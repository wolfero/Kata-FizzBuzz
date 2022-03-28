import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzTest {
    @Test
    void return_given_list_numbers(){
        List<String> givenNumbers = List.of("1", "2");
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertThat(fizzBuzz.calculate(givenNumbers)).isEqualTo(givenNumbers);
    }

    @Test
    void given_list_numbers_get_fizz_on_multiples_of_three(){
        List<String> givenNumbers = List.of("1", "2","3");
        List<String> expectedNumbers = List.of("1", "2","Fizz");
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.calculate(givenNumbers)).isEqualTo(expectedNumbers);
    }
}
