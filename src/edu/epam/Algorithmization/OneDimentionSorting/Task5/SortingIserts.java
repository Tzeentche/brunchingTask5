package edu.epam.Algorithmization.OneDimentionSorting.Task5;

//  Сортировка вставками. Дана последовательность чисел а1, а2, ..., аn. Требуется переставить числа в порядке возрастания.
//  Делается это следующим образом. Пусть а1, а2, ..., аi, — упорядоченная по неубыванию последовательность, т. е. а1<=а2<= ... <= ai.
//  Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая последовательность была также возрастающей.
//  Процесс производится до тех пор, пока все элементы от i+1 до n не будут перебраны. Примечание. Место помещения очередного
//  элемента в отсортированную часть найти с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.

import java.util.*;
import java.lang.*;

public class SortingIserts {

    public static void main(String[] args) {

        int counter = 0;
        int boofer = 0;

        try {

            System.out.println("The size of the array is 20: ");

            int[] array = new int[20];

            for (int firstCounter = 0; firstCounter < 8; firstCounter ++) {

                array[firstCounter] = firstCounter;

                System.out.print(array[firstCounter] + " ");
            }

            for (int secondCounter = 8; secondCounter < 20; secondCounter ++) {

            array[secondCounter] = (int)(Math.random() * 20 - 10);

                System.out.print(array[secondCounter] + " ");
            }

            System.out.println(" ");

            for (int sortingIndex = 0; sortingIndex < 20; sortingIndex ++) {

                for (int valuesSorting = 0; valuesSorting < 20 - 1; valuesSorting ++) {

                    if (array[valuesSorting] > array[valuesSorting + 1]) {

                        counter += 1;

                        boofer = array[valuesSorting];
                        array[valuesSorting] = array[valuesSorting + 1];
                        array[valuesSorting + 1] = boofer;
                    }
                }
            }

            for (int finalCountdown = 0; finalCountdown < 20; finalCountdown ++) {

                System.out.print(array[finalCountdown] + " ");
            }

            System.out.println(" ");
            System.out.println("The number of permutations in the array is " + counter);

        } catch (InputMismatchException e) {

            System.out.println("Unfortunately< you input wrong value. Please, try again later.");
        }
    }
}
