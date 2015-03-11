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

import java.util.Iterator;


/**
 * A {@link Renderable} with children.
 */
public interface RCollection extends BoundableRenderable {
	
	/**
	 * Gets the collection of {@link Renderable} children.
	 *
	 * @return the renderables
	 */
	public Iterator getRenderables();

	/**
	 * Update widget bounds.
	 *
	 * @param guiX the gui x
	 * @param guiY the gui y
	 */
	public void updateWidgetBounds(int guiX, int guiY);

	/**
	 * Invalidates layout in all descendents.
	 */
	public void invalidateLayoutDeep();

	/**
	 * Focus.
	 */
	public void focus();

	/**
	 * Blur.
	 */
	public void blur();
}
