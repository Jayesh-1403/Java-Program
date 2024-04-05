package multiTreading;

public class AccountSynchro implements Runnable{
 private Account  acct = new Account(); 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountSynchro acctDanger = new AccountSynchro();
		Thread t1 = new Thread(acctDanger);
		Thread t2 = new Thread(acctDanger);
		t1.start();
		t2.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i<=5; i++) {
			makeWithdrawal(1000);
			
		}
	}
	public synchronized void makeWithdrawal(int amount) {
		if(acct.getBalance()>=amount) {
			System.out.println(Thread.currentThread().getName()+" is going to withdraw");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			acct.withdraw(amount);
			System.out.println(Thread.currentThread().getName()+" completes withdrawal");
		}
		else {
			System.out.println("Not enough balance in acount for "
		+Thread.currentThread().getName()+" Balance : "+acct.getBalance());
		}
	}

}
