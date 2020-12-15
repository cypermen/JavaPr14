package ru.mirea;

import java.util.ArrayList;

public class Shirt {
    //private ArrayList<String> shirts = new ArrayList<>();
    private String kod, name, color, size;

    Shirt(String s) {
        String str[] =  s.split(",");;
        kod = str[0];
        name  = str[1];
        color = str[2];
        size = str[3];
    }

    public void output(){
            System.out.println("Kod: " + kod);
            System.out.println("Name: " + name);
            System.out.println("Color: " + color);
            System.out.println("Size: " + size + "\n\n");
    }

}
