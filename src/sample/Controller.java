package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;


public class Controller
{
    @FXML
    private Text redCapturedCount;
    @FXML
    private Text blackCapturedCount;

    //Possibly change these to change the scores by an inputted number instead of just by 1
    public void updateRedScore()
    {
        Main.redScore ++;
        redCapturedCount.setText(String.valueOf(Main.redScore));
    }

    public void updateBlackScore()
    {
        Main.blackScore ++;
        blackCapturedCount.setText(String.valueOf(Main.blackScore));
    }

}
