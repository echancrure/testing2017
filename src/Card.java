/**
 * Created by meudecc on 26/01/2017.
 */
public class Card {
    private int value;  //must be between 1 and 13 inclusive
    private Suit suit;
    private Boolean hasBeenDealt = false;

    public Card(int v, Suit s) {
        setValue(v);
        setSuit(s);
    }

    public int getValue() {
        return value;
    }

    private void setValue(int value) {
        if (value < 1 || value > 13) {
            throw new IllegalArgumentException("Card value illegal");
        }
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    private void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Boolean getHasBeenDealt() {
        return hasBeenDealt;
    }

    public void setHasBeenDealt() {
        this.hasBeenDealt = true;
    }
}
