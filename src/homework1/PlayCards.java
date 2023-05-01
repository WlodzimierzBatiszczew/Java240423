package Homework1;
import java.util.Random;


public class PlayCards {

    public static void main(String[] args) {
        distributionOfCards(mixedDeck(createDeck()));

    }

    public static String[] createDeck(){

        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suits = {"clubs", "diamonds", "hearts", "spades"};
        String[] deck = new String[52];

    int counter = 0;

        for (int i = 0; i < rank.length; i++) {
             for (int j = 0; j < suits.length; j++) {
            deck[counter] = rank[i] + " " + suits[j];
            counter++;
             }
        }
        return deck;
    }
        public static String[] mixedDeck(String[] arr) {
        Random random = new Random();

            for (int i = 0; i < arr.length; i++) {
//                int j = (int) Math.random() * i; // random card in the deck
                int j = i + (random.nextInt(arr.length - i)); // random card in the deck
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        return arr;
    }

    public static void distributionOfCards(String[] arr){
        for (int i = 0; i < 20; i++) {
            System.out.println(arr[i]);
            if ((i % 5) == 4) {
                System.out.println("=========");
            }
        }
    }
}
