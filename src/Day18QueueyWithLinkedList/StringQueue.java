package Day18QueueyWithLinkedList;

import java.util.LinkedList;

public class StringQueue {
    LinkedList queue;

    //Making a queue instance
    public StringQueue(){
        queue = new LinkedList();
    }


    //Check linkedlist/Queue is empty?
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    //Return Queue Size
    public String size() {
        return String.valueOf(queue.size());
    }

    //enqueue
    public void enqueue(String n) {
        queue.addLast(n);  //as this is queue FIFO follow
    }

    //dequeuing item
    public String dequeue() {
        return (String) queue.removeFirst();   //all will be String in queue as we created it.
    }

    //Peek at the first item
    public String peek() {
        return (String) queue.getFirst();
    }
}
