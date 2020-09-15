package Assignment1;
import java.util.Scanner;

public class WifiUtility {

	Scanner input = new Scanner(System.in);
	//Declaring user input variable
	String option;
	
	public  void step1()
	{
		//Requesting user for input
		option = input.nextLine();
		
		//Deciding the outcome of the user's input
		if (option.equals("yes"))
		{
			System.out.println("Rebooting your computer seemed to have solved the problem.");
			
			System.out.println("Goodbye!");
			
			System.exit(0);
		}

	}
	public void step2()
	{
		//Requesting user for input
		option = input.nextLine();
		
		//Deciding the outcome of the user's input
		if (option.equals("yes"))
		{
			System.out.println("Rebooting your router seemed to have solved the problem.");
			
			System.out.println("Goodbye!");
			
			System.exit(0);
		}
		
	}
	public void step3()
	{
		//Requesting user for input
		option = input.nextLine();
		
		//Deciding the outcome of the user's input
		if (option.equals("yes"))
		{
			System.out.println("Making sure power reached your router seemed to have solved the problem.");
			
			System.out.println("Goodbye!");
			
			System.exit(0);
		}
	}
	public void step4()
	{
		//Requesting user for input
		option = input.nextLine();
		
		//Deciding the outcome of the user's input
		if (option.equals("yes"))
		{
			System.out.println("Moving the computer closer to the router seemed to have solved the problem.");
			
			System.out.println("Goodbye!");
			
			System.exit(0);
		}
	}
}