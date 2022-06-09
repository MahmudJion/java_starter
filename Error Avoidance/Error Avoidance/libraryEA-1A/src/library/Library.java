package library;
import java.util.*;

public class Library
{
    private ArrayList<Member> members = new ArrayList<Member>();
    private ArrayList<Book> books = new ArrayList<Book>();

    public void addMember (Member member)
    {
        members.add (member);
    }

    public void addBook (Book book)
    {
        books.add(book);
    }


    /**
     * Loan a Book to a Member
     * PRECONDITION: is member and book is available to be loaned, i.e:
     *               isMember(m) && bookIsAvailable(b)
     * What about book not part of the library ???
     * @param m the Member to loan the Book
     * @param b the Book to be loaned
     */
    public void lendBook (Member m, Book b )
    {
        m.borrowBook (b);
        b.setUnavailable();
    }


    /** Documentation?
     *
     */
    public void returnBook (Member m, Book b)
    {
        m.returnBook (b);
        b.setAvailable();
    }

    public boolean isMember(Member m)
    {
        return members.contains(m);
    }

    public boolean isBook(Book b)
    {
        return books.contains(b);
    }

    public boolean bookIsAvailable (Book book)
    {
        return book.isAvailable();
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
