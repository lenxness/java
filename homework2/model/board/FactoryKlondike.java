package ija.ija2016.homework2.model.board;

import ija.ija2016.homework2.cardpack.Card;
import ija.ija2016.homework2.cardpack.CardDeck;
import ija.ija2016.homework2.cardpack.CardTargetPack;
import ija.ija2016.homework2.cardpack.CardStack;

public class FactoryKlondike extends AbstractFactorySolitaire {
    public Card createCard(Card.Color color, int value){
        if (value >= 1 && value <= 13) {
            return new Card(color, value);
        }
        return null;
    }

    public ija.ija2016.homework2.model.cards.CardDeck createCardDeck(){
        //CardDeck 1-13 of S,H,D,C
        CardDeck deck = new CardDeck();
        for(Card.Color c: Card.Color.values()){
            for(int i = 1; i <= 13; i++ ){
                Card card = new Card(c, i);
                deck.put(card);
            }
        }
        return deck;
    }

    public ija.ija2016.homework2.model.cards.CardDeck createTargetPack(Card.Color color) {
        return new CardTargetPack(color);
    }

    public CardStack createWorkingPack(){
        return new CardStack();
    }
}
