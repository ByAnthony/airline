import Human.CabinCrewMember;
import Human.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){ cabinCrewMember = new CabinCrewMember("Beata", Rank.FIRST_OFFICER); }

    @Test
    public void hasName(){ assertEquals("Beata", cabinCrewMember.getName()); }

    @Test
    public void hasRank() { assertEquals(Rank.FIRST_OFFICER, cabinCrewMember.getRank()); }

    @Test
    public void canRelayMessagesToPassenger(){
        assertEquals("Brace for impact", cabinCrewMember.relayMessagesToPassenger());
    }
}
