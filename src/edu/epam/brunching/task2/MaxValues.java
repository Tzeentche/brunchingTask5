package edu.epam.brunching.task2;

//      Найти max{min(a, b), min(c,d)}

import java.util.*;

public class MaxValues {

    public static void main(String[] args) {

        double[] variablesCounter = new double[4];
        double minValue1, minValue2, maxValue;
        char[] variables = {'A', 'B', 'C', 'D'};

        Scanner input = new Scanner(System.in);

        try {

            for (int counter = 0; counter < variablesCounter.length; counter ++) {

                System.out.println("Please, enter the variable for " + variables[counter] + ": ");
                variablesCounter[counter] = input.nextDouble();
            }

        } catch (InputMismatchException e) {

            System.out.println("Please, for next time enter NUMERAL value! You can try again.");
        }

        if (variablesCounter[0] > variablesCounter[1]) {

            minValue1 = variablesCounter[1];
        } else { minValue1 = variablesCounter[0]; }

        if (variablesCounter[2] > variablesCounter[3]) {

            minValue2 = variablesCounter[3];
        } else { minValue2 = variablesCounter[2]; }

        if (minValue1 > minValue2) {

            maxValue = minValue1;
        } else { maxValue = minValue2; }

        System.out.println("Max value from min values is " + maxValue);
    }
}
