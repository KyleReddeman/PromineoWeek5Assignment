package reddeman.kyle.tests.logging;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.*;
import reddeman.kyle.packages.logging.*;

public class AsteriskLoggerTest {
    
    Logger logger;

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Before
    public void setup() { //create new PrintStream to capture System.out.println output.
        logger = new AsteriskLogger();
        System.setOut(new PrintStream(outputStreamCaptor));
    }
 
    @Test public void testLog() {
        String expectedString = "***Test***\n";
        logger.log("Test");
        Assert.assertEquals(expectedString, outputStreamCaptor.toString());
    }

    @Test 
    public void testError() {
        String expectedString = "*****************\n***ERROR: Test***\n*****************\n";
        logger.error("Test");
        Assert.assertEquals(expectedString, outputStreamCaptor.toString());
    }

    @After
    public void tearDown() {
        System.setOut(standardOut);
    }
}
