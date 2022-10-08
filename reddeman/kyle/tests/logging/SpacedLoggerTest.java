package reddeman.kyle.tests.logging;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.*;
import reddeman.kyle.packages.logging.*;

public class SpacedLoggerTest {
    
    Logger logger;

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Before
    public void setup() { //create new PrintStream to capture System.out.println output.
        logger = new SpacedLogger();
        System.setOut(new PrintStream(outputStreamCaptor));
    }
 
    @Test public void testLog() {
        String expectedString = "T e s t\n";
        logger.log("Test");        Assert.assertEquals(expectedString, outputStreamCaptor.toString());

    }

    @Test 
    public void testError() {
        String expectedString = "ERROR: T e s t\n";
        logger.error("Test");
        Assert.assertEquals(expectedString, outputStreamCaptor.toString());
    }

    @After
    public void afterEach() {
        System.setOut(standardOut);
    }
}
