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

/**Needs to be commented out as it won't compile otherwise**/
    /**
     * Print details about this DVD to the text terminal.
     */
    public void print()
    {
        System.out.print("DVD: " + title + " (" + playingTime + " mins)");
        if(gotIt)
        {
            System.out.println("*");
        }
        else
        {
            System.out.println();
        }
         System.out.println("    " + director);
         System.out.println("    " + comment);
     }
}
