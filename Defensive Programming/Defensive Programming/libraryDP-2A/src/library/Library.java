package library;
import java.util.*;
public class Library
{
    private ArrayList<Member> members = new ArrayList<Member>();
    private ArrayList<Book> books = new ArrayList<Book> ();

    public void addMember (Member member) {members.add (member);}
    public void addBook (Book book) {books.add (book);}

    /**
     * Loan a Book to a Member
     * In-built defenses, but what to do if conditions not met ?
     * pre-condition : NONE
     * @param b the Book to be loaned
     * @param m the Member to loan the Book
     */
    public void lendBook (Member m,Book b)
    {
        if (b.isAvailable() && isMember(m) && isBook(b) && !m.hasFines())
        {
            m.borrowBook (b);
            b.setUnavailable();
        }
        else
        {
            // do nothing
        }
    }

    /** return book
     * PRECONDITION: isOnLoan(Member m, Book b)
     */
    public void returnBook (Member m, Book b)
    {
        m.returnBook (b);
        b.setAvailable();
    }

    public boolean isOnLoan(Member m, Book b)
    {
        return m.hasBook(b);
    }

    public boolean isMember(Member m)
    {
        return members.contains(m);
    }

    public boolean isBook(Book b)
    {
        return books.contains(b);
    }

    public String listAvailableBooks()
    {
        String s = "";
        for (Book temp : books)
        {
            if (temp.isAvailable())
            {
                s = s + temp.getTitle()+ "\n";
            }
        }
        return s;
    }

    public String listMembers()
    {
        String s = "";
        for (Member temp : members)
        {
            s = s + temp.getName()+ "\n";
        }
        return s;
    }

    public String listAllBooks()
    {
        String s = "";
        for (Book temp : books)
        {
            s = s + temp.getTitle()+ "\n";
        }
        return s;
    }
}
