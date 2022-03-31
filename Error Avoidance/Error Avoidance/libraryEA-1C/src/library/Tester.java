package library;
/**
 * Tester Class is a client of Library 
 * Explores approaches to error handling.
 * lending a book has been parametrised for the responsible client
 * @author Mick Wood, amended Olenka Marczyk 
 * @version 1a - Error Avoidance (Programming by contract)
 */
public class Tester
{
    private Library myLibrary = new Library();
    
    private Member m1,m2,m3;
    private Book b1,b2,b3,b4,b5;
        
    public Tester()
    {
        m1 = new Member ("Fred");
        m2 = new Member ("Amit");
        m3 = new Member ("Olek");  // not added to myLibrary
    
        b1 = new Book ("Wuthering Heights");
        b2 = new Book ("1984");
        b3 = new Book ("Brave New World");
        b4 = new Book ("The Book Thief");
        b5 = new Book ("Jane Eyre"); // not added to myLibrary      
        
        myLibrary.addMember (m1); myLibrary.addMember (m2);
        // m3 not added to myLibrary
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
        System.out.println("********** Responsible Client ***********");
        /** Responsible client: Test precondition on lendBook **/
        performLoan(m1,b1);    // see local method below
        performLoan(m1,b2); // second book to same member
        performLoan(m2,b1); // same book to another member - not allowed
        performLoan(m3,b3); // loan to non-member - not allowed
        performLoan(m1,b5); // book not in myLibrary



        System.out.println("\nIrresponsible client : "); 
        System.out.println("********Irresponsible client*************");
        myLibrary.lendBook (m2, b1);      //b1 already loaned
        System.out.println (b1.getTitle() + " was loaned to " + m2.getName()); 
        myLibrary.lendBook (m2, b5);      //b5 not myLibrary book
        System.out.println (b5.getTitle() + " was loaned to " + m2.getName()); 
        myLibrary.lendBook (m3, b4);      //m3 member ofmyLibrary
        System.out.println (b4.getTitle() + " was loaned to " + m3.getName());
        System.out.println("***********Available books***************");
        System.out.println(myLibrary.listAvailableBooks());
    }
    
    private void performLoan(Member m, Book b)
    {
        if (!myLibrary.isMember(m))
        {
            System.out.println (m.getName() + " not a member of this myLibrary " );
        }
        else if (!myLibrary.isBook(b))
        {
            System.out.println (b.getTitle()+ " not a book in this myLibrary " );
        }
        else if (!myLibrary.bookIsAvailable (b))
        {
            System.out.println (b.getTitle() + " not available for loan to " + m.getName());
        }
        else 
        {            
            myLibrary.lendBook (m, b);      // this is what we want to do
            System.out.println (b.getTitle() + " was loaned to " + m.getName());
        }
    }
}
