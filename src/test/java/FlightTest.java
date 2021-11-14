import Human.CabinCrewMember;
import Human.Passenger;
import Human.Pilot;
import Human.Rank;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FlightTest {

    Flight flight;
    Pilot pilot1;
    Pilot pilot2;

    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    CabinCrewMember cabinCrewMember3;
    CabinCrewMember cabinCrewMember4;
    CabinCrewMember cabinCrewMember5;

    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;
    Passenger passenger6;
    Passenger passenger7;
    Passenger passenger8;
    Passenger passenger9;
    Passenger passenger10;

    ArrayList<Pilot> pilots;
    ArrayList<CabinCrewMember> cabinCrewMembers;
    ArrayList<Passenger> passengers;

    @Before
    public void before(){

        pilot1 = new Pilot("Beata", Rank.CAPTAIN, "READY2FLY");
        pilot2 = new Pilot("Tony", Rank.FIRST_OFFICER, "READY2FLY26");

        cabinCrewMember1 = new CabinCrewMember("Will", Rank.PURSER);
        cabinCrewMember2 = new CabinCrewMember("Calum", Rank.FLIGHT_ATTENDANT);
        cabinCrewMember3 = new CabinCrewMember("Lewis", Rank.FLIGHT_ATTENDANT);
        cabinCrewMember4 = new CabinCrewMember("Jordan", Rank.FLIGHT_ATTENDANT);
        cabinCrewMember5 = new CabinCrewMember("Athina", Rank.PURSER);

        passenger1 = new Passenger("Neil", 3, false);
        passenger2 = new Passenger("Morven", 5, false);
        passenger3 = new Passenger("Andrew B.", 0, false);
        passenger4 = new Passenger("Carlos", 1, false);
        passenger5 = new Passenger("Kieran", 2, false);
        passenger6 = new Passenger("Andrew M.", 4, false);
        passenger7 = new Passenger("David", 1, false);
        passenger8 = new Passenger("Iain", 2, false);
        passenger9 = new Passenger("Vinnie", 1, false);
        passenger10 = new Passenger("Lucinda", 3, false);

        pilots = new ArrayList<>();
        cabinCrewMembers = new ArrayList<>();
        passengers = new ArrayList<>();

        flight = new Flight(PlaneType.AIRBUSA320, "FR756", "GLA", "CDG", LocalDateTime.of(2021, 12, 20, 11, 50));
    }

    @Test
    public void hasPilots(){
        flight.addPilot(pilot1);
        flight.addPilot(pilot2);
        assertEquals(2, flight.getNumberOfPilot());
    }

    @Test
    public void hasCabinCrewMembers(){
        flight.addCabinCrewMember(cabinCrewMember1);
        flight.addCabinCrewMember(cabinCrewMember2);
        flight.addCabinCrewMember(cabinCrewMember3);
        flight.addCabinCrewMember(cabinCrewMember4);
        flight.addCabinCrewMember(cabinCrewMember5);
        assertEquals(5, flight.getNumberOfCabinCrewMember());
    }

    @Test
    public void flightStartWithEmptyBookedPassenger(){
        assertEquals(0, flight.getNumberOfPassenger());
    }

    @Test
    public void canBookPassengers(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        flight.addPassenger(passenger5);
        flight.addPassenger(passenger6);
        flight.addPassenger(passenger7);
        flight.addPassenger(passenger8);
        flight.addPassenger(passenger9);
        flight.addPassenger(passenger10);
        assertEquals(10, flight.getNumberOfPassenger());
    }

    @Test
    public void hasPlaneType(){
        assertEquals(PlaneType.AIRBUSA320, flight.getPlaneType());
    }

    @Test
    public void hasFlightNumber(){
        assertEquals("FR756", flight.getFlightNumber());
    }

    @Test
    public void hasDepartureAirport(){
        assertEquals("CDG", flight.getDepartureAirport());
    }

    @Test
    public void hasDestination() {
        assertEquals("GLA", flight.getDestination());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals(LocalDateTime.of(2021, 12, 20, 11, 50), flight.getDepartureTime());
    }

    @Test
    public void hasCapacity(){
        assertEquals(PlaneType.AIRBUSA320.getCapacity(), flight.getCapacity());
    }

    @Test
    public void returnNumberOfSeatsAvailable(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        flight.addPassenger(passenger5);
        flight.addPassenger(passenger6);
        flight.addPassenger(passenger7);
        flight.addPassenger(passenger8);
        flight.addPassenger(passenger9);
        flight.addPassenger(passenger10);
        assertEquals(76, flight.getNumberOfSeatsAvailable());
    }

    @Test
    public void hasFlightStatus(){
        flight.addPassenger(passenger1);
        assertTrue(passenger1.setFlightStatus());
    }

    @Test
    public void hasNumberOfSeats(){
        assertEquals(86, flight.getNumberOfSeats());
    }
}
