package com.moodanalyser;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser(){

    }

    public MoodAnalyser(String message){
        this.message = message;
    }
    public String analyseMood(String message) throws MoodAnalyserException{
        try{
            if (message.contains("Sad")) {
                return "Sad";
            } else
                return "Happy";
        }catch (Exception e) {
           if(message == null){
               throw new MoodAnalyserException(MoodAnalyserException.Exception_Type.Null, "Invalid Mood");
           }else {
               throw new MoodAnalyserException(MoodAnalyserException.Exception_Type.Empty, "Invalid Mood");
           }
        }
    }
}
