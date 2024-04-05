package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class AgeComparator implements Comparator<student>
{

	public int compare (student s1, student s2) {
		if (s1.age==s2.age)
		{
		return 0;
		}
		else if (s1.age>s2.age)
		{
			return 1;
		}
		else 
		{
			return -1;
		}
	}


	
}
class NameComparator implements Comparator<student>
{

	@Override
	public int compare(student s1, student s2) {
	
		return s1.name.compareTo(s2.name);
	}
	
}
public class TestComparator {

	void ComparatorDemo()
	{
		ArrayList<student> a1= new ArrayList<student>();
		a1.add(new student(1,"Teena",42));
		a1.add(new student(2,"Leena",23));
		a1.add(new student(3,"Reena",24));
		System.out.println("Sorting by age");
		Collections.sort(a1, new AgeComparator());
		for(student st:a1) {
			System.out.println(st.rollNo+" "+st.name+" "+st.age);
		}
		System.out.println("---------------------------------------------");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
TestComparator test=new TestComparator();
test.ComparatorDemo();
	}

}
