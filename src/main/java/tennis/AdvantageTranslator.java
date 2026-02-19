package tennis;

public class AdvantageTranslator implements ITennisScoreTranslator{
    public boolean applies(int local, int rival){
        return (local>=3 && rival>=3) && Math.abs(local - rival)==1;
    }
    public String translate(int local, int rival){
        return (local > rival) ? "Advantage Player 1" : "Advantage Player 2";
    }
}
