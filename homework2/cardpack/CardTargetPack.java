package ija.ija2016.homework2.cardpack;

import ija.ija2016.homework2.model.cards.Card;

import java.util.Stack;

public class CardTargetPack extends CardDeck implements ija.ija2016.homework2.model.cards.CardDeck {
    private Card.Color color;

    public CardTargetPack(Card.Color color){
        // create empty deck
        super();
        this.color = color;
    }

    private Card.Color color() {
        return this.color;
    }

    @Override
    public boolean put(Card card){
        //check color and value
        if (card.color() == this.color && card.value() - 1 == super.size()) {
            return super.put(card);
        }
        return false;
    }
}
