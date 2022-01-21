package com.example.polymorphism;

public class OverridingShapes {
    public static void main(String[] args) {
        Shape obj;
        obj = new Shape();
        obj.draw();
        obj = new Circle();
        obj.draw();
        obj = new Square();
        obj.draw();
        obj = new Triangle();
        obj.draw();
    }
}
