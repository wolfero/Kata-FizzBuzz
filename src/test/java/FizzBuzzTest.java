import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void given_number_return_number_in_string_format() {
        fizzBuzz = new FizzBuzz();
        int givenNumber = 1;

        String result = fizzBuzz.checkEquivalent(givenNumber);

        assertThat(result).isEqualTo(equalizingText(givenNumber));
    }

    @Test
    void given_multiple_of_three_return_fizz() {
        fizzBuzz = new FizzBuzz();
        int givenNumber = 3;

        String result = fizzBuzz.checkEquivalent(givenNumber);

        assertThat(result).isEqualTo(equalizingText(givenNumber));
    }

    @Test
    void given_multiple_of_five_return_buzz() {
        fizzBuzz = new FizzBuzz();
        int givenNumber = 5;

        String result = fizzBuzz.checkEquivalent(givenNumber);

        assertThat(result).isEqualTo(equalizingText(givenNumber));
    }

    @Test
    void given_multiple_of_three_and_five_return_fizzbuzz() {
        fizzBuzz = new FizzBuzz();
        int givenNumber = 15;

        String result = fizzBuzz.checkEquivalent(givenNumber);

        assertThat(result).isEqualTo(equalizingText(givenNumber));
    }

    @Test
    void given_one_hundred_numbers_return_equivalent() {
        fizzBuzz = new FizzBuzz();

        for (int givenNumber = 1; givenNumber <= 100; givenNumber++) {

            String result = fizzBuzz.checkEquivalent(givenNumber);

            assertThat(result).isEqualTo(equalizingText(givenNumber));
        }
    }

    private String equalizingText(int number) {
        final String Fizz = "Fizz";
        final String Buzz = "Buzz";
        final String FizBuzz = "FizzBuzz";
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        boolean isFizzBuzz = isFizz && isBuzz;

        if (isFizzBuzz) return FizBuzz;
        if (isFizz) return Fizz;
        if (isBuzz) return Buzz;
        return Integer.toString(number);
    }
}
