package Student_bluej;

public class RunMe
{
    public static void main(String[] abc)
    {
        Student st1;
        st1 = new Student();
        st1.doPrint(10, true);

        Student st2 =  new Student("John Doe");
        st2.doPrint(30, false);


    }


}
