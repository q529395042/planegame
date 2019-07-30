package com.ch.base;


import java.awt.Image;

public abstract class BaseSprite {
    private int x;
    private int y;
    private Image image;
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
