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
        if(local==1 && rival==1){
            return "Fifteen-All";
        }
        if(local==2 && rival==0){
            return "Thirty-Love";
        }
        if(local==0 && rival==2){
            return "Love-Thirty";
        }

        return result;
    }
}
