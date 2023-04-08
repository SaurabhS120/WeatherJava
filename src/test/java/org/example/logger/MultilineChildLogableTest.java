package org.example.logger;

import org.example.Weather;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MultilineChildLogableTest {

    @Test
    void multilineChildLogableTest() {
        MultilineChildLogable multilineChildLogable = new MultilineChildLogable(new ChildLogable[]{
                new Weather()
        });
        TestLogger testLogger = new TestLogger();
        LogMachine logMachine = new LogMachine(testLogger, new ParentLogable[]{new ParentLogable("test", multilineChildLogable)});
        logMachine.logAll();
        assertArrayEquals(new String[]{"", DefaultLogConfigs.parentLogSeparator, "test", DefaultLogConfigs.parentLogSeparator, "Temperature in  : 0", DefaultLogConfigs.parentLogSeparator,}, testLogger.getResult());

    }

}
