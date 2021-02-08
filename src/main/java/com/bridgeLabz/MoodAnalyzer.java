package com.bridgeLabz;

public class MoodAnalyzer {
    private String message;
    public MoodAnalyzer(String message){
        this.message = message;
    }

    public String analzeMood(String message) throws MoodAnalyzerException{
        this.message = message;
        return analzeMood();
    }
    public String analzeMood() throws MoodAnalyzerException {
        try {
            if(message.length() == 0)
                throw new MoodAnalyzerException(MoodAnalyzerException.exceptionType.ENTERED_EMPTY, "Entered proper mood");
            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalyzerException(MoodAnalyzerException.exceptionType.ENTERED_NULL, "Enter proper mood");
        }
    }
}
