package tennis;

public class DeuceTranslator implements ITennisScoreTranslator{
    public boolean applies(int local, int rival) {return local==rival && local>=3;}
    public String translate(int local, int rival) {return "Deuce";}
}
