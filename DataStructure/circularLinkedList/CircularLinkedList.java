package DataStructure.circularLinkedList;

public class CircularLinkedList {
    Node first , last;



    public void deleteFirst(){
        first= first.next;
    }

    public void insert(int data){

        Node node = new Node();
        node.data=data;

        if(first==null){
            first=node;
            last=node;
        }else {

            last.next = node;
            node.next=first;
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
