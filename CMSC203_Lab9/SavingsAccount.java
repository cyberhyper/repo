package lab9;

public class SavingsAccount extends BankAccount {
	
	//Declaring and initializing annual interest rate
	double rate = 0.025;
	
	//Declaring and initilizing instance variable 
	static int savingsNumber = 0;
	
	//Hiding accountNumber from the superclass
	private String accountNumber = super.getAccountNumber();
	
	//Writing constructor
	public SavingsAccount(String name, double initialBalance) {
		
		super(name, initialBalance);
		
		accountNumber = accountNumber + "-" + Integer.toString(savingsNumber);
		
	}
	
	//Calculating one month's worth of interest on the balance and deposit it into the account
	public void postInterest() {
		
		double interest = getBalance() * (rate/12);
		double finalBalance = getBalance() + interest;
		
		setBalance(finalBalance);
		
	}
	
	//Overriding the getAccountNumber method in the superclass
	public String getAccountNumber() {
		
		return accountNumber;
		
	}
	
	//Writing copy constructor
	public SavingsAccount(SavingsAccount oldAccount, double initialBalance) {
		
		super(oldAccount, initialBalance);
		savingsNumber++;
		
		accountNumber = accountNumber + "-" + Integer.toString(savingsNumber);
		
	}

}
