/* -*- Mode: java; tab-width: 8; indent-tabs-mode: nil; c-basic-offset: 4 -*-
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package org.mozilla.javascript.ast;

import org.mozilla.javascript.Token;


/**
 * AST node for the '.' operator.  Node type is {@link Token#GETPROP}.
 */
public class PropertyGet extends InfixExpression {

    {
        type = Token.GETPROP;
    }

    /**
     * Instantiates a new property get.
     */
    public PropertyGet() {
    }

    /**
     * Instantiates a new property get.
     *
     * @param pos the pos
     */
    public PropertyGet(int pos) {
        super(pos);
    }

    /**
     * Instantiates a new property get.
     *
     * @param pos the pos
     * @param len the len
     */
    public PropertyGet(int pos, int len) {
        super(pos, len);
    }

    /**
     * Instantiates a new property get.
     *
     * @param pos the pos
     * @param len the len
     * @param target the target
     * @param property the property
     */
    public PropertyGet(int pos, int len, AstNode target, Name property) {
        super(pos, len, target, property);
    }

    /**
     * Constructor.  Updates bounds to include left ({@code target}) and
     * right ({@code property}) nodes.
     *
     * @param target the target
     * @param property the property
     */
    public PropertyGet(AstNode target, Name property) {
        super(target, property);
    }

    /**
     * Instantiates a new property get.
     *
     * @param target the target
     * @param property the property
     * @param dotPosition the dot position
     */
    public PropertyGet(AstNode target, Name property, int dotPosition) {
        super(Token.GETPROP, target, property, dotPosition);
    }

    /**
     * Returns the object on which the property is being fetched.
     * Should never be {@code null}.
     *
     * @return the target
     */
    public AstNode getTarget() {
        return getLeft();
    }

    /**
     * Sets target object, and sets its parent to this node.
     *
     * @param target expression evaluating to the object upon which
     * to do the property lookup
     */
    public void setTarget(AstNode target) {
        setLeft(target);
    }

    /**
     * Returns the property being accessed.
     *
     * @return the property
     */
    public Name getProperty() {
        return (Name)getRight();
    }

    /**
     * Sets the property being accessed, and sets its parent to this node.
     *
     * @param property the new property
     */
    public void setProperty(Name property) {
        setRight(property);
    }

    /* (non-Javadoc)
     * @see org.mozilla.javascript.ast.InfixExpression#toSource(int)
     */
    @Override
    public String toSource(int depth) {
        StringBuilder sb = new StringBuilder();
        sb.append(makeIndent(depth));
        sb.append(getLeft().toSource(0));
        sb.append(".");
        sb.append(getRight().toSource(0));
        return sb.toString();
    }

    /**
     * Visits this node, the target expression, and the property name.
     *
     * @param v the v
     */
    @Override
    public void visit(NodeVisitor v) {
        if (v.visit(this)) {
            getTarget().visit(v);
            getProperty().visit(v);
        }
    }
}
