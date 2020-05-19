package Day18QueueyWithLinkedList;

import java.util.LinkedList;

public class NumberQueue {

    LinkedList queue;

    //Making a queue instance
    public NumberQueue(){
        queue = new LinkedList();
    }


    //Check linkedlist/Queue is empty?
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    //Return Queue Size
    public int size() {
        return queue.size();
    }

    //enqueue
    public void enqueue(int n) {
        queue.addLast(n);  //as this is queue FIFO follow
    }

    //dequeuing item
    public int dequeue() {
        return (int) queue.removeFirst();   //all will be int in queue as we created it.
    }

    //Peek at the first item
    public int peek() {
        return (int) queue.getFirst();
    }
}
