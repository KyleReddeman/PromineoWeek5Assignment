package reddeman.kyle.packages.application;

import reddeman.kyle.packages.logging.*;

public class App {
    public static void main(String[] args) {
        Logger logger = new AsteriskLogger();

        logger.log("Asterisk");
        System.out.println();
        logger.error("Asterisk");
        System.out.println();

        logger = new SpacedLogger();
        
        logger.log("Spaced");
        System.out.println();
        logger.error("Spaced");
    }
}
