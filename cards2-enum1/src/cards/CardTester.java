package cards;

public class CardTester
{
    public static void main(String[] args)
    {
      Card myCard1 = new Card(Suit.CLUB, 6);
      Card myCard2 = new Card(Suit.SPADE, Card.JACK);
      System.out.println("Card1 : " + myCard1.getSuit());
      System.out.println("Card2 : " + myCard2.getSuit());

      System.out.println("My suit is " + Suit.CLUB);
    }
}
