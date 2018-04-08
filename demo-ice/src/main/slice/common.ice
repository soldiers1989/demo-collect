[["java:package:com.sun.ice.demo"]]
// 定义一个模块
module common {

    enum NoParams {
        ONE , TWO
    };

    enum OneParams {
        THREE = 22,
        FOUR = 33
    };

    // 结构定义 - 子
    ["java:getset"]
    struct Books {
        string  bookName;
        float   bookPrice;
    };

    // 引用子结构
    ["java:getset"]
    struct Student {
        short   age;
        int     height;
        long    legLength;
        double  money;
        string  name;
        Books   books;
    };

    // 定义一个序列类型
    sequence<Student> StuList ;

    // 定义一个词典类型
    dictionary<string , Student> StuMap ;

    // 定义常量 MY_BOOL (不能有下滑线)
    const bool MyConstBool = true;
    const string MyConstStr = "Alice";
    const int MyConstInt = 12;
    // 枚举常量
    const OneParams MyConstEnum = THREE;

    // 异常定义 - 空异常定义也是有效的
    exception ProxyException {
        string reason;
    };

    // 异常继承 - 继承可以用来区分层次 注意：异常仅支持单继承
    exception IllegProxyException extends ProxyException {
        int code;
        NoParams noParams;
    };

};