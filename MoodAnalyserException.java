package com.Day21problem;


public class MoodAnalyserException extends Exception{
    public ExceptionType type;

    public enum ExceptionType {
        ENTERED_NULL, ENTERED_EMPTY
    }

    public MoodAnalyserException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}