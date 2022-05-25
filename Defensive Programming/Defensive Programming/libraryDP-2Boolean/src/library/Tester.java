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
        boolean success;
        System.out.println("********** Client - No need to be responsible***********");
        /** Responsible client: Checks result **/
        // Note: need to check result every time

        success = myLibrary.lendBook (m1,b1);      // catch the result
        // But now need to check result
        if (success)
        {
            System.out.println (b1.getTitle() + " was loaned to "
                    + m1.getName());
        }
        else
        {
            System.out.println (b1.getTitle() + " not loaned to "
                    + m1.getName());
        }

        success = myLibrary.lendBook (m1,b2);      // catch result
        if (success)
        {
            System.out.println (b2.getTitle() + " was loaned to "
                    + m1.getName());
        }
        else
        {
            System.out.println (b2.getTitle() + " not loaned to "
                    + m1.getName());
        }

        success = myLibrary.lendBook (m2, b2);      // should not be able to do this !
        if (success)
        {
           System.out.println (b2.getTitle() + " was loaned to "
                    + m2.getName());
        }
        else
        {
           System.out.println (b2.getTitle() + " not loaned to "
                    + m2.getName());
        }

        // Irresponsible client :
        System.out.println("********Irresponsible client*************");
        success = myLibrary.lendBook (m1, b2);      //b2 already loaned
        if (success)
        {
           System.out.println (b2.getTitle() + " was loaned to "
                    + m1.getName());
        }
        else
        {
           System.out.println (b2.getTitle() + " not loaned to "
                    + m1.getName());
        }
        success = myLibrary.lendBook (m2, b5);      //b5 not myLibrary book
        if (success)
        {
           System.out.println (b5.getTitle() + " was loaned to "
                    + m2.getName());
        }
        else
        {
           System.out.println (b5.getTitle() + " not loaned to "
                    + m2.getName());
        }
        success =myLibrary.lendBook (m3,b4);      //m3 member of myLibrary
        if (success)
        {
           System.out.println (b4.getTitle() + " was loaned to "
                    + m3.getName());
        }
        else
        {
           System.out.println (b4.getTitle() + " not loaned to "
                    + m3.getName());
        }
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
