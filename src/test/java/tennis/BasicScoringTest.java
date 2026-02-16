package tennis;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static junit.framework.Assert.assertEquals;

public class BasicScoringTest {



    @Test
    void shouldReturnLoveLove_OnStart() {

        int local = 0;
        int rival = 0;
        PointsTranslator translator = new PointsTranslator();

        String result = translator.translate(local,rival);

        assertEquals("Love-Love",result);
    }

    @Test
    void testPlayerOneScoresOnce_ShouldBeFifteenLove(){
        int local = 1;
        int rival = 0;
        PointsTranslator translator = new PointsTranslator();

        String result = translator.translate(local,rival);

        assertEquals("Fifteen-Love", result);
    }
    @Test
    void testPlayerTwoScoresOnce_ShouldBeLoveFifteen(){
        int local = 0;
        int rival = 1;
        PointsTranslator translator = new PointsTranslator();

        String result = translator.translate(local,rival);

        assertEquals("Love-Fifteen", result);
    }

}
