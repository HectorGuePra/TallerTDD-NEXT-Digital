package tennis;

public class WinTranslator implements ITennisScoreTranslator{

    public boolean applies(int local, int rival){
        return (local >= 4 || rival >=4 ) && Math.abs(local-rival) == 2;
    }

    public String translate(int local, int rival){
        return (local > rival) ? "Player 1 wins" : "Player 2 wins";
    }
}
