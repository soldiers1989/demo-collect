#include "Glacier2/Session.ice"
#include "common.ice"

[["java:package:com.sun.ice.demo"]]
module myinter {

    // 接口测试及ice文件的相互引用
    interface MyInterface {

        // 获取姓名
        string getName() throws ::common::IllegProxyException ;

        // 设置姓名
        void setName(string name);
    };

    // * 代理操作符，其对应的参数类型必须是接口
    // 代理就像是能代表对象的指针
    interface StudentInterface {

        MyInterface* getMyInterface() throws ::common::ProxyException ;

        void setMyInterface(MyInterface* myInterface) throws ::common::ProxyException;

    };

    // 接口继承，可支持多继承
    // 不能从不止一个基接口那里继承相同的操作名称。(注意)
    interface MyInterface3 extends StudentInterface, MyInterface {

    };

};