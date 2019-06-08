package DataStructure.doubleyLinkedList;

public class DoubleyLinkesList {

    private Node first, last;

    private boolean isEmpty(){
        return first==null;
    }


    public void insertFirst(int data) {
        Node node = new Node();
        node.data = data;

        if(isEmpty()){
            first = node;
            last=node;
        }else{
            node.next=first;
            first.previous = node;
            first=node;
        }
    }

    public void inserLast(int data){
        Node node = new Node();
        node.data= data;

        if(isEmpty()){
            first=node;
            last = node;
        }else{
            node.previous = last;
            last.next = node;
            last = node;
        }
    }

    public int showListFromFirst(){
        Node current = first;
        if(isEmpty()){
            System.out.println("list is empty");
            return 0;
        }else{
            do{
                System.out.println(current.data);
                current = current.next;

            }while(current!=null);
        }
        return 0;
    }

    public int showListFromLast(){
        Node current = last;
        if(isEmpty()){
            System.out.println("empty");
            return 0;
        }else{
            do{
                System.out.println(current.data);
                current=current.previous;
            }while(current!=null);
        }
        return 0;
    }

}
