package com.company;

public class MovableRectangle extends Rectangle implements Movable{
    float moveX, moveY;

    @Override
    public void move(float x, float y) {
    x+=moveX;
    y+=moveY;
    }

    MovablePoints points = new MovablePoints(moveX, moveY);
}
