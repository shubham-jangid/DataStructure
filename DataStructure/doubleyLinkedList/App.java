package DataStructure.doubleyLinkedList;



public class App {
    public static void main(String[] args) {
        DoubleyLinkesList  a = new DoubleyLinkesList();

        a.insertFirst(4);
        a.insertFirst(3);
        a.insertFirst(2);
        a.showListFromFirst();
        System.out.println("insert at last");
        a.showListFromLast();

//        SinglyLinkedList b  = new SinglyLinkedList();
//        b.inserLast(4);
//        b.inserLast(3);
//        b.inserLast(2);
//        b.showList();

    }
}
