package T1_code;

public class Pokeball {

  public String type;
  public double price;
  public double catchFreq;
  public Boolean hasPokemon;

  /** Parameterized constructor
  * Constructs Pokemon with specified fields.
  * @param type is the type of Pokeball this is
  * @param price is the cost of purchasing this Pokeball
  * @param catchFreq is the frequency at which this Pokeball successfully catches a Pokemon
  * hasPokemon is whether or not this Pokeball contains a Pokemon
  */
  public Pokeball(String type, double price, double catchFreq) {
    this.type = type;
    this.price = price;
    this.catchFreq = catchFreq;
    hasPokemon = false;
  }

  // accessor & instance method
  /**
  *  @return the type of the Pokeball
  */
  public String getType() {
    return type;
  }

  // accessor & instance method
  /**
  *  @return the price of the Pokeball
  */
  public double getPrice() {
    return price;
  }

  // mutator & instance method
  /**
  *  Sets the price of this Pokeball
  *  @param price is the new price to set
  */
  public void setPrice(double price) {
    this.price = price;
  }

  // accessor & instance method
  /**
  *  @return the catch frequency of the Pokeball
  */
  public double getCatchFreq() {
    return catchFreq;
  }

  public Boolean hasPokemon() {
    return hasPokemon;
  }

  public void catchPokemon() {
    /* implementation code */
  }

}
