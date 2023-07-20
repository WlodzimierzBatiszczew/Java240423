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