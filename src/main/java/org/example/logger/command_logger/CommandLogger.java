package org.example.logger.command_logger;

import org.example.logger.Logable;
import org.example.logger.Logger;

public class CommandLogger implements Logger {

    @Override
    public void log(Logable logable) {
        logable.onLog(this);
    }

    @Override
    public void logLine(String line) {
        System.out.println(line);
    }


}
