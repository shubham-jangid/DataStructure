package DataStructure.circularLinkedList;

public class App {
    public static void main(String[] args) {
        CircularLinkedList a = new CircularLinkedList();

        a.insertFirst(4);
        a.insertFirst(5);
        a.insertFirst(2);
        a.insertFirst(4);
        a.insertFirst(5);
        a.insertFirst(2);
        a.showList();

        System.out.println("circular list");
        CircularLinkedList b = new CircularLinkedList();

        b.insertLast(5);

        b.insertLast(2);
        b.insertLast(4);
        b.insertLast(5);
        b.insertLast(2);
        b.insertLast(2);
        b.insertLast(4);
        b.insertLast(5);
        b.insertLast(2);
        b.showList();


    }
}
