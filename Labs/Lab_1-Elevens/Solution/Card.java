// Elevens Lab - ACTIVITY 1

public class Card {

  /**
  * String value that holds the suit of the card
  */
  private String suit;

  /**
  * String value that holds the rank of the card
  */
  private String rank;

  /**
  * int value that holds the point value.
  */
  private int pointValue;


  /** 1a
  * Creates a new Card instance.
  * @param rank is a String value containing the rank of the card
  * @param suit is a String value containing the suit of the card
  * @param pointValue is an int value containing the point value of the card
  */
  public Card(String rank, String suit, int pointValue) {
    this.rank = rank;
    this.suit = suit;
    this.pointValue = pointValue;
  }

  /** 1b
  * Accesses this Card's rank
  * @return the rank of this card
  */
  public String getRank() {
    return this.rank;
  }

  /** 1b
  * Accesses this Card's suit
  * @return the suit of this Card
  */
  public String getSuit() {
    return this.suit;
  }

  /** 1b
  * Accesses this Card's point value
  * @return the pointValue of this card
  */
  public String getPointVal() {
    return this.pointValue;
  }

  /** 1c
  * Compares this card with the argument.
  * @param otherCard the other card to compare to this one
  * @return boolean indicating if cards are equal
  */
  public boolean compareCard(Card otherCard) {
    if (this.rank.equals(otherCard.rank) && this.suit.equals(otherCard.suit) && this.pointValue == otherCard.pointValue)
      return true;
    return false;
  }

  /** 1d
  * Converts the rank, suit, and point value into a string in the format:
  * "[Rank] of [Suit] (point value = [PointValue])".
  * @return
  */
  @Override
  public String toString() {
    return this.rank + " of " + this.suit + " (point value = " + this.pointValue + ")";
  }
}
