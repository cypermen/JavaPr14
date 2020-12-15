package ru.mirea;
import java.util.StringTokenizer;
public class Address {
    private String country, region, city, street, house, block, flat;

    Address(String s){
        StringTokenizer st = new StringTokenizer(s," ,.-;");
        country = st.nextToken();
        region = st.nextToken();
        city = st.nextToken();
        street = st.nextToken();
        house = st.nextToken();
        block = st.nextToken();
        flat = st.nextToken();
    }

    public String toString() { return ("Полный адрес: " + country + " " + region + " " + city + " " + street + " " + house + " " + block + " " + flat); }
}
