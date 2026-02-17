package com.example.cladis;

public abstract class Shape {
    Integer x;
    Integer y;
    String color = "magenta";

    public Shape(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }
}
