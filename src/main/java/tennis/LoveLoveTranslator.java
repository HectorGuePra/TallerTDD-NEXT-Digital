package tennis;

public class LoveLoveTranslator implements ITennisScoreTranslator{
    public boolean applies(int local, int rival){return local == 0 && rival == 0;}
    public String translate(int local, int rival){return "Love-Love";}
}
