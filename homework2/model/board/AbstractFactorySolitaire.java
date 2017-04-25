package ija.ija2016.homework2.model.board;

//import ija.ija2016.homework2.model.cards.Card;
//import ija.ija2016.homework2.model.cards.CardDeck;
//import ija.ija2016.homework2.model.cards.CardStack;
import ija.ija2016.homework2.cardpack.Card;
import ija.ija2016.homework2.cardpack.CardStack;

public abstract class AbstractFactorySolitaire {

    public AbstractFactorySolitaire(){

    };

    public abstract Card createCard(Card.Color color, int value);
    public abstract ija.ija2016.homework2.model.cards.CardDeck createCardDeck();
    public abstract ija.ija2016.homework2.model.cards.CardDeck createTargetPack(Card.Color color);
    public abstract CardStack createWorkingPack();

}

