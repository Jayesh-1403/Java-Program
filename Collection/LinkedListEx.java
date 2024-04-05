package Collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Apple");
		linkedList.add("Mango");
		linkedList.add("Banana");
		linkedList.add(1,"Grapes");
		linkedList.add("Apple");
		linkedList.add(null);
		
		for (String string : linkedList) {
			System.out.println(string);
			
		}
		LinkedList<String> linkedList2 = new LinkedList<>();
		linkedList2.add("Jasmine");
		linkedList2.add("Lily");
		
		linkedList.addAll(linkedList2);
		System.out.println("adding list2 in list1 : \n"+linkedList);
		
	}

}
