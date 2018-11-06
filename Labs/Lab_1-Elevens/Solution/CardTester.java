// Elevens Lab - ACTIVITY 1

public class CardTester {

  /**
  * The main method in this class checks the Card operations for consistency.
  *	@param args is not used.
  */
  public static void main(String[] args) {
    Card card1 = new Card("7", "Diamond", 7); // first card object
    Card card2 = new Card("King", "Spade", 13); // different from card1 to test compareCard method
    Card card3 = new Card("7", "Diamond", 7); // same as card1 to test compareCard method


    System.out.println(card2.toString()); // tests constructor for card objects

    System.out.println("Card 1 and Card 3 should match: " + card3.compareCard(card1)); // test case 1 of compareCard (true)
    System.out.println("Card 2 and Card 3 should match: " + card2.compareCard(card3)); // test case 2 of compareCard (false)
  }
