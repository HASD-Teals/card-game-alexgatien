public class Card {
    // PROPERTIES
    private String color;
    private char rank;
    private String symbol;
    private int value;
    private boolean playable;

    // CONSTRUCTORS
    public Card() {
    }

    public Card(String color, char rank, String symbol, int value, boolean playable) {
        this.color = color;
        this.rank = rank;
        this.symbol = symbol;
        this.value = value;
        this.playable = playable;
    }

    // ACCESSORS
    public String getColor() {
        return this.color;
    }

    public char getRank() {
        return this.rank;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public int getValue() {
        return this.value;
    }

    public boolean getPlayable() {
        return this.playable;
    }

    // MUTATORS
    public void setColor(String color) {
        this.color = color;
    }

    public void setRank(char rank) {
        this.rank = rank;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setPlayable(boolean playable) {
        this.playable = playable;
    }
    public void setSuit(String suit){
        this.symbol = suit;
    }
    // METHODS

    public String toString() {

        return "The color of the card is " + this.color
                + ". The rank of the card is " + this.rank + ". The symbol of the card is "
                + this.symbol + ".";
    }
    public boolean isEqual(){
        return true;
    }
    
}
