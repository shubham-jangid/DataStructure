package DataStructure.singlyLinkedList;

public class SinglyLinkedList {
    Node first;

    public void insertFirst(int data){
        Node node = new Node();
        node.data = data;
        node.next=first;
        first=node;
    }

    public void deleteFirst(){
        first= first.next;
    }

    public void inserLast(int data){

        Node node = new Node();
        node.data=data;

        if(first==null){
            first=node;
        }else {
            Node current = first;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }

    }

    public void showList(){
        Node current = first;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }


}
