package topic.a.language_enhancements;

import javax.smartcardio.Card;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public interface _5Deck {

    List<_5Card> getCards();

    _5Deck deckFactory();

    int size();

    void addCard(Card card);

    void addCards(List<Card> cards);

    void addDeck(_5Deck deck);

    void shuffle();

    void sort();

    void sort(Comparator<_5Card> c);

    String deckToString();

    Map<Integer, _5Deck> deal(int players, int numberOfCards) throws IllegalArgumentException;
}
