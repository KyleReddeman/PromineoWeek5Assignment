package reddeman.kyle.packages.logging;

public class AsteriskLogger implements Logger {

    @Override
    public void error(String error) {
        int lineLength = error.length() + 13;
        String starLine = "";
        for(int i = 0; i < lineLength; i++ ) {
            starLine += "*";
        }
        System.out.println(starLine);
        log("ERROR: " + error);
        System.out.println(starLine);
    }

    @Override
    public void log(String log) {
        System.out.println("***" + log + "***");
    }
}