package Lesson19;

import java.util.Arrays;


public class HmAlgoritm {

    public static void main(String[] args) {
        int k = 7;
        int[]array1 = {100,112,256,349, 770};
        int[]array2 = {72,86,113,119,265,892};
        int[]resultArray = new int[array1.length+array2.length];
        int count = 0;
        for(int i = 0; i<array1.length; i++) {
            resultArray[i] = array1[i];
            count++;
        }

        for(int j = 0;j<array2.length;j++) {
            resultArray[count++] = array2[j];
        }
        System.out.println(Arrays.toString(resultArray));

        Arrays.sort(resultArray);
        System.out.println(Arrays.toString(resultArray));
        System.out.println(resultArray[k - 1]);
    }
}
