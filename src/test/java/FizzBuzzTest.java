import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzTest {

    @Test
    void given_number_return_number_in_string_format() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.checkEquivalent(1);

        assertThat(result).isEqualTo("1");
    }

    @Test
    void given_multiple_of_three_return_fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.checkEquivalent(3);

        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    void given_multiple_of_five_return_buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.checkEquivalent(5);

        assertThat(result).isEqualTo("Buzz");
    }
}
