package multiTreading;
 
class Customer {
	private int balance = 10000;
	 
	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw Rs. "+amount);
		if(balance < amount) {
			System.out.println("less balance. Waiting for deposit....");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		balance -= amount;
		System.out.println("withdraw completed. Balance : Rs."+balance);
	}
	synchronized void deposit(int amount) {
		System.out.println("oing to deposit Rs."+amount);
		balance += amount;
		System.out.println("deposit completes. Balance : Rs."+balance);
		notify();
	}
}
public class InterThreadCommunication {

	public static void main(String[] args) {
		Customer customer = new Customer();
		new Thread("Raj") {
			public void run() {customer.withdraw(15000);};
		}.start();
		new Thread("Riya") {
		public void run() {customer.deposit(20000);};
	}.start();
	

	}
}

