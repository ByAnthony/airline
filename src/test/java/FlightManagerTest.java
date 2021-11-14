import Human.CabinCrewMember;
import Human.Passenger;
import Human.Pilot;
import Human.Rank;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
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
        flightManager = new FlightManager(flight);
    }

    @Test
    public void hasWeightReservedPerPassenger(){
        assertEquals(174.4, flightManager.getWeightReservedPerPassenger(), 0.1);
    }

    @Test
    public void hasBaggageWeight(){
        flight.addPassenger(passenger4);
        flight.addPassenger(passenger5);
        flight.addPassenger(passenger6);
        assertEquals(70.0, flightManager.getBaggageWeight(), 0.1);
    }

    @Test
    public void hasRemainingWeight(){
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
        assertEquals(14780.0, flightManager.getRemainingWeight(), 0.1);
    }
}
