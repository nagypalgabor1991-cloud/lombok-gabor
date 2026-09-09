import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> cards;

    public Hand(List<Card> cards) {
        if (cards.size() != 7) {
            throw new InvalidHandSizeException("Each hand must have 7 cards, this one has: " + cards.size());
        }
        this.cards = cards;
    }

    public List<Card> getCards() {
        return cards;
    }

}
