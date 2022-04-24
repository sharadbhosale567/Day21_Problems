package com.MoodAnalyserTest;


import com.Day21problem.MoodAnalyserException;
import com.Day21problem.MoodAnalyserMain;
import org.testng.annotations.Test;

public class MoodAnalyserTest {
    //UC1-TC1.1
    @Test
    void givenIAmInSadMood_shouldReturnSad() throws MoodAnalyserException {
        MoodAnalyserMain moodAnalyser = new MoodAnalyserMain("I am in sad mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals(mood, "SAD");
    }

    //UC1-TC1.2
    @Test
    void givenIAmInAnyMood_shouldReturnHappy() throws MoodAnalyserException {
        MoodAnalyserMain moodAnalyser = new MoodAnalyserMain("I am in any mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals(mood, "HAPPY");
    }

    //UC1-TC-1.1 Repeat
    @Test
    void givenIAmInSadMood_shouldReturnHappy() throws MoodAnalyserException {
        MoodAnalyserMain moodAnalyser = new MoodAnalyserMain("I am in sad mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals(mood, "SAD");
    }

    //UC1-TC-1.2 Repeat
    @Test
    void givenIAmInHappyMood_shouldReturnHappy() throws MoodAnalyserException {
        MoodAnalyserMain moodAnalyser = new MoodAnalyserMain("I am in happy mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals(mood, "HAPPY");
    }

    //UC3
    @Test
    void givenNullException_shouldInformUserToEnterValidMood() {
        MoodAnalyserMain moodAnalyzer = new MoodAnalyserMain(null);
        try {
            moodAnalyzer.analyseMood();
        } catch (MoodAnalyserException e) {
            Assertions.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    //UC3
    @Test
    void givenEmpty_shouldInformUserToEnterValidMood() {
        MoodAnalyserMain moodAnalyzer = new MoodAnalyserMain("");
        try {
            moodAnalyzer.analyseMood();
        } catch (MoodAnalyserException e) {
            Assertions.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }
}
