public class Tester
{
    private Agency agency = new Agency();
    private Flight f1 ,f2,f3;
    private Passenger pp1, pp2, pp3, pp4, pp5;

    public Tester()
    {
        agency = new Agency();
        f1 = new Flight ("RO12", "Rome", 20);
        f2 = new Flight ("AM34", "Amsterdam", 2); // for testing purposes
        f3 = new Flight ("BE45", "Berlin", 50);  // not added to Agency

        pp1 = new Passenger ("Amy", true);
        pp2 = new Passenger ("Ben", false);
        pp3 = new Passenger ("Chen", false);
        pp4 = new Passenger ("Dan", false);
        pp5 = new Passenger ("Eli", false);
        System.out.println ("A version of Agency.");
        //Add flights to the agency
        agency.addFlight (f1); agency.addFlight (f2);
        // f3 not added to agency
        System.out.println("***********Flights***************");
        System.out.println(agency.listFlights());   // you can comment this out
    }


    public void doTest ()
    {

        System.out.println ("************Defensive Programming using boolean *************");
        boolean result;
        result = agency.bookFlight(f1,pp1);
        if (result)
        {
            System.out.println(f1.getCode() + " booked for " + pp1.getName());
        }
        else
        {
             System.out.println(f1.getCode() + " NOT booked for " + pp1.getName());
        }

        result = agency.bookFlight(f1,pp2);
        if (result)
        {
            System.out.println(f1.getCode() + " booked for " + pp2.getName());
        }
        else
        {
             System.out.println(f1.getCode() + " NOT booked for " + pp2.getName());
        }

        // can't be bothered with the rest
        agency.bookFlight(f2,pp1);
        agency.bookFlight(f2,pp3);
        agency.bookFlight(f3,pp1);
        agency.bookFlight(f2,pp4);

        System.out.println("\nShow all flights");
        System.out.println(agency.listFlights());

    }
}
