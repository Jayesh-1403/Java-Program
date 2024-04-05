package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("Raj");
		list.add(101);
		list.add(56.78);
		list.add(true);
		list.add(null);
		list.add("Raj");
		
		System.out.println("List elements :"+list);
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Rose");
		list2.add("Lily");
		list2.add("Mogra");
		list2.add("Lotus");
		list2.add("Rose");
		
		System.out.println("Generic List : "+list2);
		
		System.out.println("iterating list using Iterator Interface :");
		Iterator<String> iterator = list2.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("iterating list using for each loop : ");
		for (String string : list2) {
			System.out.println(string);
		}
		System.out.println("After sorting : ");
		Collections.sort(list2);
		for(String string : list2) {
			System.out.println(string);
			
		}
		
		
	}

}
