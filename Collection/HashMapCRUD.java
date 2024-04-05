package Collection;

import java.util.HashMap;

public class HashMapCRUD {

	void CRUD()
	{
		HashMap<Integer,Book> bookMap=new HashMap<Integer,Book>();
		
		//create book
		Book b1=new Book(101,"Let's C", "YCM");
		Book b2=new Book(102,"Data Commuication and Networking","YCM");
		Book b3= new Book(103,"O.S","Galvin");
		
		//Add Books 
		Book read1=bookMap.get(101);
		Book read2=bookMap.get(102);
		Book read3=bookMap.get(103);
		
		//display on console
		System.out.println("****************Books List********************");
		System.out.println(read1);
		System.out.println("------------------------------------------------");
		System.out.println(read2);
		System.out.println("-------------------------------------------------");
		System.out.println(read3);
		System.out.println("-------------------------------------------------");
		
		//update book
		if(read1!=null) {
			read1.setTitle("New Title");
			bookMap.put(read1.getId(),read1);
			System.out.println("****************Updated books**************");
			System.out.println("Updated book : "+read1);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
