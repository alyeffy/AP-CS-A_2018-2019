package T1_code;

public class Trainer {

  private static int totalTrainers = 0; // static variable
  public int trainerID;
  public String name;
  public String gender;
  public int numBadges;
  public Pokemon[] party;

  /** Parameterized constructor
  * Constructs Trainer with specified fields, assigns trainerID based on total number of Trainers created,
  * and assigns default 0 values for numBadges and party since Trainers start with 0 badges and 0 Pokemon in their party.
  * @param name is the name of the Trainer
  * @param gender is the gender of the Trainer ("Are you a boy or a girl?")
  */
  public Trainer(String name, String gender) {
    Trainer.incrementTrainers(); 			 // increments the total amount of Trainer objects ever instantiated by calling static method on all Trainer objects
    this.trainerID = Trainer.totalTrainers;  // then uses that total stored in a static variable to create a unique Trainer ID
    this.name = name;
    this.gender = gender;
    numBadges = 0;
    party = new Pokemon[0];					 // using constructor from the Pokemon class - possible because they are public
  }

  // mutator & static method
  /**
  *  Increments the total number of Trainer objects ever created.
  */
  public static void incrementTrainers() {
    totalTrainers++;						// this method is just to show you how static methods work because it's pretty redundant otherwise
  }

  // accessor & instance method
  /**
  *  @return the name of the Trainer
  */
  public String getName() {
    return name;
  }

  // accessor & instance method
  /**
  *  @return the gender of the Trainer
  */
  public String getGender() {
    return gender;
  }

  // accessor & instance method
  /**
  *  @return the number of badges the Trainer has
  */
  public int getBadges() {
    return numBadges;
  }

  // mutator & instance method
  /**
  *  Increments the number of badges a Trainer has by 1.
  */
  public void winBadge () {
    numBadges++;
  }

  // mutator & instance method
  /**
  *  Adds indicated Pokemon to the Trainer's party.
  *  @param Pokemon is the Pokemon object to be added
  */
  public void addPokemon(Pokemon pokemon) {
    /* implementation code */
  }

  // mutator & instance method
  /**
  *  Removes indicated Pokemon from the Trainer's party.
  *  @param Pokemon is the Pokemon object to be removed
  */
  public void removePokemon(Pokemon pokemon) {
    /* implementation code */
  }
}
