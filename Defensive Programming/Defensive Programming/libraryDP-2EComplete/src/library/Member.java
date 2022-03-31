package library;
import java.util.*;

public class Member
{
    private String name;
    private double fines;
    private List<Book> loans = new ArrayList<Book>();
    
    public Member (String name) { this.name = name;}
    
    public boolean hasBook (Book book) {return loans.contains (book);}
    
    public void borrowBook (Book book) {loans.add (book);}
    
    public void returnBook (Book book) {loans.remove (book);}    
    
    public String getName () {return name;}
    
    public void addFine (double amount) 
    {   fines = fines + amount;}
    
    public void payFine (double amount) 
    {   fines = fines - amount;}
    
    public boolean unpaidFines () 
    {   return fines > 0;}
    
    public double getFines () 
    {   return fines ;}
}
