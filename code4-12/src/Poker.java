
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Poker {
    public List<Card> poker = new ArrayList<>();

    public Poker() {
         String[] suit = {"♠","♣","♥","♦"};
        for(int i = 0;i < 4;i++ ) {
            for(int j = 2;j < 11;j++) {
                Card card = new Card(suit[i],String.valueOf(j));
                poker.add(card);
            }
            poker.add(new Card(suit[i],"A"));
            poker.add(new Card(suit[i],"J"));
            poker.add(new Card(suit[i],"O"));
            poker.add(new Card(suit[i],"K"));
        }

    }

    @Override
    public String toString() {
        return
                "Poker{" +
                 poker+
                '}';
    }
}