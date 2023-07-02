package Lesson5.Homework2206;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {15, 75, 181, 268, 345, 456, 589, 643};
        int[] arr2 = {7, 85, 121, 230, 347, 455, 599, 603, 606, 701, 892};
        System.out.println(Arrays.toString(concatenatedArray(arr1,arr2)));
    }
    public static int[] concatenatedArray(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int m = 0;
        int[] arr = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr[m] = arr1[i];
                i = i + 1;
                m = m + 1;
            }
            else {arr[m] = arr2[j];
                j = j + 1;
                m = m + 1;}
        }
        while (i < arr1.length){
            arr[m] = arr1[i];
            i = i + 1;
            m = m + 1;
        }
        while (j < arr2.length){
            arr[m] = arr2[j];
            j = j + 1;
            m = m + 1;
        }
        return arr;
    }
}
