package tennis;

import java.util.Arrays;
import java.util.List;

public class PointsTranslator {
    private final List<ITennisScoreTranslator> translators;
    private static final String[] NAMES = {"Love", "Fifteen", "Thirty", "Forty"};

    public PointsTranslator() {
        this.translators = Arrays.asList(
                new WinTranslator(),
                new AdvantageTranslator(),
                new DeuceTranslator(),
                new LoveLoveTranslator(),
                new EqualityTranslator()
        );
    }

    public String translate(int local, int rival) {
        for (ITennisScoreTranslator t : translators) {
            if (t.applies(local, rival)) {
                return t.translate(local, rival);
            }
        }
        return NAMES[local] + "-" + NAMES[rival];
    }
}
