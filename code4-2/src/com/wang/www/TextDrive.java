package com.wang.www;
abstract class Shape {
    abstract public void draw();
}
class Cycle extends Shape {
    @Override
    public void draw() {
            System.out.println("圆圆");
    }
}
public class TextDrive {
    public static void main(String[] args) {
        Shape shape = new Cycle();
        shape.draw();

    }
}
