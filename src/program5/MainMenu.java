// Name: Zian Church 
// Name: Matthew Blankenship
// Date: 5/2/21 @11:59 PM
// Email: zianchurch@yahoo.com
// Email: matthew@matthewblankenship.com
// Assignment: Program 5
// Course Number: 2290
// Course Section: 001
// Honor Code: I will practice academic and personal integrity and excellence of character
// and expect the same from others

package program5;

import java.util.*;
import java.io.*;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainMenu extends Application {
	
    private static Stage quizStage = null;
    private static Stage quizHistoryStage = null;
    private static Stage window;
    
    public static Stage getWindow() {
        return window;
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        primaryStage.setTitle("Program 5 Quiz");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        window = primaryStage;
		
        createQuizStage();
        createQuizHistoryStage();
		
    }
    
   
	
    // Quiz Stage
	public void createQuizStage() {
        quizStage = new Stage();
        quizStage.setTitle("Quiz");
        
        quizStage.initModality(Modality.APPLICATION_MODAL);
    }

	public static Stage getQuizStage() {
		return quizStage;
	}

        // Quiz History
        public void createQuizHistoryStage() {
        quizHistoryStage = new Stage();
        quizHistoryStage.setTitle("Quiz History");
       
        quizHistoryStage.initModality(Modality.APPLICATION_MODAL);
    }

	public static Stage getQuizHistoryStage() {
		return quizHistoryStage;
	}
    public static void main(String[] args) {
        launch(args);
    }
}
