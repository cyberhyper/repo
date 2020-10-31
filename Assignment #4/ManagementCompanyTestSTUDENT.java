package assignment4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ManagementCompanyTestSTUDENT {
	
	ManagementCompany mgmt;
	
	@Before
	public void setUp() throws Exception {
		//student create a management company
		mgmt = new ManagementCompany("Joe", "111", 5 );
		
		//student add three properties, with plots, to mgmt co
		mgmt.addProperty("Joey", "Joemantown", 123, "Joeseph", 5, 10, 9, 9);
		mgmt.addProperty("Jow", "Jowstar", 222, "Joerry", 3, 3, 8, 9);
		mgmt.addProperty("Jaw", "Jawsmovie", 425, "Jamison", 4, 5, 6, 7);
	}

	@After
	public void tearDown() {
		//student set mgmt co to null 
		mgmt = null;
	}

	@Test
	public void testAddPropertyDefaultPlot() {

		//student should add property with 4 args & default plot (0,0,1,1)
		assertEquals(mgmt.addProperty("Joey", "Joemantown", 123, "Joeseph"), 3,0);
		//student should add property with 8 args
		assertEquals(mgmt.addProperty("Joey", "Joemantown", 123, "Joeseph", 4, 2, 2, 1), 3, 0);
		//student should add property that exceeds the size of the mgmt co array and can not be added, add property should return -1	
		assertEquals(mgmt.addProperty("Joey", "Joemantown", 123, "Joeseph", 4, 115, 2, 1), 3, 0);
	}
 
	@Test
	public void testMaxRentProp() {

		//student should test if maxRentProp contains the maximum rent of properties
		String maxRentString = mgmt.maxRentProp() + ("\n");
        assertTrue(maxRentString.contains("4905.0"));
	}

	@Test
	public void testTotalRent() {

		//student should test if totalRent returns the total rent of properties
		assertEquals(mgmt.totalRent(),1213, 0);
	}

 }