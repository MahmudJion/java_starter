
/**
 * Tester Class is a client of Agency
 * Explores approaches to error handling. 
 * @version 1b - Error Avoidance (Programming by contract) parametrised
 */
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
        System.out.println("********** Responsible Client ***********");
        // write your code to check pre-conditions before making bookings
        /** Responsible client: Test precondition on bookFlight **/
        System.out.println(processBooking (f1,pp1));
        System.out.println(processBooking (f1,pp2));
        System.out.println(processBooking (f2,pp1));
        System.out.println(processBooking (f2,pp3));
        System.out.println(processBooking (f3,pp1));        
        System.out.println(processBooking (f2,pp4));        
         
        System.out.println("\nShow all flights");
        System.out.println(agency.listFlights());

        System.out.println("********Irresponsible client*************");
        // Do NOT perform checks
        agency.bookFlight (f1,pp4);      //should be OK
        System.out.println (f1.getCode() + " booked for " + pp4.getName());
        agency.bookFlight (f3,pp3);      //flight not at agency
        System.out.println (f3.getCode() + " booked for " + pp3.getName());
        agency.bookFlight (f2,pp4);      // flight full
        System.out.println (f3.getCode() + " booked for " + pp4.getName());
        agency.bookFlight (f2,pp5);      // flight full 
        System.out.println (f3.getCode() + " booked for " + pp5.getName());
        System.out.println("\nShow all flights");
        System.out.println(agency.listFlights());
    }
    
    private String processBooking(Flight f, Passenger p)
    {
        if (!agency.isFlight(f))
        {
            return "Not a flight of this agency " ;
        }
        else if (!f.hasPlaces())
        {
            return f.getCode() + " is full " ;
        }
        else        
        {
            agency.bookFlight(f,p);
            return f.getCode() + " booked for " + p.getName();
        }

    }
}
