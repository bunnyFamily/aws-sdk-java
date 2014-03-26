/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudsearchv2.model;

import java.io.Serializable;

/**
 * <p>
 * The result of a <code>DefineExpression</code> request. Contains the
 * status of the newly-configured expression.
 * </p>
 */
public class DefineExpressionResult implements Serializable {

    /**
     * The value of an <code>Expression</code> and its current status.
     */
    private ExpressionStatus expression;

    /**
     * The value of an <code>Expression</code> and its current status.
     *
     * @return The value of an <code>Expression</code> and its current status.
     */
    public ExpressionStatus getExpression() {
        return expression;
    }
    
    /**
     * The value of an <code>Expression</code> and its current status.
     *
     * @param expression The value of an <code>Expression</code> and its current status.
     */
    public void setExpression(ExpressionStatus expression) {
        this.expression = expression;
    }
    
    /**
     * The value of an <code>Expression</code> and its current status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param expression The value of an <code>Expression</code> and its current status.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DefineExpressionResult withExpression(ExpressionStatus expression) {
        this.expression = expression;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getExpression() != null) sb.append("Expression: " + getExpression() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DefineExpressionResult == false) return false;
        DefineExpressionResult other = (DefineExpressionResult)obj;
        
        if (other.getExpression() == null ^ this.getExpression() == null) return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false) return false; 
        return true;
    }
    
}
    