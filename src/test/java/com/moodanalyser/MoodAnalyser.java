package com.moodanalyser;

public class MoodAnalyser {
    public String analyseMood(String message) throws MoodAnalyserException {
        try
        {
            if (message.contains("sad"))
              return "happy";
            else
                return "sad";
        }
        catch(NullPointerException e)
        {
            throw  new MoodAnalyserException("invalid mood type");
        }
    }
}

