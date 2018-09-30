package com.sun.processor;

import com.sun.annotation.CircuitAnnotation;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.TypeElement;
import java.util.LinkedHashSet;
import java.util.Set;

/** 注解处理器 */
public class CircuitAnnotationProcessor extends AbstractProcessor {

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        Set<String> list = new LinkedHashSet<>();
        list.add(CircuitAnnotation.class.getCanonicalName());
        return list;
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latestSupported();
    }

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        System.out.println("............");
        // roundEnv.getElementsAnnotatedWith()返回使用给定注解类型的元素
        for (Element element : roundEnv.getElementsAnnotatedWith(CircuitAnnotation.class)) {
            System.out.println("------------------------------");
            // 判断元素的类型为Class
            if (element.getKind() == ElementKind.CLASS) {
                // 显示转换元素类型
                TypeElement typeElement = (TypeElement) element;
                // 输出元素名称
                System.out.println(typeElement.getSimpleName());
                // 输出注解属性值
                System.out.println(typeElement.getAnnotation(CircuitAnnotation.class).value());
            }
            System.out.println("------------------------------");
        }
        return false;

    }
}
