package assignment4;

public class Property {

	//Declaring instance variables for property name, city, rental amount, owner, and plot.
	private String city;
	private String owner;
	private String propertyName;
	private double rentAmount;
	private Plot plot;

	//Building Constructors
	
	//No-arg Constructor, creates a new object with default values of empty strings, 0 for rent amount, and default Plot
	public Property()
	{
		city = null;
		owner = null;
		propertyName = null;
		rentAmount = 0;
		
		this.plot = new Plot();
		
	}
	
	//Copy Constructor, creates a new object using the information of the object passed to it.
	public Property(Property p)
	{
		city = p.city;
		owner = p.owner;
		propertyName = p.propertyName;
		rentAmount = p.rentAmount;
		
		plot = p.plot;
	}
	
	//Parameterized Constructor
	public Property(String propertyName, String city, double rentAmount, String owner)
	{
		this.city = city;
        this.owner = owner;
        this.propertyName = propertyName;
        this.rentAmount = rentAmount;
        
        this.plot = new Plot();
	}
	
	//Constructor, Parameterized constructor
	public Property( String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth )
	{
		
		this.city = city;
        this.owner = owner;
        this.propertyName = propertyName;
        this.rentAmount = rentAmount;
        
        this.plot = new Plot(x, y, width, depth);
		
	}
	
	//Building Getters and Setters
	
	//Return the property Name
	public String getPropertyName()
	{
		return propertyName;
	}
	
	//set the property name
	public void  setPropertyName(String propertyName)
	{
		this.propertyName =  propertyName;
	}
	
	//return the city
	public String getCity()
	{
		return city;
	}

	//set the city
	public void setCity(String city)
	{
		this.city = city;
	}
	
	//return the plot
	public Plot getPlot()
	{
		return plot;
	}
	
	//set the Plot values and return the Plot instance
	public void setPlot(int x, int y, int width, int depth)
	{
		plot = new Plot(x, y, width, depth);
	}
	
	//return the rent amount
	public double getRentAmount()
	{
		return rentAmount;
	}
	
	//set the rent amount
	public void setRentAmount(double rentAmount)
	{
		this.rentAmount = rentAmount;
	}

	//return the owner name
	public String getOwner()
	{
		return owner;
	}

	//set the owner name
	public void setOwner(String owner)
	{
		this.owner = owner;
	}
	
	//Prints out the name, city, owner and rent amount for a property.
	@Override
	public String toString()
	{
		
		String a = "Property Name: " + propertyName + "\n" + "Located in " + city +"\n" + "Belonging to: " + owner + "\n" + "Rent Amount: " + rentAmount + " ";
		return a;
	}
	
}
