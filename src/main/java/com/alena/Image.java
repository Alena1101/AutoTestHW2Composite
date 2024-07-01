package com.alena;

public class Image implements File {
    private String name;
    private int size;
    private double dimension;


    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    public double getDimension() {
        return dimension;
    }

    public Image(String name, int size, double dimension) {
        this.name = name;
        this.size = size;
        this.dimension = dimension;
    }
}
