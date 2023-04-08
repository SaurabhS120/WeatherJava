package org.example.logger;

public class ParentLogable implements Logable {
    final String heading;
    final ChildLogable child;

    public ParentLogable(String heading, ChildLogable child) {
        this.heading = heading;
        this.child = child;
    }

    @Override
    public void onLog(Logger logger) {
        logger.logLine("");
        logger.logLine(DefaultLogConfigs.parentLogSeparator);
        logger.logLine(heading);
        logger.logLine(DefaultLogConfigs.parentLogSeparator);
        logger.log(child);
        logger.logLine(DefaultLogConfigs.parentLogSeparator);
    }
}
