package com.alusineconteh.quizgamelogin;

/**
 * Created by alusineconteh on 30/10/2017.
 */

public class Questions {
    //Questions
    public String mQuestions[]= {
            "The ___is the program that manages the hardware of the computer system, including the CPU, memory, storage devices, and input/output devices?",
            "Which software helps you carry out tasks, such as typing a document or creating a spreadsheet?",
            "The fastest and most expensive computers are?",
            "A string of _________0s and 1s is called a byte?",
            "A _________is approximately 1,000 bytes?",
            "The metal or plastic case that holds all the physical parts of the computer is the?",
            "The two broad categories of software are",
            "Apple Macintoshes (Macs) and PCs use different ______to process data and different operating systems.",
            "The PC (personal Computer) and the Apple Macintosh are examples of two different",
    };
    //User Choices
    private String mChoices [] [] = {

            {"Operating System", "Application", " Personal Computer","System Unit"},
            {"System Software", "Application", "Super Computers","CPU"},
            {"Super Computers", "Mainframes", "System Unit","Laptop"},
            {"kilobyte", "Processor", "Eight (8)","Super Computers"},
            {"kilobyte", "CPU", "RAM","Super Computers"},
            {"System and Application", "Application", "CPU","System Unit"},
            {"System Unit", "Platforms", "System and Application","Super Computers"},
            {"Application", "CPUs", "Platforms","Storage Devices"},
            {"Operating System", "Application", "Programs","Platforms"},
    };
    //Initializing Questions to Answers
    private  String mCorrectAnswers[] = {"Operating system", "Application", "Super Computers", "Eight (8)", "kilobyte", "System Unit","System and Application","CPU","Platforms"};

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice = mChoices[a] [0];
        return choice;
    }

    public String getChoice2(int a){
        String choice = mChoices[a] [1];
        return choice;
    }

    public String getChoice3(int a){
        String choice = mChoices[a] [2];
        return choice;
    }

    public String getChoice4(int a){
        String choice = mChoices[a] [3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }

}

