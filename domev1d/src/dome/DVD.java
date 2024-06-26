package dome;

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
        super(theTitle, time);  // call  to parent constructor
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

    /**
     * Print details about this DVD to the text terminal.
     */
    public void print()
    {
        super.print();  // call to parent print()
        System.out.println("    " + director);
    }

    public String toString()
    {
        return super.toString() + "      " + director + "\n";
    }
}
