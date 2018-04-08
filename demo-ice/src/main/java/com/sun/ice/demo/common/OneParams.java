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
// Generated from file `common.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.sun.ice.demo.common;

public enum OneParams implements java.io.Serializable
{
    
    THREE(22),
    
    FOUR(33);

    public int
    value()
    {
        return __value;
    }

    public static OneParams
    valueOf(int __v)
    {
        switch(__v)
        {
        case 22:
            return THREE;
        case 33:
            return FOUR;
        }
        return null;
    }

    private
    OneParams(int __v)
    {
        __value = __v;
    }

    public void
    __write(IceInternal.BasicStream __os)
    {
        __os.writeEnum(value(), 33);
    }

    public static void
    __write(IceInternal.BasicStream __os, OneParams __v)
    {
        if(__v == null)
        {
            __os.writeEnum(com.sun.ice.demo.common.OneParams.THREE.value(), 33);
        }
        else
        {
            __os.writeEnum(__v.value(), 33);
        }
    }

    public static OneParams
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readEnum(33);
        return __validate(__v);
    }

    private static OneParams
    __validate(int __v)
    {
        final OneParams __e = valueOf(__v);
        if(__e == null)
        {
            throw new Ice.MarshalException("enumerator value " + __v + " is out of range");
        }
        return __e;
    }

    private final int __value;
}