public class FlightManager {

    private Flight flight;
    private double totalWeight;

    public FlightManager(Flight flight){
        this.flight = flight;
    }

    public double getWeightReservedPerPassenger(){
        return (flight.getTotalWeight() / 2) / flight.getCapacity();
    }

    public double getBaggageWeight() {
        totalWeight = 0;
        flight.getPassengers().forEach(passenger -> totalWeight += (passenger.getNumberOfBags() * 10));
        return totalWeight;
    }

    public double getRemainingWeight() {
        return (flight.getTotalWeight() / 2) - this.getBaggageWeight();
    }
}
