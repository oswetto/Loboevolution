/*
    GNU LESSER GENERAL PUBLIC LICENSE
    Copyright (C) 2006 The Lobo Project. Copyright (C) 2014 Lobo Evolution

    This library is free software; you can redistribute it and/or
    modify it under the terms of the GNU Lesser General Public
    License as published by the Free Software Foundation; either
    version 2.1 of the License, or (at your option) any later version.

    This library is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
    Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public
    License along with this library; if not, write to the Free Software
    Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA

    Contact info: lobochief@users.sourceforge.net; ivan.difrancesco@yahoo.it
*/
/*
 * Created on Apr 17, 2005
 */
package org.lobobrowser.html.renderer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.lobobrowser.html.domimpl.ModelNode;

/**
 * @author J. H. S.
 */
abstract class BaseBoundableRenderable extends BaseRenderable implements BoundableRenderable {
	protected static final Logger logger = Logger.getLogger(BaseBoundableRenderable.class.getName());
	protected static final Color SELECTION_COLOR = Color.BLUE;
	protected static final Color SELECTION_XOR = Color.LIGHT_GRAY;

	// protected final Rectangle bounds = new Rectangle();
	protected final RenderableContainer container;
	/**
	 * Starts as true because ancestors could be invalidated.
	 */
	protected boolean layoutUpTreeCanBeInvalidated = true;

	protected final ModelNode modelNode;

	/**
	 * Parent for invalidation.
	 */
	protected RCollection originalParent;

	/**
	 * Parent for graphics coordinates.
	 */
	protected RCollection parent;

	public int x, y, width, height;

	public BaseBoundableRenderable(RenderableContainer container, ModelNode modelNode) {
		this.container = container;
		this.modelNode = modelNode;
	}

	public boolean contains(int x, int y) {
		return x >= this.x && y >= this.y && x < this.x + this.width && y < this.y + this.height;
	}

	public Color getBlockBackgroundColor() {
		return this.container.getPaintedBackgroundColor();
	}

	@Override
	public Rectangle getBounds() {
		return new Rectangle(this.x, this.y, this.width, this.height);
	}

	@Override
	public java.awt.Point getGUIPoint(int clientX, int clientY) {
		final Renderable parent = getParent();
		if (parent instanceof BoundableRenderable) {
			return ((BoundableRenderable) parent).getGUIPoint(clientX + this.x, clientY + this.y);
		} else if (parent == null) {
			return this.container.getGUIPoint(clientX + this.x, clientY + this.y);
		} else {
			throw new IllegalStateException("parent=" + parent);
		}
	}

	@Override
	public int getHeight() {
		return this.height;
	}

	@Override
	public ModelNode getModelNode() {
		return this.modelNode;
	}

	@Override
	public Point getOrigin() {
		return new Point(this.x, this.y);
	}

	@Override
	public RCollection getOriginalOrCurrentParent() {
		final RCollection origParent = this.originalParent;
		if (origParent == null) {
			return this.parent;
		}
		return origParent;
	}

	/**
	 * This is the parent based on the original element hierarchy.
	 */
	@Override
	public RCollection getOriginalParent() {
		return this.originalParent;
	}

	@Override
	public Point getOriginRelativeTo(RCollection ancestor) {
		int x = this.x;
		int y = this.y;
		RCollection parent = this.parent;
		for (;;) {
			if (parent == null) {
				throw new java.lang.IllegalArgumentException("Not an ancestor: " + ancestor);
			}
			if (parent == ancestor) {
				return new Point(x, y);
			}
			x += parent.getX();
			y += parent.getY();
			parent = parent.getParent();
		}
	}

	@Override
	public RCollection getParent() {
		return this.parent;
	}

	@Override
	public Point getRenderablePoint(int guiX, int guiY) {
		final Renderable parent = getParent();
		if (parent instanceof BoundableRenderable) {
			return ((BoundableRenderable) parent).getRenderablePoint(guiX - this.x, guiY - this.y);
		} else if (parent == null) {
			return new Point(guiX - this.x, guiY - this.y);
		} else {
			throw new IllegalStateException("parent=" + parent);
		}
	}

	@Override
	public Dimension getSize() {
		return new Dimension(this.width, this.height);
	}

	@Override
	public int getWidth() {
		return this.width;
	}

	@Override
	public int getX() {
		return this.x;
	}

	@Override
	public int getY() {
		return this.y;
	}

	protected abstract void invalidateLayoutLocal();

	/**
	 * Invalidates this Renderable and its parent (i.e. all ancestors).
	 */
	@Override
	public final void invalidateLayoutUpTree() {
		if (this.layoutUpTreeCanBeInvalidated) {
			this.layoutUpTreeCanBeInvalidated = false;
			invalidateLayoutLocal();
			// Try original parent first.
			RCollection parent = this.originalParent;
			if (parent == null) {
				parent = this.parent;
				if (parent == null) {
					// Has to be top block
					final RenderableContainer rc = this.container;
					if (rc != null) {
						rc.invalidateLayoutUpTree();
					}
				} else {
					parent.invalidateLayoutUpTree();
				}
			} else {
				parent.invalidateLayoutUpTree();
			}
		} else {
		}
	}

	protected boolean isValid() {
		return this.layoutUpTreeCanBeInvalidated;
	}

	public void markLayoutValid() {
		this.layoutUpTreeCanBeInvalidated = true;
	}

	@Override
	public void onMouseMoved(MouseEvent event, int x, int y, boolean triggerEvent, ModelNode limit) {
		if (triggerEvent) {
			if (isContainedByNode()) {
				HtmlController.getInstance().onMouseOver(this.modelNode, event, x, y, limit);
			}
		}
	}

	@Override
	public void onMouseOut(MouseEvent event, int x, int y, ModelNode limit) {
		if (isContainedByNode()) {
			HtmlController.getInstance().onMouseOut(this.modelNode, event, x, y, limit);
		}
	}

	@Override
	public final void paintTranslated(Graphics g) {
		final int x = this.x;
		final int y = this.y;
		g.translate(x, y);
		try {
			paint(g);
		} finally {
			g.translate(-x, -y);
		}
	}

	/**
	 * Invalidates the current Renderable (which invalidates its ancestors) and then
	 * requests the top level GUI container to do the layout and repaint. It's safe
	 * to call this method outside the GUI thread.
	 */
	@Override
	public void relayout() {
		if (EventQueue.isDispatchThread()) {
			relayoutImpl(true, false);
		} else {
			EventQueue.invokeLater(() -> relayoutImpl(true, false));
		}
	}

	public void relayoutIfValid() {
		if (EventQueue.isDispatchThread()) {
			relayoutImpl(true, true);
		} else {
			EventQueue.invokeLater(() -> relayoutImpl(true, true));
		}
	}

	private final void relayoutImpl(boolean invalidateLocal, boolean onlyIfValid) {
		if (onlyIfValid && !this.layoutUpTreeCanBeInvalidated) {
			return;
		}
		if (invalidateLocal) {
			invalidateLayoutUpTree();
		}
		final Renderable parent = this.parent;
		if (parent instanceof BaseBoundableRenderable) {
			((BaseBoundableRenderable) parent).relayoutImpl(false, false);
		} else if (parent == null) {
			// Has to be top RBlock.
			this.container.relayout();
		} else {
			if (logger.isLoggable(Level.INFO)) {
				logger.warning("relayout(): Don't know how to relayout " + this + ", parent being " + parent);
			}
		}
	}

	@Override
	public void repaint() {
		this.repaint(0, 0, this.width, this.height);
	}

	@Override
	public void repaint(int x, int y, int width, int height) {
		final Renderable parent = this.parent;
		if (parent instanceof BoundableRenderable) {
			((BoundableRenderable) parent).repaint(x + this.x, y + this.y, width, height);
		} else if (parent == null) {
			// Has to be top RBlock.
			this.container.repaint(x, y, width, height);
		} else {
			if (logger.isLoggable(Level.INFO)) {
				logger.warning("repaint(): Don't know how to repaint " + this + ", parent being " + parent);
			}
		}
	}

	// /* (non-Javadoc)
//	 * @see net.sourceforge.xamj.domimpl.markup.Renderable#getBounds()
//	 */
//	public Rectangle getBounds() {
//		return this.bounds;
//	}
//
	@Override
	public void setBounds(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	@Override
	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void setOrigin(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void setOriginalParent(RCollection origParent) {
		this.originalParent = origParent;
	}

	@Override
	public void setParent(RCollection parent) {
		this.parent = parent;
	}

	@Override
	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public void setX(int x) {
		this.x = x;
	}

	@Override
	public void setY(int y) {
		this.y = y;
	}

	protected final java.awt.Point translateDescendentPoint(BoundableRenderable descendent, int x, int y) {
		while (descendent != this) {
			if (descendent == null) {
				throw new IllegalStateException("Not descendent");
			}
			x += descendent.getX();
			y += descendent.getY();
			// Coordinates are always relative to actual parent?
			descendent = descendent.getParent();
		}
		return new Point(x, y);
	}
}