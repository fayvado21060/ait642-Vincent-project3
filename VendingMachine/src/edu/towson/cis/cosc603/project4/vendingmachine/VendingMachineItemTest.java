package edu.towson.cis.cosc603.project4.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author fayvado
 *
 */

/**
 * The unit test Class for VendingMachineItem
 */

public class VendingMachineItemTest {
	
	/**
	 * Declares necessary test objects
	 */	
	
	VendingMachineItem myVendingMachineItem1, myVendingMachineItem2,
	                   myVendingMachineItem3;
	
	VendingMachineException myVendingMachineException;
	
	
	
	
	/**
	 * Initializes the necessary test objects for the test caase to use
	 */	
	
	@Before
	public void setUp() throws Exception {
		myVendingMachineItem1 = new VendingMachineItem ("Soda",.50);
		myVendingMachineItem2 = new VendingMachineItem ("Soda",0.0);
	}
		
	/**
	 * Test for the getName() method for the VendingMachineItem class
	 */	
	@Test
	public void testGetName1(){
		assertEquals("Soda",myVendingMachineItem1.getName());
	}
	
	/**
	 * Test for the getPrice() method for the VendingMachineItem class
	 */	
	@Test
	public void testGetPrice1() {
		assertEquals(0.50,myVendingMachineItem1.getPrice(),0.001);
	}
	
	/**
	 * Test for the getPrice() method for the VendingMachineItem class
	 * Price = 0
	 */	
	@Test
	public void testGetPrice2() {
		assertEquals(0.0,myVendingMachineItem2.getPrice(),0.001);
	}
	/**
	 * Test for the getPrice() method for the VendingMachineItem class
	 * Price < 0
	 */	
	@Test
	public void testVendingMachineException() {
		myVendingMachineItem3 = new VendingMachineItem ("Soda",-10.0);
		assertEquals("Price cannot be less than zero",
		             myVendingMachineException.getMessage());
	}
	/**
	 * Cleans up test objects for the test case to use
	 */	
	
		@After
		public void tearDown() throws Exception {
			myVendingMachineItem1 = null;
			myVendingMachineItem2 = null;
			myVendingMachineItem3 = null;
	}
	
}
