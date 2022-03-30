
/**
 * Tester Class is a client of Agency
 * Explores approaches to error handling. 
 * @version 1a - Error Avoidance (Programming by contract)Solution
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
       // This very tedious and repetitious code - see next version for a better solution
        if (!agency.isFlight(f1))
        {
            System.out.println ("Not a flight of this agency " );
        }
        else if (!f1.hasPlaces())
        {
            System.out.println (f1.getCode() + " is full " );
        }
        else        
        {
            agency.bookFlight(f1,pp1);
            System.out.println (f1.getCode ()+ " booked for " + pp1.getName());
        }
     
        // try to add the second passenger to same flight
        if (!agency.isFlight(f1))
        {
            System.out.println ("Not a flight of this agency " );
        }
        else if (!f1.hasPlaces())
        {
            System.out.println (f1.getCode() + " is full " );
        }
        else        
        {
            agency.bookFlight(f1,pp2);
            System.out.println (f1.getCode() + " booked for " + pp2.getName());
        }
      
        // try to add the first passenger to another flight
        if (!agency.isFlight(f2))
        {
            System.out.println ("Not a flight of this agency " );
        }
        else if (!f2.hasPlaces())
        {
            System.out.println (f2.getCode() + " is full " );
        }
        else        
        {
            agency.bookFlight(f2,pp1);
            System.out.println (f2.getCode() + " booked for " + pp1.getName());
        }
        
        // add a second passenger to second flight making it full
        if (!agency.isFlight(f2))
        {
            System.out.println ("Not a flight of this agency " );
        }
        else if (!f2.hasPlaces())
        {
            System.out.println (f2.getCode() + " is full " );
        }
        else        
        {
            agency.bookFlight(f2,pp3);
            System.out.println (f2.getCode() + " booked for " + pp3.getName());
        }
        
        //Testing the code
        // try to add a passenger to a non-flight
         if (!agency.isFlight(f3))
        {
            System.out.println ("Not a flight of this agency " );
        }
        else if (!f3.hasPlaces())
        {
            System.out.println (f3.getCode() + " is full " );
        }
        else        
        {
            agency.bookFlight(f3,pp3);
            System.out.println (f3.getCode() + " booked for " + pp3.getName());
        }
        
        //Testing the code
        // try to add a passenger full flight 
        if (!agency.isFlight(f2))
        {
            System.out.println ("Not a flight of this agency " );
        }
        else if (!f2.hasPlaces())
        {
            System.out.println (f2.getCode() + " is full " );
        }
        else        
        {
            agency.bookFlight(f2,pp4);
            System.out.println (f2.getCode() + " booked for " + pp4.getName());
        }
        
        System.out.println("\nShow all flights");
        System.out.println(agency.listFlights());        
       
        System.out.println("********Irresponsible client (needed by EA Only !!)*************");
        // write code but DO NOT check pre-conditions before making bookings - show bad things can happen
        agency.bookFlight(f1, pp4);      // will be OK
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
}
