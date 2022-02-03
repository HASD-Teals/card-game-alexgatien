public class CardGameClient {
    public static void main(String[] args) throws Exception {

        Card oneCard = new Card("Black", 'K', "Spade", 13, true);
        Card twoCard = new Card("Black", 'K', "Spade", 13, true);
        System.out.println(oneCard.toString());
        System.out.println(checkEqual(oneCard, twoCard));
    }
    public static boolean checkEqual(Card first, Card second) {
        if (first.getRank() == second.getRank() && first.getSymbol() == second.getSymbol()) {
            return true;
        } else {
            return false;
        }
    }

}
