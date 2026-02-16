package tennis;

public class PointsTranslator {

    public String translate(int local, int rival){
        String result = "";
        if(local==0 && rival==0){
            return "Love-Love";
        }
        if(local==1 && rival==0){
            return "Fifteen-Love";
        }
        if(local==0 && rival==1){
            return "Love-Fifteen";
        }

        return result;
    }
}
