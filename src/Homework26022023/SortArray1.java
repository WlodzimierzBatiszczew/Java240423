package Homework26022023;

public class SortArray1 {
    public static void main(String[] args) {

        int N = 9;

        int[] array19 = new int[]{5, 3, 1, 4, 7, 6, 8, 2};

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array19.length - 1; i++) {
                if (array19[i] > array19[i + 1]) {
                    int term = array19[i];
                    array19[i] = array19[i + 1];
                    array19[i + 1] = term;
                    isSorted = false;
                }
            }
        }
        int[] modifiedArray19 = new int[N];
        for (int i = 0; i < N-1; i++) {
                int k = array19[i];
                modifiedArray19[i] = k;
            }
                modifiedArray19[N -1] = 0;


        int[] arrayStandart = new int[N];

        for (int j = 0; j < arrayStandart.length; j++) {
            arrayStandart[j] = j + 1;
        }
        int i = 0;
        int j = 0;
        while (i < N) {
            if (arrayStandart[j] != modifiedArray19[i]) {
                System.out.println("Число " + arrayStandart[j] + " отсуствует в массиве.");
                break;
            }
            i =i+1;
            j = j +1;
        }
    }
}
