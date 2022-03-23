package zuulnb;
import java.util.HashMap;
import java.util.Iterator;
/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2006.03.30
 */
public class Room 
{
    public String description;
    public Room northExitRoom;
    public Room eastExitRoom;
    public Room southExitRoom;
    public Room westExitRoom;
    public Room upExitRoom;  //Task 1.3
    public Room downExitRoom;
    public Room anExitRoom;
    HashMap<String, Room> exitRooms = new HashMap<>();
    
    /*private Room northExitRoom;
    private Room eastExitRoom;
    private Room southExitRoom;
    private Room westExitRoom;
    private Room upExitRoom;  //Task 1.3
    private Room downExitRoom;*/

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
    }

    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     * @param north The north exit.
     * @param east The east east.
     * @param south The south exit.
     * @param west The west exit.
     */
    public void setExitRoom(String direction, Room exitRoom)
    {
        exitRooms.put(direction, exitRoom);
    }
    
    public Room getExitRoom(String direction)
    {
        return exitRooms.get(direction);
    }
    
    public void setExitRooms(Room north, Room east, Room south, Room west, Room up, Room down) 
    {
        if(north != null)
            northExitRoom = north;
        if(east != null)
            eastExitRoom = east;
        if(south != null)
            southExitRoom = south;
        if(west != null)
            westExitRoom = west;
        if(up != null)
            upExitRoom = up;
        if(down != null)
            downExitRoom = down;
    }

    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }
    
    public String getLongDescription()
    {
        //System.out.println(description);
        Iterator it = exitRooms.keySet().iterator();//
        String key=" ";
        while(it.hasNext()) 
        {
          key = (String)it.next() + " " + key;
        }
        return key;
    }

}
