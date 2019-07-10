package edu.epam.brunching.task5;

//      Вычислить значение функции F(x) x^2+3x+9 если x <= 3
//                                      1/(x^3 - 6) если x > 3

import java.util.*;

public class functionValue {

    public static void main(String[] args) {

        double function, valueX = 0;

        Scanner input = new Scanner(System.in);

        try {

            System.out.println("Please, enter value for X:");
            valueX = input.nextDouble();

        } catch (InputMismatchException e) {

            System.out.println("");
        }

            if (valueX <= 3) {

                function = ((Math.pow(valueX, 2) - (3 * valueX) + 9));

            } else {

                function = 1 / (Math.pow(valueX, 3) + 6);
            }

        System.out.println("Your result is " + function);
    }
}
