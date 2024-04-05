package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparable {
	
		void ComparableBook1()
		{
			ArrayList<Book1> b1 = new ArrayList<Book1>();
			//Create and add 5 book records
			b1.add(new Book1(4,"Book4","Author4","Publisher4",12));
			b1.add(new Book1(2,"Book2","Author2","Publisher2",20));
			b1.add(new Book1(3,"Book3","Author3","Publisher3",15));
			b1.add(new Book1(5,"Book5","Author5","Publisher5",8));
			b1.add(new Book1(1,"Book1","Author1","Publisher1",10));
			
			System.out.println("*****************************Before Sorting ***************************");
			for(Book1 bk:b1)
			{
				System.out.println(bk.id+" "+bk.name+" "+bk.author+" "+bk.publisher);
			}
			Collections.sort(b1);
			System.out.println("*****************************After Sorting ***************************");
			for(Book1 bk:b1)
			{
				System.out.println(bk.id+" "+bk.name+" "+bk.author+" "+bk.publisher);
			}
		
		}
	public static void main(String[] args) {
		TestComparable test = new TestComparable();
		test.ComparableBook1();
		
		
	}
	

}
