import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzTest {
    @Test
    void given_number_return_number_in_string_format() {
        Number number = new Number(1);

        String result = number.checkEquivalent();

        assertThat(result).isEqualTo("1");
    }
}
