package Human;

public class Pilot extends CabinCrewMember {

    private String pilotLicenceNo;

    public Pilot(String name, Rank rank, String pilotLicenceNo){
        super(name, rank);
        this.pilotLicenceNo = pilotLicenceNo;
    }

    public String getPilotLicenceNo(){ return pilotLicenceNo; }

    public String readyToTakeOff(){
        return "Ready to take off";
    }
}
