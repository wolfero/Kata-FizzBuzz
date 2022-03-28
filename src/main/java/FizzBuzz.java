import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

public class FizzBuzz {
    public List<String> calculate(List<String> givenNumbers) {
        return givenNumbers.stream().map(this::fizzBuzzCheck).toList();
    }

    private String fizzBuzzCheck(String text) {
        boolean isFizz = Integer.parseInt(text) % 3 == 0;
        boolean isBuzz = Integer.parseInt(text) % 5 == 0;
        boolean isFizzBuzz = isFizz && isBuzz;

        if (isFizzBuzz) return "FizzBuzz";
        if (isFizz) return "Fizz";
        if (isBuzz) return "Buzz";
        return text;
    }

    public String printInConsole(List<String> numbers) {
        final var result = new ByteArrayOutputStream();
        System.setOut(new PrintStream(result));
        for (var number : numbers) {
            System.out.print(number);
        }
        return result.toString();
    }
}