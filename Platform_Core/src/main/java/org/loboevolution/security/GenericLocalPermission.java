/*
    GNU GENERAL LICENSE
    Copyright (C) 2014 - 2018 Lobo Evolution

    This program is free software; you can redistribute it and/or
    modify it under the terms of the GNU General Public
    License as published by the Free Software Foundation; either
    verion 3 of the License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
    General License for more details.

    You should have received a copy of the GNU General Public
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
    

    Contact info: ivan.difrancesco@yahoo.it
 */
package org.loboevolution.security;

import java.security.BasicPermission;
import java.security.Permission;

/**
 * The Class GenericLocalPermission.
 */
public class GenericLocalPermission extends BasicPermission {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	// public static final java.security.Permission FRAME_PARENT = new
	// GenericLocalPermission("frame-parent");
	/** The Constant EXT_GENERIC. */
	public static final Permission EXT_GENERIC = new GenericLocalPermission("extension");

	/**
	 * Instantiates a new generic local permission.
	 *
	 * @param name
	 *            the name
	 */
	public GenericLocalPermission(String name) {
		super(name);
	}
}