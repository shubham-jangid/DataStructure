package DataStructure.queue.DataStructure.queue.usingLinkedList;

public class LinkedList {

    private Node first, last;

    public void insertlast(int data) {
        Node node = new Node();
        node.data = data;
        if(first==null){
            first = node;
            last= node;
        }
        else{
            last.next=node;
            last= node;
        }

    }

    public void showList() {
        Node current = first;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;

        }
    }


}
