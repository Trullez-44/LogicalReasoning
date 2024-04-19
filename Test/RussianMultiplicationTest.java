import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RussianMultiplicationTest {

    @Test
    public void testOperation() {
        int multiplicador1 = 7;
        int multiplicando1 = 5;
        int expectedResult1 = multiplicador1 * multiplicando1;
        assertEquals(expectedResult1, RussianMultiplication.operation(multiplicador1, multiplicando1));


        int multiplicador2 = 10;
        int multiplicando2 = -4;
        int expectedResult2 = multiplicador2 * multiplicando2;
        assertEquals(expectedResult2, RussianMultiplication.operation(multiplicador2, multiplicando2));


        int multiplicador4 = -3;
        int multiplicando4 = -9;
        int expectedResult4 = multiplicador4 * multiplicando4;
        assertEquals(expectedResult4, RussianMultiplication.operation(multiplicador4, multiplicando4));


        int multiplicador5 = 0;
        int multiplicando5 = 100;
        int expectedResult5 = multiplicador5 * multiplicando5;
        assertEquals(expectedResult5, RussianMultiplication.operation(multiplicador5, multiplicando5));

    }
}
