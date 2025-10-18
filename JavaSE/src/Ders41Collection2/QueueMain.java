package Ders41Collection2;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<String> queue=new ArrayDeque<>();
        Queue<String> queue2=new PriorityQueue<>();
        Queue<String>  queue3=new LinkedList<>();

        queue2.add("Ali");

        queue3.offer("Aliimran");
        queue3.offer("REhman");
        queue3.offer("Yusif");
        queue3.offer("Sema");



        String el=queue.peek();
//        String el=queue.element();
        System.out.println("Element: "+el);

//        queue.remove();
          queue.poll();

        System.out.println("Queue: "+queue3);
        System.out.println(queue3.peek());
        System.out.println(queue3.poll());
        System.out.println(queue3.poll());
        System.out.println("Queue: "+queue3);

    }

}
