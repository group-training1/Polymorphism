package com.example.polymorphism;

public class Leaves extends Branch{
    public void treeHas(){
        System.out.println("This part of tree is leaves");
    }
    public void fruit(){
        System.out.println("This part contains fruit");
    }
    public String color(){
        System.out.println("Brown Colored leaves");
        return "Brown Colored leaves";
    }
}
