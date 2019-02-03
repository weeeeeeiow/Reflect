package com.wy.reflect;

import java.lang.reflect.Field;

public class GetFields {

    public static void main(String[] args) throws Exception {
        Class stuclass = Class.forName("com.wy.reflect.Student");
        System.out.println("-----------------------获取所有公有的字段-----------------------");
        Field[] fieldArray=stuclass.getFields();
        for(Field field:fieldArray){
            System.out.println(field);
        }
        System.out.println("-----------------------获取所有的字段-----------------------");
        fieldArray=stuclass.getDeclaredFields();
        for (Field field:fieldArray){
            System.out.println(field);
        }
        System.out.println("-----------------------获取公有字段并调用-----------------------");
        Field field=stuclass.getField("name");
        System.out.println(field);
        //获取一个对象
        Object o=stuclass.getConstructor().newInstance();
        System.out.println(o+"+++++++++");
        //为字段设置值
        field.set(o,"刘爽");
        //验证
        Student student=(Student)o;
        System.out.println("验证姓名："+student.name);

        System.out.println("-----------------------获取受保护字段并调用-----------------------");
        field=stuclass.getDeclaredField("age");
        System.out.println(field);
        field.set(o,12);
        System.out.println("验证年龄："+student.age);

        System.out.println("-----------------------获取私有字段并调用-----------------------");
        field=stuclass.getDeclaredField("phoneNum");
        System.out.println(field);
        field.setAccessible(true);
        field.set(o,"15691763813");
        System.out.println("验证电话："+student);


    }

}
