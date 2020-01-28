package org.launchcode.java.studios.technology;

public class Question {
    private String prompt;
    private String choices;
    private String answer;

    public Question(String prompt, String choices, String answer){
        this.prompt = prompt;
        this.choices = choices;
        this.answer = answer;
    }

    public String getPrompt() {
        return prompt;
    }

    public String getChoices(){
        return choices;
    }
    public String getAnswer(){
        return answer;
    }
}
