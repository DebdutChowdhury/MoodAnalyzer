package com.bridgeLabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenMessgae_WhenSad_ShouldReturn_Sad() {
        MoodAnalyzer ma = new MoodAnalyzer("This is a Sad Message");
        String mood = ma.analzeMood();
        Assert.assertEquals("SAD",mood);

    }

    @Test
    public void givenMessage_WhenHappy_ShouldReturn_Happy() {
        MoodAnalyzer ma = new MoodAnalyzer("This is Happy Messgae");
        String mood = ma.analzeMood();
        Assert.assertEquals("HAPPY",mood);
    }

    @Test
    public void givrnNull_returnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String mood = moodAnalyzer.analzeMood();
        Assert.assertEquals("HAPPY", mood);
    }
}