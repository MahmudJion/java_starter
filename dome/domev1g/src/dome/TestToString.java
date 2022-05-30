package dome;
/**
 * Testing toString()
 */
public class TestToString
{
    public static void main(String[] args)
    {
        Item p = new Item("AAA", 20);
        DVD v = new DVD("Matilda","Disney",94);
        CD c = new CD("Metallica", "Metallica",9,75);

        System.out.println("***** using println not toString *****");
        System.out.println("***print Item***");
        System.out.println(p);
        System.out.println("***print DVD***");
        System.out.println(c);
        System.out.println("***print CD***");
        System.out.println(v);

        System.out.println("\n\n***** using toString() *****");
        System.out.println("***print Item***");
        System.out.println(p.toString());
        System.out.println("***print DVD***");
        System.out.println(c.toString());
        System.out.println("***print CD***");
        System.out.println(v.toString());

    }
}
