package Student_bluej;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private String name;
    private double balance;
    private int noPagePrinted;
    public Student()
    {
        balance = 5;
        noPagePrinted = 0;
    }

    public Student(String yName)
    {
        name = yName;
        balance = 5;
        noPagePrinted = 0;
    }

    //public/private, returnType, functionName(paramsList){//statements}
    //paramsList -> nothing(empty) or list of - dataType varName

    public boolean doPrint(int numberOfPage, boolean isColor)
    {
        double rate = 0.05; //for black and white
        if (isColor)
        {
            rate = 0.08;
        }
        if (balance >= numberOfPage * rate)
        {
            balance = balance - numberOfPage * rate;
            noPagePrinted = noPagePrinted + numberOfPage;
            return true;
        }

        return false;
    }

    public void setName(String yourName)
    {
        name = yourName;
    }

    public String getName()
    {
        return name;
    }
}
