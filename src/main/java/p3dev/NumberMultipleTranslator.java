package p3dev;

public class NumberMultipleTranslator {

    public String translate(int number) {
        if (number == 0) return new OtherCasesTranslator().translate(number);
        if (number % 15 == 0) return
            new MultipleOfThreeTranslator().translate(number) +
                new MultipleOfFiveTranslator().translate(number);

        if (number % 5 == 0) return new MultipleOfFiveTranslator().translate(number);
        if (number % 3 == 0) return new MultipleOfThreeTranslator().translate(number);
        return new OtherCasesTranslator().translate(number);
    }
}
