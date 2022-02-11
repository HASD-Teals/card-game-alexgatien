public class CardGameClient {
    public static void main(String[] args) throws Exception {

        //Card oneCard = new Card("Black", 'K', "Spade", 13, true);
        //Card twoCard = new Card("Black", 'K', "Spade", 13, true);
        //System.out.println(oneCard.toString());
        //System.out.println(checkEqual(oneCard, twoCard));
        Deck firstDeck = new Deck(4, 13, false);
        Deck secondDeck = new Deck(4, 13, false);
        System.out.println(firstDeck.getCards()[8].getColor());
        System.out.println(firstDeck);
        System.out.println(firstDeck.cardsInDeck());
        System.out.println(firstDeck.getCardAt(1));
        firstDeck.shuffleCards();
        secondDeck.shuffleCards();
        int matches = 0;
        for (int i = 0; i <firstDeck.cardsInDeck(); i++){
            if (firstDeck.getCardAt(i) == secondDeck.getCardAt(i)){
                System.out.print("There is match at ");
                System.out.println(i);
                matches++;
            }
        }
        System.out.print("There are ");
        System.out.print(matches);
        System.out.println("matches");
    }
    public static boolean checkEqual(Card first, Card second) {
        if (first.getRank() == second.getRank() && first.getSymbol() == second.getSymbol()) {
            return true;
        } else {
            return false;
        }
    }
    
    
}
