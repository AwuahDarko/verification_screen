package Source;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    private double xOffset = 0;
    private double yOffset = 0;
    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setMaximized(true);
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        root.setOnMousePressed(event -> {
//            xOffset = MouseInfo.getPointerInfo().getLocation().x;
//            yOffset = MouseInfo.getPointerInfo().getLocation().y;
//            xOffset = event.getSceneX();
//            yOffset = event.getSceneY();
        });

        root.setOnMouseDragged(event -> {
//            primaryStage.setX(xOffset);
//            primaryStage.setY(yOffset);
//            System.out.println("x " + primaryStage.getX());
//            System.out.println("y " + primaryStage.getY());
        });
//        primaryStage.setX(0);
//        primaryStage.setY(0);
//        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 1000, 700));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
