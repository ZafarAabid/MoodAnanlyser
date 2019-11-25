package com.moodanalyser;

public class MoodAnalyserException extends Exception {
    public MoodAnalyserException(String mood)
    {
        super(mood);
    }

}
