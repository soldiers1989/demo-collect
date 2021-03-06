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
// Generated from file `myinterface.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.sun.ice.demo.myinter;

public abstract class _MyInterface3Disp extends Ice.ObjectImpl implements MyInterface3
{
    protected void
    ice_copyStateFrom(Ice.Object __obj)
        throws java.lang.CloneNotSupportedException
    {
        throw new java.lang.CloneNotSupportedException();
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::myinter::MyInterface",
        "::myinter::MyInterface3",
        "::myinter::StudentInterface"
    };

    public boolean ice_isA(String s)
    {
        return java.util.Arrays.binarySearch(__ids, s) >= 0;
    }

    public boolean ice_isA(String s, Ice.Current __current)
    {
        return java.util.Arrays.binarySearch(__ids, s) >= 0;
    }

    public String[] ice_ids()
    {
        return __ids;
    }

    public String[] ice_ids(Ice.Current __current)
    {
        return __ids;
    }

    public String ice_id()
    {
        return __ids[2];
    }

    public String ice_id(Ice.Current __current)
    {
        return __ids[2];
    }

    public static String ice_staticId()
    {
        return __ids[2];
    }

    public final String getName()
        throws com.sun.ice.demo.common.IllegProxyException
    {
        return getName(null);
    }

    public final void setName(String name)
    {
        setName(name, null);
    }

    public final MyInterfacePrx getMyInterface()
        throws com.sun.ice.demo.common.ProxyException
    {
        return getMyInterface(null);
    }

    public final void setMyInterface(MyInterfacePrx myInterface)
        throws com.sun.ice.demo.common.ProxyException
    {
        setMyInterface(myInterface, null);
    }

    private final static String[] __all =
    {
        "getMyInterface",
        "getName",
        "ice_id",
        "ice_ids",
        "ice_isA",
        "ice_ping",
        "setMyInterface",
        "setName"
    };

    public Ice.DispatchStatus __dispatch(IceInternal.Incoming in, Ice.Current __current)
    {
        int pos = java.util.Arrays.binarySearch(__all, __current.operation);
        if(pos < 0)
        {
            throw new Ice.OperationNotExistException(__current.id, __current.facet, __current.operation);
        }

        switch(pos)
        {
            case 0:
            {
                return _StudentInterfaceDisp.___getMyInterface(this, in, __current);
            }
            case 1:
            {
                return _MyInterfaceDisp.___getName(this, in, __current);
            }
            case 2:
            {
                return ___ice_id(this, in, __current);
            }
            case 3:
            {
                return ___ice_ids(this, in, __current);
            }
            case 4:
            {
                return ___ice_isA(this, in, __current);
            }
            case 5:
            {
                return ___ice_ping(this, in, __current);
            }
            case 6:
            {
                return _StudentInterfaceDisp.___setMyInterface(this, in, __current);
            }
            case 7:
            {
                return _MyInterfaceDisp.___setName(this, in, __current);
            }
        }

        assert(false);
        throw new Ice.OperationNotExistException(__current.id, __current.facet, __current.operation);
    }

    protected void __writeImpl(IceInternal.BasicStream __os)
    {
        __os.startWriteSlice(ice_staticId(), -1, true);
        __os.endWriteSlice();
    }

    protected void __readImpl(IceInternal.BasicStream __is)
    {
        __is.startReadSlice();
        __is.endReadSlice();
    }

    public static final long serialVersionUID = 0L;
}
