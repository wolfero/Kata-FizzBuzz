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

    @Test
    void given_multiple_of_three_and_five_return_fizzbuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.checkEquivalent(15);

        assertThat(result).isEqualTo("FizzBuzz");
    }

    @Test
    void given_one_hundred_numbers_return_equivalent(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        for (int number = 1; number <= 100; number++) {

            String result = fizzBuzz.checkEquivalent(number);

            assertThat(result).isEqualTo(equalizingText(number));
        }
    }

    private String equalizingText(int number){
        final String Fizz="Fizz";
        final String Buzz="Buzz";
        final String FizBuzz="FizzBuzz";
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        boolean isFizzBuzz = isFizz && isBuzz;

        if (isFizzBuzz) return FizBuzz;
        if(isFizz)return Fizz;
        if(isBuzz)return Buzz;
        return Integer.toString(number);
    }
}
