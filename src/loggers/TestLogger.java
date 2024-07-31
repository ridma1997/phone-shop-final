
package loggers;

import org.apache.log4j.Logger;

public class TestLogger {
    public static void main(String[] args) {
        Log4JTest.initLogger();
        Logger logger = Logger.getLogger("loggerdata");
        logger.info("Hello_Info");
        logger.debug("Hello_Debug");
        logger.error("Hello_Error");
        logger.fatal("Hello_fatal");
        //logger.trace("Hello_Trace");
        logger.warn("Hello_warn");
        
        
    }
    
}
