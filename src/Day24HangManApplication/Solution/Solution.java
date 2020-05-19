package Day24HangManApplication.Solution;

import java.io.*;
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }

}
class Solution
{

    public static Node removeDuplicates(Node head) {
        //Write your code here
        Node current,currentNext;
        current = head;
        if(current != null && current.next != null) {
            if(current.data == current.next.data) {
                //remove link from next and put to next.next
                currentNext = current.next.next;
                current.next = currentNext;
                removeDuplicates(current.next);
            }
            else {
                removeDuplicates(current.next);
            }
        }
        else {
            return head;
        }
        return current;
    }

    public static  Node insert(Node head,int data)
    {
        Node p=new Node(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)
    {
        Node start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Node head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);

    }
}