package DAY09;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(3);
        linkedList.add(6);
        linkedList.add(4);
        linkedList.add(8);
        linkedList.add(9);
        linkedList.add(1);

        linkedList.forEach(System.out::print);
        System.out.println();

        linkedList.addFirst(0);
        linkedList.addLast(10);
        linkedList.forEach(System.out::print);
        System.out.println();
        linkedList.removeIf(i -> i < 3);
        linkedList.forEach(System.out::print);
        System.out.println();

        System.out.println("Lay phan tu dau tien " + linkedList.getFirst());
        System.out.println("Lay phan tu cuoi cung " + linkedList.getLast());

    }
}