package cards;



public class CardTester
{
    public void play()
    {
      //There will be problems here
      Card myCard1 = new Card(Card.CLUB, 6);
      Card myCard2 = new Card(Card.SPADE, Card.JACK);
      System.out.println("Card1 : " + myCard1.showSuit());
      System.out.println("Card2 : " + myCard2.showSuit());
      //use of statics for enumerated types is not "type"- safe
      Card myCard3 = new Card(2, 6); //what is created ? how would I know?
      //but to associate with a particular value might be OK
      //I would guess this is a Jack
      Card myCard4 = new Card(Card.CLUB, 11);
      //Use of statics means you lose the "String" representation
      // What is output here ?
      System.out.println("My suit is " + Card.CLUB);

    }
}
