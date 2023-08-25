package HM.Lift;

import java.util.Scanner;

public class Lift2 {
    public static void main(String[] args) {

        int numberOfLifts;
        int theFloorFromWhichTheLiftIsCalled;
        System.out.println("Введите количество лифтов в здании");
        Scanner scanner = new Scanner(System.in);
        numberOfLifts = scanner.nextInt();
        int [] lifts = new int[numberOfLifts];


        for (int i = 0; i < numberOfLifts; i++) {
            System.out.println("Введите номер этажа на котором находится лифт номер " + (i + 1));
            int numberOfFloorWhereTheLiftIs = scanner.nextInt();
            lifts[i] = numberOfFloorWhereTheLiftIs;
        }

        System.out.println("Введите номер этажа с которого был сделан вызов");
        theFloorFromWhichTheLiftIsCalled = scanner.nextInt();
        for (int i = 0; i < numberOfLifts ; i++) {
            lifts[i] = Math.abs(lifts[i] - theFloorFromWhichTheLiftIsCalled);
        }
        int indexMinimumValue = 0;
        for (int i = 0; i < numberOfLifts; i++) {
            if (lifts[i] < lifts[indexMinimumValue]){
                indexMinimumValue = i;
            }
        }
        System.out.println("Поедет лифт номер - " + (indexMinimumValue + 1));
    }
}
