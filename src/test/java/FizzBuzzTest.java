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
    void given_multiple_of_three_and_five_return_fizzbuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz(15);

        String result = fizzBuzz.checkEquivalent();

        assertThat(result).isEqualTo("FizzBuzz");
    }

    @Test
    void given_one_hundred_numbers_return_equivalent(){
        for (int number = 1; number <= 100; number++) {

            String result = selectCorrectObject(number);

            assertThat(result).isEqualTo(equalizingText(number));
        }
    }

    private String equalizingText(int givenNumber){
        final String Fizz="Fizz";
        final String Buzz="Buzz";
        final String FizBuzz="FizzBuzz";
        boolean isFizz = givenNumber % 3 == 0;
        boolean isBuzz = givenNumber % 5 == 0;
        boolean isFizzBuzz = isFizz && isBuzz;

        if (isFizzBuzz) return FizBuzz;
        if(isFizz)return Fizz;
        if(isBuzz)return Buzz;
        return Integer.toString(givenNumber);
    }


    private String selectCorrectObject(int givenNumber){
        boolean isFizz = givenNumber % 3 == 0;
        boolean isBuzz = givenNumber % 5 == 0;
        boolean isFizzBuzz = isFizz && isBuzz;

        if (isFizzBuzz) return new FizzBuzz(givenNumber).checkEquivalent();
        if(isFizz)return new Fizz(givenNumber).checkEquivalent();
        if(isBuzz)return new Buzz(givenNumber).checkEquivalent();
        return new Number(givenNumber).checkEquivalent();
    }
}
