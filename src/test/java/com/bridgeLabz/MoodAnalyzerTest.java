package com.bridgeLabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyzerTest {
    @Test
    public void givenMessgae_WhenSad_ShouldReturn_Sad() {
        MoodAnalyzer ma = new MoodAnalyzer("This is a Sad Message");
        String mood;
        try{
            mood = ma.analzeMood();
            Assert.assertEquals("SAD",mood);
        } catch (MoodAnalyzerException e){
            System.out.println(e);
        }
    }

    @Test
    public void givenMessage_WhenHappy_ShouldReturn_Happy() {
        MoodAnalyzer ma = new MoodAnalyzer("This is Happy Messgae");
        String mood;
        try{
            mood = ma.analzeMood();
            Assert.assertEquals("HAPPY",mood);
        }catch (MoodAnalyzerException e){
            System.out.println(e);
        }
    }

    @Test
    public void givrnNull_returnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String mood;
        try{
            ExpectedException rule = ExpectedException.none();
            rule.expect(MoodAnalyzerException.class);
            mood  = moodAnalyzer.analzeMood();
            Assert.assertEquals("HAPPY", mood);
        }catch (MoodAnalyzerException e){
            e.printStackTrace();
        }
    }

    @Test
    public void givrnEmpty_returnEmpty() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        try{
            moodAnalyzer.analzeMood(null);
        }catch (MoodAnalyzerException e){
            Assert.assertEquals(MoodAnalyzerException.exceptionType.ENTERED_NULL, e.type);
        }
    }
}