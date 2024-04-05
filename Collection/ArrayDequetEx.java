
package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Deque<String> deque = new ArrayDeque<>();
			deque.add("Coffee");
			deque.offer("Tea");
			deque.offer("Ice-cream");
		
			deque.offerFirst("Sandwitch");
			deque.offerLast("Pizza");
			
			deque.offer("Burger");
			
			//deque.offer (null); you can't insert null
			
			System.out.println("Deque : "+deque);
			
			System.out.println("removing 1st element : "+ deque.pollFirst());
			
			System.out.println("Deque : "+deque);
			
			System.out.println("removing last element : "+ deque.pollLast());
			
			System.out.println("Deque : "+deque);
			
			System.out.println("head of queue : "+ deque.peek());
	}

}
