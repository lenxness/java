package ija.ija2016.homework2.cardpack;

import java.util.Collection;

public class CardStack extends ija.ija2016.homework2.cardpack.CardDeck implements ija.ija2016.homework2.model.cards.CardStack{
    public CardStack() {
        super();
    }

    @Override
    public boolean put(ija.ija2016.homework2.model.cards.Card card) {
        if(this.isEmpty()){
            if (card.value() == 13) {
                return this.deck.add(card);
            }

            return false;
        }

        if (!card.similarColorTo(this.get()) && card.value() + 1 == this.get().value()) {
            return this.deck.add(card);
        }
        return false;
    }

    public boolean put(ija.ija2016.homework2.model.cards.CardStack cardsToPush) {
        ija.ija2016.homework2.cardpack.Card card = (Card) cardsToPush.get(0);

        if(this.isEmpty()){
            if (card.value() == 13) {
                return this.deck.addAll((Collection) cardsToPush);
            }

            return false;
        }

        if (!card.similarColorTo(this.get()) && card.value() + 1 == this.get().value()) {
            return this.deck.addAll(cardsToPush.deck());
        }
        return false;

        /*ija.ija2016.homework2.cardpack.Card c = (Card) cardsToPush.deck.peek();
        ija.ija2016.homework2.cardpack.Card c1 = (Card) this.deck.peek();

        /*if(this.deck.isEmpty() && c.value() == 13 ){
            return this.deck.add(cardsToPush);
        }*//*
        if(this.isEmpty() && c.value() != 13){
            return false;
        }

        if((c1.color() == ija.ija2016.homework2.model.cards.Card.Color.DIAMONDS || c1.color() == ija.ija2016.homework2.model.cards.Card.Color.HEARTS) &&
                (c.color() == ija.ija2016.homework2.model.cards.Card.Color.CLUBS || c.color() == ija.ija2016.homework2.model.cards.Card.Color.SPADES) &&
                (c.value() + 1 == c1.value()) ){
            return this.deck.add(cardsToPush);
        }
        return false;*/
    }

    public CardStack pop(Card conditionCard) {
        int indexOfCondition = -1;
        CardStack stackOfRemoved;

        for (int i = 0; i < this.size(); i++) {
            if (this.deck.elementAt(i).equals(conditionCard)) {
                indexOfCondition = i;
            }
        }

        if (indexOfCondition == -1) {
            return null;
        }

        stackOfRemoved = new CardStack();
        stackOfRemoved.deck.addAll(this.deck.subList(indexOfCondition, this.deck.size()));

        for (int i = 1; i <= stackOfRemoved.deck.size(); i++) {
            this.deck.pop();
        }

        return stackOfRemoved;
    }
}
