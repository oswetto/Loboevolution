/*
    GNU GENERAL LICENSE
    Copyright (C) 2006 The Lobo Project. Copyright (C) 2014 - 2015 Lobo Evolution

    This program is free software; you can redistribute it and/or
    modify it under the terms of the GNU General Public
    License as published by the Free Software Foundation; either
    verion 2 of the License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
    General License for more details.

    You should have received a copy of the GNU General Public
    License along with this library; if not, write to the Free Software
    Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA

    Contact info: lobochief@users.sourceforge.net; ivan.difrancesco@yahoo.it
 */
package org.lobobrowser.html.layout;

/**
 * The Class LayoutValue.
 */
public class LayoutValue {

    /** The width. */
    private int width;

    /** The height. */
    private int height;

    /** The has h scroll bar. */
    private boolean hasHScrollBar;

    /** The has v scroll bar. */
    private boolean hasVScrollBar;

    /**
     * Instantiates a new layout value.
     *
     * @param width
     *            the width
     * @param height
     *            the height
     * @param hasHScrollBar
     *            the has h scroll bar
     * @param hasVScrollBar
     *            the has v scroll bar
     */
    public LayoutValue(int width, int height, boolean hasHScrollBar,
            boolean hasVScrollBar) {
        this.width = width;
        this.height = height;
        this.hasHScrollBar = hasHScrollBar;
        this.hasVScrollBar = hasVScrollBar;
    }

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * @return the hasHScrollBar
	 */
	public boolean isHasHScrollBar() {
		return hasHScrollBar;
	}

	/**
	 * @param hasHScrollBar the hasHScrollBar to set
	 */
	public void setHasHScrollBar(boolean hasHScrollBar) {
		this.hasHScrollBar = hasHScrollBar;
	}

	/**
	 * @return the hasVScrollBar
	 */
	public boolean isHasVScrollBar() {
		return hasVScrollBar;
	}

	/**
	 * @param hasVScrollBar the hasVScrollBar to set
	 */
	public void setHasVScrollBar(boolean hasVScrollBar) {
		this.hasVScrollBar = hasVScrollBar;
	}
}
