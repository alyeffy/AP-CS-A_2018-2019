package T1_code;

public class Pokemon {

  private static int totalPokemon = 0; // static variable
  public int pokedexID;
  public int level;
  public String[] types;
  public String[] moveset;
  public Boolean canEvolve;

  // constructors
  /** Default constructor
  *  Constructs Pokemon with default values.
  */

  public Pokemon() {
    totalPokemon++;				// increments total Pokemon objects ever created by 1 and all existing Pokemon objects will have this new value
    pokedexID = totalPokemon;	// then uses this value to create a unique ID for the newly created Pokemon object
    level = 5;
    types[0] = "Normal";
    moveset[0] = "Tackle";
    canEvolve = false;
  }

  /** Parameterized constructor
  * Constructs Pokemon with specified fields.
  * @param level is the starting level of this Pokemon
  * @param types is the array of types this Pokemon has
  * @param moveset is the moves this Pokemon can use in a battle
  * @param canEvolve is whether or not the Pokemon can evolve
  */
  public Pokemon(int level, String[] types, String[] moveset, Boolean canEvolve) {
    totalPokemon++;			// increments total Pokemon objects ever created by 1 and all existing Pokemon objects will have this new value
    pokedexID = totalPokemon; // then uses this value to create a unique ID for the newly created Pokemon object
    this.level = level;
    this.types = types;
    this.moveset = moveset;
    this.canEvolve = canEvolve;
  }

  // accessor & instance method
  /**
  *  @return the level of the Pokemon
  */
  public int getLevel() {
    /* implementation code */
    return 0;
  }

  // mutator & instance method
  /**
  *  Adds given move to the Pokemon's moveset if the Pokemon can learn it.
  *  @param type is the type of the move to be learned
  *  @param move is the name of move to be learned
  */
  public void learnMove(String type, String move) {
    /* implementation code */
  }
}
