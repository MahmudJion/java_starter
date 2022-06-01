package dome;

import java.util.ArrayList;

public class Database
{
    private ArrayList<Item> items;

    /**
     * Construct an empty Database.
     */
    public Database()
    {
        items = new ArrayList<Item>();
    }

    /**
     * Add an item to the database.
     * @param theItem The item to be added.
     */
    public void addItem(Item theItem)
    {
        items.add(theItem);
    }

    /**
     * Add a comment to an item
     */
    public void addComment(Item theItem, String com)
    {
        theItem.setComment(com);
    }


    /** set all items in database to "own"
     */
    public void setAllOwn()
    {
        for(Item myItem: items)
        {
            myItem.setOwn(true);
        }
    }

    /**
     * Print a list of all currently stored items to the
     * text terminal.
     */
    public void list()
    {
        for(Item xxx : items) // for loop used with collections
        {
            xxx.print();
            System.out.println();   // empty line between items
        }
    }

    /**
     * Display a list of all currently stored items to the
     * text terminal.
     */
    public void display()
    {
        for(Item xxx : items) // for loop used with collections
        {
            System.out.println(xxx.toString() + "/n");
        }
    }
}
