package zuulnb;
public class Room
{
    public String description;
    public Room northExitRoom;
    public Room eastExitRoom;
    public Room southExitRoom;
    public Room westExitRoom;

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
    public void setExitRooms(Room north, Room east, Room south, Room west)
    {
        if(north != null)
            northExitRoom = north;
        if(east != null)
            eastExitRoom = east;
        if(south != null)
            southExitRoom = south;
        if(west != null)
            westExitRoom = west;
    }

    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }

}
