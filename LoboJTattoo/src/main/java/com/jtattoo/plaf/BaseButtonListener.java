/*
* Copyright (c) 2002 and later by MH Software-Entwicklung. All Rights Reserved.
*
* JTattoo is multiple licensed. If your are an open source developer you can use
* it under the terms and conditions of the GNU General Public License version 2.0
* or later as published by the Free Software Foundation.
*
* see: gpl-2.0.txt
*
* If you pay for a license you will become a registered user who could use the
* software under the terms and conditions of the GNU Lesser General Public License
* version 2.0 or later with classpath exception as published by the Free Software
* Foundation.
*
* see: lgpl-2.0.txt
* see: classpath-exception.txt
*
* Registered users could also use JTattoo under the terms and conditions of the
* Apache License, Version 2.0 as published by the Apache Software Foundation.
*
* see: APACHE-LICENSE-2.0.txt
*/

package com.jtattoo.plaf;

import java.awt.event.FocusEvent;
import java.awt.event.MouseEvent;

import javax.swing.AbstractButton;
import javax.swing.plaf.basic.BasicButtonListener;

/**
 * <p>BaseButtonListener class.</p>
 *
 *
 *
 */
public class BaseButtonListener extends BasicButtonListener {

	/**
	 * <p>Constructor for BaseButtonListener.</p>
	 *
	 * @param b a {@link javax.swing.AbstractButton} object.
	 */
	public BaseButtonListener(AbstractButton b) {
		super(b);
	}

	/** {@inheritDoc} */
	@Override
	public void focusGained(FocusEvent e) {
		AbstractButton b = (AbstractButton) e.getSource();
		b.repaint();
	}

	/** {@inheritDoc} */
	@Override
	public void focusLost(FocusEvent e) {
		AbstractButton b = (AbstractButton) e.getSource();
		b.repaint();
	}

	/** {@inheritDoc} */
	@Override
	public void mouseEntered(final MouseEvent e) {
		super.mouseEntered(e);
		AbstractButton button = (AbstractButton) e.getSource();
		button.getModel().setRollover(true);
	}

	/** {@inheritDoc} */
	@Override
	public void mouseExited(final MouseEvent e) {
		super.mouseExited(e);
		AbstractButton button = (AbstractButton) e.getSource();
		button.getModel().setRollover(false);
	}

	/** {@inheritDoc} */
	@Override
	public void mouseReleased(final MouseEvent e) {
		super.mouseReleased(e);
	}

} // end of class BaseButtonListener
