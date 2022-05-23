package cards;

import java.util.*;
public class Card
{
    // Why can't we use enums here ?
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;

    private Suit cardSuit;
    private int faceValue;


    public Card(Suit s, int fv) //Note s is NOT int!!
    {
        cardSuit = s;
        faceValue = fv;
    }


    //uses the toString() method in Suit
    public String getSuit()
    {
        return cardSuit.toString();
    }


}

