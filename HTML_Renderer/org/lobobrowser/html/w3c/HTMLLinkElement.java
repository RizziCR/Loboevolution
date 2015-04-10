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
 * Copyright (c) 2003 World Wide Web Consortium,
 * (Massachusetts Institute of Technology, Institut National de
 * Recherche en Informatique et en Automatique, Keio University). All
 * Rights Reserved. This program is distributed under the W3C's Software
 * Intellectual Property License. This program is distributed in the
 * hope that it will be useful, but WITHOUT ANY WARRANTY; without even
 * the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 * PURPOSE.
 * See W3C License http://www.w3.org/Consortium/Legal/ for more details.
 */

package org.lobobrowser.html.w3c;


/**
 * The <code>LINK</code> element specifies a link to an external resource, and
 * defines this document's relationship to that resource (or vice versa). See
 * the LINK element definition in HTML 4.01 (see also the <code>LinkStyle</code>
 * interface in the StyleSheet module [<a
 * href='http://www.w3.org/TR/2000/REC-DOM-Level-2-Style-20001113'>DOM Level 2
 * Style Sheets and CSS</a>]).
 * <p>
 * See also the
 * Object Model (DOM) Level 2 HTML Specification</p>.
 */
public interface HTMLLinkElement extends HTMLElement {
	
	/**
	 * Enables/disables the link. This is currently only used for style sheet
	 * links, and may be used to activate or deactivate style sheets.
	 *
	 * @return the disabled
	 */
	public boolean getDisabled();

	/**
	 * Enables/disables the link. This is currently only used for style sheet
	 * links, and may be used to activate or deactivate style sheets.
	 *
	 * @param disabled the new disabled
	 */
	public void setDisabled(boolean disabled);

	/**
	 * The character encoding of the resource being linked to. See the charset
	 * attribute definition in HTML 4.01.
	 *
	 * @return the charset
	 */
	public String getCharset();

	/**
	 * The character encoding of the resource being linked to. See the charset
	 * attribute definition in HTML 4.01.
	 *
	 * @param charset the new charset
	 */
	public void setCharset(String charset);

	/**
	 * The URI [<a href='http://www.ietf.org/rfc/rfc2396.txt'>IETF RFC 2396</a>]
	 * of the linked resource. See the href attribute definition in HTML 4.01.
	 *
	 * @return the href
	 */
	public String getHref();

	/**
	 * The URI [<a href='http://www.ietf.org/rfc/rfc2396.txt'>IETF RFC 2396</a>]
	 * of the linked resource. See the href attribute definition in HTML 4.01.
	 *
	 * @param href the new href
	 */
	public void setHref(String href);

	/**
	 * Language code of the linked resource. See the hreflang attribute
	 * definition in HTML 4.01.
	 *
	 * @return the hreflang
	 */
	public String getHreflang();

	/**
	 * Language code of the linked resource. See the hreflang attribute
	 * definition in HTML 4.01.
	 *
	 * @param hreflang the new hreflang
	 */
	public void setHreflang(String hreflang);

	/**
	 * Designed for use with one or more target media. See the media attribute
	 * definition in HTML 4.01.
	 *
	 * @return the media
	 */
	public String getMedia();

	/**
	 * Designed for use with one or more target media. See the media attribute
	 * definition in HTML 4.01.
	 *
	 * @param media the new media
	 */
	public void setMedia(String media);

	/**
	 * Forward link type. See the rel attribute definition in HTML 4.01.
	 *
	 * @return the rel
	 */
	public String getRel();

	/**
	 * Forward link type. See the rel attribute definition in HTML 4.01.
	 *
	 * @param rel the new rel
	 */
	public void setRel(String rel);

	/**
	 * Reverse link type. See the rev attribute definition in HTML 4.01.
	 *
	 * @return the rev
	 */
	public String getRev();

	/**
	 * Reverse link type. See the rev attribute definition in HTML 4.01.
	 *
	 * @param rev the new rev
	 */
	public void setRev(String rev);

	/**
	 * Frame to render the resource in. See the target attribute definition in
	 * HTML 4.01.
	 *
	 * @return the target
	 */
	public String getTarget();

	/**
	 * Frame to render the resource in. See the target attribute definition in
	 * HTML 4.01.
	 *
	 * @param target the new target
	 */
	public void setTarget(String target);

	/**
	 * Advisory content type. See the type attribute definition in HTML 4.01.
	 *
	 * @return the type
	 */
	public String getType();

	/**
	 * Advisory content type. See the type attribute definition in HTML 4.01.
	 *
	 * @param type the new type
	 */
	public void setType(String type);

	/**
	 * Gets the rel list.
	 *
	 * @return the rel list
	 */
	public DOMTokenList getRelList();

	/**
	 * Gets the sizes.
	 *
	 * @return the sizes
	 */
	public DOMSettableTokenList getSizes();

	/**
	 * Sets the sizes.
	 *
	 * @param sizes the new sizes
	 */
	public void setSizes(String sizes);
}