import java.util.ArrayList;

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

}
