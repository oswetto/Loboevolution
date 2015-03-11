package org.mozilla.javascript.arrays;

import java.io.Serializable;

import org.mozilla.javascript.ScriptRuntime;


/**
 * The abstract base class for the different types of external arrays. Users must construct one of
 * the subclasses before passing it to "ScriptableObject.setExternalArray()".
 */

public abstract class ExternalArray
    implements Serializable
{
    
    /**
     * Return the length of the array.
     *
     * @return the length
     */
    public abstract int getLength();

    /**
     * Return true if the given index is in range. Normally users should not need to use this.
     *
     * @param index the index
     * @return true, if successful
     */
    public boolean inRange(int index) {
        return ((index < getLength()) && (index >= 0));
    }

    /**
     * Return the element at the specified index as an Object.
     *
     * @param index the index
     * @return the object
     */
    public Object get(int index) {
        return getElement(index);
    }

    /**
     * Set the element at the specified index.
     *
     * @param index the index
     * @param value the value
     */
    public void put(int index, Object value) {
        try {
            putElement(index, value);
        } catch (ClassCastException cce) {
            throw ScriptRuntime.typeError("Invalid object type for external array");
        }
    }

    /**
     * Copy numeric ids representing the property IDs of each array element to the specified array.
     * Used internally when iterating over the properties of the object.
     *
     * @param ids the ids
     * @return the int
     */
    public int copyIds(Object[] ids) {
        int i;
        for (i = 0; i < getLength(); i++) {
            ids[i] = Integer.valueOf(i);
        }
        return i;
    }

    /**
     * Return the value of the element in a form that works for a script. Caller will check bounds --
     * don't do that.
     *
     * @param index the index
     * @return the element
     */
    protected abstract Object getElement(int index);

    /**
     * Set the value of the element. Don't check bounds. Blind casting is OK -- caller will handle
     * ClassCastException -- don't add an instanceof check.
     *
     * @param index the index
     * @param value the value
     */
    protected abstract void putElement(int index, Object value);
}
