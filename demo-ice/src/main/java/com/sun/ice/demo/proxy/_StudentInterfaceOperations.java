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

public interface _StudentInterfaceOperations
{
    MyInterfacePrx getMyInterface(Ice.Current __current)
        throws com.sun.ice.demo.common.ProxyException;

    void setMyInterface(MyInterfacePrx myInterface, Ice.Current __current)
        throws com.sun.ice.demo.common.ProxyException;
}