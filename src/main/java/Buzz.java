public class Buzz {
    private final String text="Buzz";
    private final int givenNumber;

    public Buzz(int givenNumber) {
        this.givenNumber = givenNumber;
    }

    public String checkEquivalent() {
        if(givenNumber%5==0)return text;
        return new Number(givenNumber).checkEquivalent();
    }
}
