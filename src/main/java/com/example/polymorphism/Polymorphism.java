package com.example.polymorphism;
public class Polymorphism {
    public static void main(String[] args) {
        Tree s1=new Tree();
        s1.treeHas();
        System.out.println("-----------------");
        Branch s2= new Branch();
        s2.treeHas();
        s2.color();
        System.out.println("-----------------");
        Leaves s3= new Leaves();
        s3.treeHas();
        s3.fruit();
        s3.color();
        System.out.println("-----------------");
        Branch s4 = new Leaves();
        System.out.println("Dynamic method overriding -"+s4.color());
    }
}
