package com.moodanalyser;


import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void given_messageWhenSadShouldReturnSad() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in Sad Mood");
        Assert.assertEquals("Sad",mood);
    }

    @Test
    public void given_messageWhenHappyShouldReturnHappy() throws MoodAnalyserException{
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in Happy Mood");
        Assert.assertEquals("Happy",mood);
    }

    @Test
    public void GivenNullMoodShouldReturnMessage() {
         MoodAnalyser moodAnalyser= new MoodAnalyser();
         try {
             String mood = moodAnalyser.analyseMood("Null");
         }catch (MoodAnalyserException e){
            Assert.assertEquals(MoodAnalyserException.Exception_Type.Null, e.type);
         }
    }

    @Test
    public void GivenEmptyMoodShouldReturnMessage() {
        MoodAnalyser moodAnalyser= new MoodAnalyser();
        try {
            String mood = moodAnalyser.analyseMood("");
        }catch (MoodAnalyserException e){
            Assert.assertEquals(MoodAnalyserException.Exception_Type.Empty, e.type);
        }
    }
}