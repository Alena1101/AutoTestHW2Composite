package com.alena;

import java.util.ArrayList;
import java.util.List;

public class Folder implements File{
    private List<File> fileList = new ArrayList<>();
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    public void add(File file){
        fileList.add(file);
    }


    public String getName() {

        return name;
    }

    @Override
    public int getSize() {
      int size=0;
      for (File file: fileList){
          size=size+ file.getSize();
      }
        return size;
    }
}
