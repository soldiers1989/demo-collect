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
// Generated from file `proxy.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.sun.ice.demo.proxy;

public final class MyInterface3Holder extends Ice.ObjectHolderBase<MyInterface3>
{
    public
    MyInterface3Holder()
    {
    }

    public
    MyInterface3Holder(MyInterface3 value)
    {
        this.value = value;
    }

    public void
    patch(Ice.Object v)
    {
        if(v == null || v instanceof MyInterface3)
        {
            value = (MyInterface3)v;
        }
        else
        {
            IceInternal.Ex.throwUOE(type(), v);
        }
    }

    public String
    type()
    {
        return _MyInterface3Disp.ice_staticId();
    }
}
