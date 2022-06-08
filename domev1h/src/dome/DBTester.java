package dome;
public class DBTester
{
    public static void main(String args[])
    {
        Database db = new Database();

        CD cd1 = new CD("Funky Music", "Joe Bloggs", 10, 80);
        DVD dvd1 = new DVD("Psycho","Hitchcock",160);
        Item it1 = new Item("XXX",100);

        //Polymorphic creation
        Item cd2 = new CD("Boring Music", "Fred Bloggs", 7, 80);
        Item dvd2 = new DVD("Bambi","Disney",100);

        // Won't compile ??
        CD cd3 = new Item("Metallica",100);
        DVD dvd3 = new Item("Alien",150);

        // non-polymorphic method call
        db.addCD(cd1);
        db.addDVD(dvd1);

        db.addCD(cd2);
        db.addDVD(dvd2);

        db.list();
    }
}
