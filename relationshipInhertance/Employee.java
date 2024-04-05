package relationshipInhertance;

public class Employee extends Person {

	float perDay, workingDays, salary;

	public Employee() {
		super();// super class constructor
		this.perDay = 1200;
		this.workingDays = 18;
	}

	public Employee(int id, String name, MyDate dob, Address add, float perDay, float workingDays)

	{
		super(id,name,dob,add);
		this.perDay = perDay;
		this.workingDays = workingDays;
	}
	public void calculate() {
		salary = workingDays*perDay;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();// calling parent method
		System.out.println("Salary : "+salary);
	
	}

	
}


