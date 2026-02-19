package tennis;

public class PointsTranslator {

    private static final String[] SCORES_NAMES={"Love","Fifteen","Thirty","Forty"};
    public String translate(int local, int rival){
        if(local==0 && rival ==0){
            return SCORES_NAMES[local] + "-" +SCORES_NAMES[rival];
        }
        if(local+rival>=6){
            if(local==rival){
                return "Deuce";
            }
            if(local > rival){
                return "Advantage Player 1";
            }
            else{
                return "Advantage Player 2";
            }
        }
        if(local==rival){
            return SCORES_NAMES[local] + "-" + "All";
        }

        else{
            return SCORES_NAMES[local] + "-" + SCORES_NAMES[rival];
        }

    }
}
