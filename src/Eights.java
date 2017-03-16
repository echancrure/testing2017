import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by meudecc on 26/01/2017.
 */
public class Eights {
    private Suit currentSuit;
    private Player turn;
    private ArrayList<Card> deck = new ArrayList<>(52);
    private StarterPile starterPile;
    private Stock stock;
    private Player human;
    private Player ai;

    public Eights() {
        for (Suit s : Suit.values()) {
            for (int value = 1; value < 14; value++) {
                Card c = new Card(value, s);
                deck.add(c);
            }
        }
    }

    public void setPlayer(String name) {
        this.human = new Human(name);
    }

    public String getPlayerName() {
        if (this.human == null) {
            throw new IllegalArgumentException("No human player set");
        }
        String s = ((Human)this.human).getName();
        return s;
    }

    public void startGame(Difficulty difficulty) {
        this.ai = new Computer(difficulty);
        deal();
        this.turn = human;
    }

    private void deal() {
        for (int n=1; n<=7; n++) {
            Card c = getRandomCard();
            this.human.dealCard(c);
            c.setHasBeenDealt();
            c = getRandomCard();
            this.ai.dealCard(c);
            c.setHasBeenDealt();
        }
        Card c1;
        do {
            c1 = getRandomCard();
        } while (c1.getValue() != 8);
        this.starterPile = new StarterPile(c1);
        c1.setHasBeenDealt();
        ArrayList<Card> remainingCards = new ArrayList<>();
        for (Card c2 : deck) {
            if (!c2.getHasBeenDealt()) {
                remainingCards.add(c2);
                c2.setHasBeenDealt();
            }
        }
        this.stock = new Stock(remainingCards);
    }

    private Card getRandomCard() {
        int randomIndex;
        Card card;
        do {
            randomIndex = (int)Math.round(Math.random() * 52);
            card = this.deck.get(randomIndex);
        } while (!card.getHasBeenDealt());
        return card;
    }

}
