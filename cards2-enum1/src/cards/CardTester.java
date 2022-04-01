package cards;


/**
 * Write a description of class CardTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CardTester
{   
    public static void main(String[] args)
    {
      Card myCard1 = new Card(Suit.CLUB, 6);
      Card myCard2 = new Card(Suit.SPADE, Card.JACK);
      System.out.println("Card1 : " + myCard1.getSuit());
      System.out.println("Card2 : " + myCard2.getSuit());
      //use of statics for enumerated types is not "type"- safe
      //Card myCard3 = new Card(2, 6); //what is created ? how would I know? 
      // above won't compile anyway as Suit is not the same type as int
      //but to associate with a particular value might be OK
      //I would guess this is a Jack
//      Card myCard4 = new Card(Card.CLUB, 11);
      // above won't compile because Card no longer has a field called CLUB
      // it is now stored in Suit
      // correct to : 
      // Card myCard4 = new Card(Suit.CLUB, 11);
      
      //Use of statics means you lose the "String" representation
      // What is output here ?
      System.out.println("My suit is " + Suit.CLUB);
      
      /** this causes a syntax error - can't compare String and int
       * replacing myString.equals(Card.CLUB) compiles but results in "No"
      String myString = "Club";
      if (myString==Card.CLUB)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
      */
     
    }
}   
