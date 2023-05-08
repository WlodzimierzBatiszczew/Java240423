package Battleship;

import java.util.Scanner;

public class Battleship {

    static String playerName1;
    static String playerName2;
    static Scanner scanner = new Scanner(System.in);
    static int [][] battlefield1 = new int[10][10];
    static int [][] battlefield2 = new int[10][10];
    static int [][] monitor1 = new int[10][10];
    static int [][] monitor2 = new int[10][10];

    public static void main(String[] args) {

        System.out.println("Player1, please, enter your name.");
        playerName1 = scanner.nextLine();
        System.out.println("Player2, please enter your name.");
        playerName2 = scanner.nextLine();
        placeShips(playerName1, battlefield1);
        placeShips(playerName2, battlefield2);


       while(true){
           makeTurn(playerName1, monitor1, battlefield2);
           if (isWinCondition()){
               break;
           }
       }
        while(true){
            makeTurn(playerName2, monitor2, battlefield1);
            if (isWinCondition()){
                break;
            }
        }



    }


    public static void placeShips(String playerName, int[][] battlefield) {
        int deck = 4;
        while (deck>=1) {
            System.out.println();
            System.out.println(playerName + ", please place your" + deck + "-deck ship on the battlefield");
            System.out.println();
            drawField(battlefield);




            System.out.println("Please enter OX coordinate: ");
            int x = scanner.nextInt();
            System.out.println("Please enter OY coordinate: ");
            int y = scanner.nextInt();
            System.out.println("Choose direction: ");
            System.out.println("2. Vertical.");
            System.out.println("1. Horizontal.");
            int direction = scanner.nextInt();

            for (int i = 0; i < deck; i++) {
                if (direction==1){
                    battlefield[x][y+i] = 1;
                }else{
                    battlefield[x+i][y] = 1;
                }

            }

            deck--;
        }

    }

    public static void drawField(int [][] battlefield){
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < battlefield.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < battlefield[1].length; j++) {
                if (battlefield[i][j] ==0){
                    System.out.print("- ");
                }else{
                    System.out.print("X ");
                }

            }
            System.out.println();
        }

    }
    public static void makeTurn(String playerName, int[][] monitor, int[][] battlefield) {
        while (true) {
            System.out.println(playerName + ", please, make your turn");
            System.out.println("  0 1 2 3 4 5 6 7 8 9");
            for (int i = 0; i < monitor.length; i++) {
                System.out.print(i + " ");
                for (int j = 0; j < monitor[1].length; j++) {
                    if (monitor[i][j] == 0) {
                        System.out.print("- ");
                    } else if (monitor[i][j] == 1) {
                        System.out.print(". ");
                    } else {
                        System.out.print("X ");

                    }

                }
                System.out.println();
            }
            System.out.println("Please enter OX coordinate: ");
            int x = scanner.nextInt();
            System.out.println("Please enter OY coordinate: ");
            int y = scanner.nextInt();
            if (battlefield[x][y] == 1) {
                System.out.println("Hit!");
                monitor[x][y] = 2;

            } else {
                System.out.println("Miss! Your opponent turn!");
                monitor[x][y] = 1;
                break;

            }

        }
    }
    public static boolean isWinCondition() {
        int counter1 = 0;
        for (int i = 0; i < monitor1.length; i++) {
            for (int j = 0; j < monitor1[i].length; j++) {
                if (monitor1[i][j] == 2) {
                    counter1++;
                }
            }
        }


        int counter2 = 0;
        for (int i = 0; i < monitor2.length; i++) {
            for (int j = 0; j < monitor2[i].length; j++) {
                if (monitor1[i][j] == 2) {
                    counter2++;
                }
            }
        }
        System.out.println(counter1);
        System.out.println(counter2);

        if (counter1 >=1){
            System.out.println(playerName1 + " Win!");
            return true;
        }
        if (counter2 >=1){
            System.out.println(playerName2 + " Win!");
            return true;
        }
        return false;
    }
}
