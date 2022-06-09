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
        super(theTitle, time);
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

    /** @override
     * Print details about this CD to the text terminal.
     */
    public void print()
    {
        super.print();
        System.out.println("Artist:    " + artist);
        System.out.println("   tracks: " + numberOfTracks);
    }

    /** @override
     * returns details about this CD .
     */
    public String toString()
    {
        String s = super.toString();
        s = s + "\nArtist:    " + artist;
        s = s + "\nTracks: " + numberOfTracks;
        return s;
    }
}
