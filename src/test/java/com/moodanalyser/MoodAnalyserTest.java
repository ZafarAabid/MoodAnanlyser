package com.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
//    public static void main(String[] args) {
        @Test
        public void givenMessage_whenSad_shouldReturnSad() {
                MoodAnalyser moodAnalyfser = new MoodAnalyser();
                String mood = MoodAnalyser.analyseMood("Tis is sad message");
                Assert.assertEquals("SAD", mood);
        }
        @Test
        public void givenMessage_whenHappy_shouldReturnHappy(){
                MoodAnalyser moodAnalyser=new MoodAnalyser();
                String mood = moodAnalyser.analyseMood("This is Happy Message");
                Assert.assertEquals("HAPPY", mood );

}
       @Test
        public void givenMessage(){
                MoodAnalyser moodAnalyser=new MoodAnalyser();
                String mood = moodAnalyser.analyseMood("This is Happy Message");
                try{
                    if(mood == "HAPPY")
                    Assert.assertEquals("HAPPY", mood );
                    else
                     Assert.assertEquals("HAPPY", mood );
                }

}

}