package library;
public class Book
{
    private String title;
    private boolean available;

    public Book (String title)
    {
        this.title = title;
        available = true;
    }

    public String getTitle()
    {
        return title;
    }

    public boolean isAvailable()
    {
        return available;
    }

    public void setUnavailable()
    {
        available  = false;
    }

    public void setAvailable()
    {
        available  = true;
    }
}
