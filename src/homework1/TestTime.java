package Homework0905;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestTime {

    public static void main(String[] args) {

        List<Integer> list10 = new ArrayList<>();

        for (int i = 0; i < 10000000; i++) {
            list10.add(i);

        }

        int temp;
        long start = System.currentTimeMillis();

        for (int element: list10)
        {
            temp = element;

        }
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Цикл foreach. Прошло времени, мс: " + elapsed);


        System.out.println();
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            temp = list10.get(i);
           // System.out.print(temp + " ");
        }
        long finish1 = System.currentTimeMillis();
        long elapsed1 = finish1 - start1;
        System.out.println(" Классический for. Прошло времени, мс: " + elapsed1);

        System.out.println();

        long start2 = System.currentTimeMillis();
        int list10Bigness = 10000000;
        for (int i = 0; i < list10Bigness; i++) {
            temp = list10.get(i);
           // System.out.print(temp + ", ");
        }
        long finish2 = System.currentTimeMillis();
        long elapsed2 = finish2 - start2;
        System.out.println("Классический for с отдельной переменной размера массива. Прошло времени, мс: " + elapsed2);


        System.out.println();

        long start3 = System.currentTimeMillis();
        for (int i = list10Bigness - 1; i > 0; i--) {
            temp = list10.get(i);
           // System.out.print(temp + ", ");
        }
        long finish3 = System.currentTimeMillis();
        long elapsed3 = finish3 - start3;
        System.out.println("Тоже что и предыдущее, но в обратном порядке. Прошло времени, мс: " + elapsed3);

        System.out.println();

        Iterator<Integer> iterator10 = list10.iterator();

        long start4 = System.currentTimeMillis();
        while (iterator10.hasNext()) {
            temp = iterator10.next();
          //  System.out.print(temp + "; ");
        }
        long finish4 = System.currentTimeMillis();
        long elapsed4 = finish4 - start4;
        System.out.println("С iterator. Прошло времени, мс: " + elapsed4);


        System.out.println();

        ListIterator<Integer> iterator11 = list10.listIterator();
        long start5 = System.currentTimeMillis();

        while (iterator11.hasNext()){
            int tmp = iterator11.next();
          //  System.out.print(tmp + "; ");
        }
        long finish5 = System.currentTimeMillis();
        long elapsed5 = finish5 - start5;
        System.out.println("C ListIterator. Прошло времени, мс: " + elapsed5);





        


    }
}
