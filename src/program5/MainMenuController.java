package program5;

import java.io.IOException;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class MainMenuController {

	public void openQuizWindow() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Quiz.fxml"));
			Parent root = loader.load();

			MainMenu.getQuizStage().setScene(new Scene(root));

			MainMenu.getQuizStage().show();
		} catch (IOException ex) {
			System.out.println(ex);
		}
	}

	public void openQuizHistoryWindow() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("QuizHistory.fxml"));
			Parent root = loader.load();

			MainMenu.getQuizHistoryStage().setScene(new Scene(root));

			MainMenu.getQuizHistoryStage().show();
		} catch (IOException ex) {
			System.out.println(ex);
		}
	}

	public void onMouseClick(MouseEvent mouseEvent) {
		Button button = (Button) mouseEvent.getSource();
		String buttonInput = button.getText();

		switch (buttonInput) {
			case "Take Quiz":
				openQuizWindow();
				break;
			case "Quiz History":
				openQuizHistoryWindow();
				break;
			case "Quit":
				MainMenu.getWindow().close();

		}

	}

}
