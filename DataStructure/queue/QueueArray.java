package DataStructure.queue;

public class QueueArray  {
    private int first = 0, size, current, top = -1;
    private int stack[];

    QueueArray(int size) {
        this.size = size;
        stack = new int[size];
    }

    public boolean overflow(){
        return top==size-1;
    }

    public boolean underflow(){

        return first==top+1;
    }

    public void push(int data) {
        if(!overflow()){
            top++;
            stack[top]=data;
        }else{
            System.out.println("stack is full");
        }
    }

    public void pop(){
        while(!underflow()){
            System.out.println(stack[first]);
            first++;
        }

    }

    public static void main(String[] args) {
        QueueArray stack = new QueueArray(6);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(1);
        stack.pop();
        stack.pop();

    }
}
