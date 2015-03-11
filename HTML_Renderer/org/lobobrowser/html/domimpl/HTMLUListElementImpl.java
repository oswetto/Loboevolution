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
/*
 * Created on Feb 12, 2006
 */
package org.lobobrowser.html.domimpl;

import org.lobobrowser.html.HtmlAttributeProperties;
import org.lobobrowser.html.renderstate.ListRenderState;
import org.lobobrowser.html.renderstate.RenderState;
import org.lobobrowser.html.w3c.HTMLUListElement;


/**
 * The Class HTMLUListElementImpl.
 */
public class HTMLUListElementImpl extends HTMLAbstractUIElement implements
		HTMLUListElement {
	
	/**
	 * Instantiates a new HTMLU list element impl.
	 *
	 * @param name the name
	 */
	public HTMLUListElementImpl(String name) {
		super(name);
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLUListElement#getCompact()
	 */
	public boolean getCompact() {
		String compactText = this.getAttribute(HtmlAttributeProperties.COMPACT);
		return HtmlAttributeProperties.COMPACT.equalsIgnoreCase(compactText);
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLUListElement#setCompact(boolean)
	 */
	public void setCompact(boolean compact) {
		this.setAttribute(HtmlAttributeProperties.COMPACT, compact ? HtmlAttributeProperties.COMPACT : null);
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLUListElement#getType()
	 */
	public String getType() {
		return this.getAttribute(HtmlAttributeProperties.TYPE);
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.HTMLUListElement#setType(java.lang.String)
	 */
	public void setType(String type) {
		this.setAttribute(HtmlAttributeProperties.TYPE, type);
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.domimpl.HTMLElementImpl#createRenderState(org.lobobrowser.html.renderstate.RenderState)
	 */
	protected RenderState createRenderState(RenderState prevRenderState) {
		return new ListRenderState(prevRenderState, this);
	}
}
