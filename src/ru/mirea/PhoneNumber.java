package ru.mirea;

public class PhoneNumber {
    private String num;

    PhoneNumber(String n){
        if(n.substring(0,1).equals("+")){
            num = n.substring(0,n.length() - 7) + "-" + n.substring(n.length() - 7,n.length() - 4) + "-" + n.substring(n.length() - 4);
        }else{
            num = "+" +"7" + n.substring(n.length() - 10,n.length() - 7) + "-" + n.substring(n.length() - 7,n.length() - 4) + "-" + n.substring(n.length() - 4);
        }
    }

    @Override
    public String toString() {
        return num;
    }
}
