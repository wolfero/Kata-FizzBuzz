import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void given_list_numbers_get_fizz_on_multiples_of_three() {
        fizzBuzz = new FizzBuzz();
        List<String> givenNumbers = List.of("1", "2", "3");
        List<String> expectedNumbers = List.of("1", "2", "Fizz");

        List<String> result = fizzBuzz.calculate(givenNumbers);

        assertThat(result).isEqualTo(expectedNumbers);
    }

    @Test
    void given_list_numbers_get_buzz_on_multiples_of_five() {
        fizzBuzz = new FizzBuzz();
        List<String> givenNumbers = List.of("1", "2", "5");

        List<String> expectedNumbers = List.of("1", "2", "Buzz");

        List<String> result = fizzBuzz.calculate(givenNumbers);

        assertThat(result).isEqualTo(expectedNumbers);
    }

    @Test
    void given_list_numbers_get_fizzbuzz_on_multiples_of_three_and_five() {
        fizzBuzz = new FizzBuzz();
        List<String> givenNumbers = List.of("1", "2", "3", "5", "15");
        List<String> expectedNumbers = List.of("1", "2", "Fizz", "Buzz", "FizzBuzz");


        List<String> result = fizzBuzz.calculate(givenNumbers);

        assertThat(result).isEqualTo(expectedNumbers);
    }

    @Test
    void given_number_of_repetition() {
        List<String> givenNumbers = List.of("1", "2", "3", "4", "5", "6", "7", "15");
        List<String> expectedNumbers = List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "FizzBuzz");

        List<String> result = fizzBuzz.calculate(givenNumbers);
        String printedOutput = fizzBuzz.printInConsole(result);

        assertThat(printedOutput).isEqualTo(String.join("", expectedNumbers));
    }
}
