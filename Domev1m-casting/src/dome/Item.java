package dome;

public class Item
{
    private String title;
    private int playingTime;
    private boolean gotIt;
    private String comment;

    /**
     * Initialise the fields of the item.
     * @param theTitle The title of this item.
     * @param time The running time of this item.
     */
    public Item(String theTitle, int time)
    {
        title = theTitle;
        playingTime = time;
        gotIt = false;
        comment = "";
    }

    /**
     * Enter a comment for this item.
     * @param comment The comment to be entered.
     */
    public void setComment(String comment)
    {
        this.comment = comment;
    }

    /**
     * @return The comment for this item.
     */
    public String getComment()
    {
        return comment;
    }

    /**
     * Set the flag indicating whether we own this item.
     * @param ownIt true if we own the item, false otherwise.
     */
    public void setOwn(boolean ownIt)
    {
        gotIt = ownIt;
    }

    /**
     * @return true if we own a copy of this item.
     */
    public boolean getOwn()
    {
        return gotIt;
    }

    /**
     * @returns the title
     */
    public String getTitle()
    {
        return title;
    }


    /**
     * Print details about this item to the text terminal.
     */
    public void print()
    {
        System.out.print("title: " + title + " (" + playingTime + " mins)");
        if(gotIt)
        {
            System.out.println("*");
        }
        else
        {
            System.out.println();
        }
        System.out.println("Comment:    " + comment);
    }

    /**
     * @return details about this item .
     */
    public String toString()
    {
        String s;
        s = "title: " + title + " (" + playingTime + " mins)";
        if(gotIt)
        {
            s = s + "*\n";
        }
        else
        {
            s = s + "\n";
        }
        s = s + "Comment:    " + comment;
        return s;
    }


}
