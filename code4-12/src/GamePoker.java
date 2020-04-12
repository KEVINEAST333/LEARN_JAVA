
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GamePoker {
    public static void main(String[] args) {
        Poker poker = new Poker();
        System.out.println(poker.toString());
       Collections.shuffle(poker.poker);
        System.out.println(poker.toString());
        List<List<Card>> players= new ArrayList<List<Card>>();
        List<Card> play1 = new ArrayList<>();
        List<Card> play2 = new ArrayList<>();
        List<Card> play3 = new ArrayList<>();
        List<Card> play4 = new ArrayList<>();
        List<Card> play5 = new ArrayList<>();
        List<Card> play6 = new ArrayList<>();
        players.add(play1);
        players.add(play2);
        players.add(play3);
        players.add(play4);
        players.add(play5);
        players.add(play6);
        for(int carIndex = 0;carIndex < 3 ;carIndex++) {
            for (int playIndex = 0;playIndex < 6;playIndex++) {
                List<Card> player = players.get(playIndex);
               // Card topCard = poker.poker.remove(0);
                Card topCard = poker.poker.get(0);
                poker.poker.remove(0);
                player.add(topCard);
            }
        }
        System.out.println("玩家一手牌" + play1.toString());
        System.out.println("玩家二手牌 " + play2.toString());
        System.out.println("玩家三手牌" + play3.toString());
        System.out.println("玩家四手牌" + play4.toString());
        System.out.println("玩家五手牌" + play5.toString());
        System.out.println("玩家六手牌" + play6.toString());

    }
}
