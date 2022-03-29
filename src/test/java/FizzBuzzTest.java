import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzTest {
    @Test
    void given_number_return_number_in_string_format() {
        Number number = new Number(1);

        String result = number.numberToString();

        assertThat(result).isEqualTo("1");
    }

    @Test
    void given_multiple_of_three_return_fizz() {
        Fizz fizz = new Fizz(3);

        String result = fizz.checkEquivalent();

        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    void given_multiple_of_five_return_buzz() {
        Buzz buzz = new Buzz(5);

        String result = buzz.checkEquivalent();

        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    void given_multiple_of_three_and_five_return_fizzbuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz(15);

        String result = fizzBuzz.checkEquivalent();

        assertThat(result).isEqualTo("FizzBuzz");
    }

    @Test
    void given_one_hundred_numbers_return_equivalent() {
        for (int number = 1; number <= 100; number++) {

            String result = selectCorrectObject(number);

            assertThat(result).isEqualTo(equalizingText(number));
        }
    }

    private String equalizingText(int givenNumber) {
        FizzBuzz fizzBuzz = new FizzBuzz(givenNumber);
        Fizz fizz = new Fizz(givenNumber);
        Buzz buzz = new Buzz(givenNumber);

        if (fizzBuzz.isFizzBuzz()) return fizzBuzz.getText();
        if (fizz.isFizz()) return fizz.getText();
        if (buzz.isBuzz()) return buzz.getText();
        return Integer.toString(givenNumber);
    }


    private String selectCorrectObject(int givenNumber) {
        FizzBuzz fizzBuzz = new FizzBuzz(givenNumber);
        Fizz fizz = new Fizz(givenNumber);
        Buzz buzz = new Buzz(givenNumber);

        if (fizzBuzz.isFizzBuzz()) return fizzBuzz.checkEquivalent();
        if (fizz.isFizz()) return fizz.checkEquivalent();
        if (buzz.isBuzz()) return buzz.checkEquivalent();
        return new Number(givenNumber).numberToString();
    }
}
