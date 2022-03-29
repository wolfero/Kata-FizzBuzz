public class FizzBuzz {
    private final String text="FizzBuzz";
    private final int givenNumber;

    public FizzBuzz(int givenNumber) {
        this.givenNumber = givenNumber;
    }

    public String checkEquivalent() {
        if((givenNumber%3==0)&&(givenNumber%5==0))return text;
        return new Number(givenNumber).checkEquivalent();
    }
}
