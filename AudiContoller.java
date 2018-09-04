package sample.ControllerClass;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Orientation;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AudiContoller implements Initializable {

    @FXML
    private JFXButton audi;

    @FXML
    private JFXButton audi1;

    @FXML
    private JFXButton audi2;

    @FXML
    private JFXButton audi3;

    @FXML
    private ImageView Audi;

    @FXML
    private ImageView Audi2;

    @FXML
    private ImageView Audi1;

    @FXML
    private ImageView Audi11;

    @FXML
    private Button GoBack;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    public void Exit(ActionEvent event) {
        System.exit(0);
    }

    public void setGoBack(ActionEvent event) throws IOException
    {
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/sample/Style/homepage.fxml"));
        primaryStage.setTitle("Wlcome to Audi Official");

        primaryStage.setScene(new Scene(root, 913,629));
        primaryStage.show();
        primaryStage.setResizable(false);

    }

    @FXML
    public void audiR8(javafx.event.ActionEvent actionEvent)throws IOException
    {

        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/sample/Style/AudiR8.fxml"));
        primaryStage.setTitle("Wlcome to Audi Official");

        primaryStage.setScene(new Scene(root, 668, 528));
        primaryStage.show();
        primaryStage.setResizable(false);

    }

    @FXML
    public void audiQ3(javafx.event.ActionEvent actionEvent)throws IOException
    {

        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/sample/Style/AudiQ3.fxml"));
        primaryStage.setTitle("Wlcome to Audi Official");

        primaryStage.setScene(new Scene(root, 668, 528));
        primaryStage.show();
        primaryStage.setResizable(false);

    }

    @FXML
    public void audiA4(javafx.event.ActionEvent actionEvent)throws IOException
    {

        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/sample/Style/AudiA4.fxml"));
        primaryStage.setTitle("Wlcome to Audi Official");

        primaryStage.setScene(new Scene(root, 668, 528));
        primaryStage.show();
        primaryStage.setResizable(false);

    }

    @FXML
    public void audiQ7(javafx.event.ActionEvent actionEvent)throws IOException
    {

        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/sample/Style/AudiQ7.fxml"));
        primaryStage.setTitle("Wlcome to Audi Official");

        primaryStage.setScene(new Scene(root, 668, 528));
        primaryStage.show();
        primaryStage.setResizable(false);

    }
}
