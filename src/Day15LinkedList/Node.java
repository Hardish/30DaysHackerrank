package Day15LinkedList;

/*
node hold data and ref to next node
*/

public class Node {

    //Properties
    Node next;  //ref of next node
    int data;   //making linked list of int datatype

    //Constructor
    public Node(int newData)        //we dont know which is next node
    {
        data = newData;
        next = null;
    }

    public Node(int newData,Node newNext)
    {
        data = newData;
        next = newNext;
    }

    //Getters & Setters

    public int getData()
    {
        return data;
    }

    public Node getNext()
    {
        return next;
    }

    public void  setData(int newData)
    {
        data = newData;
    }

    public void setNext(Node nextNode)
    {
        next = nextNode;
    }
}
