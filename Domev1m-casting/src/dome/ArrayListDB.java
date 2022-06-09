package dome;
import java.util.*;

public class ArrayListDB
{
    public static void main(String[] args)
    {
        DVD v = new DVD("Matilda","Disney",94);
        CD c = new CD("Metallica", "Metallica",9,75);
        Item p = new Item("xxx",  100);
        Item dvd3 = new DVD("Alien","Universal",150);
        ArrayList<Item> myStuff = new ArrayList<Item>();

        // all types allowed to be stored in ArrayList
        myStuff.add(p);     //p is Item object
        myStuff.add(v);     //v is DVD object
        myStuff.add(c);     //c is CD object
        myStuff.add(x);     //x is CD object at the moment

        System.out.println("Call superclass method setOwn() on all elements in collection");
        for(Item temp : myStuff)
        {  // call supertype method
            temp.setOwn(true);
        }
        System.out.println("===============================================");

        System.out.println("\nCall superclass method print() on all elements in collection");
        for(Item temp : myStuff)
        {  // call supertype method
            temp.print();          //overridden method
            System.out.println("========================");
        }
        System.out.println("===============================================");

        System.out.println("\nCall superclass method toString() on all elements in collection");
        for(Item temp : myStuff)
        {  // call supertype method
            System.out.println(temp.toString()); //overridden method
            System.out.println("========================");
        }

        // This won't compile, as getDirector() is a subclass method - fix it ! safely
        String s = " ";
        for(Item temp : myStuff)
        {
            s = temp.getDirector();
            System.out.println("Director: " + s);
            System.out.println("=================");
        }



       // Declare new Item but don't create, just assign
        Item pv1;           // static type of pv1 - Item
        pv1 = v;            // allowed by polymorphism - pv1 dynamic type:DVD
        myStuff.add(pv1);
        pv1 = c;            // allowed by polymorphism - pv1 dynamic type:CD
        myStuff.add(pv1);

        System.out.println("**** Print with additions *****");
        for(Item temp : myStuff)
        {  // call supertype method
            System.out.println(temp.toString());          //overridden method
            System.out.println("========================");
        }

}
