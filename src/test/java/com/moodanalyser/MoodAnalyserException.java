package com.moodanalyser;

public class MoodAnalyserException extends Exception {
    public MoodAnalyserException(String mood)
    {
        super(mood);
    }

    public enum ExceptionType {
        ENTERED_NULL,ENTERED_EMPTY
    }

    ExceptionType type;

    public MoodAnalyserException(ExceptionType type,String message)
    {
        super(message);
        this.type=type;
    }
    public MoodAnalyserException(ExceptionType type,Throwable throwable)
    {
        super(throwable);
        this.type=type;
    }
    public MoodAnalyserException(ExceptionType type,String message,Throwable throwable)
    {
        super(message,throwable);
        this.type=type;
    }
}