package DataStructure.circularLinkedList;




public class CircularLinkedList {
    Node first, last;

    public void deleteFirst() {
        first = first.next;
    }

    public void insertFirst(int data) {
        Node node = new Node();
        node.data = data;
        if (isEmpty()) {
            first = node;
            node.next = first;
            last = node;
        } else {
            node.next = first;
            first = node;
            last.next=first;

        }

    }

    public void insertLast(int data){
        Node node = new Node();
        node.data = data;

        if(isEmpty()) {
            first = node;
            last=first;
            node.next=first;
        }
        else{
            last.next=node;
            last=node;
            node.next=first;

        }

    }



    public boolean isEmpty() {
        return (first == null);
    }

    public int showList() {
        Node current = first;
        if (isEmpty()) {
            System.out.println("list is empty");
            return 0;
        } else {
            do {
                System.out.println(current.data);
                current = current.next;
            } while (current!= first);

        }
        return 0;
    }


}
