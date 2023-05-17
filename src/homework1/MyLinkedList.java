package Homework1105;

import java.util.Iterator;
import java.util.ListIterator;

public class MyLinkedList {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addFirst("a");
        list.addFirst("b");
        list.addFirst("c");
        list.addFirst("d");
        list.addLast("e");
        list.addLast("f");
        list.addLast("g");
        list.addLast("h");

        list.print();
        System.out.println();
        System.out.println("size = " + list.size());
        System.out.println();
        System.out.println("value index " + list.get(0));
        System.out.println();
        System.out.println(list);
    }





    private Node head;

    private Node tail;

    public MyLinkedList() {
        head = null;
        tail = null;

    }

    private boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String data) {
        Node temp = new Node(data);

        if (isEmpty()) {
            tail = temp;
        } else {
            head.prev = temp;
        }
        temp.next = head;
        head = temp;
    }

    public void addLast(String data) {
        Node temp = new Node(data);
        if (isEmpty()) {
            head = temp;
        } else {
            tail.next = temp;
        }
        temp.prev = tail;
        tail = temp;
    }


    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public int size() {
        Node temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        return size;
    }

    public String get(int index) {
        Node temp = head;
        int size = 0;
        while (size < index) {
            temp = temp.next;
            size++;
        }
        return temp.data;

    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");
        Node current = head;
        while (current != null) {
            builder.append(current.data).append(", ");
            current = current.next;
        }
        builder.setLength(builder.length() - 2);
        builder.append("]");
        return builder.toString();
    }


    public ListIterator<String> iterator() {
        MyListIterator listIterator = new MyListIterator() {
            @Override
            public boolean hasPrevious() {
                return false;
            }

            @Override
            public String previous() {
                return null;
            }

            @Override
            public int nextIndex() {
                return 0;
            }

            @Override
            public int previousIndex() {
                return 0;
            }

            @Override
            public void remove() {

            }

            @Override
            public void set(String s) {

            }

            @Override
            public void add(String s) {

            }

        };
        return listIterator;
    }


    public abstract class MyListIterator implements ListIterator<String> {
        private int cursor = 0;
        private Node current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public String next() {
            String result = current.data;
            current = current.next;
            return result;
        }
    }


    public class Node {
        public String data;
        public Node next;

        public Node prev;

        public Node(String data) {
            this.data = data;
        }
    }
}
