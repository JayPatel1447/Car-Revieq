package sample.ControllerClass;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPopup;
import com.jfoenix.controls.JFXRippler;
import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.text.Text;


import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class homepageController implements Initializable {


    @FXML
    AnchorPane holderPane;

    AnchorPane home;
    @FXML
    private ImageView lblmenu;

    @FXML
    private VBox overFlowConatiner;


    @FXML
    private Text toolBarRight;


    @FXML
    private MenuItem LogOut;

    @FXML
    private MenuItem Exit;

    @FXML
    private AnchorPane homeC;




    @FXML
    public void initialize(URL arg0, ResourceBundle arg1)
    {
        JFXRippler rippler = new JFXRippler(lblmenu);
        rippler.setMaskType(JFXRippler.RipplerMask.RECT);

        createPage();
    }


    private void setNode(Node node)
    {
        holderPane.getChildren().clear();
        holderPane.getChildren().add((Node)node);

        FadeTransition ft = new FadeTransition(Duration.millis(1500));
        ft.setNode(node);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }
    private void createPage()
    {
        try {
            home = FXMLLoader.load(getClass().getResource("/sample/Style/home.fxml"));
            setNode(home);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void exit(javafx.event.ActionEvent actionEvent)
    {
        Platform.exit();
    }

    public void logout(javafx.event.ActionEvent actionEvent) throws IOException
    {
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/sample/Style/sample.fxml"));
        primaryStage.setTitle("Hello World");

        primaryStage.setScene(new Scene(root, 630, 495));
        primaryStage.show();
        primaryStage.setResizable(false);
    }

    public void Contact(javafx.event.ActionEvent actionEvent) throws IOException
    {
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/sample/Style/Contact.fxml"));
        primaryStage.setTitle("Contact us");

        primaryStage.setScene(new Scene(root,600,428));
        primaryStage.show();
        primaryStage.setResizable(false);
    }



}
