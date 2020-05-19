package Day21Generics.Linkedlist;

import java.util.LinkedList;

/*
    Add,Remove,#of nodes,is linkedlist sequence empty,retrieve data from node
 */
public class LinkedListUs<D> {

    //Properties
    Node<D> head;
    int count = 0;    //end of list, how many nodes are in list

    //Constructor
/*    public LinkedListUs()  -- check 19:25
     {
        head = null;
        count = 0;
    }*/

    public LinkedListUs(Node<D> newNode)
    {
        head = newNode;
        count++;
    }

    //methods
    //add
    public void add(D newData)
    {
        Node<D> temp = new Node(newData);
        Node<D> current = head;
        while(current.getNext()!=null)
        {
            current = current.getNext();
        }
        current.setNext(temp);
    }

    //get
    public D get(int index){

/*        if(index <= 0)  //throw exception
        {
            return -1;
        }*/
        Node<D> current = head;
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
        Node<D> current = head;
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

        LinkedList<Integer> linkedList1 = new LinkedList<Integer>();

        linkedList1.add(1);
        System.out.println(linkedList1);
        linkedList1.add(4);
        System.out.println(linkedList1);


    }
}
