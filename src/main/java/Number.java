public class Number {
    private final int givenNumber;

    public Number(int givenNumber) {
        this.givenNumber = givenNumber;
    }

    public String numberToString() {
        return Integer.toString(givenNumber);
    }
}
