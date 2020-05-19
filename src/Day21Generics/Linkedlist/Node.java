package Day21Generics.Linkedlist;

/*
node hold data and ref to next node
*/

public class Node<D> {

    //Properties
    Node next;  //ref of next node
    D data;   //making linked list of D datatype genetic

    //Constructor
    public Node(D newData)        //we dont know which is next node
    {
        data = newData;
        next = null;
    }

    public Node(D newData,Node newNext)
    {
        data = newData;
        next = newNext;
    }

    //Getters & Setters

    public D getData()
    {
        return data;
    }

    public Node<D> getNext()
    {
        return next;
    }//most important

    public void  setData(D newData)
    {
        data = newData;
    }

    public void setNext(Node<D> nextNode)
    {
        next = nextNode;
    }  //most important
}
