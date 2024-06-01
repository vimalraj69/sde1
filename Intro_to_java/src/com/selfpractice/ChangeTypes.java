package com.selfpractice;

public class ChangeTypes {
    public static void main(String[] args) {
        
        int price = 52;
        float priceFloat = price;
        
        System.out.println("Float: " + priceFloat);
        
        byte age = 83;
        int intAge = age;
        
        System.out.println("intAge: " + intAge);
        
        int highestAge = 120;
        byte byteAge = (byte) highestAge;
        
        System.out.println("byteAge: " + byteAge);
        
        highestAge = 130;
        byteAge = (byte) highestAge;
        
        System.out.println("Changed: " + byteAge);
    }
}

