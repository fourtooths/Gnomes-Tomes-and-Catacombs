package com.gg.game;

public class Vector {
    private float x;
    private float y;

    public Vector() {
        this(0, 0);
    }

    public Vector(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Vector(Vector other) {
        this(other.getX(), other.getY());
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public static Vector add(Vector v1, Vector v2) {
        float sumX = v1.x + v2.x;
        float sumY = v1.y + v2.y;
        return new Vector(sumX, sumY);
    }
}
