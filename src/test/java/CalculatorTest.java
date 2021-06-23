import com.codecool.junitsample.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void Setup() {
        Calculator calculator = new Calculator();
    }
    @Test
    public void TestAdd(){
        Calculator cal1 = new Calculator();
        Assertions.assertEquals(3, cal1.Add(1,2));
    }


}


