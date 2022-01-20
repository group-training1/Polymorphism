package com.example.polymorphism;

public class SubClass2 extends SubClass1 {
    public void SubClass2method(){
        System.out.println("I am from subclass2  subclass2Method()");
    }
    public void method1(int a){
        a=a+10+10;
        System.out.println("I am from subclass2  method1():"+a);
    }
}
