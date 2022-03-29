public class FizzBuzz {
    private final String text = "FizzBuzz";
    private final int givenNumber;

    public FizzBuzz(int givenNumber) {
        this.givenNumber = givenNumber;
    }

    public String checkEquivalent() {
        if (isFizzBuzz()) return text;
        return new Number(givenNumber).checkEquivalent();
    }

    private boolean isFizzBuzz() {
        Fizz fizz=new Fizz(givenNumber);
        Buzz buzz=new Buzz(givenNumber);
        return (fizz.isFizz()) && (buzz.isBuzz());
    }
}
