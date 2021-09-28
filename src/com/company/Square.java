package com.company;

public class Square extends Rectangle implements MovablePoint {
    private double side;
    public Square() {
    }

    public Square(double side) {
        this.side=side;
    }

    public Square(double width, double length, double side) {
        super(width, length);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
    @Override
    public void movePoint(float a, float b)
    {
        a+=0.01;
        b+=0.01;
    }
}
