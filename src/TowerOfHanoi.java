package Lessons.Lesson17.task2;

import java.util.Stack;

public class TowerOfHanoi {

    static class Move {
        int n;
        char point1;
        char temp;
        char point2;

        public Move(int n, char point1, char temp, char point2) {
            this.n = n;
            this.point1 = point1;
            this.temp = temp;
            this.point2 = point2;
        }
    }

    public static void towerOfHanoi(int n, char point1, char temp, char point2) {
        Stack<Move> stack = new Stack<>();
        stack.push(new Move(n, point1, temp, point2));
        while (!stack.isEmpty()) {
            Move move = stack.pop();
            n = move.n;
            point1 = move.point1;
            temp = move.temp;
            point2 = move.point2;
            if (n == 1) {
                System.out.println("Move disk from " + point1 + " to " + point2);
            } else {
                stack.push(new Move(n-1, temp, point1, point2));
                stack.push(new Move(1, point1, temp, point2));
                stack.push(new Move(n-1, point1, point2, temp));
            }
        }
    }

    public static void moveElement(char point1, char point2){
        System.out.println("move dick from " + point1 + " to " + point2);
    }
    public static void moveTower(int amount, char point1, char point2, char temp){
        if (amount == 0) return;
        moveTower(amount-1, point1, temp, point2);
        moveElement(point1, point2);
        moveTower(amount - 1, temp, point2, point1);
    }
}


    public static void main(String[] args) {

        towerOfHanoi(3, 'A', 'B', 'C');
        System.out.println();
        System.out.println(________________________);
        System.out.println();

        moveTower(3, 'A', 'B', 'C');

    }
}