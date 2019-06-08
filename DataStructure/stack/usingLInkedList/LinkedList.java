package DataStructure.stack.usingLInkedList;

public class LinkedList {

    private Node first;

    public void insertfirst(int data) {
        Node node = new Node();
        node.data = data;
        node.next = first;
        first = node;
    }

    public void showList() {
        Node current = first;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;

        }
    }


}
