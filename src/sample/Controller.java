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

    public void updateRedScore(int num)
    {
        Main.redScore += num;
        redCapturedCount.setText(String.valueOf(Main.redScore));
    }

    public void updateBlackScore(int num)
    {
        Main.blackScore += num;
        blackCapturedCount.setText(String.valueOf(Main.blackScore));
    }

    //Delete these later - just for testing if it updates
    public void testRed()
    {
        updateRedScore(2);
    }

    public void testBlack()
    {
        updateBlackScore(2);
    }
}
