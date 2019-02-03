package com.wy.reflect;

public class Student {

    public String name;
    protected int age;
    char sex;
    private String phoneNum;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }

    Student(String string){
        System.out.println("默认构造 s = "+string);
    }

    public Student() {
        System.out.println("调用了公有、无参构造方法执行了。。。");
    }

    public Student(char name){
        System.out.println("姓名："+name);
    }

    public Student(String name,int age){
        System.out.println("姓名："+name+"，年龄："+age);
    }

    protected Student(boolean n){
        System.out.println("受保护的构造方法 n = "+n);
    }

    private Student(int age){
        System.out.println("私有的构造方法，年龄："+age);
    }

    public void show1(String s){
        System.out.println("调用了公有的String参数的show1()：s="+s);
    }

    protected void show2(){
        System.out.println("调用了受保护的无参的show2()");
    }

    void show3(){
        System.out.println("调用了默认的无参的show3()");
    }
    private String show4(int age){
        System.out.println("调用了私有的并且有返回值的int参数的show4()：age="+age);
        return "返回值";
    }

    public void show(){
        System.out.println("is show()");
    }

    public static void main(String[] args) {
        System.out.println("main方法执行了......");
//        for (Object o:args){
//            System.out.println(o);
//        }
    }
}
