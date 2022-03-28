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
}
