
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

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
    public void Number_Beyond100_NotSupported() {
        IllegalArgumentException expected =
                assertThrows(IllegalArgumentException.class,
                        () -> { Fizzbuzz.of(101); } );
        assertEquals("Number must be within 1 to 100", expected.getMessage());
    }

    @Test
    @Disabled("Ask PO how to best handle this")
    public void NegativeNumber() {
        fail("unknown behavior");
    }

    @Test
    public void Verify_TrainerContactInfo() {
        Contacts.Info actual = Contacts.get("Paul");
        assertAll("Should return full contact info",
                () -> assertEquals("Paul", actual.getFirstName()),
                () -> assertEquals("Moore", actual.getLastName()),
                () -> assertEquals("@pdmoore", actual.getTwitterHandle())
        );
    }
}
