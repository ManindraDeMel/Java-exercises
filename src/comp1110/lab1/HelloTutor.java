package comp1110.lab1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloTutor extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // TODO: Correct the application title and label to display
        // TODO: your tutor's name.

        // Create the root stack pane
        primaryStage.setTitle("John / Leo / Robert");
        StackPane root = new StackPane();

        // Create label and add to root
        Label helloLabel = new Label("John / Leo / Robert");
        root.getChildren().add(helloLabel);

        // Set scene of stage with size 240x150 and show the stage
        primaryStage.setScene(new Scene(root, 240, 150));
        primaryStage.show();
    }
}
