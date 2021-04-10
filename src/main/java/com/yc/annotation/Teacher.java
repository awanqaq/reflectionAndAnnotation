package com.yc.annotation;

/**
 * @program: reflectionAndAnnotation
 * @description:
 * @author: 苗苗酱
 * @create: 2021-04-04 18:50
 */
@MyHelloWorld
public class Teacher {
    @MyHelloWorld
    private String name;

    @MyHelloWorld
    public String show(@MyHelloWorld String s){
        System.out.println(name);
        return name;
    }
}
