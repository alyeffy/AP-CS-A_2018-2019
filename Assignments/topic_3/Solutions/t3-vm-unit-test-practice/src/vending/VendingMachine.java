package vending;

import java.util.*;

public class VendingMachine {

	 public List<Drink> drinks;
	  public double money;
	  
	  /** Constructor for VendingMachine object
	    * @param money is the amount of money currently in the VendingMachine object
	    * PRECONDITION: money cannot be negative
	    * POSTCONDITION: Empty VendingMachine object is created
	    */
	  public VendingMachine(double money) {
	    this.drinks = new ArrayList<Drink>();
	    this.money = money;
	  }

	  /** @return the number of Drinks left in the VendingMachine
	    * PRECONDITION: VendingMachine object exists
	    */
	  public int getNumDrinks() {
	    return this.drinks.size();
	  }

	  /** Loads a drink into the VendingMachine from the front
	    * PRECONDITION: Drink and VendingMachine object exists
	    * POSTCONDITION: Drink will be in VendingMachine
	    */
	  public void addDrink(Drink d) {
	    this.drinks.add(0, d);
	  }

	  /** Removes a drink into the VendingMachine from the front
	    * PRECONDITION: VendingMachine object exists and has at least one Drink
	    * POSTCONDITION: Drink will no longer be in VendingMachine
	    */
	  public void removeDrink() {
	    this.drinks.remove(0);
	  }

	  /** @return the total amount of money in the VendingMachine
	    * PRECONDITION: VendingMachine object exists
	    */
	  public double getMoney() {
	    return this.money;
	  }

	  /** Adds the amount of money to the total money of the VendingMachine
	    * PRECONDITION: amount cannot be negative and VendingMachine object exists
	    * POSTCONDITION: VendingMachine's total money increases by amount
	    */
	  public void addMoney(double amount) {
	    this.money += amount;
	  }

	  /** Clears out all the money from the VendingMachine
	    * PRECONDITION: VendingMachine object exists
	    * POSTCONDITION: VendingMachine's total money is now 0
	    */
	  public void clearMoney() {
	    this.money = 0.0;
	  }

	  /** TODO: Complete the precondition and postcondition for this method.
	    * Purchase a drink from the VendingMachine
	    * @return the Drink at the front of the VendingMachine
	    * PRECONDITION:
	    * POSTCONDITION:
	    */
	  public Drink buyDrink() {
	     Drink d = this.drinks.get(0);
	     this.drinks.remove(0);
	     double p = d.getPrice();
	     this.addMoney(p);
	     return d;
	  }

}
