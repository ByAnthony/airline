import Human.Pilot;
import Human.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){ pilot = new Pilot("Wellington", Rank.CAPTAIN, "FLY2SKY"); }

    @Test
    public void hasName(){ assertEquals("Wellington", pilot.getName()); }

    @Test
    public void hasRank(){ assertEquals(Rank.CAPTAIN, pilot.getRank()); }

    @Test
    public void hasPilotLicenceNo(){ assertEquals("FLY2SKY", pilot.getPilotLicenceNo()); }

    @Test
    public void canFlyThePlane(){
        assertEquals("Ready to take off", pilot.readyToTakeOff());
    }
}
