package Day23TicTacToeApplication.Solution;

import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

    static void levelOrder(Node root){
        //Write your code here
        LinkedList<Node> queue = new LinkedList<>();
       // ArrayList<Node> removed = new ArrayList<>();
        if(root != null) {
            // enqueue current root
            queue.addLast(root);

            // while there are nodes to process
            while(!queue.isEmpty()) {
                // dequeue next node
                Node tree = queue.removeFirst();
                System.out.print(tree.data + " ");
              //  removed.add(tree);
                // enqueue child elements from next level in order
                if( tree.left != null) {
                    queue.addLast( tree.left );
                }
                if( tree.right != null ) {
                    queue.addLast(tree.right);
                }
            }
        }
       /* for(Node sample:removed ) {
            System.out.print(sample.data + " ");
        }*/


    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}
