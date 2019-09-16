package com.gg.game;

public class Player extends Character {
    private Vector direction;

    public Player(Vector location) {
        super(location);
        direction = new Vector();
    }

    public Player(float x, float y) {
        super(x, y);
        direction = new Vector();
    }

    @Override
    public void move() {
        location = Vector.add(location, direction);
    }

    @Override
    public void setDirection(Vector direction) {
        this.direction = new Vector(direction);
    }
}
