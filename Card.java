import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.Buffer;

    public class Card {
        private ColorCard color;
        private int value;
        private boolean isFaceUp;
        public final BufferedImage image;

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
        public String toString() {
            //"9(C)"/"J(D)"
            switch (this.value) {
                case 1:
                    return "A" + this.color.toString();
                case 2:
                    return this.value + this.color.toString();
                case 3:
                    return this.value + this.color.toString();
                case 4:
                    return this.value + this.color.toString();
                case 5:
                    return this.value + this.color.toString();
                case 6:
                    return this.value + this.color.toString();
                case 7:
                    return this.value + this.color.toString();
                case 8:
                    return this.value + this.color.toString();
                case 9:
                    return this.value + this.color.toString();
                case 10:
                    return this.value + this.color.toString();
                case 11:
                    return "J" + this.color.toString();
                case 12:
                    return "Q" + this.color.toString();
                case 13:
                    return "K" + this.color.toString();
                default:
                    throw new IllegalArgumentException();
            }
        }
        public Card(ColorCard c, int value) throws IOException {
            this.color = c;
            this.value = value;
            this.isFaceUp = false; // implicitne rub
            this.image = ImageIO.read(new File("img/" + this.color + this.value + ".png"));
        }


        public ColorCard color(){
            return this.color;
        }

        public int value(){
            return this.value;
        }

        public boolean similarColorTo(Card c){
            if ((this.color() == ColorCard.HEARTS || this.color() == ColorCard.DIAMONDS) && (c.color() == ColorCard.HEARTS || c.color() == ColorCard.DIAMONDS)) {
                return true;
            }
            if ( (this.color() == ColorCard.CLUBS || this.color() == ColorCard.SPADES) && (c.color() == ColorCard.CLUBS || c.color() == ColorCard.SPADES) ){
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

        public int compareValue(Card c){
            return this.value() - c.value();
        }

    }
