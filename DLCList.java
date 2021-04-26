// Node Class
class Node
{
    // start value
    public int start;
    // Pointer for tail node
    public Node tail;
    // Pointer for head node
    public Node head;
    // Constructor for  default value
    public Node(){
        this.start = 0;
        this.tail = null;
        this.head = null;

    };
    // Constructor for  start value
    public Node(int start){
        this.start = start;
        this.tail = null;
        this.head = null;

    };
};

// Doubly Circular List Class
class DLCList<E>
{
    // Pointer for first node
    public Node first;

    // Pointer for minimum node
    public Node minimum;
    // Constructor
    public DLCList(){
        this.first = null;
        this.minimum = null;

    };

    boolean isEmpty(){
        return (this.first == null);
    }
    // insert node x to the dlc list
    void insert(Node xyz){
        if (isEmpty())
        {
            this.first = xyz;
            this.minimum = xyz;
            xyz.tail = xyz;
            xyz.head = xyz;
        }
        else
        {
            Node last = this.first.tail;
            last.head = xyz;
            xyz.tail = last;
            this.first.tail = xyz;
            xyz.head = this.first;
            if (xyz.start < this.minimum.start) this.minimum = xyz;
        }

    }
    // get minimum node
    Node getMinimum(){
        return this.minimum;
    }
    //
    Node extractMinimum(){
        if (isEmpty()) return null;

        Node ret = this.minimum;
        if (ret.head == ret)
        {
            this.first = null;
            this.minimum = null;
        }
        else
        {
            Node prev = ret .tail;
            Node next = ret.head;
            prev.head = next;
            next.tail = prev;
            if (ret == this.first)
            {
                this.first = next;
            }
            this.minimum = this.first;
            Node curr = this.first.head;
            while (curr != this.first)
            {
                if (curr.start < this.minimum.start) this.minimum = curr;
                curr = curr.head;
            }
        }
        return ret;

    }
    void decreasekey(Node xyz, int newkey){
        xyz.start = newkey;
        if (xyz.start < this.minimum.start) this.minimum = xyz;
    }
    void Delete(Node xyz){

        if (this.minimum == xyz) extractMinimum();
        else
        {
            Node prev = xyz .tail;
            Node next = xyz.head;
            prev.head = next;
            next.tail = prev;
            if (xyz == this.first)
            {
                this.first = next;
            }
        }
    }

    void print(){
        if (isEmpty()) { System.out.print("\n"); return; }
        else
        {
            if (this.first == this.minimum) System.out.printf("*%d*", this.first.start);
            else System.out.printf("%d", this.first.start);
                Node curr = this.first;
                do
                {
                    curr = curr.head;
                    if (this.minimum == curr) System.out.printf(" <-> *%d*", curr.start);
            else System.out.printf(" <-> %d", curr.start);
                } while (curr != this.first);
            System.out.printf("\n");
        }

    }
}
//  Reference 
//  https://github.com/PetarV-/Algorithms/blob/master/Data%20Structures/Circular%20Doubly-Linked%20List
//
