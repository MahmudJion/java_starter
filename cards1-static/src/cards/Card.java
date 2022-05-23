package cards;
public class Card
{
    public static final int CLUB = 1;
    public static final int DIAMOND = 2;
    public static final int HEART = 3;
    public static final int SPADE = 4;

    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;
    public static final int ACE = 1;

    private int suit;
    private int faceValue;

    public Card(int s, int fv) //Note types are int !!
    {
        suit = s;
        faceValue = fv;
    }

    public String getSuitName()
    {
        String s = "";
        if (suit == CLUB){s = "Club";}
        else if (suit == HEART){s = "Heart";}
        else if (suit == DIAMOND){s = "Diamond";}
        else if (suit == SPADE){s = "Spade";}
        return s;
    }

    public String toString()
    {
        String face = "" + faceValue;
        if (faceValue == 11) {face = "Jack";}
        else if (faceValue == 12) {face = "Queen";}
        else if (faceValue == 13) {face = "King";}
        else if (faceValue == 1)  {face = "Ace";}
        face = face + " of " + getSuitName()+ "s";
        return face;
    }

}