package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import sample.Board;

import javafx.scene.image.ImageView;

import javax.swing.*;
import java.io.FileInputStream;


public class
Main extends Application {

    public static int redScore = 0;
    public static int blackScore = 0;

        public  void showPicture() {
            JFrame frame = new JFrame();
            ImageIcon icon = new ImageIcon("redcheckers.png");
            JLabel label = new JLabel(icon);
            frame.add(label);
            frame.setDefaultCloseOperation
                    (JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }


    @Override
    public void start(Stage primaryStage) throws Exception{
        String color = "";
        double sceneWidth = 300;
        double sceneHeight = 300;
        double gridWidth = sceneWidth / 8;
        double gridHeight = sceneHeight / 8;
        Spaces[][] board = new Spaces[8][8];
        Group root = new Group();
        for(int x=0; x < board.length; x++) {
            for(int y = 0; y < board[x].length; y++) {
                color = "";
                if((x+y)%2 == 0 && y <= 3)
                {
                     color = "black";
                }
                else if((x+y)%2 == 0 && y >= 6)
                {
                    color = "red";
                }
                CheckerPiece piece = new CheckerPiece(color, x, y);
                Spaces node = new Spaces(x, y, piece, x * gridWidth, y * gridHeight, gridWidth, gridHeight);
                root.getChildren().add(node);
                board[x][y] = node;
            }
        }
        root.getChildren().add((Node) FXMLLoader.load(getClass().getResource("sample.fxml")));
        primaryStage.setTitle("Checkers");
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();
        showPicture();
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
