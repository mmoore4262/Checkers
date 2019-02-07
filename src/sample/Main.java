package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import sample.Board;

import javafx.scene.image.ImageView;




public class Main extends Application {

    public static int redScore = 0;
    public static int blackScore = 0;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Checkers");
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();
        Board.createBoard();

        Parent endScreen = FXMLLoader.load(getClass().getResource("endScreen.fxml"));
        primaryStage.setTitle("You lose");
        primaryStage.setScene(new Scene(endScreen, 500, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
        

}
