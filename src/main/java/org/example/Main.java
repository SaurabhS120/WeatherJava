package org.example;

import org.example.logger.*;
import org.example.logger.command_logger.CommandLogger;

public class Main {
    public static void main(String[] args) {
        new LogMachine(new CommandLogger()).logAll(new Logable[]{
                new ParentLogable(
                        "Weather list",
                        new MultilineChildLogable(new ChildLogable[]{
                                new Weather("Mumbai", 30),
                                new Weather("Pune", 40),
                                new Weather("Bangalore", 12),
                                new Weather("Delhi", 25),
                        })
                )
        });
    }
}