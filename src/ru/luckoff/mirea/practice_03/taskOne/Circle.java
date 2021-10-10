package ru.luckoff.mirea.practice_03.taskOne;

public class Circle extends Shape {
    protected double radius;

    public Circle() {
        this.color = "Red";
        this.filled = true;
        this.radius = 0;
    }
    public Circle(double radius) {
        this.color = "Red";
        this.filled = true;
        this.radius = radius;
    }
    public Circle(String color, boolean filled, double radius) {
        this.color = color;
        this.filled = filled;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    double getArea() {
        return 3.14*radius*radius;
    }
    @Override
    double getPerimeter() {
        return 2*3.14*radius;
    }
    @Override
    public String toString() {
        return "Circle{"+"radius="+radius+", color='"+color+'\''+", filled="+filled+'}';
    }
}
