package org.launchcode.java.studios.technology;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    ArrayList<String> correctAnswers = new ArrayList<String>();
    public static ArrayList<Question> quizQuestions = new ArrayList<Question>();
    MultipleChoice question1 = new MultipleChoice("Which of these teams are in the SuperBowl?",
            "A) Raiders \n" +
                    "B) Vikings \n" +
                    "C) Chiefs \n" +
                    "D) Patriots","C");
    MultipleChoice question2 = new MultipleChoice("Which of these teams never won the SuperBowl?",
            "A) Vikings \n" +
                    "B) Jets \n" +
                    "C) Chiefs \n" +
                    "D) Seahawks","A");
    TrueFalse question3 = new TrueFalse("This SuperBowl is being played in Tampa: ", "True \nFalse", "False");
    Checkbox question4 = new Checkbox("Select all the teams who have won more than two SuperBowls:  ", "A) Steelers " +
            "\nB) Cowboys \nC) Chiefs \nD) Lions\nE)Texans", "AB");
    Scanner input = new Scanner(System.in);

    public void addQuestions(Question questionClass){
        quizQuestions.add(questionClass);
    }

    public void takeQuiz() {
        addQuestions(question1);
        addQuestions(question2);
        addQuestions(question3);
        addQuestions(question4);
        for (int i = 0; i < quizQuestions.size(); i++) {
            System.out.println(quizQuestions.get(i).getPrompt());
            System.out.println(quizQuestions.get(i).getChoices());
            System.out.println("Answer: ");
            String userAnswer = input.nextLine();
            String rightAnswer = quizQuestions.get(i).getAnswer();
            if(userAnswer.toUpperCase().equals(rightAnswer.toUpperCase())){
                correctAnswers.add(userAnswer);
            }
        }
    }

    public void gradeQuiz(){
        int numCorrectAnswers = correctAnswers.size();
        int numOfQuestions = quizQuestions.size();
        int correctPercent = numCorrectAnswers * 100 / numOfQuestions;
        System.out.println("You got " + numCorrectAnswers + "/" + numOfQuestions + " correct for a " + correctPercent + "%");
    }
}
