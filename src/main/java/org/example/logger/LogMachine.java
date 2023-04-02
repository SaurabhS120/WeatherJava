package org.example.logger;

public class LogMachine {
    private Logger logger;

    public LogMachine(Logger logger) {
        this.logger = logger;
    }

    public void log(Logable logable) {
        logger.log(logable);
    }

    public void logAll(Logable[] logables) {
        for (int i = 0; i < logables.length; i++) {
            log(logables[i]);
        }
    }
}
