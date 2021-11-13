package Human;

import Human.Person;
import Human.Rank;

public class CabinCrewMember extends Person {

    private Rank rank;

    public CabinCrewMember(String name, Rank rank){
        super(name);
        this.rank = rank;
    }

    public Rank getRank(){ return rank; }

    public String relayMessagesToPassenger(){
        return "Brace for impact";
    }
}
