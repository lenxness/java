package ija.ija2016.homework2.model.cards;

public interface CardDeck{
     Card get();
     Card get(int index);
     boolean isEmpty();
     Card pop();
     boolean put(Card card);
     int size();
}
