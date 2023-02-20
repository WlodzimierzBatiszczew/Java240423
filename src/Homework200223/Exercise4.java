package Homework200223;

import java.util.Random;
public class Exercise4 {
    public static void main(String[] args) {

        Random random1 = new Random();

        int[] array11 = new int[30];
        for (int i = 0; i < array11.length; i++) {
            array11[i] = random1.nextInt(1, 101);
            System.out.print(array11[i] + ", ");

        }
        System.out.println();
        System.out.println();


        int indexMax = 0;
        int indexMin = 0;
        int minNumber = array11[0];
        int maxNumber = array11[0];


        for (int j = 1; j < array11.length; j++) {
            if (array11[j] < minNumber) {
                minNumber = array11[j];
                indexMin = j;
            }
        }
        System.out.println("Минимальное число = " + minNumber );

        for (int c = 0; c < array11.length; c++) {
            if (array11[c] > maxNumber) {
                maxNumber = array11[c];
                indexMax = c;
            }
        }
        System.out.println("Максимальное число = " + maxNumber );
        System.out.println("Количество элементов между минимальным элементом и максимальным элементом = " +
                (Math.abs(indexMax - indexMin) - 1));


        double array11Sum = 0;
        for (int c = 0; c < array11.length; c++) {
            array11Sum = array11Sum + array11[c];
        }
        System.out.println("Среднее арифметическое всего ряда = " + array11Sum / array11.length);

        int counter = 1;
        int bufferNumber = 0;


        for (int i = 0; i < array11.length; i++) {


            int number1 = array11[i];
            int div = 0;
            for (int p = 1; p < (number1); p++) {
                if (number1 % (p) == 0) {
                    div = div + 1;
                }
            }
            if (number1 <= 3) {
                div = 1;
            }



            if (div == 1 && counter == 1) {
                System.out.println(number1 + " является первым простым числом  ");
                counter = counter + 1;

            } else if ( div == 1 && counter > 1){
                counter = counter + 1;
                bufferNumber = array11[i];
            }

            }
        System.out.println( bufferNumber + " является последним простым числом ");
        System.out.println( "В последовательности " + counter + " простых чисел");

        }


    }







