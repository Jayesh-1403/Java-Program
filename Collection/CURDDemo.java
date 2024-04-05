
package Collection;

import java.util.ArrayList;

public class CURDDemo {

	ArrayList<String> listed = new ArrayList<>();

	public void create() {
		listed.add("Apple");
		listed.add("Banana");
		listed.add("Mango");
		System.out.println("\nList of listed");
		for (String list : listed)
			
			
		{
			System.out.println(list);
		}
	}

	public void update1() {
		int indexAt = 1;
		listed.set(indexAt, "Mango");
		System.out.println("Updated List");
		for (String list : listed)
			
		{
			System.out.println(list);
		}
	}

	public void delete() {
		listed.remove(0);
		System.out.println("Deleted List");
		for (String list : listed)
			
		{
			System.out.println(list);
		}
	}

	public static void main(String[] args) {
		CURDDemo demo = new CURDDemo();
		demo.create();
		demo.update1();
		demo.delete();

	}

}
