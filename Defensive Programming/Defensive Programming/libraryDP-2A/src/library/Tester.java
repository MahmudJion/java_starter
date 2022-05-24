package library;

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
        System.out.println("********** Client - No need to be responsible***********");
        myLibrary.lendBook (m1, b1);
        myLibrary.lendBook (m2, b2);
        // What happens here ?
        // should not be able to do these !
        myLibrary.lendBook (m2, b1);      // book already on loan
        myLibrary.lendBook (m3, b1);      // not member of myLibrary
        myLibrary.lendBook (m2, b5);      // book not in myLibrary
        m2.addFine(10);
        myLibrary.lendBook (m2, b3);
        m2.payFine(10);
        myLibrary.lendBook (m2, b3);
        // In practice, the client wants to have some idea of what is happening

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
