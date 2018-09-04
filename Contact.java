package sample.ControllerClass;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Contact {

    @FXML
    private Button GoBack;

    public void setGoBack(javafx.event.ActionEvent actionEvent) throws IOException
    {
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/sample/Style/homepage.fxml"));


        primaryStage.setScene(new Scene(root, 913,629));
        primaryStage.show();
        primaryStage.setResizable(false);

    }

}
