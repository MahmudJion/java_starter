package dome;
import java.util.*;

public class ArrayListDB
{
    public static void main(String[] args)
    {
        DVD v = new DVD("Matilda","Disney",94);
        CD c = new CD("Metallica", "Metallica",9,75);
        Item p = new Item("xxx",  100);
        Student s = new Student("Fred",123);
        Item pv1;

        ArrayList<Item> myStuff = new ArrayList<Item>();

        // all types allowed to be stored in ArrayList
        myStuff.add(s);
        myStuff.add(p);     //p is Item object
        myStuff.add(v);     //v is DVD object
        myStuff.add(c);     //c is CD object

        for(Item temp : myStuff)
        {  // call supertype method
            temp.setOwn(true);
        }

        for(Item temp : myStuff)
        {  // call supertype method
            temp.print();          //overridden method
            System.out.println("========================");
        }
        //pv1 static type Item, current dynamic type CD

        pv1 = v;            // allowed by polymorphism
        myStuff.add(pv1);
        pv1 = c;            // allowed by polymorphism
        myStuff.add(pv1);    // current dynamic type DVD
        System.out.println("**** Print with additions *****");
        for(Item temp : myStuff)
        {  // call supertype method
            temp.print();          //overridden method
            System.out.println("========================");
        }
    }

}
