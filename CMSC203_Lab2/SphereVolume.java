import java.util.Scanner;
import java.lang.Math.*;

public class SphereVolume {
	
public static void main(String[] args) 
{ 
	//Declaring Scanner Object
	Scanner input = new Scanner(System.in);
	
	//Declaring variables
	double diam;
	double radi;
	double volume;
	
	//Introducing program purpose
	System.out.println("Welcome User! This is a program that calculates the volume of a sphere\n" + 
	"utilizing your personal inputs!");
	
	//Prompting the user for an input for diameter
	System.out.println("To begin this program, please enter a number for your sphere's diameter in meters.");
	diam = input.nextDouble();
	
	//Calculating radius
	radi = diam/2.0;
	
	//Utilizing formula
	volume = (4/3.0) * Math.PI * Math.pow(radi, 3);
	
	System.out.println("Calculation Complete: The Volume of a Sphere with a diameter of " + diam + " meter(s) is: ");
	System.out.printf("%.2f", volume);
	System.out.println(" meters cubed");
} 
} 
