package vending;

public class Drink {

	  public String name;
	  public double price;
	  
	  /** Constructor for Drink object
	    * @param name is the name of the Drink
	    * @param price is the price of the Drink
	    * PRECONDITION: name cannot be an empty String, price cannot be negative
	    * POSTCONDITION: Drink object is created
	    */
	  public Drink(String name, double price) {
	    this.name = name;
	    this.price = price;
	  }
	  
	  /** @return name of Drink object
	    * PRECONDITION: Drink object exists
	    */
	  public String getName() {
	    return this.name;
	  }
	  
	  /** Changes the name of Drink object to input name
	    * @param name is the new name
	    * PRECONDITION: Drink object exists and input name cannot be an empty String
	    * POSTCONDITION: Drink object's name will now be the input name
	    */
	  public void setName(String name) {
	    this.name = name;
	  }
	  
	  /** @return price of Drink object
	    * PRECONDITION: Drink object exists
	    */
	  public double getPrice() {
	    return this.price;
	  }
	  
	  /** Changes the price of Drink object to input price
	    * @param price is the new price
	    * PRECONDITION: Drink object exists and input price cannot be negative
	    * POSTCONDITION: Drink object's price will now be the input price
	    */
	  public void setPrice(double price) {
	    this.price = price;
	  }

}
