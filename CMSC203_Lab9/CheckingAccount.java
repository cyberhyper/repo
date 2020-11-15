package lab9;

public class CheckingAccount extends BankAccount {

	//Declaring and initializing static constant FEE that represents the cost of clearing one check
	private static double FEE = .15;

	//Initializing accountNumber to the current value in accountNumber concatenated with –10
	private String accountNumber = getAccountNumber() + "-10";  

	//Writing constructor
	public CheckingAccount(String name, double initialBalance) {

		super(name, initialBalance);
		setAccountNumber(accountNumber);

	}

	//Overiding the withdraw method in the superclass
	public boolean withdraw(double initialBalance) {
		
		double finalBalance = initialBalance + FEE;
		super.withdraw(finalBalance);
		boolean result = true;
		
		return result;
	}

}