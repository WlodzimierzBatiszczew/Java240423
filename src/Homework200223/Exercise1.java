package Homework200223;

import java.util.Random;

public class Exercise1 {
    public static void main(String[] args) {


        Random random = new Random();

        int[] array1 = new int[8];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(1, 51);
            System.out.print(array1[i] +" ");

        }

        System.out.println(" ");
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0) {
                array1[i] =0;
            }
            System.out.print(array1[i] +" ");

        }


    }
}
