package Human;

public class Passenger extends Person {

    private int numberOfBags;
    private boolean flight;
    private int seat;

    public Passenger(String name, int numberOfBags, boolean flight) {
        super(name);
        this.numberOfBags = numberOfBags;
        this.flight = flight;
    }

    public int getNumberOfBags(){
        return numberOfBags;
    }

    public boolean getFlightStatus(){ return flight; }

    public boolean setFlightStatus(){ return true; }

    public int setSeatNumber(int randomSeat) { return randomSeat; }
}
