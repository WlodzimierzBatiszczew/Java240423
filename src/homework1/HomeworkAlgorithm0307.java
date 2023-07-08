package Lesson5sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeworkAlgorithm0307 {
    public static void main(String[] args) {
        Integer[] array = {9,1,2,3,0,7,6,5,7,6,4,12,55};
        List<Integer> array2 = Arrays.asList(array);
        System.out.println(quickSort(array2));
    }
    public static List<Integer> quickSort(List<Integer> arr){
        if (arr.size() <= 1) return arr;
        int pivot = arr.get(arr.size() - 1);
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for (int i = 0; i < arr.size() - 1; i++){
            if (arr.get(i) > pivot){
                right.add(arr.get(i));
            } else {
                left.add(arr.get(i));
            }
        }
        List<Integer> combined = new ArrayList<>();
        combined.addAll(quickSort(left));
        combined.add(pivot);
        combined.addAll(quickSort(right));
        return combined;
    }
}
