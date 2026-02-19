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
    @Test
    void testBothPlayersScoreOnce_ShouldBeFifteenAll(){
        int local = 1;
        int rival = 1;
        PointsTranslator translator = new PointsTranslator();

        String result = translator.translate(local,rival);

        assertEquals("Fifteen-All", result);
    }

    @Test
    void testPlayerOneScoresTwice_ShouldBeThirtyLove(){
        int local = 2;
        int rival = 0;
        PointsTranslator translator = new PointsTranslator();

        String result = translator.translate(local,rival);

        assertEquals("Thirty-Love", result);
    }

    @Test
    void testPlayerTwoScoresTwice_ShouldBeLoveThirty(){
        int local = 0;
        int rival = 2;
        PointsTranslator translator = new PointsTranslator();

        String result = translator.translate(local,rival);

        assertEquals("Love-Thirty", result);
    }

    @Test
    void testPlayerOneScoresThreeTimes_ShouldBeFortyLove(){
        int local = 3;
        int rival = 0;
        PointsTranslator translator = new PointsTranslator();

        String result = translator.translate(local,rival);

        assertEquals("Forty-Love", result);
    }

}
