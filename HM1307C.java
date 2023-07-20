package Lessons.Lesson25.Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HM1307C {



    public static Integer[] findCommonNumber2(int[] array1, int[] array2) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array2[j] == array1[i]) {
                    list.add(array2[j]);
                }
            }
        }
        return (list.toArray(new Integer[list.size()]));
    }

    public static Integer[] removeDublicate(int[] array) {

        List<Integer> list = new ArrayList<>();
        list.add(array[0]);
        for (int i = 1; i < array.length; i++) {
            int counter = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) == array[i]) {
                    counter++;
                }
            }
            if (counter == 0) {
                list.add(array[i]);
            }
        }
        return (list.toArray(new Integer[list.size()]));
    }

    public static int secondBiggestNumber(int[] array){
        Arrays.sort(array);
        return array[array.length - 2];
    }

    public static int secondLeastNumber(int[] array){
        Arrays.sort(array);
        return array[1];
    }

    public static void main(String[] args) {

        int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};
        Integer[] array3 = findCommonNumber2(array1, array2);
        System.out.println(Arrays.toString(array3));

        int[] array4 = {0,3,-2,4,3,2};
        Integer[] array5 = removeDublicate(array4);
        System.out.println(Arrays.toString(array5));
        int[] array6 = {-1, 4, 0, 2, 7, -3};
        int secondBiggestNumber = secondBiggestNumber(array6);
        System.out.println(secondBiggestNumber);
        int secondLeastNumber = secondLeastNumber(array6);
        System.out.println(secondLeastNumber);
        System.out.println(Arrays.toString(array6));


    }


}


-------------------------------------------------------------------------------------


    package Lessons.Lesson25.Task3;

import Lessons.Lesson25.Task1.ArrayUtils;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HM1307CTest {
    @Test
    public void checkFindCommonNumber() {
        int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};

        Integer[] result = HM1307C.findCommonNumber2(array1, array2);
        Integer[] expected = {1, 7};
        Assert.assertArrayEquals(expected, result);
    }
       @Test
    public void checkRemoveDuplicate(){
        int[] array = {0,3,-2,4,3,2};
        Integer[] result = HM1307C.removeDublicate(array);
        Integer[] expected = {0, 3, -2, 4, 2};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void secondBiggestNumber() {
        int[] array = {-1, 4, 0, 2, 7, -3};
        int expected = 4;
        int result = HM1307C.secondBiggestNumber(array);
        assertEquals(expected, result);
    }

    @Test
    public void secondLeastNumber() {
        int[] array = {-1, 4, 0, 2, 7, -3};
        int expected = -1;
        int result = HM1307C.secondLeastNumber(array);
        assertEquals(expected, result);
    }
}


