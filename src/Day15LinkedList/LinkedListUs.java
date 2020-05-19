package Day15LinkedList;

import java.util.LinkedList;

/*
    Add,Remove,#of nodes,is linkedlist sequence empty,retrieve data from node
 */
public class LinkedListUs {

    //Properties
    Node head;
    int count = 0;    //end of list, how many nodes are in list

    //Constructor
/*    public LinkedListUs()  -- check 19:25
     {
        head = null;
        count = 0;
    }*/

    public LinkedListUs(Node newNode)
    {
        head = newNode;
        count++;
    }

    //methods
    //add
    public void add(int newData)
    {
        Node temp = new Node(newData);
        Node current = head;
        while(current.getNext()!=null)
        {
            current = current.getNext();
        }
        current.setNext(temp);
    }

    //get
    public int get(int index){

        if(index <= 0)
        {
            return -1;
        }
        Node current = head;
        for(int i = 1; i < index ; i++)
        {
            current = current.getNext();
        }
        return current.getData();
    }
    //size
    public int size()
    {
        return count;
    }
    //empty
    public boolean isEmpty()
    {
        return head == null;
    }
    //remove
    public void remove(){
        //remove from the back of the list
        Node current = head;
        while(current.getNext().getNext() != null)  //this wont work for one node element
        {
            current.getNext();
        }
        current.setNext(null);
        count--;
    }

    public static void main(String[] args) {
        //linkedlist is alredy present in the java in build
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("Disha");
        System.out.println(linkedList);
        linkedList.add("Hardik");
        System.out.println(linkedList);

    }
}
