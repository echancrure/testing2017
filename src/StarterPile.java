import java.util.ArrayList;

/**
 * Created by meudecc on 26/01/2017.
 */
public class StarterPile {
    private ArrayList<Card> cards;

    StarterPile(Card c) {
        this.cards = new ArrayList<Card>();
        this.cards.add(c);
    }

    public void addCard(Card c) {
        this.cards.add(c);
    }
}
