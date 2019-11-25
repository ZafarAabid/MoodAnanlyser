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
                Assert.assertEquals("invalid mood type",e.getMessage());
            }
    }
    @Test
    public void givenMoodAnalyserClass_whenProper_returnObject()
    {
        MoodAnalyser moodAnalyser=MoodAnalyserFactory.createMoodAnalyser("I'm in happy mood");
        try {
            String mood = moodAnalyser.analyseMood();
            Assert.assertEquals("happy",mood);
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
    }

    @Test
    public static void givenMessage_WhenProper_Should_Return_Object_Using_Reflector() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        ObjectReflector.dump(moodAnalyser, 0);

    }
}
