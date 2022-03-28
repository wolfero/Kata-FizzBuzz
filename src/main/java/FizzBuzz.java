import java.util.List;

public class FizzBuzz {
    public List<String> calculate(List<String> givenNumbers){
        return givenNumbers.stream().map(this::fizzBuzzCheck).toList();
    }

    private String fizzBuzzCheck(String text) {
        boolean isFizz = Integer.parseInt(text) % 3 == 0;
        boolean isBuzz = Integer.parseInt(text) % 5 == 0;

        if (isFizz) return "Fizz";
        if (isBuzz) return "Buzz";
        return text;
    }
}