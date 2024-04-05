package relationshipInhertance;

public class test {
	public static void main(String[] args) {
		/*
		 * Person person = new Person(); person.display();
		 * 
		 * Person person2 = new Person(102, "Riya", new MyDate(23, 11, 2002), new
		 * Address("line 1", "Alandi road", "Bhosar", "Pune", 411039));
		 * person2.display();
		

		/*
		 * Employee employee = new Employee(); employee.calculate(); employee.display();
		 * 
		 * Employee employee2 = new Employee(102, "Manas", new MyDate(12, 5, 1997), new
		 * Address(), 20, 1200); employee2.calculate(); employee2.display();
		

		/*
		 * Student student = new Student(); student.calculate(); student.display();
		 * 
		 * Student student1 = new Student(111, "Jayesh", new MyDate(14, 05, 2001), new
		 * Address("Line 1", "Alandi rd", "Bhosari", "Pune", 411039), 85, 78, 70);
		 * student1.calculate(); student1.display();
		 

		Student student = new Student();
		student.calculate();
		student.display();

		
		  Student student1 = new Student(101, "John", new MyDate(14, 05, 2001), new
		  Address("Line 1", "Alandi rd", "Bhosari", "Pune", 411039), 90, 85, 75);
		  student1.calculate();
		  student1.display();
		 
		
		SalesPerson sale = new SalesPerson();
		sale.calculate();
		sale.display();
		
		
		SalesPerson sale1 = new SalesPerson(101, "Paras", new MyDate(15, 8, 1998), new Address("Line 1", "Alandi rd", "Moshi", "Pune", 411039), 2500, 24, 75);
		sale1.calculate();
		sale1.display();
		
		
		StudentGrade student1 = new StudentGrade();
		student1.calculate();
		student1.display();
		
		
		StudentGrade student2 = new StudentGrade(109, "Manav", new MyDate(15, 05, 2001), new Address("Line 1", "Alandi rd", "Bhosari", "Pune", 411039), 90, 85, 75);
				  student2.calculate();
				  student2.display();*/
		
		
		
		Customer customer1 = new Customer();
		customer1.CalculateDiscount();
		customer1.display();
		
		Customer customer2 = new Customer("bike",1,100000,99000);
		customer2.CalculateDiscount();
		customer2.display();
		
		
		
		
		
	}
}
