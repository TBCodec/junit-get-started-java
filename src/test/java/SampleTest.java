import com.codecool.junitsample.Sample;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class SampleTest {

    Boolean testBoolean;

    private Sample sample;
    static final Logger logger = Logger.getLogger(SampleTest.class.getName());

    @BeforeEach
    public void Setup(TestInfo testInfo, TestReporter testReporter ) {
        logger.info(() -> String.format("About to execute [%s]",
                testInfo.getDisplayName()));
        this.sample = new Sample();
    }

    @RepeatedTest(5)
    public void TestDubleANumber() {
        Assertions.assertEquals(6, sample.DoubleANumber(3));
    }

    @Test
    @Disabled
    public void TestNotExecuted() {
    }

    @Test
    public void TestGetBooleanFalse() {
        testBoolean = sample.GetBoolean("Codecol");
        Assertions.assertFalse(testBoolean);
    }

    @Test
    public void TestGetBooleanTrue() {
        testBoolean = sample.GetBoolean("Codecool");
        Assertions.assertTrue(testBoolean);
    }

    @Test
    public void TestDoSomething() throws IllegalAccessException {
        try {
            sample.DoSomething("Codecool");
        } catch (Exception e) {
            fail("Should not throw exception");
        }

        //Így is lehet:
        //assertDoesNotThrow(() -> sample.DoSomething("Codecool"));

    }
    @Test
    public void TestDoSomethingException() throws IllegalAccessException {
        assertThrows(IllegalArgumentException.class, () -> sample.DoSomething("Not Codecool"));
    }

    @Test
    //@Timeout(value = 800, unit = TimeUnit.MICROSECONDS)
    public void TestTimeout() {
        Assertions.assertEquals(6, sample.DoubleANumber(3));
        assertTimeout(Duration.ofMillis(50), () -> sample.DoubleANumber(8));
        //TestDubleANumber();
    }
}
