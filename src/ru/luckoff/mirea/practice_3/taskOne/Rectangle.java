package ru.luckoff.mirea.practice_3.taskOne;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        this.color = "Red";
        this.filled = true;
        this.width = 0;
        this.length = 0;
    }
    public Rectangle(double width, double length) {
        this.color = "Red";
        this.filled = true;
        this.width = width;
        this.length = length;
    }
    public Rectangle(String color, boolean filled, double width, double length) {
        this.color = color;
        this.filled = filled;
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    @Override
    double getArea() {
        return width*length;
    }
    @Override
    double getPerimeter() {
        return 2*width+2*length;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
