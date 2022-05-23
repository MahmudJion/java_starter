package cards;

public class CardTester
{
    public static void main(String[] args)
    {
      Card myCard1 = new Card(Card.CLUB, 6);
      Card myCard2 = new Card(Card.SPADE, Card.JACK);
      System.out.println("Card1 : " + myCard1.getSuitName());
      System.out.println("Card2 : " + myCard2.getSuitName());
      System.out.println("Card1 : " + myCard1.toString());

      System.out.println("My suit is " + Card.CLUB);

    }
}
