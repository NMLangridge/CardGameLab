import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();
    }

    public int getDeck() {
        return this.cards.size();
    }

    public void createCards() {
        for (RankType rank : RankType.values()) {
            for (SuitType suit : SuitType.values()) {
                Card card = new Card(suit, rank);
                this.cards.add(card);
            }
        }
    }

    public boolean shuffleCards() {
        this.createCards();
        Card option1 = this.cards.get(0);
        Collections.shuffle(this.cards);
        Card option2 = this.cards.get(0);
        if (option1 == option2) {
            return true;
        }
        return false;
    }

    public Card dealCard() {
        this.shuffleCards();
        Card cardToReturn = this.cards.remove(0);
        return cardToReturn;
    }

}
