package Task_5.logger;

public final class InterestCalculator {
	private InterestCalculator() {}
	
	public static double calculateSimpleInterest(double principalAmount, double timeInYears, double annualRate) throws NegativeValuesException{
		
		if(principalAmount < 0)
			throw new NegativeValuesException("Principal");
		if(timeInYears < 0)
			throw new NegativeValuesException("Time");
		if(annualRate < 0)
			throw new NegativeValuesException("Rate");
		
		double result = (principalAmount*timeInYears*annualRate)/100;
		
		ILogger.LOGGER.debug("Principal : " + principalAmount + " Time : " + timeInYears + " Rate : " + annualRate);
		ILogger.LOGGER.debug("Result : " + result);
		
		return result;
	}
	
	
	public static double calculateCompoundInterest(double principalAmount, double timeInYears, double annualRate) throws NegativeValuesException {
		
		if(principalAmount < 0)
			throw new NegativeValuesException("Compound Principal");
		if(timeInYears < 0)
			throw new NegativeValuesException("Compound Time");
		if(annualRate < 0)
			throw new NegativeValuesException("Compound Rate");
		
		double result = Math.floor(principalAmount*Math.pow(1+(annualRate/100.00), timeInYears));
		result -= principalAmount;
		
		ILogger.LOGGER.debug("Principal : " + principalAmount + " Time : " + timeInYears + " Rate : " + annualRate);
		ILogger.LOGGER.debug("Result : " + result);
		
		return result;
	}
}