package library;
/**
 * Tester Class is a client of Library 
 * Explores approaches to error handling.
 * No changes to version 1a
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
        if (!myLibrary.isMember(m1))
        {
            System.out.println (" Not a member of this myLibrary " );
        }
        else if (!myLibrary.isBook(b1))
        {
            System.out.println (b1.getTitle()+ " not a book in this myLibrary " );
        }
        else if (myLibrary.bookIsAvailable (b1))
        {
            myLibrary.lendBook (m1, b1);      // this is what we want to do
            System.out.println (b1.getTitle() + " was loaned to " + m1.getName());
        }
        else 
        {
            System.out.println (b1.getTitle() + " not available for loan to " + m1.getName());
        }
        // NOTE: Not very efficient code !!!!
        // lend second book - slightly different if..statement
        if (!myLibrary.isMember(m1))
        {
            System.out.println (" Not a member of this myLibrary " );
        }
        else if (!myLibrary.isBook(b2))
        {
            System.out.println (b2.getTitle()+ " not a book in this myLibrary " );
        }
        else if (!myLibrary.bookIsAvailable (b2))
        {
            System.out.println (b2.getTitle() + " not available for loan to " 
                + m1.getName());
        }
        else
        {
            myLibrary.lendBook (m1,b2);
            System.out.println (b2.getTitle() + " was loaned to " 
                + m1.getName());            
        }        
        
        // try to lend the second book again
        if (!myLibrary.isMember(m1))
        {
            System.out.println (" Not a member of this myLibrary " );
        }
        else if (!myLibrary.isBook(b2))
        {
            System.out.println (b2.getTitle()+ " not a book in this myLibrary " );
        }
        else if (!myLibrary.bookIsAvailable (b2))
        {
            System.out.println (b2.getTitle() + " not available for loan to " 
                    + m2.getName());
        }
        else
        {
            myLibrary.lendBook (m2, b2);
            System.out.println (b2.getTitle() + " was loaned to " 
                    + m2.getName());            
        } 
        
        // try to lend a book to a non-member
        if (!myLibrary.isMember(m3))
        {
            System.out.println (" Not a member of this library " );
        }
        else if (!myLibrary.bookIsAvailable (b3))
        {
            System.out.println (b3.getTitle() + " not available for loan to " 
                    + m3.getName());
        }
        else
        {
            myLibrary.lendBook (m3, b3);
            System.out.println (b3.getTitle() + " was loaned to " 
                    + m3.getName());            
        }  
        
        // Test for lend book which is not part of the myLibrary ??

        System.out.println("\nIrresponsible client : ");
        System.out.println("********Irresponsible client*************");
        myLibrary.lendBook (m2,b1);      //b1 already loaned
        System.out.println (b1.getTitle() + " was loaned to " + m2.getName()); 
        myLibrary.lendBook (m2, b5);      //b5 not myLibrary book
        System.out.println (b5.getTitle() + " was loaned to " + m2.getName()); 
        myLibrary.lendBook (m3, b4);      //m3 member ofmyLibrary
        System.out.println (b4.getTitle() + " was loaned to " + m3.getName());
        System.out.println("***********Available books***************");
        System.out.println(myLibrary.listAvailableBooks());
    }
}
