package com.rajtechnolgies.java8.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {

    public static void main(String[] args) {
        Queue<Integer> queue=new PriorityQueue<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.poll();
        queue.poll();
        System.out.println(queue);
    }
}
