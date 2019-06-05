package DataStructure.singlyLinkedList;

public class App {
    public static void main(String[] args) {
        SinglyLinkedList a = new SinglyLinkedList();
        System.out.println(a.first);
        a.insertFirst(4);
        a.insertFirst(3);
        a.insertFirst(2);
        a.showList();
        System.out.println("insert at last");

        SinglyLinkedList b  = new SinglyLinkedList();
        b.inserLast(4);
        b.inserLast(3);
        b.inserLast(2);
        b.showList();

    }
}
