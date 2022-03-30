package program5;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import java.io.IOException;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;

public class QuizHistoryController {

    @FXML
    private Label histroyErrorMessage;
    @FXML
    private TextField searchField;
    @FXML
    private Label message;

    // this is when the user hits the search button
    public void whenMouseClicked(MouseEvent mouseEvent) {
        Button button = (Button) mouseEvent.getSource();
        String buttonInput = button.getText();
        switch (buttonInput) {
            case "Search":
                // we want to make sure that first their is atleast one person who is in the testTakers arraylist
                if (TestTaker.getNumTestTakers() == 0) {
                    // show proper error message 
                    histroyErrorMessage.setText("Error: No one has taken the test yet.");
                }
                else { // there is atleast one person in testTakers

                    // check to make sure that the user entered a name in the search field 
                    if (searchField.getText().isEmpty()) {
                        // show proper error message 
                        histroyErrorMessage.setText("Error: Please enter a name to search.");
                    }
                    else { // the user entered a name 

                        // change the error message field to be blank
                        histroyErrorMessage.setText("");

                        // we want to save whatever name the user typed into a variable 
                        String searchName = searchField.getText();

                        // parse through testTakers and try to look for the name 
                        boolean foundTestTaker = false;
                        int foundAtIndex = -1;

                        // loop over the names in testTakers
                        for (int index = 0; index < TestTaker.getNumTestTakers(); index++) {
                            // check to see if searchName is euqals to the name of testTakers at index 
                            if (searchName.equals(QuizController.getTestTakers().get(index).getName())) {

                                // update foundTestTaker to be true 
                                foundTestTaker = true;
                                // update foundAtIdex to be the current index we were looping on
                                foundAtIndex = index;

                            }
                        }

                        // if we found the test taker
                        if (foundTestTaker) {
                            // print their stats to message Label
                            message.setText(QuizController.getTestTakers().get(foundAtIndex).toString());
                        }

                        else { // if no test taker was found
                            // print error message to historyErrorMessage Label
                            histroyErrorMessage.setText("Error: Test Taker not found.");

                        }

                    }
                }
                break;
                
            case "Quit":
                MainMenu.getQuizHistoryStage().close();
        }

    }

}
