import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by meudecc on 30/01/2017.
 */
public class StockTest {
    private ArrayList<Card> cards = initialise();

    private ArrayList<Card> initialise() {
        ArrayList<Card> cards = new ArrayList<>();
        for (Suit s : Suit.values()) {
            for (int v = 1; v < 14; v++) {
                Card c = new Card(v, s);
                cards.add(c);
            }
        }
        return cards;
    }

    @Test
    public void constructorSameSize() {
        Stock stockTest = new Stock(this.cards);
        assertTrue(stockTest.size()==this.cards.size());
    }

    @Test
    public void constructorSameCards() {
        Stock stockTest = new Stock(this.cards);
       // for (card : )
    }

    @Test
    public void getTopCardTest() {
        Stock stockTest = new Stock(this.cards);
        int initialSize = stockTest.size();
        for (int n = 1 ; n < this.cards.size()+1; n++) {
            Card c = stockTest.getTopCard();
            assertTrue(this.cards.contains(c));
            assertEquals(initialSize - n, stockTest.size());
        }
        assertEquals(0, stockTest.size());
    }
}