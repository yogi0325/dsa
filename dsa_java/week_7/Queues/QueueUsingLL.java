package dsa.dsa_java.week_7.Queues;

public class QueueUsingLL<T> {
    
    private Node<T> front;
    private Node<T> rear;
    int size;

   public QueueUsingLL(){
        front = null;
        rear = null;
        size = 0;
    }

    int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    T front() throws QueueEmptyExceptions{
        if(size == 0){
            throw new QueueEmptyExceptions();
        }
        return front.data;
    }

     public void enqueue(T value){
        Node<T> newNode = new Node <>(value);
        if(rear == null){
            front = newNode;
            rear = newNode;
        }
        else{
        rear.next =  newNode;
        rear = newNode;
        }
        size++;
    }

    public T dequeue() throws QueueEmptyExceptions{

        if(size == 0){
            throw new QueueEmptyExceptions();
        }

        T temp = front.data;
        front =  front.next;
        if(size == 1){
            rear = null;
        }
        size--;
        return temp;
    }

    public void enqueue(int leftChild) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'enqueue'");
    }
}
