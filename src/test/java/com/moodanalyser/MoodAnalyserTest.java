package com.moodanalyser;


import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void given_messageWhenSadShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in Sad Mood");
        Assert.assertEquals("Sad",mood);
    }

    @Test
    public void given_messageWhenHappyShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in Happy Mood");
        Assert.assertEquals("Happy",mood);
    }

    @Test
    public void GivenNullMoodShouldReturnHappy() {
         MoodAnalyser moodAnalyser= new MoodAnalyser();
         String mood = moodAnalyser.analyseMood(null);
         Assert.assertEquals("Happy", mood);
    }
}