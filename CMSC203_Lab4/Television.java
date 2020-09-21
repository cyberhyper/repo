package Lab4;
/** 
*The purpose of this class is to model a television
*Kevin Gu, 9-20-2020
*/
public class Television {

	// The manufacturer constant attribute will hold the brand name.
	public static String MANUFACTURER = "";
	// The screenSize constant attribute will hold the size of the television screen.
	public static int SCREEN_SIZE = 0;
	// The powerOn attribute will hold the value true if the power is on, and false if the power is off.
	boolean powerOn;
	// The channel attribute will hold the value of the station that the television is showing.
	int channel;
	//The volume attribute will hold a number value representing the loudness.
	int volume;
	
	//Initialize the Television variables.
	Television(String MANUFACTURER, int SCREEN_SIZE)
	{
		Television.MANUFACTURER = MANUFACTURER;
		
		Television.SCREEN_SIZE = SCREEN_SIZE;
		
		powerOn = false;
		
		volume = 20;
		
		channel = 2;
	}
	
	/** This method returns the manufacturer variable.*/
	public String getManufacturer() 
	{
		return MANUFACTURER;
	}
	
	/** This method returns the screen size variable. */
	public int getScreenSize() 
	{
		return SCREEN_SIZE;
	}
	
	/** This method returns the volume variable. */
	public int getVolume() 
	{
		return volume;
	}
	
	/** This method increases the volume variable by one. */
	public int increaseVolume() 
	{
		volume++;
		return volume;
	}
	
	/** This method decreases the volume variable by one. */
	public int decreaseVolume() 
	{
		volume--;
		return volume;
	}
	
	/** This method returns the channel variable. */
	public int getChannel() 
	{
		return channel;
	}
	
	/** This method accepts a integer into the channel variable. */
	public void setChannel(int channel) 
	{
		this.channel = channel;
	}

	/** This method turns on and off the power variable. */
	public boolean power() 
	{
		if (powerOn)
		{
			return !powerOn;
		}
		else
		{
			return powerOn;
		}
	}
	
}
