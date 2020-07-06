package Task_5.logger;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Task_5.logger.ConstructionCostCalculator;
import Task_5.logger.NegativeValuesException;

public class ConstructionCostTest {
	
	@Test
	public void testConstructionCostStandard() throws NegativeValuesException {
		assertEquals(1200.00,ConstructionCostCalculator.calculateConstructionCost("standard", 1, false), 0.01);
	}
	
	@Test
	public void testConstructionCostHighStandard() throws NegativeValuesException {
		assertEquals(360000.00,ConstructionCostCalculator.calculateConstructionCost("high standard", 200, false), 0.01);
	}
	
	@Test
	public void testConstructionCostAboveStandard() throws NegativeValuesException {
		assertEquals(150000.00,ConstructionCostCalculator.calculateConstructionCost("above standard", 100, false), 0.01);
	}
	
	@Test
	public void testConstructionCostHighStandardAutomated() throws NegativeValuesException {
		assertEquals(250000.00,ConstructionCostCalculator.calculateConstructionCost("high standard", 100, true), 0.01);
	}
	
	@Test
	public void testConstructionCostInvalidStandard() throws NegativeValuesException {
		assertEquals(-1,ConstructionCostCalculator.calculateConstructionCost("high", 100, true), 0.01);
	}
	
	@Test
	public void testConstructionNegative() throws NegativeValuesException {
		try {
			assertEquals(100.00,ConstructionCostCalculator.calculateConstructionCost("high standard", -200, false), 0.01);			
		}catch(NegativeValuesException ex) {
			assertEquals("Area", ex.getMessage());
		}
	}
	
}