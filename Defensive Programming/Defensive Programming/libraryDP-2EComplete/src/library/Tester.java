package library;
/**
 * Tester Class for Library example.
 * Explores approaches to error handling.
 * 
 * @author Mick Wood, amended by Olenka Marczyk 10/03/08
 * @version 2 - Defensive Programming with Error Codes
 */
public class Tester
{
    private Library myLibrary;
    
    private Member m1,m2,m3,m4;
    private Book b1,b2,b3,b4,b5;
        
    public Tester()
    {
        myLibrary = new Library();
        m1 = new Member ("Fred");
        m2 = new Member ("Amit");
        m3 = new Member ("Olek");  // not added to myLibrary
        m4 = new Member ("Zan");
    
        b1 = new Book ("Wuthering Heights");
        b2 = new Book ("1984");
        b3 = new Book ("Brave New World");
        b4 = new Book ("The Book Thief");
        b5 = new Book ("Jane Eyre"); // not added to myLibrary      
        
        myLibrary.addMember(m1); myLibrary.addMember(m2);
        // m3 not added to myLibrary
        myLibrary.addMember(m4);
        myLibrary.addBook (b1); myLibrary.addBook (b2);
        myLibrary.addBook (b3); myLibrary.addBook (b4);
        
        // b5 not added to myLibrary
        System.out.println ("A version of Library.");
        System.out.println("***********Members***************");
        System.out.println(myLibrary.listMembers());
        System.out.println("*******Available books***********");
        System.out.println(myLibrary.listAllBooks());
    }
    
    public void doTest ()
    {
        System.out.println(myLibrary.lendBook (m1, b1));

        System.out.println(myLibrary.lendBook (m1, b2));
       
        System.out.println(myLibrary.lendBook (m2, b2));
        
        System.out.println(myLibrary.lendBook (m2, b5));

        System.out.println(myLibrary.lendBook (m3, b4));
        
        m4.addFine(10);
        System.out.println(myLibrary.lendBook (m4, b3));
        m4.payFine(10);
        System.out.println("Fine paid");
        System.out.println(myLibrary.lendBook (m4, b3));

        
        /*** NOTE - there is nothing to force us to test the return value of lendBook, 
         * e.g. we can get away with:
         */
        myLibrary.lendBook (m2, b2);
        System.out.println ("Ignoring result:--  " + b2.getTitle() + " for loan to " 
                    + m2.getName()+ " : Successful");
        System.out.println("***********Available books***************");
        System.out.println(myLibrary.listAvailableBooks());
        
        
        System.out.println ("\n\nReturn Book");
        //Return book - which is on loan
        System.out.println(doReturn(m1,b1));

        //Return book - which is not on loan
        System.out.println(doReturn(m1,b4));
    }
    
    private String doReturn(Member m, Book b)
    {
        //Return book - which is on loan
        if (myLibrary.isOnLoan(m,b))
        {
            myLibrary.returnBook(m,b);
            return b.getTitle() + " was returned by " 
            + m.getName(); 
        }
        else
        {
            return b.getTitle() + " not on loan to " 
            + m.getName();
        } 
    }
}
