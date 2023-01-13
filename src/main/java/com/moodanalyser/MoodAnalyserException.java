package com.moodanalyser;
public class MoodAnalyserException extends Exception {
    public enum Exception_Type{
        Null, Empty;
    }
    Exception_Type type;
    public MoodAnalyserException( Exception_Type type,String message){
        super(message);
        this.type = type;
    }

}
