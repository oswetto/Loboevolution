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
package com.jtattoo.plaf.mcwin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.swing.UIDefaults;
import javax.swing.plaf.InsetsUIResource;

import com.jtattoo.plaf.AbstractBorderFactory;
import com.jtattoo.plaf.AbstractIconFactory;
import com.jtattoo.plaf.AbstractLookAndFeel;
import com.jtattoo.plaf.AbstractTheme;
import com.jtattoo.plaf.BaseCheckBoxMenuItemUI;
import com.jtattoo.plaf.BaseDesktopPaneUI;
import com.jtattoo.plaf.BaseEditorPaneUI;
import com.jtattoo.plaf.BaseFileChooserUI;
import com.jtattoo.plaf.BaseFormattedTextFieldUI;
import com.jtattoo.plaf.BaseLabelUI;
import com.jtattoo.plaf.BaseMenuItemUI;
import com.jtattoo.plaf.BaseMenuUI;
import com.jtattoo.plaf.BasePasswordFieldUI;
import com.jtattoo.plaf.BasePopupMenuUI;
import com.jtattoo.plaf.BaseProgressBarUI;
import com.jtattoo.plaf.BaseRadioButtonMenuItemUI;
import com.jtattoo.plaf.BaseScrollBarUI;
import com.jtattoo.plaf.BaseSeparatorUI;
import com.jtattoo.plaf.BaseSpinnerUI;
import com.jtattoo.plaf.BaseTableHeaderUI;
import com.jtattoo.plaf.BaseTableUI;
import com.jtattoo.plaf.BaseTextAreaUI;
import com.jtattoo.plaf.BaseTextFieldUI;
import com.jtattoo.plaf.BaseToolTipUI;
import com.jtattoo.plaf.BaseTreeUI;

/**
 * <p>McWinLookAndFeel class.</p>
 *
 * Author Michael Hagen
 *
 */
public class McWinLookAndFeel extends AbstractLookAndFeel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private static McWinDefaultTheme myTheme = null;

	private static final List<String> themesList = new ArrayList<>();
	private static final Map<String, Properties> themesMap = new HashMap<>();
	private static final Properties defaultProps = new Properties();
	private static final Properties smallFontProps = new Properties();
	private static final Properties largeFontProps = new Properties();
	private static final Properties giantFontProps = new Properties();
	private static final Properties modernProps = new Properties();
	private static final Properties modernSmallFontProps = new Properties();
	private static final Properties modernLargeFontProps = new Properties();
	private static final Properties modernGiantFontProps = new Properties();
	private static final Properties pinkProps = new Properties();
	private static final Properties pinkSmallFontProps = new Properties();
	private static final Properties pinkLargeFontProps = new Properties();
	private static final Properties pinkGiantFontProps = new Properties();

	static {
		smallFontProps.setProperty("controlTextFont", "Dialog 10");
		smallFontProps.setProperty("systemTextFont", "Dialog 10");
		smallFontProps.setProperty("userTextFont", "Dialog 10");
		smallFontProps.setProperty("menuTextFont", "Dialog 10");
		smallFontProps.setProperty("windowTitleFont", "Dialog bold 10");
		smallFontProps.setProperty("subTextFont", "Dialog 8");

		largeFontProps.setProperty("controlTextFont", "Dialog 14");
		largeFontProps.setProperty("systemTextFont", "Dialog 14");
		largeFontProps.setProperty("userTextFont", "Dialog 14");
		largeFontProps.setProperty("menuTextFont", "Dialog 14");
		largeFontProps.setProperty("windowTitleFont", "Dialog bold 14");
		largeFontProps.setProperty("subTextFont", "Dialog 12");

		giantFontProps.setProperty("controlTextFont", "Dialog 18");
		giantFontProps.setProperty("systemTextFont", "Dialog 18");
		giantFontProps.setProperty("userTextFont", "Dialog 18");
		giantFontProps.setProperty("menuTextFont", "Dialog 18");
		giantFontProps.setProperty("windowTitleFont", "Dialog 18");
		giantFontProps.setProperty("subTextFont", "Dialog 16");

		modernProps.setProperty("brightMode", "on");
		modernProps.setProperty("menuOpaque", "on");
		modernProps.setProperty("backgroundPattern", "off");
		modernProps.setProperty("drawSquareButtons", "on");
		modernProps.setProperty("windowTitleForegroundColor", "54 68 84");
		modernProps.setProperty("windowTitleBackgroundColor", "172 179 185");
		modernProps.setProperty("windowTitleColorLight", "204 208 212");
		modernProps.setProperty("windowTitleColorDark", "172 179 185");
		modernProps.setProperty("windowBorderColor", "150 158 167");
		modernProps.setProperty("windowInactiveTitleForegroundColor", "67 84 103");
		modernProps.setProperty("windowInactiveTitleBackgroundColor", "221 223 225");
		modernProps.setProperty("windowInactiveTitleColorLight", "232 234 236");
		modernProps.setProperty("windowInactiveTitleColorDark", "221 223 225");
		modernProps.setProperty("windowInactiveBorderColor", "172 179 185");
		modernProps.setProperty("backgroundColor", "226 228 231");
		modernProps.setProperty("selectionBackgroundColor", "201 205 240");
		modernProps.setProperty("rolloverColor", "228 228 192");
		modernProps.setProperty("rolloverColorLight", "248 248 184");
		modernProps.setProperty("rolloverColorDark", "220 220 172");
		modernProps.setProperty("controlColorLight", "194 204 216");
		modernProps.setProperty("controlColorDark", "160 177 197");
		modernProps.setProperty("menuBackgroundColor", "242 244 247");
		modernProps.setProperty("menuColorLight", "242 244 247");
		modernProps.setProperty("menuColorDark", "226 228 231");
		modernProps.setProperty("menuSelectionBackgroundColor", "220 220 172");
		modernProps.setProperty("toolbarBackgroundColor", "226 228 231");
		modernProps.setProperty("desktopColor", "208 211 216");

		pinkProps.setProperty("backgroundColorLight", "248 244 248");
		pinkProps.setProperty("backgroundColorDark", "255 255 255");
		pinkProps.setProperty("focusCellColor", "160 120 160");
		pinkProps.setProperty("selectionBackgroundColor", "248 202 248");
		pinkProps.setProperty("rolloverColor", "240 145 240");
		pinkProps.setProperty("controlColorLight", "255 220 255");
		pinkProps.setProperty("controlColorDark", "248 140 248");
		pinkProps.setProperty("rolloverColorLight", "240 180 240");
		pinkProps.setProperty("rolloverColorDark", "232 120 232");
		pinkProps.setProperty("windowTitleForegroundColor", "0 0 0");
		pinkProps.setProperty("windowTitleBackgroundColor", "248 180 248");
		pinkProps.setProperty("windowTitleColorLight", "248 180 248");
		pinkProps.setProperty("windowTitleColorDark", "200 120 200");
		pinkProps.setProperty("windowBorderColor", "200 120 200");
		pinkProps.setProperty("menuSelectionForegroundColor", "0 0 0");
		pinkProps.setProperty("menuSelectionBackgroundColor", "248 202 248");
		pinkProps.setProperty("desktopColor", "242 242 242");

		String key;
		String value;
		Iterator<Object> iter = smallFontProps.keySet().iterator();
		while (iter.hasNext()) {
			key = (String) iter.next();
			value = smallFontProps.getProperty(key);
			modernSmallFontProps.setProperty(key, value);
			pinkSmallFontProps.setProperty(key, value);
		}
		iter = largeFontProps.keySet().iterator();
		while (iter.hasNext()) {
			key = (String) iter.next();
			value = largeFontProps.getProperty(key);
			modernLargeFontProps.setProperty(key, value);
			pinkLargeFontProps.setProperty(key, value);
		}
		iter = giantFontProps.keySet().iterator();
		while (iter.hasNext()) {
			key = (String) iter.next();
			value = giantFontProps.getProperty(key);
			modernGiantFontProps.setProperty(key, value);
			pinkGiantFontProps.setProperty(key, value);
		}

		iter = modernProps.keySet().iterator();
		while (iter.hasNext()) {
			key = (String) iter.next();
			value = modernProps.getProperty(key);
			modernSmallFontProps.setProperty(key, value);
			modernLargeFontProps.setProperty(key, value);
			modernGiantFontProps.setProperty(key, value);
		}
		iter = pinkProps.keySet().iterator();
		while (iter.hasNext()) {
			key = (String) iter.next();
			value = pinkProps.getProperty(key);
			pinkSmallFontProps.setProperty(key, value);
			pinkLargeFontProps.setProperty(key, value);
			pinkGiantFontProps.setProperty(key, value);
		}

		themesList.add("Default");
		themesList.add("Small-Font");
		themesList.add("Large-Font");
		themesList.add("Giant-Font");

		themesList.add("Modern");
		themesList.add("Modern-Small-Font");
		themesList.add("Modern-Large-Font");
		themesList.add("Modern-Giant-Font");

		themesList.add("Pink");
		themesList.add("Pink-Small-Font");
		themesList.add("Pink-Large-Font");
		themesList.add("Pink-Giant-Font");

		themesMap.put("Default", defaultProps);
		themesMap.put("Small-Font", smallFontProps);
		themesMap.put("Large-Font", largeFontProps);
		themesMap.put("Giant-Font", giantFontProps);

		themesMap.put("Modern", modernProps);
		themesMap.put("Modern-Small-Font", modernSmallFontProps);
		themesMap.put("Modern-Large-Font", modernLargeFontProps);
		themesMap.put("Modern-Giant-Font", modernGiantFontProps);

		themesMap.put("Pink", pinkProps);
		themesMap.put("Pink-Small-Font", pinkSmallFontProps);
		themesMap.put("Pink-Large-Font", pinkLargeFontProps);
		themesMap.put("Pink-Giant-Font", pinkGiantFontProps);
	}

	/**
	 * <p>getThemeProperties.</p>
	 *
	 * @param name a {@link java.lang.String} object.
	 * @return a {@link java.util.Properties} object.
	 */
	public static Properties getThemeProperties(String name) {
		return themesMap.get(name);
	}

	/**
	 * <p>getThemes.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public static List<String> getThemes() {
		return themesList;
	}

	/**
	 * <p>setCurrentTheme.</p>
	 *
	 * @param themesProps a {@link java.util.Properties} object.
	 */
	public static void setCurrentTheme(Properties themesProps) {
		setTheme(themesProps);
	}

	/**
	 * <p>setTheme.</p>
	 *
	 * @param themesProps a {@link java.util.Properties} object.
	 */
	public static void setTheme(Properties themesProps) {
		currentThemeName = "mcwinTheme";
		if (myTheme == null) {
			myTheme = new McWinDefaultTheme();
		}
		if (myTheme != null && themesProps != null) {
			myTheme.setUpColor();
			myTheme.setProperties(themesProps);
			myTheme.setUpColorArrs();
			AbstractLookAndFeel.setTheme(myTheme);
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>setTheme.</p>
	 */
	public static void setTheme(String name) {
		setTheme(themesMap.get(name));
		if (myTheme != null) {
			AbstractTheme.setInternalName(name);
		}
	}

	/**
	 * <p>setTheme.</p>
	 *
	 * @param name a {@link java.lang.String} object.
	 * @param licenseKey a {@link java.lang.String} object.
	 * @param logoString a {@link java.lang.String} object.
	 */
	public static void setTheme(String name, String licenseKey, String logoString) {
		Properties props = themesMap.get(name);
		if (props != null) {
			props.put("licenseKey", licenseKey);
			props.put("logoString", logoString);
			setTheme(props);
			if (myTheme != null) {
				AbstractTheme.setInternalName(name);
			}
		}
	}

	/** {@inheritDoc} */
	@Override
	protected void createDefaultTheme() {
		if (myTheme == null) {
			myTheme = new McWinDefaultTheme();
		}
		setTheme(myTheme);
	}

	/** {@inheritDoc} */
	@Override
	public AbstractBorderFactory getBorderFactory() {
		return McWinBorderFactory.getInstance();
	}

	/** {@inheritDoc} */
	@Override
	public String getDescription() {
		return "The McWin Look and Feel";
	}

	/** {@inheritDoc} */
	@Override
	public AbstractIconFactory getIconFactory() {
		return McWinIconFactory.getInstance();
	}

	/** {@inheritDoc} */
	@Override
	public String getID() {
		return "McWin";
	}

	/** {@inheritDoc} */
	@Override
	public String getName() {
		return "McWin";
	}

	/** {@inheritDoc} */
	@Override
	protected void initClassDefaults(UIDefaults table) {
		if (!"mcwinTheme".equals(currentThemeName)) {
			setTheme("Default");
		}
		super.initClassDefaults(table);
		Object[] uiDefaults = {
				// BaseLookAndFeel classes
				"LabelUI", BaseLabelUI.class.getName(), "SeparatorUI", BaseSeparatorUI.class.getName(), "TextFieldUI",
				BaseTextFieldUI.class.getName(), "TextAreaUI", BaseTextAreaUI.class.getName(), "EditorPaneUI",
				BaseEditorPaneUI.class.getName(), "PasswordFieldUI", BasePasswordFieldUI.class.getName(), "ToolTipUI",
				BaseToolTipUI.class.getName(), "TreeUI", BaseTreeUI.class.getName(), "TableUI",
				BaseTableUI.class.getName(), "TableHeaderUI", BaseTableHeaderUI.class.getName(), "ScrollBarUI",
				BaseScrollBarUI.class.getName(), "ProgressBarUI", BaseProgressBarUI.class.getName(), "FileChooserUI",
				BaseFileChooserUI.class.getName(), "MenuUI", BaseMenuUI.class.getName(), "PopupMenuUI",
				BasePopupMenuUI.class.getName(), "MenuItemUI", BaseMenuItemUI.class.getName(), "CheckBoxMenuItemUI",
				BaseCheckBoxMenuItemUI.class.getName(), "RadioButtonMenuItemUI",
				BaseRadioButtonMenuItemUI.class.getName(), "PopupMenuSeparatorUI", BaseSeparatorUI.class.getName(),
				"DesktopPaneUI", BaseDesktopPaneUI.class.getName(),
				// McWinLookAndFeel classes
				"CheckBoxUI", McWinCheckBoxUI.class.getName(), "RadioButtonUI", McWinRadioButtonUI.class.getName(),
				"ButtonUI", McWinButtonUI.class.getName(), "ToggleButtonUI", McWinToggleButtonUI.class.getName(),
				"ComboBoxUI", McWinComboBoxUI.class.getName(), "SliderUI", McWinSliderUI.class.getName(), "PanelUI",
				McWinPanelUI.class.getName(), "ScrollPaneUI", McWinScrollPaneUI.class.getName(), "TabbedPaneUI",
				McWinTabbedPaneUI.class.getName(), "ToolBarUI", McWinToolBarUI.class.getName(), "MenuBarUI",
				McWinMenuBarUI.class.getName(), "SplitPaneUI", McWinSplitPaneUI.class.getName(), "InternalFrameUI",
				McWinInternalFrameUI.class.getName(), "RootPaneUI", McWinRootPaneUI.class.getName(), };
		table.putDefaults(uiDefaults);
		table.put("FormattedTextFieldUI", BaseFormattedTextFieldUI.class.getName());
		table.put("SpinnerUI", BaseSpinnerUI.class.getName());
	}

	/** {@inheritDoc} */
	@Override
	protected void initComponentDefaults(UIDefaults table) {
		super.initComponentDefaults(table);
		table.put("SplitPane.centerOneTouchButtons", Boolean.FALSE);
		table.put("TabbedPane.tabAreaInsets", new InsetsUIResource(5, 5, 6, 5));
	}

	/** {@inheritDoc} */
	@Override
	public boolean isNativeLookAndFeel() {
		return false;
	}

	/** {@inheritDoc} */
	@Override
	public boolean isSupportedLookAndFeel() {
		return true;
	}

} // end of class McWinLookAndFeel
