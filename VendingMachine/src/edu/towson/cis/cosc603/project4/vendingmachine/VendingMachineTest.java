package edu.towson.cis.cosc603.project4.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Bonita Faye Vincent
 *         AIT642
 *         Spring 2016
 *         Project #3
 *
 */


	

public class VendingMachineTest {
	
	/**
	 * Declares necessary test objects
	 */	

	VendingMachineItem myItem1, myItem2,
                       myItem3, myItem4,
                       myItem5, myItem6;
	/**
	 * This test testAddItem1 to see if Items are added correctly
	 */	
	
	@Test
	public void testAddItem1(){
		VendingMachine myVendingMachine1 = new VendingMachine(); 
		 myVendingMachine1.addItem(myItem1, "A");
		 assertEquals(myItem1,myVendingMachine1.getItem("A"));
		 myVendingMachine1.addItem(myItem2, "B");
		 assertEquals(myItem2,myVendingMachine1.getItem("B"));
		 myVendingMachine1.addItem(myItem3, "C");
		 assertEquals(myItem3,myVendingMachine1.getItem("C"));
		 myVendingMachine1.addItem(myItem4, "D");
		 assertEquals(myItem4,myVendingMachine1.getItem("D"));
	}
	/**
	 * The testAddItemException1 tests if when adding more items 
	 * than slots available will cause an error
	 */	
		
	@Test (expected = VendingMachineException.class)
	public void testAddItemException1(){
		 VendingMachine myVendingMachine2 = new VendingMachine(); 
		 myVendingMachine2.addItem(myItem1, "A");
		 myVendingMachine2.addItem(myItem2, "B");
		 myVendingMachine2.addItem(myItem3, "C");
		 myVendingMachine2.addItem(myItem4, "D");
		 myVendingMachine2.addItem(myItem5, "E");
	}
	/**
	 * The testAddItemException2 tests if when adding an item 
	 * to an occupied slot will cause an error
	 */	
	@Test (expected = VendingMachineException.class)
	public void testAddItemException2(){
		VendingMachine myVendingMachine3 = new VendingMachine();
		myVendingMachine3.addItem(myItem1, "A");
		myVendingMachine3.addItem(myItem2, "B");
		myVendingMachine3.addItem(myItem3, "C");
		myVendingMachine3.addItem(myItem4, "A");
		}
	
	
	/**
	 * The test VendingMachine removeItem tests if items are removed correctly 
	 */	
	@Test
	public void testRemoveItem1(){
		VendingMachine myVendingMachine4 = new VendingMachine(); 
		 myVendingMachine4.addItem(myItem4, "A");
		 myVendingMachine4.addItem(myItem3, "B");
		 myVendingMachine4.addItem(myItem2, "C");
		 myVendingMachine4.addItem(myItem1, "D");
		 
		 assertEquals(myItem4,myVendingMachine4.removeItem("A"));
		 }
	
	/**
	 * The test VendingMachine removeItem Exception test if an error 
	 * occurs when trying to remove an item from an empty slot 
	 */	
	@Test (expected = VendingMachineException.class)
	public void testRemoveItemException1(){
		VendingMachine myVendingMachine5 = new VendingMachine();
			
		 myVendingMachine5.addItem(myItem4, "A");
		 myVendingMachine5.addItem(myItem3, "B");
		 myVendingMachine5.addItem(myItem1, "D");
		 
		 myItem6 = myVendingMachine5.removeItem("C");
		 }
	
	/**
	 * The test VendingMachine insertMoney tests if money is inserted 
	 * and calculated correctly
	 */	
	@Test
	public void testInsertMoney(){
		VendingMachine myVendingMachine6 = new VendingMachine(); 
		myVendingMachine6.balance = 20.00;
		myVendingMachine6.insertMoney(5.00);
		assertEquals(25.00,myVendingMachine6.getBalance(),0.00);
		}
	
	
	
	
	
	@Before
	public void setUp() throws Exception {
		myItem1 = new VendingMachineItem ("Soda",1.25);
		myItem2 = new VendingMachineItem ("Candy",1.00);
		myItem3 = new VendingMachineItem ("Chips",0.75);
		myItem4 = new VendingMachineItem ("Gum",0.50);	
		myItem5 = new VendingMachineItem ("Mints",1.50);
		}
	

	@After
	public void tearDown() throws Exception {
	}

	

}
