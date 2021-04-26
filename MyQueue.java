
public class MyQueue<E>{
    // Properties
    // The Object Array
    private Object[] que;
    // The Maximal Capacity
    private int size;
    private int defaultsize = 4;
    // Pointer of head of queue
    private int head = 0;
    // Pointer of tail of queue
    private int tail = 0;
    // Whether the queue is empty or not
    private boolean isempty = true;

    // Contructor for a queue with default capacity of 4
    public MyQueue(){
        this.que = new Object[this.defaultsize];
        this.size = this.defaultsize;

    }
    // Contructor for a queue with size capacity
    public MyQueue(int capacity){
        this.que = new Object[capacity];
        this.size = capacity;
    }
    //insert an element into the queue
    public boolean insert(E element) {
        if(head==tail && !isempty){
            return false;
        }
        que[tail] = element;
        tail = (tail+1)/this.size;
        isempty = false;
        return true;
    }
    // Retrieve the current element from the queue and Return the current element in the queue
    public E peek() {
        if(isempty){
            return null;
        }
        E elem = (E)que[head];
        head = (head+1) % this.size;
        isempty = (head == tail);
        return elem;
    }
    // Remove and return current from the Queue.
    public E remove() {
        return null;
    }
    // return the current capacity of the queue
    public int getCapacity() {
        return this.size;
    }
    // the current size of the queue
    public int getSize() {
        return que.length;
    }
    // clear all elements from the queue
    public void clear() {
        isempty = true;
        head = 0;
        tail = 0;
        for(int i = 0; i < que.length; i++){
            que[i] = null;
        }

    }
    public String toString(){
        String sb = new String();
        for(int i = 0; i < this.que.length; i++){
            E e = (E)que[i];
            sb += e;
            sb +="\n";

        }
        return sb;
    }
}
