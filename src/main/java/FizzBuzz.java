public class FizzBuzz {
    public String checkEquivalent(int givenNumber) {
        if(givenNumber % 3 == 0)return "Fizz";
        if (givenNumber % 5 == 0) return "Buzz";
        return Integer.toString(givenNumber) ;
    }
}
