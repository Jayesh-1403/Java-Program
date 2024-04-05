//create list of integers and display even numbers using Stream API

package java8features;e

import java.util.*;
import java.util.stream.Collectors;

public class EvenNumberStream {

	public static void main(String[] args, Collection<Integer> numbers) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(5);
		list.add(8);
		list.add(3);
		list.add(12);
		list.add(7);
		
		List<Integer> evenNumbers = list.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
		
		System.out.println("Original List : "+list);
		System.out.println("Even Numbers : "+evenNumbers);
		
		
	}

}
