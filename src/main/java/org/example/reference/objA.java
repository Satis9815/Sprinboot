package org.example.reference;

public class objA {
    public objA() {
    }

    public objA(int x, objB obj) {
        this.x = x;
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "objA{" +
                "x=" + x +
                ", obj=" + obj +
                '}';
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public objB getObj() {
        return obj;
    }

    public void setObj(objB obj) {
        this.obj = obj;
    }

    private  int x;
    private  objB obj;

}
