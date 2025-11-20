package collection.compare.test;

import java.util.Comparator;
import java.util.Map;

public class Card implements Comparable<Card>{

     int number;
     String suit;

    public Card(int number, String suit) {
        this.suit = suit;
        this.number = number;
    }

    private static final Map<String, Integer> suitPriority = Map.of(
            "♠", 0,
            "♦", 1,
            "♥" , 2,
            "♣", 3
    );

    @Override
    public String toString() {
        return number + "(" + suit + ")";
    }

    @Override
    public int compareTo(Card otherCard) {
        if (this.number != otherCard.number) {
            return Integer.compare(this.number, otherCard.number);
        } else {
            return Integer.compare(suitPriority.get(this.suit), suitPriority.get(otherCard.suit));
        }
    }
}
