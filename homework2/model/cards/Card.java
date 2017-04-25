package ija.ija2016.homework2.model.cards;

public interface Card {
    //nested class Card.Color- Výčtový typ reprezentující barvu karty.

    enum Color {
        CLUBS,
        DIAMONDS,
        HEARTS,
        SPADES;


        @Override
        public String toString() {
            switch (this) {
                case CLUBS:
                    return "C";
                case DIAMONDS:
                    return "D";
                case HEARTS:
                    return "H";
                case SPADES:
                    return "S";
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    Color color();
    int compareValue(Card c);
    boolean isTurnedFaceUp();
    boolean similarColorTo(Card c);
    boolean turnFaceUp();
    int value();
}
