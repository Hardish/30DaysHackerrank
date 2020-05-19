package Day15LinkedList;

import java.io.*;
import java.util.*;

class Node1 {
    int data;
    Node1 next;

    Node1(int d) {
        data = d;
        next = null;
    }
    public Node1(int newData,Node1 newNext)
    {
        data = newData;
        next = newNext;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node1 getNext() {
        return next;
    }

    public void setNext(Node1 next) {
        this.next = next;
    }

}

class Solution {

    public static  Node1 insert(Node1 head,int data) {
        //Complete this method

        Node1 temp = new Node1(data);
        Node1 current = head;

        if (current != null ) {
            while (current.next != null) {
                current = current.next;
            }
            current.next = temp;
        }
        else {
            head = temp;
        }
        return head;


    }

    public static void display(Node1 head) {
        Node1 start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node1 head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}