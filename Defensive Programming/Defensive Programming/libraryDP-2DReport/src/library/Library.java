package library;
import java.util.*;
/**
 * Class Library explores approaches to error handling.
 * 
 * @author Mick Wood amended by Olenka Marczyk
 * @version 2 - Defensive Programming with Error Codes
 */
public class Library
{
    private List<Member> members = new ArrayList<Member>();
    private List<Book> books = new ArrayList<Book> ();
    
    public void addMember (Member member) {members.add (member);}
    public void addBook (Book book) {books.add (book);}

    /**
     * Loan a Book to a Member
     * Error codes used 
     * @param b the Book to be loaned
     * @param m the Member to loan the Book
     * 
     * @return true if book was loaned successfully, false otherwise
     */
    public String lendBook (Member m, Book b)
    {
        if (!isMember(m)) {return m.getName() + " - not a member";}
        else if (!b.isAvailable()) {return b.getTitle() + " not available "  ;}
        else if (!isBook(b)) {return b.getTitle() + " - not a book:";}
        else if (m.hasFines()) {return m.getName() + " - has fines:";}
        else 
        {            
            b.setUnavailable();
            m.borrowBook (b);
            return b.getTitle() + " loaned to " + m.getName();
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
