package DataStructure.singlyLinkedList;

public class SinglyLinkedList {
    Node first;

    public void insertFirst(int data){
        Node node = new Node();
        node.data = data;
        node.next=first;
        first=node;
    }

    public void showList(){
        Node current = first;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList a = new SinglyLinkedList();
        a.insertFirst(4);
        a.insertFirst(3);
        a.insertFirst(2);
        a.showList();
    }
}
