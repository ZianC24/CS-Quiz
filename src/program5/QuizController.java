package program5;

import java.util.*;
import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import java.io.IOException;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class QuizController {
    
    // Input Textfields On The Quiz
    @FXML
    private TextField nameInput;
    @FXML
    private TextField question1Input;
    @FXML
    private TextField question2Input;
    @FXML
    private TextField question3Input;
    @FXML
    private TextField question4Input;
    @FXML
    private TextField question5Input;
    
    // Error Message Label
    @FXML
    private Label errorMessage;
    
    
    private static ArrayList<TestTaker> testTakers = new ArrayList<>();
    
    public static ArrayList<TestTaker> getTestTakers() {
        return testTakers;
    }
    
    public void whenMouseClicked(MouseEvent mouseEvent) {
        
        
        
        
        Button button = (Button) mouseEvent.getSource();
        String buttonInput = button.getText();
        
        switch (buttonInput) {
            
                
            case "Finish":
                if (nameInput.getText().isEmpty() || question1Input.getText().isEmpty() || question2Input.getText().isEmpty() || question3Input.getText().isEmpty() || question4Input.getText().isEmpty() || question5Input.getText().isEmpty()) {
                    errorMessage.setText("Error: Please fill all fields");
                }
                else {
                    if ((!question1Input.getText().matches("true") && !question1Input.getText().matches("false")) || (!question2Input.getText().matches("true") && !question2Input.getText().matches("false")) || (!question3Input.getText().matches("true") && !question3Input.getText().matches("false")) || (!question4Input.getText().matches("true") && !question4Input.getText().matches("false")) || (!question5Input.getText().matches("true") && !question5Input.getText().matches("false"))) {
                        errorMessage.setText("Error: Enter 'true' or 'false' only for the questions");
                    }
                    else {
                        testTakers.add(new TestTaker(nameInput.getText(), question1Input.getText(), question2Input.getText(), question3Input.getText(), question4Input.getText(), question5Input.getText()));
                        MainMenu.getQuizStage().close();
                    }
                }
                break;
            
        }
    }
    
    
    
    
	
}
