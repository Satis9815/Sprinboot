package org.example.reference;

public class objB {
    public objB() {
    }

    private int y;

    public objB(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "objB{" +
                "y=" + y +
                '}';
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
