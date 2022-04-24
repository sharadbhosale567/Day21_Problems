package com.Day21problem;

public class MoodAnalyserMain {
    String message;

    //Constructor without parameter
    public MoodAnalyserMain() {

    }

    //Constructor with parameter
    public MoodAnalyserMain(String message) {
        this.message = message;
    }

    //analyseMood method
    public String analyseMood() throws MoodAnalyserException {
        try {
            if (message.length() == 0)
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY , "Please enter proper message!");
            if (message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch(NullPointerException e) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL , "Please enter proper message!");
        }
    }
}
