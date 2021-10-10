package ru.luckoff.mirea.practice_03.taskOne;

public class Square extends Rectangle {
    protected double side;

    public Square() {
        this.color = "Red";
        this.filled = true;
        this.side = 0;
    }
    public Square(double side) {
        this.color = "Red";
        this.filled = true;
        this.side = side;
    }
    public Square(String color, boolean filled, double side) {
        this.color = color;
        this.filled = filled;
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public String toString() {
        return "Square{"+"width="+width+", length="+ length
                +", color='"+color+'\''+", filled="+filled+", side="+side+'}';
    }
}
