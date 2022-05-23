package cards;

public enum Suit
{
    // A value for each suit along with its
    // corresponding user interface string.
    CLUB("Clubs"), DIAMOND("Diamonds"), HEART("Hearts"),SPADE("Spades"), UNKNOWN("Unknown");

    // The suit.
    private String suitString;

    /**
     * Initialise with the corresponding suit string.
     * @param suitString The suit string.
     **/
    private Suit(String suitString)
    {
            this.suitString = suitString;
    }


    /**
     *@return The Suit word as a string.
        **/
    public String toString()
    {
        return suitString;
    }
}
