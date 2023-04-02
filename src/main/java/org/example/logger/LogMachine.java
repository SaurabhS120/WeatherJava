package org.example.logger;

public class LogMachine {
    private Logger logger;
    private Logable[] logables;

    public LogMachine(Logger logger) {
        this.logger = logger;
        this.logables = new Logable[]{};
    }

    public LogMachine(Logger logger, Logable[] logables) {
        this.logger = logger;
        this.logables = logables;
    }

    public void log(Logable logable) {
        logger.log(logable);
    }

    public void logAll() {
        logAll(logables);
    }

    public void logAll(Logable[] logables) {
        for (int i = 0; i < logables.length; i++) {
            log(logables[i]);
        }
    }
}
