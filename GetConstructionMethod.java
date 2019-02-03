package com.wy.reflect;

import java.lang.reflect.Constructor;

public class GetConstructionMethod {
    public static void main(String[] args) throws Exception{
        //加载Class对象
        Class clazz=Class.forName("com.wy.reflect.Student");

        //获取构造方法
        System.out.println("-----------所有公有的构造方法-----------");
        Constructor[] constructors=clazz.getConstructors();
        for (Constructor constructor:constructors){
            System.out.println(constructor);
        }

        System.out.println("-----------所有构造方法-----------");
        constructors=clazz.getDeclaredConstructors();
        for (Constructor constructor:constructors){
            System.out.println(constructor);
        }

        System.out.println("-----------获取公有、无参的构造方法-----------");
        Constructor constructor=clazz.getConstructor(/*char.class*/);
        System.out.println("constructor = "+constructor);
        //调用构造方法
        constructor.newInstance();

        System.out.println("-----------获取私有的构造方法并调用-----------");
        constructor = clazz.getDeclaredConstructor(int.class);
        System.out.println(constructor);
        //调用构造方法
        constructor.setAccessible(true);//暴力访问，忽略访问修饰符
        constructor.newInstance(12);

    }
}
