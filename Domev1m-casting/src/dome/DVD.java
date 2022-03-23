package dome;
/**
 * The DVD class represents a DVD object. Information about the 
 * DVD is stored and can be retrieved. We assume that we only deal 
 * with movie DVDs at this stage.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 2006.03.30
 */
public class DVD extends Item 
{
    private String director;

    /**
     * Constructor for objects of class DVD
     * @param theTitle The title of this DVD.
     * @param theDirector The director of this DVD.
     * @param time The running time of the main feature.
     */
    public DVD(String theTitle, String theDirector, int time)
    {
        super(theTitle, time);
        director = theDirector;
    }

    /**
     * @return The director for this DVD.
     */
    public String getDirector()
    {
        return director;
    }
    
    /** 
     * sets a new director
     * @dir the new director
     */
    public void setDirector(String dir)
    {
        director = dir;
    }
    
    /** @override
     * Print details about this CD to the text terminal.
     */
    public void print()
    {
        super.print();
        System.out.println("Director:    " + director);
    }
    
    /** @override
     * returns details about this DVD .
     */
    public String toString()
    {
        String s = super.toString();
        s = s + "\nDirector:    " + director;
        return s;
    }
}
