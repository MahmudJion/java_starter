package dome;

public class TestPoly3
{
    public static void main(String[] args)
    {
        Item p = new Item("xxx",  100);
        DVD v = new DVD("Matilda","Disney",94);
        CD c = new CD("Metallica", "Metallica",9,75);

        //Polymorphic creation
        Item pv2, pc2;
        pv2 = new DVD("BFG","Disney",100);
        pc2 = new CD("The Wall","Pink Floyd",8,70);

        // run time system uses dynamic type
        System.out.println("***What gets printed***");
        System.out.println("***pv2 - static:Item, dynamic:DVD***");
        pv2.print();
        System.out.println("***pv2 re-assigned a CD pc2 ***");
        pv2 = pc2; //polymorphic assignment
        pv2.print();
        System.out.println("***pv2 re-assigned a DVD***");
        pv2 = v;
        pv2.print();

// Additional tests - casting
        String s;
        int n;
        Item pv3 = v;
        Item pc3 = c;
// compiler uses static type
        pv3.setOwn(true);
        pc3.setOwn(true);

// Why do these not compile ???
        s = pc3.getArtist();
        s = pv3.getDirector();
        s = pv3.getArtist();
        s = pc3.getDirector();

// Compiles BUT what about runtime ?????
        s = ((CD)pc3).getArtist();
        n = ((CD)pc3).getNumberOfTracks();
        s = ((DVD)pc3).getDirector();

        s = ((DVD)pv3).getDirector();
        s = ((CD)pv3).getArtist();
        n = ((CD)pv3).getNumberOfTracks();



    }
}