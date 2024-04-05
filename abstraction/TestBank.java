package abstraction;

import java.util.Scanner;

abstract class Bank{
	public abstract double getrateofintrest();
	
}
class Axis extends Bank{

	@Override
	public double getrateofintrest() {
		// TODO Auto-generated method stub
		return 8.5;
	}
	
}
class Sbi extends Bank {

	@Override
	public double getrateofintrest() {
		// TODO Auto-generated method stub
		return 6.2;
	}
	
}
public class TestBank {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double principleAmt, years, rateSbi, rateAxis;
	System.out.println("Enter Principle amount and no. of years :");
	principleAmt = sc.nextDouble();
	years = sc.nextDouble();
	
	Bank bank;
	
	bank = new Sbi();
	rateSbi = bank.getrateofintrest();
	
	bank = new Axis();
	rateAxis = bank.getrateofintrest();
	
	double interestSbi = principleAmt*years*rateSbi/100;
	double interestAxis = principleAmt*years*rateAxis/100;
	
	System.out.println("Simple interest for Sbi :"+interestSbi);
	System.out.println("Simple interest for Axis :"+interestAxis);
	
}
}
