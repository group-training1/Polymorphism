package com.example.polymorphism;

public class Overriding {
    public static void main(String[] args) {
        SuperClass superCls = new SuperClass();
        superCls.method();

        SubClass1 sub1 = new SubClass1();
        sub1.SubClass1method();

        SubClass2 sub2 = new SubClass2();
        sub2.SubClass2method();

        SuperClass superCls_1 = new SuperClass();
        superCls_1.method1(10);

        SubClass1 sub1_1 = new SubClass1();
        sub1_1.method1(10);

        SubClass2 sub2_1 = new SubClass2();
        sub2_1.method1(10);

        SuperClass sub1_2 =new SubClass1();
        sub1_2 .method1(10);

        SuperClass sub2_2 =new SubClass2();
		sub2_2.method1(10);

		SubClass1 sub2_3=new SubClass2();
		sub2_3.method1(10);
    }
}
