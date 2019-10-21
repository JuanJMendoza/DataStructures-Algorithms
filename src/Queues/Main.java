package Queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue);
        reverse(queue);
        System.out.println(queue);

        //////////ARRAY QUEUE//////////
        ArrayQueue arrQue = new ArrayQueue(5);
        arrQue.enqueue(1);
        arrQue.enqueue(3);
        arrQue.enqueue(5);
        arrQue.enqueue(9);
        arrQue.enqueue(21);
        System.out.println(arrQue.dequeue());
        System.out.println(arrQue.dequeue());

        arrQue.enqueue(7);
        arrQue.enqueue(13);


        System.out.println(arrQue.toString());

        /////////////STACK QUEUE/////////////
        System.out.println("/////////////STACK QUEUE/////////////");
        StackQueue sq = new StackQueue();
        sq.enqueue(1);
        sq.enqueue(3);
        sq.enqueue(5);
        sq.enqueue(7);
        sq.enqueue(9);
        System.out.println(sq.peek());

//        sq.dequeue();
//        sq.dequeue();
//        sq.dequeue();
//        sq.dequeue();
//        System.out.println(sq.peek());


        /////////////PRIORITY QUEUE/////////////
        System.out.println("/////////////PRIORITY QUEUE/////////////");
        PriorityQueue pq = new PriorityQueue(5);
        pq.add(5);
        pq.add(3);
        pq.add(1);
        pq.add(9);
        pq.add(0);
        System.out.println(pq.toString());
    }

    public static void reverse(Queue<Integer> queue){
        // Can only use add, remove, isEmpty to make this function.
        if (!queue.isEmpty()){
            Stack<Integer> stack = new Stack<>();

            while (!queue.isEmpty()){
                stack.push(queue.remove());
            }

            while (!stack.isEmpty()){
                queue.add(stack.pop());
            }
        }


    }
}
