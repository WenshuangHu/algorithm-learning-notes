package algorithm.copylistwithrandompointer;

public class Node {
	int data;//Node data
    Node next, random;//Next and random reference
 
    //Node constructor
    public Node(int data)
    {
        this.data = data;
        this.next = this.random = null;
    }
}
