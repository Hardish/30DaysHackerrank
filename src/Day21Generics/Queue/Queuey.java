package Day21Generics.Queue;

import Day18QueueyWithLinkedList.StringQueue;

public class Queuey {

    public static void main(String[] args) {
        NumberQueue numberQueuey = new NumberQueue();

        numberQueuey.enqueue(5);
        numberQueuey.enqueue(54);
        numberQueuey.enqueue(24);
        numberQueuey.enqueue(78);
        numberQueuey.enqueue(98);

        System.out.println("First out: " + numberQueuey.dequeue());
        System.out.println("Second out: " + numberQueuey.dequeue());
        System.out.println("Third out: " + numberQueuey.dequeue());
        System.out.println("Fourth out: " + numberQueuey.dequeue());

        System.out.println("Check the first element in the Queue: " + numberQueuey.peek());
        System.out.println("Size of the Queue is "+numberQueuey.size());


        StringQueue stringQueue = new StringQueue();
        stringQueue.enqueue("Disha");
        stringQueue.enqueue("Hardik");
        stringQueue.enqueue("Utsav");
        stringQueue.enqueue("Khyati");
        stringQueue.enqueue("Anaya");
        stringQueue.enqueue("K.P.Patel");
        stringQueue.enqueue("Surekha Patel");
        stringQueue.enqueue("Jigar Kumar");

        System.out.println("First out: " + stringQueue.dequeue());
        System.out.println("Second out: " + stringQueue.dequeue());
        System.out.println("Third out: " + stringQueue.dequeue());
        System.out.println("Fourth out: " + stringQueue.dequeue());

        System.out.println("Check the first element in the Queue: " + stringQueue.peek());
        System.out.println("Size of the Queue is "+stringQueue.size());

    }
}
