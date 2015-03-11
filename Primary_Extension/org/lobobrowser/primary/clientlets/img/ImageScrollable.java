/*
    GNU GENERAL PUBLIC LICENSE
    Copyright (C) 2006 The Lobo Project. Copyright (C) 2014 - 2015 Lobo Evolution

    This program is free software; you can redistribute it and/or
    modify it under the terms of the GNU General Public
    License as published by the Free Software Foundation; either
    verion 2 of the License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
    General Public License for more details.

    You should have received a copy of the GNU General Public
    License along with this library; if not, write to the Free Software
    Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA

    Contact info: lobochief@users.sourceforge.net; ivan.difrancesco@yahoo.it
 */

package org.lobobrowser.primary.clientlets.img;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;

import javax.swing.JComponent;
import javax.swing.Scrollable;
import javax.swing.SwingConstants;


/**
 * The Class ImageScrollable.
 */
public class ImageScrollable extends JComponent implements Scrollable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The image. */
	private final Image image;
	
	/** The image width. */
	private int imageWidth = -1;
	
	/** The image height. */
	private int imageHeight = -1;

	/**
	 * Instantiates a new image scrollable.
	 *
	 * @param img the img
	 */
	public ImageScrollable(Image img) {
		super();
		this.image = img;
		int w = img.getWidth(this);
		int h = img.getHeight(this);
		this.imageWidth = w;
		this.imageHeight = h;
	}

	/* (non-Javadoc)
	 * @see java.awt.Component#imageUpdate(java.awt.Image, int, int, int, int, int)
	 */
	public boolean imageUpdate(Image img, int infoflags, int x, int y, int w,
			int h) {
		if ((infoflags & ImageObserver.ALLBITS) != 0
				|| (infoflags & ImageObserver.FRAMEBITS) != 0) {
			this.imageWidth = img.getWidth(this);
			this.imageHeight = img.getHeight(this);
			this.revalidate();
			this.repaint();
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Insets insets = this.getInsets();
		g.drawImage(this.image, insets.left, insets.top, this);
	}

	/* (non-Javadoc)
	 * @see javax.swing.JComponent#getPreferredSize()
	 */
	public Dimension getPreferredSize() {
		int w = this.imageWidth;
		int h = this.imageHeight;
		return new Dimension(w == -1 ? 0 : w, h == -1 ? 0 : h);
	}

	/* (non-Javadoc)
	 * @see javax.swing.Scrollable#getPreferredScrollableViewportSize()
	 */
	public Dimension getPreferredScrollableViewportSize() {
		return this.getPreferredSize();
	}

	/* (non-Javadoc)
	 * @see javax.swing.Scrollable#getScrollableUnitIncrement(java.awt.Rectangle, int, int)
	 */
	public int getScrollableUnitIncrement(Rectangle arg0, int arg1, int arg2) {
		return 12;
	}

	/* (non-Javadoc)
	 * @see javax.swing.Scrollable#getScrollableBlockIncrement(java.awt.Rectangle, int, int)
	 */
	public int getScrollableBlockIncrement(Rectangle arg0, int orientation,
			int direction) {
		if (orientation == SwingConstants.HORIZONTAL) {
			return arg0.width;
		} else {
			return arg0.height;
		}
	}

	/* (non-Javadoc)
	 * @see javax.swing.Scrollable#getScrollableTracksViewportWidth()
	 */
	public boolean getScrollableTracksViewportWidth() {
		return false;
	}

	/* (non-Javadoc)
	 * @see javax.swing.Scrollable#getScrollableTracksViewportHeight()
	 */
	public boolean getScrollableTracksViewportHeight() {
		return false;
	}
}
