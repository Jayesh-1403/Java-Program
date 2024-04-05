package MiniProject;

/*import java.util.ArrayList;

import Collection.TestComparable;

public class Product {

	static int id;
	static String name;
	static int price;
	static String discription;
	
	
	public Product(int i, String string, int j, String string2) {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getDiscription() {
		return discription;
	}


	public void setDiscription(String discription) {
		this.discription = discription;
	}


	void Product() {
	
	ArrayList<Product> p1 = new ArrayList<Product>();

	//Create and add 5 product records
	p1.add(new Product(101,"Bat",2030,"Wooden Bat"));
	p1.add(new Product(102,"Ball",40,"Tennis Ball"));
	p1.add(new Product(103,"Stump",350,"Wooden rod"));
	p1.add(new Product(104,"Volly Ball",580,"Big Ball"));
	p1.add(new Product(105,"Hockey",800,"Wooden Stick"));
	
	System.out.println("Please Enter the requirement : ");
	for (Product pt:p1) 
	{
		System.out.println(pt.id+" "+pt.name+" "+pt.price+" "+pt.discription);
	}
	
	}
	 public void add(int extra) {
	        Product.price += extra;
	        System.out.println("Add more item ?");
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product = new Product(id, name, price, discription);
		product.Product();*/

import java.util.*;

class Product {
	int id;
	String name;
	double price;
	String description;

	public Product(int id, String name, double price, String description) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getDescription() {
		return description;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Product{" + "id=" + id + ", name='" + name + '\'' + ", price=" + price + ", description='" + description
				+ '\'' + '}';
	}

}
