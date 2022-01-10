import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void validUserInput() {
       String userInput = String.format("*%s3%s5",
               System.lineSeparator(),
               System.lineSeparator());
        ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);

        double result_test = Calculator.main();

        Assertions.assertEquals(15.0, result_test);
    }
}