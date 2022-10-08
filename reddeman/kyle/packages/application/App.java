package reddeman.kyle.packages.application;

import reddeman.kyle.packages.logging.*;

public class App {
    public static void main(String[] args) {
        Logger logger = new AsteriskLogger();

        logger.log("Test");
        System.out.println();
        logger.error("Test");
        System.out.println();

        logger = new SpacedLogger();
        
        logger.log("Test");
        System.out.println();
        logger.error("Test");
    }
}
