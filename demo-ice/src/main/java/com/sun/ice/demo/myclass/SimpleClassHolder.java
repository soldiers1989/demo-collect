// **********************************************************************
//
// Copyright (c) 2003-2016 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.3
//
// <auto-generated>
//
// Generated from file `myclass.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.sun.ice.demo.myclass;

public final class SimpleClassHolder extends Ice.ObjectHolderBase<SimpleClass>
{
    public
    SimpleClassHolder()
    {
    }

    public
    SimpleClassHolder(SimpleClass value)
    {
        this.value = value;
    }

    public void
    patch(Ice.Object v)
    {
        if(v == null || v instanceof SimpleClass)
        {
            value = (SimpleClass)v;
        }
        else
        {
            IceInternal.Ex.throwUOE(type(), v);
        }
    }

    public String
    type()
    {
        return SimpleClass.ice_staticId();
    }
}