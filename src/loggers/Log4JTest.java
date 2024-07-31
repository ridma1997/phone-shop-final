
package loggers;

import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.RollingFileAppender;

public class Log4JTest {

    public static void initLogger() {
        try {
            String path = "F:/MOBSYS/logers/loger.mobsys";
            PatternLayout layout = new PatternLayout("%-3p %-10d %m %L %c %n");
            RollingFileAppender appender = new RollingFileAppender(layout, path);
            appender.setName("loggerdata");
            appender.setMaxFileSize("1MB");
            appender.activateOptions();
            Logger.getRootLogger().addAppender(appender);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
       
    }
    
}
