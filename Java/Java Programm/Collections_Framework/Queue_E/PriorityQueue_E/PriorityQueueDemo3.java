package Collections_Framework.Queue_E.PriorityQueue_E;

import java.util.PriorityQueue;

record Task(String name, Integer priority)
{
}


public class PriorityQueueDemo3 {
    public static void main(String[] args) 
    {                                               
        PriorityQueue<Task> taskQueue = new PriorityQueue<>((t1,t2)-> Integer.compare(t1.priority(), t2.priority()));

        taskQueue.add(new Task("Submit report", 4));
        taskQueue.add(new Task("Find Bug", 2));
        taskQueue.add(new Task("Write Program", 1));
        taskQueue.add(new Task("Execute Program", 3));

        while (!taskQueue.isEmpty()) 
        {
            System.out.println("Executing: " + taskQueue.poll());
        }
    }
}