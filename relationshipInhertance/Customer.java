/*Person <- Customer(prodName,quantity, price, billAmount) <- Discount 

	if billAmount is 20000 or greater than then 15% discount on billAmount
				15000 or more then 10% discount on billAmount
				10000 or more then 7% discount on billAmount
				below 10000 no discount.
				
	calculate discount and final bill.*/

package relationshipInhertance;

public class Customer extends Person {
	String prodname;
	int quantity;
	int price, billAmount;

	Customer(){
		super();
		prodname="Boxes";
		price = 60;
		quantity = 9;
		
	}
	Customer (int id, String name, MyDate dob, Address add, String prodname, int price, int quantity){
		super(id,name,dob,add);
		this.prodname = prodname;
		this.quantity = quantity;
		this.price = price;
	}
	

/*	public Customer(String prodname, int quantity, int price, int billAmount) {
		this.prodname = prodname;
		this.quantity = quantity;
		this.price = price;
		this.billAmount = quantity*price;

	}
	  public double CalculateDiscount() {
	        if (billAmount >= 20000) 
	            return 0.15 * billAmount;
	         else if (billAmount >= 15000) 
	            return 0.10 * billAmount;
	         else if (billAmount >= 10000) 
	            return 0.07 * billAmount;
	         else 
	            return 0.0;
	}
	  public double CalculateFinalBill() {
	        double discount = CalculateDiscount();
	        return billAmount - discount;*/
	    }
}
