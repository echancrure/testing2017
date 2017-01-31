import java.util.ArrayList;

/**
 * Created by meudecc on 26/01/2017.
 */
public class Stock {
    private ArrayList<Card> cards;

    Stock(ArrayList<Card> startingCards) {
        ArrayList<Card> workingCards = (ArrayList<Card>)startingCards.clone();
        int randomIndex;
        this.cards = new ArrayList<>();
        int numberOfCards = workingCards.size();
        for (int n = 1; n <= numberOfCards; n++) {
            randomIndex = (int)Math.round(Math.random() * (workingCards.size()-1));
            Card randomCard = workingCards.get(randomIndex);
            workingCards.remove(randomIndex);
            this.cards.add(randomCard);
            randomCard.setHasBeenDealt();
        }
    }

    public int size() {
        return cards.size();
    }

    public Card getTopCard() {
        if (this.size() == 0) throw new IllegalArgumentException("Empty Stock");
        int topCardIndex = this.size()-1;
        Card card = this.cards.get(topCardIndex);
        this.cards.remove(topCardIndex);
        return card;
    }

}
