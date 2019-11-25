package com.moodanalyser;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnanlyserTests {

    @Test
        public void givenMessage_whenSad_shouldReturnSad() throws MoodAnalyserException {
            MoodAnalyser moodAnalyser = new MoodAnalyser();
            try {
                ExpectedException expectedException= ExpectedException.none();
                expectedException.expect(MoodAnalyserException.class);
                String mood = moodAnalyser.analyseMood(null);
            }
            catch (MoodAnalyserException e)
            {
            }
    }
}
