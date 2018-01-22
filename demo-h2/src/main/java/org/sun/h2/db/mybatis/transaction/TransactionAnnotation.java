package org.sun.h2.db.mybatis.transaction;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TransactionAnnotation {

    // 注解返回值
    Propagation value() default Propagation.REQUIRED;

}
