package edu.epam.Algorithmization.ArraysOfArrays.task9;

//      Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
//      Определить, какой столбец содержит максимальную сумму

import java.util.*;

public class PositiveMatrix {

    public static void main(String[] args) {

        int maxValue = 0;
        int position = 0;

        Scanner input = new Scanner(System.in);

        try {

            System.out.println("Please, enter the size of the array: ");
            int size = input.nextInt();

            int[][] array = new int[size][size];

            System.out.println("Yours array looks like that: ");

            for (int firstCounter = 0; firstCounter < size; firstCounter ++) {

                for (int secondCounter = 0; secondCounter < size; secondCounter++) {

                    array[firstCounter][secondCounter] = (int)(Math.random() * 4);

                    System.out.print(array[firstCounter][secondCounter] + " ");
                }

                System.out.println(" ");
            }

            int[] resultArray = new int[size];

            System.out.println("Sum of elements in each column is: ");

            for (int firstSorting = 0; firstSorting < size; firstSorting ++) {

                for (int secondSorting = 0; secondSorting < size; secondSorting ++) {

                    resultArray[firstSorting] += array[secondSorting][firstSorting];
                    }

                System.out.print(resultArray[firstSorting] + " ");
                }

            System.out.println(" ");

            for (int finalCountdown = 0; finalCountdown < size; finalCountdown ++) {

                if (maxValue < resultArray[finalCountdown]) {

                    maxValue = resultArray[finalCountdown];
                    position += finalCountdown + 1;
                }

            }

            System.out.print("Max value " + maxValue + " consists in " + position + " column");

        } catch (InputMismatchException e) {

            System.out.println("Unfortunately< you input wrong value. Please, try again later.");
        }
    }
}
