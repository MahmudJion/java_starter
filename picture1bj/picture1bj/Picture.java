public class Picture
{
    // declare the components of your picture
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun ;

    /**
     * Constructor for objects of class Picture
     * Create the components of your picture
     */
    public Picture()
    {
        wall = new Square();
        window = new Square();
        roof = new Triangle();
        sun = new Circle();
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();

        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();

        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.makeVisible();

        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
}
