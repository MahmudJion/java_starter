import java.util.*;

public class Agency
{
    private ArrayList<Flight> flights = new ArrayList<Flight>();

    /** adds a flight to the flights at the agency
     * @param flight is the flight to be added
     */
    public void addFlight (Flight flight)
    {
        flights.add (flight);
    }


    /**
     * Add a Passenger to a Flight
     * PRECONDITION: is flight & has places
     *               isFlight(flt) && flt.hasPlaces()
     * @param pp the Passenger to be added
     * @param flt the Flight to which the passenger is to be added
     */
    public void bookFlight (Flight flt,Passenger pp)
    {
            flt.addPassenger(pp);
    }


    /** Cancel a booking
     * PRECONDITION: is flight and is passenger on flight
     *               isFlight(flt) && flt.isPassenger(pp)
     */
    public void cancelBooking (Flight flt, Passenger pp)
    {
       flt.removePassenger (pp);
    }




    /** returns true if the flight is with the Agency, else false
     * @param the flight
     * @return true if the flight is with the Agency, else false
     */
    public boolean isFlight(Flight fl)
    {
        return flights.contains(fl);
    }


    /** provides a String representation of all flights at the agency
     * @return a String representation of all flights at the agency
     */
    public String listFlights()
    {
        String s = "";
        for (Flight temp : flights)
        {
            s = s + temp.toString()+ "\n";
        }
        return s;
    }


}
