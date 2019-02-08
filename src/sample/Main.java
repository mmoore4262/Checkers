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

import java.io.FileInputStream;


public class Main extends Application {

    public static int redScore = 0;
    public static int blackScore = 0;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Checkers");
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();
        FileInputStream input = new FileInputStream("images/blackcheckers.png");
        Image[] blackCheckers = new Image[12];
        for (int i = 0; i < 12; i++) {
            blackCheckers[0] = new Image(input);
            ImageView imageView = new ImageView(blackCheckers[0]);
        }
        FileInputStream input2 = new FileInputStream("images/redcheckers.png");
        Image[] redCheckers = new Image[12];
        for (int i = 0; i < 12; i++) {
            redCheckers[0] = new Image(input);
            ImageView imageView = new ImageView(redCheckers[0]);
        }


        Board.createBoard();
    }
    //actually shows the physical checkers on the board
    public void showBoard() {

    }


    public static void main(String[] args) {
        launch(args);
    }


}