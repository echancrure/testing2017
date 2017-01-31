import java.util.ArrayList;

/**
 * Created by meudecc on 26/01/2017.
 */
public class Player {
    private ArrayList<Card> hand = new ArrayList<Card>();

    public void dealCard(Card c) {
        this.hand.add(c);
    }
}
