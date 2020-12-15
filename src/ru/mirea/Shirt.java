package ru.mirea;

import java.util.ArrayList;

public class Shirt {
    private ArrayList<String> shirts = new ArrayList<>();

    public void addShirt(String s){
        shirts.add(s);
    }

    public void output(){
        String str[];
        for (String s: shirts) {
            str = s.split(",");
            System.out.println("Kod: " + str[0]);
            System.out.println("Name: " + str[1]);
            System.out.println("Color: " + str[2]);
            System.out.println("Size: " + str[3] + "\n\n");
            
        }
    }

}
