package sample;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Spaces extends StackPane {

    public Spaces(int x, int y, CheckerPiece piece, double x2, double y2, double width, double height, String img) {
        Rectangle rectangle = new Rectangle( width, height);
        rectangle.setStroke(Color.BLACK);
        if((x+y)%2 == 0) {
            rectangle.setFill(Color.RED);
        }
        else {
            rectangle.setFill(Color.BLACK);
        }
        //37.5 per checker space
        setTranslateX(x2+180);
        setTranslateY(y2+80);
        getChildren().addAll( rectangle);
    }
}