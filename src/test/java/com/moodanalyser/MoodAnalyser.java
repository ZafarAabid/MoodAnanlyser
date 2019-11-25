package com.moodanalyser;

public class MoodAnalyser {
    public String message;

    public MoodAnalyser()   { this.message=message; }
    public MoodAnalyser(String message)
    {
        this.message=message;
    }

    public String analyseMood(String message) throws MoodAnalyserException
    {
        this.message=message;
        return analyseMood();
    }
    public String analyseMood() throws MoodAnalyserException {
        try
        {
            if (message.length() == 0)
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY,"please enter valid mood");

            else if (message.contains("happy"))
                return "happy";
            else
                return "sad";
        }
        catch(NullPointerException e)
        {
            throw  new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL,"please enter valid mood");
        }
    }

    public boolean equals(Object another)
    {
        if(this.message.equals(((MoodAnalyser)another).message))
            return true;
        return false;
    }
}
