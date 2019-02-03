package com.wy.reflect;

public class GetClass {
    public static void main(String[] args) throws ClassNotFoundException {
        //一
        Student student1=new Student();
        Class stuclass=student1.getClass();
        System.out.println(stuclass.getName());
        //二
        Class stuclass2=Student.class;
        System.out.println(stuclass==stuclass2);
        //三
        Class stuclass3=Class.forName("com.wy.reflect.Student");
        System.out.println(stuclass3==stuclass2);
    }
}
