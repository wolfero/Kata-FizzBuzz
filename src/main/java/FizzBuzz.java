public class FizzBuzz {
    public String checkEquivalent(int givenNumber) {
        if (isFizz(givenNumber)) return "Fizz";
        if (isBuzz(givenNumber)) return "Buzz";
        return Integer.toString(givenNumber);
    }

    private boolean isBuzz(int givenNumber) {
        return givenNumber % 5 == 0;
    }

    private boolean isFizz(int givenNumber) {
        return givenNumber % 3 == 0;
    }
}
