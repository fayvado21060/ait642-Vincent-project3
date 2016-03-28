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
	
	/**
	 * The test VendingMachine insertMoneyException tests if an error occurs
	 * when the amount is 0 
	 * 	 */	
	@Test (expected = VendingMachineException.class)
	public void testInsertMoneyException1(){
		VendingMachine myVendingMachine7 = new VendingMachine(); 
		myVendingMachine7.balance = 20.00;
		myVendingMachine7.insertMoney(0.00);
		}
	
	/**
	 * The test VendingMachine insertMoneyException tests if an error occurs
	 * when the amount is less than 0 
	 */	
	@Test (expected = VendingMachineException.class)
	public void testInsertMoneyException2(){
		VendingMachine myVendingMachine8 = new VendingMachine(); 
		myVendingMachine8.balance = 20.00;
		myVendingMachine8.insertMoney(-10.00);
		}
	/**
	 * The test VendingMachine getBalance tests the correct balance is returned  
	 */	
	@Test
	public void testGetbalance(){
		VendingMachine myVendingMachine9 = new VendingMachine(); 
		myVendingMachine9.balance = 0.0;
		myVendingMachine9.balance = 15.00;
		assertEquals(15.00,myVendingMachine9.getBalance(),0.00);
	}
	
	/**
	 * This tests VendingMachine makePurchase method True option
	 */	
		
	@Test
	public void testMakePurchase1(){
		 VendingMachine myVendingMachine10 = new VendingMachine(); 
		 myVendingMachine10.addItem(myItem1, "A");
		 myVendingMachine10.addItem(myItem2, "B");
		 myVendingMachine10.addItem(myItem3, "C");
		 myVendingMachine10.addItem(myItem4, "D");
		 
		 myVendingMachine10.balance = 20.00;
		 
		 assertTrue(myVendingMachine10.makePurchase("B"));
		 assertEquals(19.00,myVendingMachine10.getBalance(),0.00);
	}
	 /**
	 * This tests VendingMachine makePurchase method False option
	 * because balance is less than price of item
	 */	
				
	@Test
	public void testMakePurchase2(){
		 VendingMachine myVendingMachine10 = new VendingMachine(); 
		 myVendingMachine10.addItem(myItem1, "A");
		 myVendingMachine10.addItem(myItem2, "B");
		 myVendingMachine10.addItem(myItem3, "C");
		 myVendingMachine10.addItem(myItem4, "D");
			 
		 myVendingMachine10.balance = 0.00;
				 
		 assertFalse(myVendingMachine10.makePurchase("B"));
	}
	/**
	 * This tests VendingMachine makePurchase method False option
	 * because the slot is empty
	 */	
				
	@Test
	public void testMakePurchase3(){
		 VendingMachine myVendingMachine11 = new VendingMachine(); 
		 myVendingMachine11.addItem(myItem1, "A");
		 myVendingMachine11.addItem(myItem2, "B");
		 myVendingMachine11.addItem(myItem4, "D");
			 
		 myVendingMachine11.balance = 0.00;
				 
		 assertFalse(myVendingMachine11.makePurchase("C"));
	}
	
	/**
	 * This tests VendingMachine makePurchase method True option 
	 * and balance calculation
	 */	
	@Test
	public void testMakePurchase4(){
		 VendingMachine myVendingMachine10 = new VendingMachine(); 
		 myVendingMachine10.addItem(myItem1, "A");
		 myVendingMachine10.addItem(myItem2, "B");
		 myVendingMachine10.addItem(myItem3, "C");
		 myVendingMachine10.addItem(myItem4, "D");
		 
		 myVendingMachine10.balance = 20.00;
		 
		 myVendingMachine10.makePurchase("B");		 
		 assertEquals(19.00,myVendingMachine10.getBalance(),0.00);
	}
	
	/**
	 * This tests VendingMachine returnChange method  
	 * Check the balance before and after the method is called
	 * 
	 * */	
	@Test
	public void testReturnChange(){
		 VendingMachine myVendingMachine12 = new VendingMachine(); 
		 myVendingMachine12.balance = 20.00;
		 
		 assertEquals(20.00,myVendingMachine12.getBalance(),0.00);
		 
		 assertEquals(20.00,myVendingMachine12.returnChange(),0.00);
		 
		 assertEquals(0.00,myVendingMachine12.getBalance(),0.00);
		 
		 
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
