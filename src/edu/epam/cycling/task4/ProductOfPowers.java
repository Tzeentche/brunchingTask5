package edu.epam.cycling.task4;

//  Составить программу нахождения произведения квадратов первых двухсот чисел

public class ProductOfPowers {

    public static void main(String[] args) {

        int productOfPower = 1;

        for
                (int number = 1; number <= 200; number ++) {

            productOfPower += (productOfPower * Math.pow(number, 2));
        }

        System.out.println("Product of power to 2 of first 200 numbers is " + productOfPower);

    }
}
