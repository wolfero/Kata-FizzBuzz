import java.util.List;

public class FizzBuzz {
    public List<String> calculate(List<String> givenNumbers){
        return givenNumbers.stream().map(n->(Integer.parseInt(n)%3==0)?"Fizz":n).toList();
    }
}