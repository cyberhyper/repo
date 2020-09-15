package Assignment1;


public class WifiDriver {
	
	public static void main(String[] args) {
	
		WifiUtility method = new WifiUtility();
		
		//Introduce program
		System.out.println("Hello User! Welcome to the WIFI Diagnostic Program!");
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.");
		
		
		//Request for User input
			System.out.println("First step: Reboot your computer.");
			System.out.println("Are you able to connect with the internet? (yes or no)");
		
			//Calling the method
			method.step1();
		
			System.out.println("Second step: Reboot your router.");
			System.out.println("Now are you able to connect with the internet? (yes or no)");

			method.step2();
		
			System.out.println("Third step: Make sure the cables to your router are plugged in firmly and your router is getting power.");
			System.out.println("Now are you able to connect with the internet? (yes or no)");
			
			method.step3();
		
			System.out.println("Fourth step: Move the computer closer to the router and try to connect.");
			System.out.println("Now are you able to connect with the internet? (yes or no)");
			
			method.step4();
			
			System.out.println("Fifth step: Contact your ISP.");
			System.out.println("Make sure your ISP is hooked up to your router.");
			
			
			System.out.println("Goodbye!");
	}
}