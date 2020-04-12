class Card {
    public String suit;
    public String rank;

    @Override
    public String toString() {
        return "(" + suit + rank +")";
    }

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }
}
