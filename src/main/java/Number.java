public class Number {
    private final int givenNumber;

    public Number(int givenNumber) {
        this.givenNumber = givenNumber;
    }

    public String checkEquivalent() {
        return Integer.toString(givenNumber);
    }
}
