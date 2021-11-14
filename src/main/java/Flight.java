import Human.CabinCrewMember;
import Human.Passenger;
import Human.Pilot;

import java.util.ArrayList;
import java.time.LocalDateTime;

public class Flight{

    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private PlaneType planeType;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private LocalDateTime departureTime;

    public Flight(PlaneType planeType, String flightNumber, String destination, String departureAirport, LocalDateTime departureTime) {
        this.pilots = new ArrayList<>();
        this.cabinCrewMembers = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.planeType = planeType;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public int getNumberOfPilot() {
        return pilots.size();
    }

    public void addPilot(Pilot pilot) {
        pilots.add(pilot);
    }

    public int getNumberOfCabinCrewMember() {
        return cabinCrewMembers.size();
    }

    public void addCabinCrewMember(CabinCrewMember cabinCrewMember) {
        cabinCrewMembers.add(cabinCrewMember);
    }

    public int getNumberOfPassenger() {
        return passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        if(this.getNumberOfSeatsAvailable() > 0) {
            passengers.add(passenger);
        }
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public PlaneType getPlaneType(){
        return planeType;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public int getCapacity(){
        return planeType.getCapacity();
    }

    public double getTotalWeight(){
        return planeType.getTotalWeight();
    }

    public int getNumberOfSeatsAvailable(){
        return this.getCapacity() - this.getNumberOfPassenger();
    }

}
