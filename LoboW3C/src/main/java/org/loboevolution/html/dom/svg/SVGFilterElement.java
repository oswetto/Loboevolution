/*
 * GNU GENERAL LICENSE
 * Copyright (C) 2014 - 2021 Lobo Evolution
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public
 * License as published by the Free Software Foundation; either
 * verion 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General License for more details.
 *
 * You should have received a copy of the GNU General Public
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contact info: ivan.difrancesco@yahoo.it
 */
package org.loboevolution.html.dom.svg;

/**
 * <p>SVGFilterElement interface.</p>
 *
 *
 *
 */
public interface SVGFilterElement
		extends SVGElement, SVGURIReference, SVGLangSpace, SVGExternalResourcesRequired, SVGStylable, SVGUnitTypes {
	/**
	 * <p>getFilterUnits.</p>
	 *
	 * @return a {@link org.loboevolution.html.dom.svg.SVGAnimatedEnumeration} object.
	 */
	SVGAnimatedEnumeration getFilterUnits();

	/**
	 * <p>getPrimitiveUnits.</p>
	 *
	 * @return a {@link org.loboevolution.html.dom.svg.SVGAnimatedEnumeration} object.
	 */
	SVGAnimatedEnumeration getPrimitiveUnits();

	/**
	 * <p>getX.</p>
	 *
	 * @return a {@link org.loboevolution.html.dom.svg.SVGAnimatedLength} object.
	 */
	SVGAnimatedLength getX();

	/**
	 * <p>getY.</p>
	 *
	 * @return a {@link org.loboevolution.html.dom.svg.SVGAnimatedLength} object.
	 */
	SVGAnimatedLength getY();

	/**
	 * <p>getWidth.</p>
	 *
	 * @return a {@link org.loboevolution.html.dom.svg.SVGAnimatedLength} object.
	 */
	SVGAnimatedLength getWidth();

	/**
	 * <p>getHeight.</p>
	 *
	 * @return a {@link org.loboevolution.html.dom.svg.SVGAnimatedLength} object.
	 */
	SVGAnimatedLength getHeight();

	/**
	 * <p>getFilterResX.</p>
	 *
	 * @return a {@link org.loboevolution.html.dom.svg.SVGAnimatedInteger} object.
	 */
	SVGAnimatedInteger getFilterResX();

	/**
	 * <p>getFilterResY.</p>
	 *
	 * @return a {@link org.loboevolution.html.dom.svg.SVGAnimatedInteger} object.
	 */
	SVGAnimatedInteger getFilterResY();

	/**
	 * <p>setFilterRes.</p>
	 *
	 * @param filterResX a int.
	 * @param filterResY a int.
	 */
	void setFilterRes(int filterResX, int filterResY);
}