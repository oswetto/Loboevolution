package org.lobobrowser.html.domimpl;

import org.lobobrowser.html.HtmlAttributeProperties;
import org.lobobrowser.html.w3c.HTMLFormElement;
import org.lobobrowser.html.w3c.HTMLObjectElement;
import org.lobobrowser.html.w3c.ValidityState;
import org.w3c.dom.Document;


/**
 * The Class HTMLObjectElementImpl.
 */
public class HTMLObjectElementImpl extends HTMLAbstractUIElement implements
		HTMLObjectElement {
	
	/**
	 * Instantiates a new HTML object element impl.
	 *
	 * @param name the name
	 */
	public HTMLObjectElementImpl(String name) {
		super(name);
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLObjectElement#getAlign()
	 */
	public String getAlign() {
		return this.getAttribute(HtmlAttributeProperties.ALIGN);
	}

	/**
	 * Gets the alt.
	 *
	 * @return the alt
	 */
	public String getAlt() {
		return this.getAttribute(HtmlAttributeProperties.ALT);
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLObjectElement#getArchive()
	 */
	public String getArchive() {
		return this.getAttribute(HtmlAttributeProperties.ARCHIVE);
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLObjectElement#getCode()
	 */
	public String getCode() {
		return this.getAttribute(HtmlAttributeProperties.CODE);
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLObjectElement#getCodeBase()
	 */
	public String getCodeBase() {
		return this.getAttribute(HtmlAttributeProperties.CODEBASE);
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLObjectElement#getHeight()
	 */
	public String getHeight() {
		return this.getAttribute(HtmlAttributeProperties.HEIGHT);
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLObjectElement#getName()
	 */
	public String getName() {
		return this.getAttribute(HtmlAttributeProperties.NAME);
	}

	/**
	 * Gets the object.
	 *
	 * @return the object
	 */
	public String getObject() {
		return this.getAttribute(HtmlAttributeProperties.OBJECT);
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLObjectElement#getWidth()
	 */
	public String getWidth() {
		return this.getAttribute(HtmlAttributeProperties.WIDTH);
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLObjectElement#setAlign(java.lang.String)
	 */
	public void setAlign(String align) {
		this.setAttribute(HtmlAttributeProperties.ALIGN, align);
	}

	/**
	 * Sets the alt.
	 *
	 * @param alt the new alt
	 */
	public void setAlt(String alt) {
		this.setAttribute(HtmlAttributeProperties.ALT, alt);
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLObjectElement#setArchive(java.lang.String)
	 */
	public void setArchive(String archive) {
		this.setAttribute(HtmlAttributeProperties.ARCHIVE, archive);
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLObjectElement#setCode(java.lang.String)
	 */
	public void setCode(String code) {
		this.setAttribute(HtmlAttributeProperties.CODE, code);
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLObjectElement#setCodeBase(java.lang.String)
	 */
	public void setCodeBase(String codeBase) {
		this.setAttribute(HtmlAttributeProperties.CODEBASE, codeBase);
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLObjectElement#setHeight(java.lang.String)
	 */
	public void setHeight(String height) {
		this.setAttribute(HtmlAttributeProperties.HEIGHT, height);
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLObjectElement#setName(java.lang.String)
	 */
	public void setName(String name) {
		this.setAttribute(HtmlAttributeProperties.NAME, name);
	}

	/**
	 * Sets the object.
	 *
	 * @param object the new object
	 */
	public void setObject(String object) {
		this.setAttribute(HtmlAttributeProperties.OBJECT, object);
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLObjectElement#setWidth(java.lang.String)
	 */
	public void setWidth(String width) {
		this.setAttribute(HtmlAttributeProperties.WIDTH, width);
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLObjectElement#getBorder()
	 */
	public String getBorder() {
		return this.getAttribute(HtmlAttributeProperties.BORDER);
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLObjectElement#getCodeType()
	 */
	public String getCodeType() {
		return this.getAttribute(HtmlAttributeProperties.CODETYPE);
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLObjectElement#getContentDocument()
	 */
	public Document getContentDocument() {
		return this.getOwnerDocument();
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLObjectElement#getData()
	 */
	public String getData() {
		return this.getAttribute(HtmlAttributeProperties.DATA);
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLObjectElement#getDeclare()
	 */
	public boolean getDeclare() {
		return "declare".equalsIgnoreCase(this.getAttribute(HtmlAttributeProperties.DECLARE));
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLObjectElement#getForm()
	 */
	public HTMLFormElement getForm() {
		return (HTMLFormElement) this
				.getAncestorForJavaClass(HTMLFormElement.class);
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLObjectElement#getHspace()
	 */
	public int getHspace() {
		try {
			return Integer.parseInt(this.getAttribute(HtmlAttributeProperties.HSPACE));
		} catch (Exception err) {
			return 0;
		}
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLObjectElement#getStandby()
	 */
	public String getStandby() {
		return this.getAttribute(HtmlAttributeProperties.STANDBY);
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.domimpl.DOMElementImpl#getTabIndex()
	 */
	public int getTabIndex() {
		try {
			return Integer.parseInt(this.getAttribute(HtmlAttributeProperties.TABINDEX));
		} catch (Exception err) {
			return 0;
		}
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLObjectElement#getType()
	 */
	public String getType() {
		return this.getAttribute(HtmlAttributeProperties.TYPE);
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLObjectElement#getUseMap()
	 */
	public String getUseMap() {
		return this.getAttribute(HtmlAttributeProperties.USEMAP);
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLObjectElement#getVspace()
	 */
	public int getVspace() {
		try {
			return Integer.parseInt(this.getAttribute(HtmlAttributeProperties.VSPACE));
		} catch (Exception err) {
			return 0;
		}
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLObjectElement#setBorder(java.lang.String)
	 */
	public void setBorder(String border) {
		this.setAttribute(HtmlAttributeProperties.BORDER, border);
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLObjectElement#setCodeType(java.lang.String)
	 */
	public void setCodeType(String codeType) {
		this.setAttribute(HtmlAttributeProperties.CODETYPE, codeType);
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLObjectElement#setData(java.lang.String)
	 */
	public void setData(String data) {
		this.setAttribute(HtmlAttributeProperties.DATA, data);
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLObjectElement#setDeclare(boolean)
	 */
	public void setDeclare(boolean declare) {
		this.setAttribute(HtmlAttributeProperties.DECLARE, declare ? "declare" : null);
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLObjectElement#setHspace(int)
	 */
	public void setHspace(int hspace) {
		this.setAttribute(HtmlAttributeProperties.HSPACE, String.valueOf(hspace));
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLObjectElement#setStandby(java.lang.String)
	 */
	public void setStandby(String standby) {
		this.setAttribute(HtmlAttributeProperties.STANDBY, standby);
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.domimpl.DOMElementImpl#setTabIndex(int)
	 */
	public void setTabIndex(int tabIndex) {
		this.setAttribute(HtmlAttributeProperties.TABINDEX, String.valueOf(tabIndex));
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLObjectElement#setType(java.lang.String)
	 */
	public void setType(String type) {
		this.setAttribute(HtmlAttributeProperties.TYPE, type);
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLObjectElement#setUseMap(java.lang.String)
	 */
	public void setUseMap(String useMap) {
		this.setAttribute(HtmlAttributeProperties.USEMAP, useMap);
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLObjectElement#setVspace(int)
	 */
	public void setVspace(int vspace) {
		this.setAttribute(HtmlAttributeProperties.VSPACE, String.valueOf(vspace));
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLObjectElement#getWillValidate()
	 */
	@Override
	public boolean getWillValidate() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLObjectElement#getValidity()
	 */
	@Override
	public ValidityState getValidity() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLObjectElement#getValidationMessage()
	 */
	@Override
	public String getValidationMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLObjectElement#checkValidity()
	 */
	@Override
	public boolean checkValidity() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLObjectElement#setCustomValidity(java.lang.String)
	 */
	@Override
	public void setCustomValidity(String error) {
		// TODO Auto-generated method stub
		
	}
}
