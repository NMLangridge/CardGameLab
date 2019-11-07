import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void before() {
        deck = new Deck();
    }

    @Test
    public void deckShouldStartEmpty() {
        assertEquals(0, deck.getDeck());
    }

    @Test
    public void deckShouldHave52Cards() {
        deck.createCards();
        assertEquals(52, deck.getDeck());
    }

}
