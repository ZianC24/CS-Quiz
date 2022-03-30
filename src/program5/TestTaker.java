package program5;

import java.util.*;
import java.io.*;

public class TestTaker {
        
    // Data Members
   
    private static int numTestTakers = 0;
    private String name;
    private ArrayList<String> userAnswers;
    private static ArrayList<String> answerKey = new ArrayList<>() {
        {
        add("false");
        add("false");
        add("true");
        add("true");
        add("false");
        }
    };
    
    
    
    // Constructor
    
    public TestTaker(String name, String userAnswer1, String userAnswer2, String userAnswer3, String userAnswer4, String userAnswer5) {
        this.name = name;
        this.userAnswers = new ArrayList<>() {
            {
            add(userAnswer1);
            add(userAnswer2);
            add(userAnswer3);
            add(userAnswer4);
            add(userAnswer5);
            }
        }; 
        numTestTakers++;
}
    
    public String getName() {
        return this.name;
    }
    
    public static int getNumTestTakers() {
        return numTestTakers;
    }
    
    
    public double getTestScore() {
        double testScore = 100.0;
        for (int i = 0; i < answerKey.size(); i++) {
            if (userAnswers.get(i).equalsIgnoreCase(answerKey.get(i))) {
                continue;
            }
            else {
                testScore -= 20.0;
            }
        }
        return testScore;
    }
    
    @Override
    public String toString() {
		String s = "";
		
		s += String.format("%s'S Final Grade: %.2f\n", this.name.toUpperCase(), this.getTestScore());
		
        return s; 
    }
   
}