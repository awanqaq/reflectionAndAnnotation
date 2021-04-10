package com.yc.refection;

/**
 * @program: maven01
 * @description:
 * @author: 苗苗酱
 * @create: 2021-03-29 20:06
 */
public class person implements Showable{
    private  String name;
    private  int age;

    public person(){System.out.println("无参数构造方法");}

    public  person(String name){
        this.name=name;
        System.out.println("有参数构造方法");
    }

    @Override
    public String toString() {
        return "person{"+"name='"+name+"\'"+",age="+age+'}';
    }

    @Override
    public void show() {

    }
    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public  String getName(){
        return  name;
    }
    public int getAge(){
        return age;
    }
}
