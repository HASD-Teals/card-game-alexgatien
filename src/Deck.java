public class Deck {
    // PROPERTIES
    private Card[] deck;

    // CONSTRUCTORS
    public Deck(){
    Card[] cards = new Card[52];
    
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
