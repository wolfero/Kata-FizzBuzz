import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzTest {
    @Test
    void given_number_return_number_in_string_format() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.checkEquivalent(1);

        assertThat(result).isEqualTo("1");
    }
}
