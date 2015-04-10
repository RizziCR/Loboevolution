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
 * Created on Apr 17, 2005
 */
package org.lobobrowser.util;

import java.util.Iterator;


/**
 * The Class ArrayUtilities.
 *
 * @author J. H. S.
 */
public class ArrayUtilities {

	/**
	 * Instantiates a new array utilities.
	 */
	private ArrayUtilities() {
		super();
	}

	/**
	 * Iterator.
	 *
	 * @param array the array
	 * @param offset the offset
	 * @param length the length
	 * @return the iterator
	 */
	public static Iterator iterator(Object[] array, int offset, int length) {
		return new ArrayIterator(array, offset, length);
	}

	/**
	 * The Class ArrayIterator.
	 */
	private static class ArrayIterator implements Iterator {
		
		/** The array. */
		private final Object[] array;
		
		/** The top. */
		private final int top;
		
		/** The offset. */
		private int offset;

		/**
		 * Instantiates a new array iterator.
		 *
		 * @param array the array
		 * @param offset the offset
		 * @param length the length
		 */
		public ArrayIterator(Object[] array, int offset, int length) {
			this.array = array;
			this.offset = offset;
			this.top = offset + length;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.util.Iterator#hasNext()
		 */
		public boolean hasNext() {
			return this.offset < this.top;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.util.Iterator#next()
		 */
		public Object next() {
			return this.array[this.offset++];
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.util.Iterator#remove()
		 */
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}
}