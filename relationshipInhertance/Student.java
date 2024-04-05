package relationshipInhertance;

public class Student extends Person{

	int phy, chem, maths, total;
	int percent;

	public Student() {
		super();
		phy = 85;
		chem = 78;
		maths = 70;
	}

	public Student(int id, String name, MyDate dob, Address add, int phy, int chem, int maths) {
		super(id, name, dob, add);
		this.phy = phy;
		this.chem = chem;
		this.maths = maths;
	}

	public void calculate() {
		total = phy + chem + maths;
		percent = total / 3;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Total : "+total);
		System.out.println("Percent : "+percent);
	}

}
