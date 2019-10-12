package generics;

import java.sql.SQLOutput;

public class GenericQueueDemo {
    public static void main(String[] args) {
        Integer arr1[] = new Integer[10];
        GenericQueueFixedSize<Integer> q1 = new GenericQueueFixedSize<>(arr1);

        System.out.println("Demonstrating queue of integers:");
        try{
            for (int i = 1; i < 9; i++) {
                System.out.println("adding " + i * 2 + " to the queue");
                q1.put(i * 2);
            }
        }catch (QueueFullException e){
            System.out.println(e);
        }

        try{
            for (int i = 1; i < 9; i++) {
                System.out.println("getting the next Integer from the queue: " + q1.get());
            }
        }catch (QueueEmptyException e){
            System.out.println(e);
        }
    }
}
