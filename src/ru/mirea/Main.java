package ru.mirea;

public class Main {

    public static void main(String[] args) {
        //Тест задания 1
        Person person1 = new Person("Babich");
        Person person2 = new Person("Babich", "Andrey", "Pavlovich");
        System.out.println(person1);
        System.out.println(person2);
        // Тест задания 2
        Address address = new Address("Франция, 63. Париж; Соловьёво-19 3 96");
        System.out.println(address);
        //Тест задания 3
        String shirts[] = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL"; shirts[1] = "S002,Black Polo Shirt,Black,L"; shirts[2] = "S003,Blue Polo Shirt,Blue,XL"; shirts[3] = "S004,Blue Polo Shirt,Blue,M"; shirts[4] = "S005,Tan Polo Shirt,Tan,XL"; shirts[5] = "S006,Black T-Shirt,Black,XL"; shirts[6] = "S007,White T-Shirt,White,XL"; shirts[7] = "S008,White T-Shirt,White,L"; shirts[8] = "S009,Green T-Shirt,Green,S"; shirts[9] = "S010,Orange T-Shirt,Orange,S"; shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        Shirt shirt = new Shirt();
        for (String s: shirts) {
            shirt.addShirt(s);
        }
        shirt.output();
        //Тест задания 4
        PhoneNumber pn = new PhoneNumber("+79055142541");
        PhoneNumber pn2 = new PhoneNumber("89055142541");

        System.out.println(pn);
        System.out.println(pn2);

    }
}
