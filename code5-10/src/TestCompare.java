import java.util.*;

public class TestCompare {
    static class Card implements Comparable<Card>{
        //实例变量
        public int rank;
        public String suit;

        public Card(int rank, String suit) {
            this.rank = rank;
            this.suit = suit;
        }

        @Override
        public int compareTo(Card o) {
            return o.rank - this.rank ;
        }

        @Override
        public String toString() {
            return "Card{" +
                    "rank=" + rank +
                    ", suit='" + suit + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {
        Card card1 = new Card(5,"♥");
        Card card2 = new Card(6,"♣");
        Card card3 = new Card(4,"♥");
        List<Card> cards = new ArrayList<>();
        cards.add(card1);
        cards.add(card2);
        cards.add(card3);
        Collections.sort(cards);
        System.out.println(cards);
    }
}