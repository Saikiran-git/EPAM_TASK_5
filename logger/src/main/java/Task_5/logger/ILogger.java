package Task_5.logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class ILogger {
    public static final Logger LOGGER;
    
    private ILogger() {}
    
    static {
    	LOGGER = Logger.getLogger(ConstructionCostCalculator.class);
        BasicConfigurator.configure();
    }
}