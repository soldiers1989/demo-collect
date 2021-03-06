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
// Generated from file `mymodule.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.sun.ice.demo.mymodule.module02;

public interface ModuleInterfacePrx extends Ice.ObjectPrx
{
    public String[] getList();

    public String[] getList(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getList();

    public Ice.AsyncResult begin_getList(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getList(Ice.Callback __cb);

    public Ice.AsyncResult begin_getList(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getList(Callback_ModuleInterface_getList __cb);

    public Ice.AsyncResult begin_getList(java.util.Map<String, String> __ctx, Callback_ModuleInterface_getList __cb);

    public Ice.AsyncResult begin_getList(IceInternal.Functional_GenericCallback1<String[]> __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_getList(IceInternal.Functional_GenericCallback1<String[]> __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                         IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_getList(java.util.Map<String, String> __ctx, 
                                         IceInternal.Functional_GenericCallback1<String[]> __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_getList(java.util.Map<String, String> __ctx, 
                                         IceInternal.Functional_GenericCallback1<String[]> __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                         IceInternal.Functional_BoolCallback __sentCb);

    public String[] end_getList(Ice.AsyncResult __result);
}
