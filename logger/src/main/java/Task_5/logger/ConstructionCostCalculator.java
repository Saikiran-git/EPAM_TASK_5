package Task_5.logger;

public class ConstructionCostCalculator {
	private ConstructionCostCalculator() {}
	
	public static double calculateConstructionCost(String standard, double area, boolean automatedHouse) throws NegativeValuesException {
		
		standard = standard.toLowerCase();
		if(area < 0)
			throw new NegativeValuesException("Area");
		
		if(standard.equals("standard")) {	
			ILogger.LOGGER.debug("Standard materials and area : " + area);
			return area*1200;
		}else if(standard.equals("above standard")) {
			ILogger.LOGGER.debug("above Standard materials and area : " + area);
			return area*1500;
		}else if(standard.equals("high standard") && !automatedHouse) {
			ILogger.LOGGER.debug("High Standard materials and area : " + area);
			return area*1800;
		}else if(standard.equals("high standard") && automatedHouse) {
			ILogger.LOGGER.debug("High Standard materials, automated house and area : " + area);
			return area*2500;
		}
		
		return -1;
	}
}
