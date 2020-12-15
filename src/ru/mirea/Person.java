package ru.mirea;

public class Person {
    private String name, surname, patronymic;

    Person(String surname) {
        this.surname = surname;
    }

    Person(String surname, String name, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String toString(){
        if(name == null || patronymic == null){
            return surname;
        }
        return surname + " " + name + " " + patronymic;
    }

}