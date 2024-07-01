package com.alena;

public class PdfFile implements File {
    private String name;
    private int size;
    private String text;



    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    public String getText() {
        return text;
    }

    public PdfFile(String name, int size, String text) {
        this.name = name;
        this.size = size;
        this.text = text;
    }
}
