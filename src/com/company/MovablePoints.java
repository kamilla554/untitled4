package com.company;

public class MovablePoints implements Movable{
    float moveX, moveY;
    public boolean speedCheck()
    {
        if(moveX==moveY) return true;
        else return false;
    }

    public MovablePoints(float moveX, float moveY) {
        this.moveX = moveX;
        this.moveY = moveY;
    }

    @Override
    public void move(float x, float y) {
        x+=moveX;
        y+=moveY;
    }
}
