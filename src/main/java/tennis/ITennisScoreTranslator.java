package tennis;

public interface ITennisScoreTranslator {
    boolean applies(int local, int rival);
    String translate(int local, int rival);
}
