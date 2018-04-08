[["java:package:com.sun.ice.demo"]]
module mymodule {

    module module01 {
        sequence<string> NameList;
    };

    // ::
    module module02 {

        interface ModuleInterface {

            module01::NameList getList();

        };

    };

};