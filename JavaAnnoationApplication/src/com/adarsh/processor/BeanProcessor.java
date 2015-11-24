package com.adarsh.processor;

import com.adarsh.annoation.IdentifierClass;
import com.adarsh.annoation.IdentifierMethod;
import com.adarsh.annoation.IdentifierParam;
import com.adarsh.annoation.IdentifierProperty;
import com.adarsh.bean.Bean;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh
 * Date: 9/11/12
 * Time: 4:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class BeanProcessor {

    public void getClassProfile() {
        System.out.println("\n");
        Annotation[] classAnnotations = beanObject.getClass().getAnnotations();
        for (Annotation classAnnotation : classAnnotations) {
            System.out.println("Class Annotation Type " + classAnnotation.annotationType());
            System.out.println("Class Annotation Param Value " + ((IdentifierClass) classAnnotation).value());
            System.out.println("Class Annotation Param Name " + ((IdentifierClass) classAnnotation).name());
            System.out.println("Class Annotation Name " + classAnnotation.annotationType().getSimpleName());

        }

        System.out.println("\n");
        Field[] fields = beanObject.getClass().getFields();
        for (Field fieldObject : fields) {
            Annotation[] fieldAnnotations = fieldObject.getAnnotations();
            for (Annotation fieldAnnotation : fieldAnnotations) {
                System.out.println("Field Annotation Type " + fieldAnnotation.annotationType());
                System.out.println("Field Annotation Value" + ((IdentifierProperty) fieldAnnotation).value());
                System.out.println("Field Annotation Name" + fieldAnnotation.annotationType().getSimpleName());
            }
        }


        System.out.println("\n");
        Method[] methods = beanObject.getClass().getMethods();
        for (Method methodObject : methods) {
            Annotation[] methodAnnotations = methodObject.getDeclaredAnnotations();
            for (Annotation methodAnnotation : methodAnnotations) {
                System.out.println("Method Annotation Type " + methodAnnotation.annotationType());
                System.out.println("Method Annotation Value " + ((IdentifierMethod) methodAnnotation).value());
                System.out.println("Method Annotation Name " + methodAnnotation.annotationType().getSimpleName());
            }

            Annotation[][] methodParameterAnnotation = methodObject.getParameterAnnotations();
            for (Annotation[] ann1 : methodParameterAnnotation) {
                System.out.println("\n");
                for (Annotation ann2 : ann1) {
                    System.out.println("Method Parameter Annotation Type " + ann2.annotationType());
                    System.out.println("Method Parameter Annotation Value " + ((IdentifierParam) ann2).value());
                    System.out.println("Method Parameter Annotation Name " + ann2.annotationType().getSimpleName());
                }
            }
        }


    }

    private Bean beanObject;

    public void setBeanObject(Bean beanObject) {
        this.beanObject = beanObject;
    }
}
