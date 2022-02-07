public class Deck {
    // PROPERTIES
    private Card[] deck;

    // CONSTRUCTORS
    public Deck() {
        Card[] cards = new Card[52];

    }

    public Deck(int suitNumber, int cardsPerSuit, boolean aceHigh) {
        Card[] cards = new Card[suitNumber * cardsPerSuit];

        int value = 1;
        int a = 0;
        for (int i = 0; i < cards.length; i++) {
            cards[i] = new Card();
            cards[i].setPlayable(true);
            if (i % cardsPerSuit == 0) {
                a++;
                value = 1;
            }
            if (a == 1) {
                cards[i].setSuit("Clubs");
                cards[i].setColor("Black");

            }
            if (a == 2) {
                cards[i].setSuit("Hearts");
                cards[i].setColor("Red");
            }
            if (a == 3) {
                cards[i].setSuit("Spades");
                cards[i].setColor("Black");
            }
            if (a == 4) {
                cards[i].setSuit("Diamonds");
                cards[i].setColor("Red");
            }
            cards[i].setValue(value);
            if (value == 1) {
                if (aceHigh == true) {
                    cards[i].setValue(14);
                }
                cards[i].setRank('A');
            }
            if (value == 11) {
                cards[i].setValue(11);
                cards[i].setRank('J');
            }
            if (value == 12) {
                cards[i].setValue(12);
                cards[i].setRank('Q');
            }
            if (value == 13) {
                cards[i].setValue(13);
                cards[i].setRank('K');
            } else {
                cards[i].setValue(value);
                cards[i].setRank((char) value);
            }
            value++;

        }
        this.deck = cards;
    }

    // ACCESSORS
    public Card[] getCards() {
        return this.deck;
    }

    // MUTATORS
    public void setCards(Card[] cards) {
        this.deck = cards;
    }

    // METHODS
    public void shuffleCards() {
        // Shuffle this.cards in a random order
    }
}
