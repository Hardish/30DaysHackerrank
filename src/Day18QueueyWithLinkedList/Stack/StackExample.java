package Day18QueueyWithLinkedList.Stack;

//Java already provided implementation of the Stack and Queue

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();  //string type Stack class

        stack.push("there");
        stack.push("Hi");

        System.out.println("Searching element from Stack: " + stack.search("there"));

        System.out.print(stack.pop() + " ");
        System.out.println(stack.pop() + "! ");

        System.out.println("Size of the Stack "+stack.size());



    }

}
