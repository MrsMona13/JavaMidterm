package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add, peek, remove & poll elements.
         * Use For-Each loop and While-Loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */

        Queue<Integer> q1 = new LinkedList<>();
        //Add elements to the Queue
        q1.add(100);
        q1.add(200);
        q1.add(300);
        q1.add(400);
        q1.add(500);
        System.out.println("These are the numbers in Queue:"+q1);
        //remove () method =>removes first element from the queue
        System.out.println("Number removed from the queue: "+q1.remove());
        //element() => returns head of the queue
        System.out.println("Head numberof the queue: "+q1.element());
        //poll () => removes and returns the head
        System.out.println("Poll():Returned Head number of the queue: "+q1.poll());
        //returns head of the queue
        System.out.println("peek():Head number of the queue: "+q1.peek());
        //print the contents of the Queue
        System.out.println("Final number Queue:"+q1);
    }
}