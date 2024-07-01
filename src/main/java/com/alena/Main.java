package com.alena;

public class Main {
    public static void main(String[] args) {
        Folder pictures = new Folder("pictures");
        pictures.add(new Image("1.jpeg",12,152.3));
        pictures.add(new Image("2.jpeg",14,142.3));
        pictures.add(new Image("3.jpeg",18,162.3));
        Folder files = new Folder("files");
        files.add(new PdfFile("1.pdf",22,"112.3"));
        files.add(new PdfFile("2.pdf",36,"162.3"));
        files.add(new PdfFile("3.pdf",12,"182.3"));
        Folder folder=new Folder("all");
        folder.add(pictures);
        folder.add(files);
        folder.add(new PdfFile("myPdf.pdf",40,"test"));
        System.out.println("Size pictures: "+pictures.getSize());
        System.out.println("Size files: "+files.getSize());
        System.out.println("Size all: "+folder.getSize());
    }
}