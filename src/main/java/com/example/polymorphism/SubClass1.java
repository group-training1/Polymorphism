package com.example.polymorphism;

public class SubClass1 extends SuperClass {
    public void SubClass1method() {
        System.out.println("I am from subclass1  subclass1Method()");
    }

    public void method1(int a){
	    a=10+10;
		System.out.println("I am from subclass1  method1():"+a);
	}

}

