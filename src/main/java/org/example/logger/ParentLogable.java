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
        logger.logLine("-------------------------------------------------");
        logger.logLine(heading);
        logger.logLine("-------------------------------------------------");
        logger.log(child);
        logger.logLine("-------------------------------------------------");
    }
}
