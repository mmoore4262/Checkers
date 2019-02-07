package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;


public class Controller2
{
    @FXML
    private Button Restart;

    //Possibly change these to change the scores by an inputted number instead of just by 1
  public void Restart() throws IOException {
    Stage stage = (Stage) Restart.getScene().getWindow();
      Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
      stage.setTitle("Checkers");
      stage.setScene(new Scene(root, 500, 500));
      stage.show();
      Board.createBoard();
  }

}
