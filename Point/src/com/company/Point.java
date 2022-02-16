package com.company;

public class Point {

    private int x;
    private int y;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0,0);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(((double)(this.x - 0) * (this.x - 0) + (this.y - 0) * (this.y - 0)));
    }
    public double distance(int x, int y) {
        return Math.sqrt(((double)(this.x - x) * (this.x - x) + (this.y - y) * (this.y - y)));
    }
    public double distance(Point point) {
        return Math.sqrt(((double)(this.x - point.getX()) * (this.x - point.getX()) + (this.y - point.getY()) * (this.y - point.getY())));
    }
}
