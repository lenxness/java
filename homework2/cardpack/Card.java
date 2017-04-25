package ija.ija2016.homework2.cardpack;

public class Card implements ija.ija2016.homework2.model.cards.Card {
    private Color color;
    private int value;
    private boolean isFaceUp;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;

        Card card = (Card) o;

        //noinspection SimplifiableIfStatement
        if (value != card.value) return false;
        return color == card.color;
    }

    @Override
    public int hashCode() {
        int result = color.hashCode();
        result = 31 * result + value;
        return result;
    }

    @Override
    public String toString(){
        //"9(C)"/"J(D)"
        switch (this.value){
            case 1:
                return "A(" + this.color.toString() + ")";
            case 2:
                return this.value + "(" + this.color.toString() + ")";
            case 3:
                return this.value + "(" + this.color.toString() + ")";
            case 4:
                return this.value + "(" + this.color.toString() + ")";
            case 5:
                return this.value + "(" + this.color.toString() + ")";
            case 6:
                return this.value + "(" + this.color.toString() + ")";
            case 7:
                return this.value + "(" + this.color.toString() + ")";
            case 8:
                return this.value + "(" + this.color.toString() + ")";
            case 9:
                return this.value + "(" + this.color.toString() + ")";
            case 10:
                return this.value + "(" + this.color.toString() + ")";
            case 11:
                return "J(" + this.color.toString() + ")";
            case 12:
                return "Q(" + this.color.toString() + ")";
            case 13:
                return "K(" + this.color.toString() + ")";
            default:
                throw new IllegalArgumentException();
        }

    }

    public Card(Card.Color c, int value){
        this.color = c;
        this.value = value;
        this.isFaceUp = false; // implicitne rub
    }
    public Color color(){
        return this.color;
    }

    public int value(){
        return this.value;
    }

    public boolean similarColorTo(ija.ija2016.homework2.model.cards.Card c){
        if ((this.color() == Color.HEARTS || this.color() == Color.DIAMONDS) && (c.color() == Color.HEARTS || c.color() == Color.DIAMONDS)) {
            return true;
        }
        if ( (this.color() == Color.CLUBS || this.color() == Color.SPADES) && (c.color() == Color.CLUBS || c.color() == Color.SPADES) ){
            return true;
        }
        return false;
    }
    

    public boolean isTurnedFaceUp(){
        return this.isFaceUp;
    }

    public boolean turnFaceUp(){
        if (this.isFaceUp == false){
            this.isFaceUp = true;
            return true;
        }
        return false;
    }

    public int compareValue(ija.ija2016.homework2.model.cards.Card c){
        return this.value() - c.value();
    }

}
