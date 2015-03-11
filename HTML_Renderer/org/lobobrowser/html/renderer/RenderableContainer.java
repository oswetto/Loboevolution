/*
    GNU LESSER GENERAL PUBLIC LICENSE
    Copyright (C) 2006 The Lobo Project. Copyright (C) 2014 - 2015 Lobo Evolution

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

import java.awt.Color;
import java.awt.Component;
import java.util.Collection;


/**
 * A RenderableContainer is either usually a parent block or the root GUI
 * component. It's is a Renderable or GUI component whose layout may be
 * invalidated.
 */
public interface RenderableContainer {
	// public Insets getInsets();
	/**
	 * Adds the component.
	 *
	 * @param component the component
	 * @return the component
	 */
	public Component addComponent(Component component);

	// public void remove(Component component);
	/**
	 * Invalidate layout up tree.
	 */
	public void invalidateLayoutUpTree();

	/**
	 * Repaint.
	 *
	 * @param x the x
	 * @param y the y
	 * @param width the width
	 * @param height the height
	 */
	public void repaint(int x, int y, int width, int height);

	/**
	 * Relayout.
	 */
	public void relayout();

	/**
	 * Update all widget bounds.
	 */
	public void updateAllWidgetBounds();

	/**
	 * Gets the painted background color.
	 *
	 * @return the painted background color
	 */
	public Color getPaintedBackgroundColor();

	/**
	 * Gets the GUI point.
	 *
	 * @param x the x
	 * @param y the y
	 * @return the GUI point
	 */
	public java.awt.Point getGUIPoint(int x, int y);

	/**
	 * Focus.
	 */
	public void focus();

	/**
	 * Adds the delayed pair.
	 *
	 * @param pair the pair
	 */
	public void addDelayedPair(DelayedPair pair);

	/**
	 * Gets the delayed pairs.
	 *
	 * @return the delayed pairs
	 */
	public Collection getDelayedPairs();

	/**
	 * Gets the parent container.
	 *
	 * @return the parent container
	 */
	public RenderableContainer getParentContainer();

	/**
	 * Clear delayed pairs.
	 */
	public void clearDelayedPairs();
}
