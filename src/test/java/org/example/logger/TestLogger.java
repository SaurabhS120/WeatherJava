package org.example.logger;

import java.util.Iterator;
import java.util.LinkedList;

public class TestLogger implements Logger {
    private LinkedList<String> logs = new LinkedList<String>();

    @Override
    public void log(Logable logable) {
        logable.onLog(this);
    }

    @Override
    public void logLine(String line) {
        logs.add(line);
    }

    String[] getResult() {
        Iterator<String> iterator = logs.iterator();
        String[] logArray = new String[logs.size()];
        int i = 0;
        while (iterator.hasNext()) {
            logArray[i] = iterator.next();
            i++;
        }
        return logArray;
    }

    void logCurrentResult() {
        System.out.print("new String[]{");
        for (String log : logs) {
            if (log == DefaultLogConfigs.parentLogSeparator) {
                System.out.print("DefaultLogConfigs.parentLogSeparator,");
            } else {
                System.out.print("\"" + log + "\",");
            }
        }
        System.out.print("}");
    }
}
