package sample.Application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/sample/Style/sample.fxml"));
        primaryStage.setTitle("Hello World");

        primaryStage.setScene(new Scene(root, 630, 495));
        primaryStage.show();
        primaryStage.setResizable(false);
    }


    public static void main(String[] args)
    {

        launch(args);
    }
}
