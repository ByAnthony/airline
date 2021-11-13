import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.AIRBUSA320);
    }

    @Test
    public void hasType(){
        assertEquals(PlaneType.AIRBUSA320, plane.getType());
    }

    @Test
    public void hasCapacity(){ assertEquals(86, plane.getCapacity()); }

    @Test
    public void hasTotalWeight(){ assertEquals(30000, plane.getTotalWeight(), 0.0); }
}
