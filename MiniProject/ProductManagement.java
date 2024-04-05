package MiniProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;



	public class ProductManagement extends Product{
	    public ProductManagement(int id, String name, double price, String description) {
			super(id, name, price, description);
			// TODO Auto-generated constructor stub
		}

		private static ArrayList<Product> product = new ArrayList<>();
	    private static int nextid = 1;

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        boolean running = true;

	        while (running) {
	            System.out.println("\n1. Add Product");
	            System.out.println("2. Update Product");
	            System.out.println("3. Get Product by ID");
	            System.out.println("4. Delete Product by ID");
	            System.out.println("5. Sort Products by Price");
	            System.out.println("6. Sort Products by Name");
	            System.out.println("7. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline character

	            switch (choice) {
	            ProductManagemet obj = new ProductManagement(choice, null, choice, null)
	                case 1:
	                    addProduct(scanner);
	                    break;
	                case 2:
	                    updateProduct(scanner);
	                    break;
	                case 3:
	                    getProductById(scanner);
	                    break;
	                case 4:
	                    deleteProductByid(scanner);
	                    break;
	                case 5:
	                    sortProductsByPrice1();
	                    break;
	                case 6:
	                    sortProductsByName1();
	                    break;
	                case 7:
	                    running = false;
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }

		private static void deleteProductByid(Scanner scanner) {
			// TODO Auto-generated method stub
			
		}

		private static void addProduct(Scanner scanner, int nextId) {
	        System.out.print("Enter product name: ");
	        String name = scanner.nextLine();
	        System.out.print("Enter product price: ");
	        double price = scanner.nextDouble();
	        scanner.nextLine(); // Consume newline character
	        System.out.print("Enter product description: ");
	        String description = scanner.nextLine();

	        Product product = new Product(nextId++, name, price, description);
	        product.add(product);
	        System.out.println("Product added successfully.");
	    }

	    void updateProduct(Scanner scanner) {
	        System.out.print("Enter product ID to update: ");
	        int id = scanner.nextInt();
	        scanner.nextLine(); // Consume newline character

	        for (Product product : product) {
	            if (product.getId() == id) {
	                System.out.print("Enter new name: ");
	                String name = scanner.nextLine();
	                System.out.print("Enter new price: ");
	                double price = scanner.nextDouble();
	                scanner.nextLine(); // Consume newline character
	                System.out.print("Enter new description: ");
	                String description = scanner.nextLine();

	                product.setName(name);
	                product.setPrice(price);
	                product.setDescription(description);
	                System.out.println("Product updated successfully.");
	                return;
	            }
	        }

	        System.out.println("Product not found with ID: " + id);
	    }

	    void getProductById(Scanner scanner) {
	        System.out.print("Enter product ID: ");
	        int id = scanner.nextInt();

	        for (Product product : product) {
	            if (product.getId() == id) {
	                System.out.println(product);
	                return;
	            }
	        }

	        System.out.println("Product not found with ID: " + id);
	    }

	    void deleteProductById(Scanner scanner, int product) {
	        System.out.print("Enter product ID to delete: ");
	        int id = scanner.nextInt();
	    
	     product.removeIf(product > product.getid() == id);
	        System.out.println("Product deleted successfully.");
	    
	    }
	     void sortProductByPrice() {
	        Collections.sort(product, Comparator.comparingDouble(Product::getPrice));
	        System.out.println("Products sorted by price:");
	        displayProduct();
	    }

	    void sortProductByName() {
	        Collections.sort(product, Comparator.comparing(Product::getName));
	        System.out.println("Products sorted by name:");
	        displayProduct();
	    }

	    private static void displayProduct() {
	        for (Product product : product) {
	            System.out.println(product);
	        }
	    }
	}


