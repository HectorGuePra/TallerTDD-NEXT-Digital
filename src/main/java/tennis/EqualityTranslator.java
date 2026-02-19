package tennis;

public class EqualityTranslator implements ITennisScoreTranslator{
    private static final String[] NAMES = {"Love-All", "Fifteen-All", "Thirty-All"};
    public boolean applies(int local, int rival){
        return local == rival && local < 3;
    }
    public String translate(int local, int rival){
        return NAMES[local];
    }
}

