package org.example;

public class Main {
    public static void main(String[] args) {
        String firstName = "Vlad";
        int age = 28;
        String location = "DE";
        String productName = "Diablo IV";
        double price = 69.99;
        String euro = "\u20ac";

        System.out.println("Hello " + firstName + "! We know that you are " + age + " years old and that you still like " +
                "to play " + productName + ". If you are in " + location + " region, you will not get special offer, so buy it " +
                "for the " + price + euro + " price and let's fight with the Lilith!");


        int addition = 20 + 3;
        int subtraction = 20 - 3;
        int multiply = 20 * 3;
        double divide = 20 / 3;
        System.out.println("\naddition = " + addition + ";\tsubtraction = " + subtraction + ";\tmultiply = " +
                multiply + ";\tdivide = " + divide + ";");




    }

}
