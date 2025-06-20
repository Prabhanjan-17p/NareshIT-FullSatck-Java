package Collections_Framework.Queue_E.PriorityQueue_E;

import java.util.PriorityQueue;
public class PriorityQueueDemo1
{
      public static void main(String[] argv)
      {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
	    pq.add(11);
            pq.add(2);
            pq.add(4);          
	    pq.add(6);
           System.out.println(pq);  
	  }
}