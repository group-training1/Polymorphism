package com.example.polymorphism;

public class Branch extends Tree{
    public void treeHas(){
        System.out.println("This part of tree is branch");
    }
    public String color(){
        System.out.println("Brown Colored branch");
        return "Brown Colored Branch";
    }
}
