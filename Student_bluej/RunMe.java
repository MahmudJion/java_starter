
/**
 * Write a description of class RunMe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RunMe
{
    public static void main(String[] abc)
    {
        Student st1;
        st1 = new Student();
        boolean flagPrint = st1.doPrint(10, true);
        /*
        if(flagPrint)
        {
            System.out.println(st1.getName()+"Please collect your page");
        }else 
        {
            System.out.println("Please top up");
        }*/
        
        Student st2 =  new Student("John Doe");
        boolean flagPrint2 = st2.doPrint(30, false);
        
        
    }
    

}
