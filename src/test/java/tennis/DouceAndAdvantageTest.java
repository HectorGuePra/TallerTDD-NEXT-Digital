package tennis;

import org.junit.jupiter.api.Test;
import static junit.framework.Assert.assertEquals;

public class DouceAndAdvantageTest {

    @Test
    public void testScoreIsFortyAll_ShouldBeDeuce(){
        int local = 3;
        int rival = 3;

        PointsTranslator translator = new PointsTranslator();

        String result = translator.translate(local,rival);

        assertEquals("Deuce",result);

    }
}
