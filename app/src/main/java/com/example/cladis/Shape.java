package com.example.cladis;

public abstract class Shape {
    Integer x;
    Integer y;
    String color = "purple";

    public Shape(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }
}
