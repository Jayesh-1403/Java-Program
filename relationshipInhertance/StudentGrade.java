package relationshipInhertance;

	public class StudentGrade extends Student {
	String Grade;
	public StudentGrade() {
		super();
		
	}
	public StudentGrade(int id, String name, MyDate dob, Address add, int phy, int chem, int maths) {
	super(id, name, dob, add, phy, chem, maths);
	}
	@Override
		public void calculate() {
			// TODO Auto-generated method stub
			super.calculate();{
			if (percent >= 90) 
	            Grade = "A+";
			
	            else if (percent >= 80) 
	                Grade = "A";
	            
	            else if (percent >= 70) 
	            Grade = "B+";
	            
			else if (percent >= 60) 
	            Grade = "B";
			
			else 
				Grade = "fail";
			}
			
	}
	@Override
		public void display() {
			// TODO Auto-generated method stub
			super.display();
			System.out.println("Grade : "+Grade);
			
			
		}
	}
	
	

