package ija.ija2016.homework2.model.cards;

/**
 * Created by Lenka on 11.4.2017.
 */
public interface StartPack {
   boolean isEmpty();
   boolean put(CardStack stack);
   Card pop();
   int size();
}
