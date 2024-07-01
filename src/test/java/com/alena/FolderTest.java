package com.alena;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FolderTest {
    @Test
    public void getFolderSize(){
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
        Assertions.assertEquals(44,pictures.getSize());
        Assertions.assertEquals(70,files.getSize());
        Assertions.assertEquals(154,folder.getSize());

    }
    @Test
    public void emptyFolders(){
        Folder folder1=new Folder("1");
        Folder folder2=new Folder("2");
        Folder folder3=new Folder("3");
        folder2.add(folder3);
        folder1.add(folder2);
        Assertions.assertEquals(0,folder1.getSize());
    }
}
