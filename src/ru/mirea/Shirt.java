package ru.mirea;

import java.util.ArrayList;

public class Shirt {
    private ArrayList<String> shirts = new ArrayList<>();

    public void addShirt(String s){
        shirts.add(s);
    }

    public void output(){
        for (String s: shirts) {
            System.out.println(s);
        }
    }

}
