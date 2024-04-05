package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapEx {

	void HashMapDemo()
	{
		HashMap<Integer,String> map = new HashMap<Integer, String>();
		map.put(1, "Mango");
		map.put(2, "Apple");
		map.put(3, "Banana");
		map.put(4, "Grapes");
		
		System.out.println("Iterating Hashmaps....");
		System.out.println(" key "+"     "
				+ ""+" Value");
		for(Entry<Integer, String> m : map.entrySet()) {
			System.out.println(" "+m.getKey()+" "+m.getValue());
		}
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapEx hashMap = new HashMapEx();
		hashMap.HashMapDemo();
	}

}
