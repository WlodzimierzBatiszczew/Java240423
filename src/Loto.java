package Homework040323;
import java.util.Random;
import java.util.Scanner;

public class Loto {
    static int numbersOfBets = 5;
    static int minWinNumber = 1;
    static int maxWinNumbers = 51;


    public static void main(String[] args) throws InterruptedException {

        checkWinBet(lotteryBet(), toto2());
    }
    public static int[] lotteryBet () throws InterruptedException {

        int[] bets = new int[numbersOfBets];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Делайте ставки, господа. Всего шесть ставок, от 1 до 50. ");
        for (int i = 0; i < numbersOfBets; i++) {
            System.out.println("Делайте ставку номер "+ (i + 1));
            bets[i] = scanner.nextInt();
        }
        System.out.println("Ставки сделаны. Ставок больше нет");
        Thread.sleep(1500);
        return bets;

    }
    public static int toto2(){
        Random random = new Random();
        int winNumber = random.nextInt(minWinNumber,maxWinNumbers + 1);
        return winNumber;
    }
    public static void checkWinBet(int[] lotteryBet, int winNumber) throws InterruptedException {
        System.out.println("Выигрышный номер: " + winNumber);
        Thread.sleep(1000);
        int counter = 0;
        for (int i = 0; i < lotteryBet.length; i++) {
            if (lotteryBet[i] == winNumber){
                System.out.println("Выиграла ставка номер: " + (i + 1));
                counter++;
            }
        }
        if (counter == 0){
            System.out.println("Выигрышных ставок нет.");
        }

    }
}
