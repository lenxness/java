/**
 * Created by Lenka on 6.5.2017.
 */
public enum ColorCard {
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
