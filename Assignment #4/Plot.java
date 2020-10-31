package assignment4;

public class Plot {

	//Declaring private variables for x, y, width, and depth.
		private int x;
		private int y;
		private int width;
		private int depth;
		
	//Building Constructors
		
	//No-arg Constructor, creates a default Plot with args x=0, y=0, width=1, depth=1
	public Plot()
	{
		x = 0;
		y = 0;
		width = 1;
		depth = 1;
	}
	
	//Copy Constructor, creates a new object using the information of the object passed to it.
	public Plot(Plot p)
	{
		x = p.x;
		y = p.y;
		width = p.width;
		depth = p.depth;
	}
	
	//Parameterized Constructor
	public Plot(int x, int y, int width, int depth)
	{
		this.x = x;
        this.y = y;
        this.width = width;
        this.depth = depth;
	}
	
	//determines if this plot overlaps the parameter,returns true if the two plots overlap, false otherwise
	public boolean overlaps(Plot p)
	{
		boolean first_checka  = (p.x >= x && p.x < (x + width)) && (p.y >= y && p.y < (y + depth));
		
		boolean first_checkb  = (x >= p.x && x < (p.x + width)) && (y >= p.y && y <(p.y + depth));
		
		boolean second_checka = (p.x + p.width) > x && (p.x + p.width) < (x + width) && p.y >= y && p.y <= (y + depth);
		
		boolean second_checkb = (x + width) > p.x && (x + width) < (p.x + p.width) && y >= p.y && y <= (p.y + p.depth);
		
		boolean third_checka  = p.x >= x && p.x < (x + width) && (p.y + p.depth) > y && (p.y + p.depth) <= (y + depth);
		
		boolean third_checkb  = x >= p.x && x < (p.x + p.width) && (y + depth) > p.y && (y + depth) <= (p.y + p.depth);
		
		boolean fourth_checka = (p.x + p.width) > x && (p.x + p.width) <= (x +width) && (p.y + p.depth) > y && (p.y + p.depth) <= (y + depth);
		
		boolean fourth_checkb = (x + width) > p.x && (x + width) <= (p.x + p.width) && (y + depth) > p.y && (y + depth) <= (p.y + p.depth);
		
		return first_checka || first_checkb || second_checka || second_checkb || third_checka || third_checkb || fourth_checka || fourth_checkb;
	} 
	
	//takes a Plot instance and determines if the current plot contains it.
	public boolean encompasses(Plot p)
	{
		boolean xLimits = p.x >= x;
		boolean yLimits = p.y >= y;
		
		boolean widthLimits = p.width + p.x >= width + x;
		boolean depthLimits = p.depth + p.y >= depth + y;
		
		return xLimits && yLimits && widthLimits && depthLimits;
	}
	
	//Creating Getters and Setters
	
	//Returns the x value
	public int getX()
	{
		return x;
	}
	
	//Sets the x value
	public void setX(int x)
	{
		this.x = x;
	}
	
	//Returns the y value
	public int getY()
	{
		return y;
	}
	
	//Sets the y value
	public void setY(int y)
	{
		this.y = y;
	}
	
	//Returns the width value
	public int getWidth()
	{
		return width;
	}
	
	//Sets the width value
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	//Returns the depth value
	public int getDepth()
	{
		return depth;
	}
	
	//Sets the depth value
	public void setDepth(int depth)
	{
		this.depth = depth;
	}
	
	//Prints the X,Y of the upper left corner, the width and the depth.
	@Override
	public String toString()
	{
		String a = "Upper left: (" + x + "," + y + "); Width: " + width + " Depth: " + depth;
		
		return a;
	}
	
	
	
	
	
	
	
	
	
	
}
