package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardGameMain {

    public static void main(String[] args) {
        List<Card> deck = new ArrayList<>();
        String[] suits = {"♠", "♥", "♦", "♣"};

        for (int i = 1; i <= 13; i++) {
            for (String suit : suits) {
                deck.add(new Card(i, suit));
            }
        }

        Collections.shuffle(deck);
        List<Card> player1 = new ArrayList<>(deck.subList(0, 5));
        List<Card> player2 = new ArrayList<>(deck.subList(5, 10));

        player1.sort(null);
        player2.sort(null);

        int sum1 = 0;
        for (Card c : player1) {
            sum1 += c.number;
        }

        int sum2 = 0;
        for (Card c : player2) {
            sum2 += c.number;
        }

        System.out.println("플레이어1의 카드: " + player1 + ", 합계: " + sum1);
        System.out.println("플레이어2의 카드: " + player2 + ", 합계: " + sum2);

        if (sum1 > sum2) {
            System.out.println("플레이어1 승리");
        } else if (sum1 < sum2) {
            System.out.println("플레이어2 승리");
        } else {
            System.out.println("무승부");
        }
    }
}
