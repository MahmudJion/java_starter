package dome;

public class CD extends Item
{
    private String artist;
    private int numberOfTracks;

    /**
     * Initialize the CD.
     * @param theTitle The title of the CD.
     * @param theArtist The artist of the CD.
     * @param tracks The number of tracks on the CD.
     * @param time The playing time of the CD.
     */
    public CD(String theTitle, String theArtist, int tracks, int time)
    {
        super(theTitle, time);  // call to parent constructor
        artist = theArtist;
        numberOfTracks = tracks;
    }

    /**
     * @return The artist for this CD.
     */
    public String getArtist()
    {
        return artist;
    }

    /**
     * @return The number of tracks on this CD.
     */
    public int getNumberOfTracks()
    {
        return numberOfTracks;
    }

    /**
     * sets a new artist
     * @dir the new artist
     */
    public void setArtist(String dir)
    {
        artist = dir;
    }


    /**
     * sets number of tracks
     * @trks number of tracks
     */
    public void setTracks(int trks)
    {
        numberOfTracks = trks;
    }

/**Needs to be commented out as it won't compile otherwise**/
    /**
     * Print details about this CD to the text terminal.
     */
    public void print()
    {
        System.out.print("CD: " + title + " (" + playingTime + " mins)");
        if(gotIt)
        {
            System.out.println("*");
        }
        else
        {
            System.out.println();
        }
         System.out.println("    " + artist);
         System.out.println("    tracks: " + numberOfTracks);
         System.out.println("    " + comment);
     }
}
