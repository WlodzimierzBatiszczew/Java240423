package Lesson0708.Task2;

public class Node {
    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    static class LinkNode {
        Node head;
        Node tail;

        public LinkNode(int data) {
            this.head = new Node(data, null);
            this.tail = head;

        }

        public void add(int data) {
            Node temp = new Node(data, null);
            tail.next = temp;
            tail = tail.next;
        }

        public void print() {
            Node current = head;
            while (current != null) {
                System.out.printf("%d -> ", current.data);
                current = current.next;
            }
        }

        public void getByIndex(int index) {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            System.out.println("data index " + index + " = " + current.data);
        }

        public void addByIndex(int data, int index) {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = new Node(data, current.next);
        }

        public int size() {
            int count = 0;
            Node current = head;
            while (current != null) {
                current = current.next;
            }
            return count;

        }

        public void removeLast() {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
        public void removeByIndex(int index){
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;

        }


        public static void main(String[] args) {
            LinkNode node = new LinkNode(100);
            node.add(200);
            node.add(400);
            node.add(600);
            node.add(800);
            node.print();
            System.out.println();
            node.getByIndex(1);
            node.addByIndex(7000, 3);
            System.out.println();
            node.print();
            System.out.println();
            node.getByIndex(3);
            System.out.println();
            node.size();
            node.removeLast();
            node.print();
            System.out.println();
            //System.out.println(node.size());
            node.getByIndex(3);
            System.out.println();
            node.removeByIndex(3);
            node.print();
        }
    }
}
