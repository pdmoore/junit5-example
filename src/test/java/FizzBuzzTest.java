import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FizzBuzzTest {

    @Test
    public void Number_NotDivisibleBy_3or5_ReturnsNumber() {
        assertEquals("1", Fizzbuzz.of(1));
    }

    @ParameterizedTest(name = "{0} should return 'Fizz'")
    @CsvSource({"3", "99"})
    public void Number_DivisibleBy3_ReturnsFizz(int value) {
        assertEquals("Fizz", Fizzbuzz.of(value));
    }

    @Test
    public void Number_OutsideRange_1to100_NotSupported() {
        IllegalArgumentException expected =
                assertThrows(IllegalArgumentException.class,
                        () -> { Fizzbuzz.of(0); } );
        assertEquals("Number must be within 1 to 100", expected.getMessage());
    }
}
