package flights;


/**
 * Tester Class is a client of Agency
 * Explores approaches to error handling. 
 * @version 1a - Error Avoidance (Programming by contract)
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
      
        
        
        System.out.println("\nShow all flights");
        System.out.println(agency.listFlights());

        System.out.println("********Irresponsible client (needed by EA Only !!)*************");
        // write code but DO NOT check pre-conditions before making bookings - show bad things can happen
        
        
        
        
        System.out.println("\nShow all flights");
        System.out.println(agency.listFlights());


    }
}
