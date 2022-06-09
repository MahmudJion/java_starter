package dome;

public class TesterBetter
{
    public static void main(String args[]){

        Database db = new Database();

        CD cd1 = new CD("Funky Music", "Joe Bloggs", 10, 80);
        CD cd2 = new CD("Boring Music", "Fred Bloggs", 7, 80);
        Item cd3 = new CD("Metallica", "Metallica", 8, 100);

        DVD dvd1 = new DVD("Psycho","Hitchcock",160);
        DVD dvd2 = new DVD("Bambi","Disney",100);
        Item dvd3 = new DVD("Alien","Universal",150);

        Item xx = new Item("XXXXX", 0);

        db.addItem(cd1);
        db.addItem(cd2);
        db.addItem(cd3);
        db.addItem(dvd1);
        db.addItem(dvd2);
        db.addItem(dvd3);
        db.addItem(xx);

        db.addComment(cd1,"Dated");
        db.addComment(cd2,"Boring");
        db.addComment(cd3,"Loud");
        db.addComment(dvd1,"Scary");
        db.addComment(dvd2,"Sweet");
        db.addComment(dvd3,"Watch out !");
        db.addComment(xx,"Exciting");

        db.setAllOwn();
        db.list();
    }
}
