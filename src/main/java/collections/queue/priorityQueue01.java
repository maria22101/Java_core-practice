package collections.queue;

import java.util.PriorityQueue;

public class priorityQueue01 {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            q.add((int) (Math.random() * 51));
        }
        System.out.println(q);
        while (!q.isEmpty()){
            System.out.print(q.poll() + " "); //pick the queue's element according to the priority
        }
    }
}
