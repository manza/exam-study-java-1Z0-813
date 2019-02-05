package topic.a.language_enhancements;

public interface _5Card extends Comparable<_5Card> {

    public enum Suit {
        DIAMONDS (1, "Diamonds"),
        CLUBS (2, "Clubs"),
        HEARTS (3, "Hearts"),
        SPADES (4, "Spades");

        private final int value;
        private final String text;

        Suit(int value, String text) {
            this.value = value;
            this.text = text;
        }

        public int value() {
            return value;
        }

        public String text() {
            return text;
        }
    }

    public enum Rank {
        DEUCE(2, "Two"),
        THREE(3, "Three"),
        FOUR(4, "Four");

        private final int value;
        private final String text;

        Rank(int value, String text) {
            this.value = value;
            this.text = text;
        }

        public int value() {
            return value;
        }

        public String text() {
            return text;
        }
    }

    public _5Card.Suit getSuit();
    public _5Card.Rank getRank();
}