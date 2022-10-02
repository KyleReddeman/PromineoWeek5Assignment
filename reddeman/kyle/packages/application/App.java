package reddeman.kyle.packages.application;

import reddeman.kyle.packages.logging.*;

public class App {
    public static void main(String[] args) {
        Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();
        asteriskLogger.log("Asterisk");
        System.out.println();
        asteriskLogger.error("Asterisk");
        System.out.println();
        spacedLogger.log("Spaced");
        System.out.println();
        spacedLogger.error("Spaced");
    }
}
