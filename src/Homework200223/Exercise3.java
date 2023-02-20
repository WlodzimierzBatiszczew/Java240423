package Homework200223;

public class Exercise3 {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        System.out.println("Первая последовательность ");

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (i * 2) + 2;
            System.out.print(array1[i] + ", ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Вторая последовательность ");


        int[] array2 = new int[10];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (i * 2) + 1;
            System.out.print(array2[i] + ", ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Третья последовательность ");

        int[] array3 = new int[10];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = (i + 1) * (i + 1);
            System.out.print(array3[i] + ", ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Четвертая последовательность ");

        int[] array4 = new int[10];
        for (int i = 0; i < array4.length; i++) {
            array4[i] = (i + 1) * (i + 1) * (i +1);
            System.out.print(array4[i] + ", ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Пятая последовательность ");

        int[] array5 = new int[10];
        int k1 = 1;
        for (int i = 0; i < array5.length; i++) {
            array5[i] = k1;
            k1 = k1 * (-1);
            System.out.print(array5[i] + ", ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Шестая последовательность ");

        int[] array6 = new int[10];
        int k2 = 1;
        for (int i = 0; i < array6.length; i++) {
            array6[i] = (i + 1) * k2;
            k2 = k2 * (-1);
            System.out.print(array6[i] + ", ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Седьмая последовательность ");

        int[] array7 = new int[10];
        int k3 = 1;
        for (int i = 0; i < array7.length; i++) {
            array7[i] = (i + 1) * (i + 1) * k3;
            k3 = k3 * (-1);
            System.out.print(array7[i] + ", ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Восьмая последовательность ");

        int[] array8 = new int[10];
        int k4 = 0;
        for (int i = 0; i < array8.length; i++) {
            if ((i + 1) % 2 == 0){
                array8[i] = 0;
            } else {
                array8[i] = k4 +1;
                k4 = array8[i];
            }

            System.out.print(array8[i] + ", ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Девятая последовательность ");

        int[] array9 = new int[10];
        int k5 = 1;
        for (int i = 0; i < array9.length; i++) {
            array9[i] = k5 * (i + 1);
            k5 = array9[i];

            System.out.print(array9[i] + ", ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Десятая последовательность ");

        int[] array10 = new int[10];
        int k6 = 0;
        int k7 = 1;
        array10[0] = 1;
        System.out.print(array10[0] + ", ");
        for (int i = 1; i < array10.length; i++) {
            array10[i] = k6 + k7;
            k6 = k7;
            k7 = array10[i];



            System.out.print(array10[i] + ", ");
        }





        }
    }

