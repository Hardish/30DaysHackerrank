package Day21Generics.Queue;

import java.util.LinkedList;

public class NumberQueue<D> {

    LinkedList<D> queue;

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
    public void enqueue(D n) {
        queue.addLast(n);  //as this is queue FIFO follow
    }

    //dequeuing item
    public D dequeue() {
        return queue.removeFirst();   //all will be int in queue as we created it.
    }

    //Peek at the first item
    public D peek() {
        return queue.getFirst();
    }
}
