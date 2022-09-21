package comp1110.lab6;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Board extends Application {


    public class Triangle extends Polygon {
        Triangle(double x, double y, double side) {
            Double firstPoint = side / 2;
            Double apex = Math.sqrt((side * side) - (firstPoint * firstPoint)) / 2;
            getPoints().addAll(new Double[] {
                    0.0, -apex,
                    -firstPoint, apex,
                    firstPoint,apex
            });
            setLayoutX(x);
            setLayoutY(y);
            setFill(Color.LIGHTGRAY);
        }
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        stage.setTitle("Board");
        ArrayList<Triangle> trList = new ArrayList<>();
        for (int y = 87; y < 519; y +=519/3) {
            for (int x = 100; x < 600; x+=100) {
                if (x == 200 || x == 400) {
                    Triangle rTr = new Triangle(x, y, 196);
                    rTr.setRotate(180);
                    trList.add(rTr);
                }
                else {
                    trList.add(new Triangle(x, y, 196));
                }
            }
        }
        for (Triangle trA : trList) {
            root.getChildren().add(trA);
        }
        Scene scene = new Scene(root, 600, 519);
        stage.setScene(scene);
        stage.show();
    }
}
