package edu.epam.Algorithmization.ArraysOfArrays.task10;

//  Найти положительные элементы главной диагонали квадратной матрицы

import java.util.*;

public class MainDiagonal {

    public static void main(String[] args) {

        int maxValue = 0;
        int position = 0;

        Scanner input = new Scanner(System.in);

        try {

            System.out.println("Please, enter the size of the array: ");
            int size = input.nextInt();

            int[][] array = new int[size][size];

            System.out.println("Yours array looks like that: ");

            for (int firstCounter = 0; firstCounter < size; firstCounter++) {

                for (int secondCounter = 0; secondCounter < size; secondCounter++) {

                    array[firstCounter][secondCounter] = (int) (Math.random() * 20 - 10);

                    System.out.print(array[firstCounter][secondCounter] + " ");
                }

                System.out.println(" ");
            }

            int[] resultArray = new int[size];

            System.out.println("Positive elements of the main diagonal this square matrix is: ");

            for (int firstSorting = 0; firstSorting < size; firstSorting++) {

                for (int secondSorting = 0; secondSorting < size; secondSorting++) {

                    if (firstSorting == secondSorting & array[firstSorting][secondSorting] > 0) {

                        resultArray[firstSorting] = array[firstSorting][secondSorting];
                    }
                }
            }

            for (int sorting = 0; sorting < size; sorting ++) {

                if (resultArray[sorting] < resultArray[size - 1 - sorting]) {

                    resultArray[sorting] = resultArray[size - 1 - sorting];
                    resultArray[size - 1 - sorting] = 0;
                }

                System.out.print(resultArray[sorting] + " ");
            }
            System.out.println(" ");

//        for (int finalCountdown = 0; finalCountdown < size; finalCountdown ++) {
//
//            if (maxValue < resultArray[finalCountdown]) {
//
//                maxValue = resultArray[finalCountdown];
//                position += finalCountdown + 1;
//            }
//
//        }
//
//        System.out.print("Max value " + maxValue + " consists in " + position + " column");

        } catch (InputMismatchException e) {

            System.out.println("Unfortunately< you input wrong value. Please, try again later.");
        }
    }
}
