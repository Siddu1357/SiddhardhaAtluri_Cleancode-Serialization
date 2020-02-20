package org.HomeTask.Task4;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestHouseCost {

	HouseCost hc = new HouseCost();
	 @Test
	    public void testCalculation() {
			assertEquals(3000000, hc.Cost("Standard Materials", 2500, "Fully Automated Home"));
			assertEquals(3000000, hc.Cost("Standard Materials", 2500, "Not Fully Automated Home"));
			assertEquals(4500000, hc.Cost("High Standard Materials", 2500, "Not Fully Automated Home"));
			assertEquals(6250000, hc.Cost("High Standard Materials", 2500, "Fully Automated Home"));
			assertEquals(3750000, hc.Cost("Above Standard Materials", 2500, "Fully Automated Home"));
			assertEquals(3750000, hc.Cost("Above Standard Materials", 2500, "Not Fully Automated Home"));	
		}

}
