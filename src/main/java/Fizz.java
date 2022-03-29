public class Fizz {
    private final String text="Fizz";
    private final int givenNumber;

    public Fizz(int givenNumber) {
        this.givenNumber = givenNumber;
    }

    public String checkEquivalent(){
        if(givenNumber%3==0) return text;
        return new Number(givenNumber).checkEquivalent();
    }
}
