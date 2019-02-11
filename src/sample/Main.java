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
        String img = "";
        double sceneWidth = 300;
        double sceneHeight = 300;
        double gridWidth = sceneWidth / 8;
        double gridHeight = sceneHeight / 8;
        Spaces[][] board = new Spaces[8][8];
        Group root = new Group();
        for(int x=0; x < board.length; x++) {
            for(int y = 0; y < board[x].length; y++) {
                color = "";
                img = "";
                if((x+y)%2 == 0 && y <= 3)
                {
                     color = "black";
                     img = "images/blackcheckers.png";
                }
                else if((x+y)%2 == 0 && y >= 6)
                {
                    color = "red";
                    img = "images/redcheckers.png";
                }
                CheckerPiece piece = new CheckerPiece(color, x, y);
                Spaces node = new Spaces(x, y, piece, x * gridWidth, y * gridHeight, gridWidth, gridHeight, img);
                root.getChildren().add(node);
                if(color.equals("black") || color.equals("red")) {
                    board[x][y] = node;
                }
                else
                {
                    board[x][y] = null;
                }
            }
        }

        root.getChildren().add((Node) FXMLLoader.load(getClass().getResource("sample.fxml")));
        primaryStage.setTitle("Checkers");
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();
        showPicture();
        FileInputStream input = new FileInputStream("images/blackcheckers.png");
        ImageView[]ImageViewArr  = new ImageView[12];
        Image[] blackCheckers = new Image[12];
        for (int i = 0; i < 12; i++) {
            double offset = 37.5 * i;
            blackCheckers[i] = new Image(input);
            ImageView imageView = new ImageView(blackCheckers[i]);
            imageView.setImage(blackCheckers[i]);
            imageView.setLayoutX(0 + offset);
            imageView.setLayoutY(0 + + offset);
            imageView.setFitWidth(50);
            imageView.setFitHeight(50);
            ImageViewArr[i] = imageView;
        }
        FileInputStream input2 = new FileInputStream("images/redcheckers.png");
        ImageView[]ImageViewArr2  = new ImageView[12];
        Image[] redCheckers = new Image[12];
        for (int i = 0; i < 12; i++) {
            double offset = 37.5 * i;
            redCheckers[i] = new Image(input2);
            ImageView imageView = new ImageView(redCheckers[i]);
            imageView.setLayoutX(100 + offset);
            imageView.setLayoutY(100 + offset);
            imageView.setFitWidth(50);
            imageView.setFitHeight(50);
            ImageViewArr2[i] = imageView;
        }
        for (int i = 0;i<ImageViewArr.length;i++)
        {
            root.getChildren().add(ImageViewArr[i]);
            ImageViewArr[i].setImage(blackCheckers[i]);
        }
        for (int i = 0;i<ImageViewArr2.length;i++)
        {
            ImageViewArr2[i].setImage(imageView[i]);
            root.getChildren().add(ImageViewArr2[i]);
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
