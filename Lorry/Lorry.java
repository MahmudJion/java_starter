
/**
 * Write a description of class Lorry here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lorry
{
   // declare the components of your picture
    private Square bigLorryBody;
    private Square smallLorryBody;
    private Square treeTrunk;
    private Square lorryWindow;
    private Triangle treeTop;
    private Circle sun;
    private Circle leftWheel;
    private Circle rightWheel;

    /**
     * Constructor for objects of class Picture
     * Create the components of your picture
     */
    public Lorry()
    {
        bigLorryBody = new Square();
        smallLorryBody = new Square();
        lorryWindow = new Square();
        treeTrunk = new Square();
        treeTop = new Triangle();
        sun = new Circle();
        leftWheel = new Circle();
        rightWheel = new Circle();
    }



    public void draw()
    {
        bigLorryBody.moveVertical(80);
        bigLorryBody.changeSize(80);
        bigLorryBody.changeColor("blue");
        bigLorryBody.makeVisible();

        smallLorryBody.moveVertical(130);
        smallLorryBody.moveHorizontal(80);
        smallLorryBody.changeSize(30);
        smallLorryBody.changeColor("blue");
        smallLorryBody.makeVisible();

        lorryWindow.moveVertical(90);
        lorryWindow.moveHorizontal(50);
        lorryWindow.changeSize(20);
        lorryWindow.changeColor("magenta");
        lorryWindow.makeVisible();

        leftWheel.changeColor("black");
        leftWheel.moveHorizontal(50);
        leftWheel.moveVertical(140);
        leftWheel.changeSize(30);
        leftWheel.makeVisible();

        rightWheel.changeColor("black");
        rightWheel.moveHorizontal(110);
        rightWheel.moveVertical(140);
        rightWheel.changeSize(30);
        rightWheel.makeVisible();

        treeTop.changeSize(100, 40);
        treeTop.moveHorizontal(180);
        treeTop.moveVertical(90);
        treeTop.makeVisible();

        treeTrunk.moveVertical(155);
        treeTrunk.moveHorizontal(160);
        treeTrunk.changeSize(20);
        treeTrunk.changeColor("red");
        treeTrunk.makeVisible();

        sun.changeColor("yellow");
        sun.moveHorizontal(150);
        sun.moveVertical(-30);
        sun.changeSize(40);
        sun.makeVisible();
    }


    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(bigLorryBody != null)   // only if it's painted already...
        {
            bigLorryBody.changeColor("black");
            smallLorryBody.changeColor("black");
            lorryWindow.changeColor("white");
            treeTrunk.changeColor("black");
            treeTop.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(bigLorryBody != null)   // only if it's painted already...
        {
            bigLorryBody.changeColor("blue");
            smallLorryBody.changeColor("blue");
            lorryWindow.changeColor("magenta");
            treeTrunk.changeColor("red");
            treeTop.changeColor("green");
            sun.changeColor("yellow");
        }
    }
}
