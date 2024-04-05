package relationshipInhertance;

public class Address {

	String addrline;
	String street;
	String city;
	String state;
	int pincode;
	
	public Address() {
		addrline = "line 1 phata";
		street = "charholi phata";
		city = "pune";
		state = "maharastra";
		pincode = 412105;
		
	}
	public Address(String addrline, String street, String city, String state, int pincode ) {
		this.addrline=addrline;
		this.street=street;
		this.city=city;
		this.state=state;
		this.pincode=pincode;
		
	}
	public void display() {
		System.out.println(addrline+" "+street+" " +city+" "+state+" "+pincode);
	}
	
}

