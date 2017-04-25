package ija.ija2016.homework2.cardpack;

import java.util.Stack;

import ija.ija2016.homework2.model.cards.Card;
import ija.ija2016.homework2.model.cards.CardStack;
import ija.ija2016.homework2.model.cards.StartPack;

public class CardDeck implements StartPack, ija.ija2016.homework2.model.cards.CardDeck {
    public Stack deck;

    public CardDeck(){
        // create empty deck
        this.deck = new Stack();
    }

    public Stack deck() {
        return this.deck;
    }

    public int size(){
        return this.deck.size();
    }

    public boolean put(Card card){
        //insert card to top
        return this.deck.add(card);
    }

    public Card pop(){
        //take card from top
        return (Card) this.deck.pop();
    }

    public Card get(){
        if(this.deck.isEmpty()){
            return null;
        }
        return (Card) this.deck.peek();
    }

    public Card get(int index){
        if(index > this.deck.size() - 1 || this.deck.isEmpty() || index < 0){
            return null;
        }
        return (Card) this.deck.get(index);
    }

    public boolean isEmpty(){
        return this.deck.isEmpty();
    }

    @Override
    public boolean put(CardStack stack) {
        return false;
    }
}
