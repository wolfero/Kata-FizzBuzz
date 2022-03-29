import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzTest {
    @Test
    void given_number_return_number_in_string_format() {
        Number number = new Number(1);

        String result = number.checkEquivalent();

        assertThat(result).isEqualTo("1");
    }

    @Test
    void given_multiple_of_three_return_fizz(){
        Fizz fizz = new Fizz(3);

        String result = fizz.checkEquivalent();

        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    void given_multiple_of_five_return_buzz(){
        Buzz buzz = new Buzz(5);

        String result = buzz.checkEquivalent();

        assertThat(result).isEqualTo("Buzz");
    }
}
