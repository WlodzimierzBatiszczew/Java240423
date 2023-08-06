package LessonAlgoritm;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Main {


        public static void main(String[] args) {
            SpecialStack<Integer> stack = new SpecialStack<>();
            stack.push(10);
            stack.push(-5);
            stack.push(-9);
            stack.push(20);
            stack.push(30);
            System.out.println(stack.count);
            System.out.println(stack.items);
            System.out.println(stack.size());
            System.out.println(stack.isEmpty());
            System.out.println(stack.items);
            System.out.println(stack.peek());
            System.out.println(stack.getMin(stack));

        }
    }

