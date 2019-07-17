package edu.epam.brunching.task4;

//    Заданы размеры А, В прямоугольного отверстия и размеры Х, Y, Z кирпича.
//    Определите, пройдет ли кирпич через отверстие

import java.util.*;

public class BricksSizes {

    public static void main(String[] args) {

        double[] holeVariables = new double[2];
        double[] brickVariables = new double[3];
        char[] holeSize = {'A', 'B'};
        char[] brickSize = {'X', 'Y', 'Z'};

        Scanner input = new Scanner(System.in);

        try{

            for (int counter1 = 0; counter1 < holeSize.length; counter1 ++) {

                System.out.println("Please, enter size " + holeSize[counter1] + " of a rectangular hole:");
                holeVariables[counter1] = input.nextDouble();
            }

            for (int counter2 = 0; counter2 < brickSize.length; counter2 ++) {

                System.out.println("Please, enter size " + brickSize[counter2] + " of a brick:" +
                        "");
                brickVariables[counter2] = input.nextDouble();
            }

        } catch (InputMismatchException e) {

            System.out.println("Please, enter some NUMERAL variables!");
        }

        if (((holeVariables[0] >= brickVariables[0]) & (holeVariables[1] >= brickVariables[1])) |
                ((holeVariables[0] >= brickVariables[1]) & (holeVariables[1] >= brickVariables[2])) |
                ((holeVariables[0] >= brickVariables[0]) & (holeVariables[1] >= brickVariables[2]))) {

            System.out.println("Your brick is suitable");

        } else {
            System.out.println("Unfortunately, your brick is unsuitable!");
        }
    }
}
