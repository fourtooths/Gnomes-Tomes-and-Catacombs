package com.gg.game;

public abstract class Character implements Positionable {
    protected Vector location;

    public Character(Vector location) {
        this.location = new Vector(location);
    }

    public Character(float x, float y) {
        this.location = new Vector(x, y);
    }

    @Override
    public void setPos(int x, int y) {
        location.setX(x);
        location.setY(y);
    }

    @Override
    public void setPos(Vector point) {
        location = new Vector(point);
    }

    @Override
    public Vector getPos() {
        return new Vector(location);
    }

    public abstract void move();

    public abstract void setDirection(Vector direction);
}
