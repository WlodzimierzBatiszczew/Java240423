package Homework200223;

import java.util.Random;

public class Exercise2 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] array1 = new int[8];
        for (int i = 0; i < 5; i++) {
            array1[i] = random.nextInt(10, 99);
            System.out.print(array1[i] +" ");

        }
        System.out.println(" ");
        int k = array1[0];
        int a = 0;
        int i = 1;

        while (k < array1[i]) {
            k = array1[i];
            i = i + 1;
        }
        if(i < 4){
            System.out.println("Массив НЕ является строго возрастающей последовательностью.");

        } else {
            System.out.println("Массив является строго возрастающей последовательностью.");
        }
    }
}
