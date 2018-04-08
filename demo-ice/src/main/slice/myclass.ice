[["java:package:com.sun.ice.demo"]]
module myclass {

    exception BaseException {};

    exception UnsupportException extends BaseException {
        string reason;
    };

    // 简单类
    class SimpleClass {
        short   myshort;
        int     myint = 10 ;
        string  mystr = "aaa";
        long    mylong;
    };

    // 类的继承 - 类只支持单继承
    class BaseClass {
        string name;
    };

    // 派生类不能重新定义基类的数据成员
    class ExtendsClass extends BaseClass {
        int age;
    };

    // 类的自引用 - 注意：此处不需要代理符号 *
    // 类具有值语义，代理具有引用语义
    class ReferSelf {
        ReferSelf rself ;
    };

    // 类实现接口 , 接口实现可以多实现，单继承
    interface BaseInterface {
        void sayHello();
    };

    class ExtendInterfaceClassa implements BaseInterface {
        string name;
    };




};