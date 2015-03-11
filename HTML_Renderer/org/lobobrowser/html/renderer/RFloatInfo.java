/*
    GNU LESSER GENERAL PUBLIC LICENSE
    Copyright (C) 2006 The XAMJ Project. Copyright (C) 2014 - 2015 Lobo Evolution

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
package org.lobobrowser.html.renderer;

import java.awt.Graphics;

import org.lobobrowser.html.dombl.ModelNode;


/**
 * The Class RFloatInfo.
 */
final class RFloatInfo implements Renderable {
	
	/** The model node. */
	private final ModelNode modelNode;
	
	/** The element. */
	private final BoundableRenderable element;
	
	/** The left float. */
	private final boolean leftFloat;

	/**
	 * Instantiates a new r float info.
	 *
	 * @param node the node
	 * @param element the element
	 * @param leftFloat the left float
	 */
	public RFloatInfo(ModelNode node, BoundableRenderable element,
			boolean leftFloat) {
		this.modelNode = node;
		this.element = element;
		this.leftFloat = leftFloat;
	}

	/**
	 * Checks if is left float.
	 *
	 * @return true, if is left float
	 */
	public boolean isLeftFloat() {
		return this.leftFloat;
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.renderer.Renderable#getModelNode()
	 */
	public ModelNode getModelNode() {
		return this.modelNode;
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.renderer.Renderable#paint(java.awt.Graphics)
	 */
	public void paint(Graphics g) {
		// nop
	}

	/**
	 * Gets the renderable.
	 *
	 * @return the renderable
	 */
	public final BoundableRenderable getRenderable() {
		return element;
	}
}
