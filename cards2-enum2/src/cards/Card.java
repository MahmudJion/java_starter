package cards;

import java.util.*;
/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card
{   
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
 
    
    public String getSuit()
    {  
        return cardSuit.toString();
    }
    
    public enum Suit  //private inner class - there could be problems with this
    {
        // A value for each suit along with its
        // corresponding user interface string.
        CLUB("Clubs"), DIAMOND("Diamonds"), HEART("Hearts"),SPADE("Spades"), UNKNOWN("Unknown");
    
        // The suit.
        private String suitString;
    
        /**
         * Initialise with the corresponding suit string.
         * @param suitString The suit string.
         */
        Suit(String suitString)
        {
            this.suitString = suitString;
        } 
    
        /**
         * @return The Suit word as a string.
         */
        public String toString()
        {
            return suitString;
        }
    }
}

