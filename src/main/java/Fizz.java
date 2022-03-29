public class Fizz {
    private final String text = "Fizz";
    private final int givenNumber;

    public Fizz(int givenNumber) {
        this.givenNumber = givenNumber;
    }

    public String checkEquivalent() {
        if (isFizz()) return text;
        return new Number(givenNumber).checkEquivalent();
    }

    public boolean isFizz() {
        return givenNumber % 3 == 0;
    }
}
