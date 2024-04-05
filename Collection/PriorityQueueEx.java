package Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> queue = new PriorityQueue<>();
		queue.add("Jasmine");
		queue.add("Lotus");
		queue.add("Rose");
		queue.add("Mogra");
		queue.add("Lilly");
		//queue.offer(null); you can't store null
		
		System.out.println("Queue : "+queue);
		
		System.out.println("head of queue : "+queue.element());
		
		System.out.println("removing element : "+queue.remove());
		
		System.out.println("after removing element : "+queue.poll());
		
		System.out.println("after removing queue :"+queue);
	}

}
