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
package org.lobobrowser.primary.gui;

import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

import javax.swing.AbstractAction;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;


/**
 * The Class StringListControl.
 */
public class StringListControl extends JComponent {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The combo box. */
	private final JComboBox<String> comboBox;

	/**
	 * Instantiates a new string list control.
	 */
	public StringListControl() {
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		this.comboBox = new JComboBox<String>();
		this.comboBox.setEditable(false);
		JButton editButton = new JButton();
		editButton.setAction(new EditAction());
		editButton.setText("Edit List");
		this.add(this.comboBox);
		this.add(editButton);
	}

	/** The strings. */
	private String[] strings;

	/**
	 * Sets the strings.
	 *
	 * @param strings the new strings
	 */
	public void setStrings(String[] strings) {
		this.strings = strings;
		JComboBox<String> comboBox = this.comboBox;
		comboBox.removeAllItems();
		for (String string : strings) {
			comboBox.addItem(string);
		}
	}

	/**
	 * Gets the strings.
	 *
	 * @return the strings
	 */
	public String[] getStrings() {
		return this.strings;
	}

	/**
	 * Gets the strings as text.
	 *
	 * @return the strings as text
	 */
	public String getStringsAsText() {
		String lineSeparator = System.getProperty("line.separator");
		String[] strings = this.strings;
		if (strings == null) {
			return null;
		}
		StringBuffer buffer = new StringBuffer();
		for (String string : strings) {
			buffer.append(string);
			buffer.append(lineSeparator);
		}
		return buffer.toString();
	}

	/**
	 * Sets the strings from text.
	 *
	 * @param text the new strings from text
	 */
	public void setStringsFromText(String text) {
		try {
			BufferedReader reader = new BufferedReader(new StringReader(text));
			String line;
			ArrayList<String> stringsAL = new ArrayList<String>();
			while ((line = reader.readLine()) != null) {
				stringsAL.add(line);
			}
			this.setStrings(stringsAL.toArray(new String[0]));
		} catch (IOException ioe) {
			throw new IllegalStateException("not expected", ioe);
		}
	}

	/** The edit list caption. */
	private String editListCaption;

	/**
	 * Sets the edits the list caption.
	 *
	 * @param caption the new edits the list caption
	 */
	public void setEditListCaption(String caption) {
		this.editListCaption = caption;
	}

	/**
	 * The Class EditAction.
	 */
	private class EditAction extends AbstractAction {
		
		/** The Constant serialVersionUID. */
		private static final long serialVersionUID = 1L;

		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			Frame parentFrame = SwingTasks.getFrame(StringListControl.this);
			SimpleTextEditDialog dialog;
			if (parentFrame != null) {
				dialog = new SimpleTextEditDialog(parentFrame);
			} else {
				Dialog parentDialog = SwingTasks
						.getDialog(StringListControl.this);
				dialog = new SimpleTextEditDialog(parentDialog);
			}
			dialog.setModal(true);
			dialog.setTitle("Edit List");
			dialog.setCaption(editListCaption);
			dialog.setSize(new Dimension(400, 300));
			dialog.setLocationByPlatform(true);
			dialog.setText(getStringsAsText());
			dialog.setVisible(true);
			String text = dialog.getResultingText();
			if (text != null) {
				setStringsFromText(text);
			}
		}
	}
}
