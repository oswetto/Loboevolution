/* -*- Mode: java; tab-width: 8; indent-tabs-mode: nil; c-basic-offset: 4 -*-
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package org.mozilla.javascript;

import java.util.Objects;

/**
 * <p>NativeContinuation class.</p>
 *
 *
 *
 */
public final class NativeContinuation extends IdScriptableObject
    implements Function
{
    private static final long serialVersionUID = 1794167133757605367L;

    private static final Object FTAG = "Continuation";

    private Object implementation;

    /**
     * <p>init.</p>
     *
     * @param cx a {@link org.mozilla.javascript.Context} object.
     * @param scope a {@link org.mozilla.javascript.Scriptable} object.
     * @param sealed a boolean.
     */
    public static void init(Context cx, Scriptable scope, boolean sealed)
    {
        NativeContinuation obj = new NativeContinuation();
        obj.exportAsJSClass(MAX_PROTOTYPE_ID, scope, sealed);
    }

    /**
     * <p>Getter for the field <code>implementation</code>.</p>
     *
     * @return a {@link java.lang.Object} object.
     */
    public Object getImplementation()
    {
        return implementation;
    }

    /**
     * <p>initImplementation.</p>
     *
     * @param implementation a {@link java.lang.Object} object.
     */
    public void initImplementation(Object implementation)
    {
        this.implementation = implementation;
    }

    /** {@inheritDoc} */
    @Override
    public String getClassName()
    {
        return "Continuation";
    }

    /** {@inheritDoc} */
    @Override
    public Scriptable construct(Context cx, Scriptable scope, Object[] args)
    {
        throw Context.reportRuntimeError("Direct call is not supported");
    }

    /** {@inheritDoc} */
    @Override
    public Object call(Context cx, Scriptable scope, Scriptable thisObj,
                       Object[] args)
    {
        return Interpreter.restartContinuation(this, cx, scope, args);
    }

    /**
     * <p>isContinuationConstructor.</p>
     *
     * @param f a {@link org.mozilla.javascript.IdFunctionObject} object.
     * @return a boolean.
     */
    public static boolean isContinuationConstructor(IdFunctionObject f)
    {
        if (f.hasTag(FTAG) && f.methodId() == Id_constructor) {
            return true;
        }
        return false;
    }

    /**
     * Returns true if both continuations have equal implementations.
     *
     * @param c1 one continuation
     * @param c2 another continuation
     * @return true if the implementations of both continuations are equal, or they are both null.
     * @throws java.lang.NullPointerException if either continuation is null
     */
    public static boolean equalImplementations(NativeContinuation c1, NativeContinuation c2) {
        return Objects.equals(c1.implementation, c2.implementation);
    }

    /** {@inheritDoc} */
    @Override
    protected void initPrototypeId(int id)
    {
        String s;
        int arity;
        switch (id) {
          case Id_constructor: arity=0; s="constructor"; break;
          default: throw new IllegalArgumentException(String.valueOf(id));
        }
        initPrototypeMethod(FTAG, id, s, arity);
    }

    /** {@inheritDoc} */
    @Override
    public Object execIdCall(IdFunctionObject f, Context cx, Scriptable scope,
                             Scriptable thisObj, Object[] args)
    {
        if (!f.hasTag(FTAG)) {
            return super.execIdCall(f, cx, scope, thisObj, args);
        }
        int id = f.methodId();
        switch (id) {
          case Id_constructor:
            throw Context.reportRuntimeError("Direct call is not supported");
        }
        throw new IllegalArgumentException(String.valueOf(id));
    }

// #string_id_map#

    /** {@inheritDoc} */
    @Override
    protected int findPrototypeId(String s)
    {
        int id;
// #generated# Last update: 2021-03-21 09:51:50 MEZ
        switch (s) {
        case "constructor":
            id = Id_constructor;
            break;
        default:
            id = 0;
            break;
        }
// #/generated#
        return id;
    }

    private static final int
        Id_constructor          = 1,
        MAX_PROTOTYPE_ID        = 1;

// #/string_id_map#
}
