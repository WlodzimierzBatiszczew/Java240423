package Homework26022023;

import java.util.Random;

public class SumCombinations1 {
    public static void main(String[] args) {

        Random random = new Random();

        int N = 9;
        int K = 12;

        int[] array1 = new int[N];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(1, 10);
            System.out.print(array1[i] + ", ");
        }
        int counterOfCombination = 0;
        int t = 0;
        for (int f = 0; f < array1.length - 1; f++) {

            int p = 1;
            for (int j = t + 1; j < array1.length; j++) {
            if ((array1[t] + array1[t + p]) == K) {
                counterOfCombination = counterOfCombination + 1;
            }
            p = p + 1;
            }
            t = t + 1;
        }
        System.out.println();
            System.out.println("Количество комбинация двух чисел дающих сумму " + K + " = " + counterOfCombination);
    }
}


