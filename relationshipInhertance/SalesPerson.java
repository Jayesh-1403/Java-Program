package relationshipInhertance;

public class SalesPerson extends Employee{
	float sales, commission, totalSalary;
	
	public SalesPerson() {
		super();
		sales = 70;
	}
	public SalesPerson(int id,String name, MyDate dob, Address add, float perday, float workingDays, float sales)
	
	{
	super(id,name,dob,add,perday,workingDays);
	this.sales=sales;
		
	}
	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		super.calculate();
		if(sales>95)
			commission = salary * 0.2f;
		else if(sales>75)
			commission = salary * 0.15f;
		else if(sales>60)
			commission = salary * 0.1f;
		else 
			commission = 0;
		totalSalary = salary + commission;
		
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Sales : "+sales);
		System.out.println("commission :"+commission);
		System.out.println("Total Salary :"+totalSalary);
	}
}
