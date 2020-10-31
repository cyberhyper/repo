package assignment4;

public class ManagementCompany {

	//Decaring constants
	private final int MAX_PROPERTY = 5;
	private final int MGMT_WIDTH = 10;
	private final int MGMT_DEPTH = 10;
	
	//Declaring needed fields
	private double mgmFeePer;
	private String name;
	private Property[] properties;
	private String taxID;
	private Plot plot;
	
	//Building Constructors
	
	//No-Arg Constructor that creates a ManagementCompany object using empty strings and a default Plot.
	public ManagementCompany()
	{
		mgmFeePer = 0;
		name = null;
		taxID = null;
		
		this.properties = new Property[MAX_PROPERTY];
		this.plot = new Plot();
		
	}
	
	//Constructor Creates a ManagementCompany object using the passed information.
	public ManagementCompany(String name, String taxID, double mgmFee)
	{
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFee;
		
		this.plot = new Plot(0,0,MGMT_WIDTH, MGMT_DEPTH);
	}
	
	//Constructor Creates a ManagementCompany object using the passed information.
	public ManagementCompany(String name,String taxID,double mgmFee, int x, int y, int width, int depth)
	{
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFee;
		
		this.properties = new Property[MAX_PROPERTY];
		
		this.plot = new Plot(x,y,width, depth);
	}

	//Copy Constructor creates a ManagementCompany object using another ManagementCompany object.
	public ManagementCompany(ManagementCompany otherCompany)
	{
		
	}
	
	
	public int getMAX_PROPERTY()
	{
		return MAX_PROPERTY;
	}
	
	public Plot getPlot()
	{
		return plot;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int addProperty(Property property)
	{
		if (property == null)
		{
			return -2;
		}
		
		if (!plot.encompasses(property.getPlot()))
		{
			return -3;
		}
		
		for (int i = 0; i < properties.length; i++)
		{
			if (properties[i] != null)
			{
				if (properties[i].getPlot().overlaps(property.getPlot()))
				{
					return -4;
				}
			}
			else
			{
				properties[i] = property;
				return i;
			}
			
		}
		
		return -1;
	}
	
	public int addProperty(String name, String city, double rent, String owner)
	{
		return addProperty(new Property(name, city, rent, owner));
		
	}
	
	public int addProperty(String name,String city,double rent,String owner,int x,int y,int width,int depth)
	{
		return addProperty(new Property(name, city, rent, owner, x, y, width, depth));
	}
	
	public double totalRent()
	{
		double total_rent = 0;
		
		for (int i = 0; i < properties.length; i++)
		{
			if(properties[i] == null)
			{
				break;
			}
			
			 total_rent += properties[i].getRentAmount();
			 
		}
		return total_rent;
	}
	
	public double maxRentProp()
	{
		double max_rent = 0;
		
		max_rent = properties[maxRentPropertyIndex()].getRentAmount();
		return max_rent;
	}
	
	public int maxRentPropertyIndex()
	{
		int index = -1;
		double max = 0;
		for (int i = 0; i < properties.length; i++)
		{
			if (properties[i] == null)
			{
				break;
			}
			
			if (properties[i].getRentAmount() > max)
			{
				max = properties[i].getRentAmount();
				index = i;
			}
		}
		return index;
	}
	
	public String displayPropertyAtIndex(int i)
	{
		return properties[i].toString();
	}
	
	@Override
	public String toString()
	{
		String easy = null;
		for(int i = 0; i < MAX_PROPERTY; i++)
		{
			if(properties[i] == null)
			{
				break;
			}
			
			easy += properties[i] + "\n";
			
		}
		String a = "List of the properties for " + name + ", taxID: " + taxID + "\n_________________________________________________________\n"
				 + easy + "_________________________________________________________\n Total Management Fee: "
				+ (totalRent() * mgmFeePer / 100);
		
		return a;
	}
	
	
	
}
