package com.bridgeLabz;

public class MoodAnalyzer {
    private String message;
    public MoodAnalyzer(String message){
        this.message = message;
    }
    public String analzeMood(){
        if(message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
