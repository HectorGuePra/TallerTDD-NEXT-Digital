package p3dev;

public class MultipleOfThreeTranslator implements INumberMultipleTranslator {
    @Override
    public boolean applies(int number) {
        return false;
    }

    @Override
    public String translate(int number) {
        if (!applies(number)) throw new IllegalArgumentException("Number must be a multiple of 3");
        return "Fizz";
    }
}
