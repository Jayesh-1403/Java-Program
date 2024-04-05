package java8features;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Product{
	int productId;
	String productName;
	float productPrice;
	public Product(int productId, String productName, float productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
	}

public abstract class LambdaInComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product> list = new ArrayList<>();
		list.add(new Product(101, "Mousepad", 1200));
		list.add(new Product(102, "Laptop", 65000));
		list.add(new Product(103, "KeyBoard", 3300));
		list.add(new Product(104, "Speakers", 1700));
		list.add(new Product(105, "Pendrive", 2400));
		list.add(new Product(106, "Printer", 5400));
		Collections.sort(list, (p1,p2) -> {
			return p1.productName.compareTo(p2.productName);
		});
		list.forEach(p -> System.out.println(p));
		
	System.out.println("----------------------------------------------------------------------------");
		Collections.sort(list, (p1,p2)->{
			if (p1.productPrice == p2.productPrice ) {
				return 0;
			}else if (p1.productPrice > p2.productPrice ) {
				return 1;
			}
			else 
				return -1;
			
		});
		list.forEach(p -> System.out.println(p) );
	
	}
}
	
	

