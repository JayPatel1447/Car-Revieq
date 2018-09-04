package sample.ControllerClass;

import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

import javax.jws.soap.SOAPBinding;
import java.io.IOException;
import java.net.URL;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    @FXML
    private TextField UserName;

    @FXML
    private PasswordField Password;


    @FXML
    private CheckBox Remember;

    @FXML
    private Button Login;

    @FXML
    private Hyperlink Forgot;

    @FXML
    private Label Car;

    @FXML
    private Label Review;

    @FXML
    private ImageView CarImage;

    @FXML
    private Button SignUp;

    @FXML
    private ImageView UserImage;

    @FXML
    private ImageView PassImage;

    @FXML
    private ImageView gif;

    @FXML
    private CheckBox pass_vis;





    public void initialize(URL url , ResourceBundle rb)
    {

    }



    public void loginAction(javafx.event.ActionEvent actionEvent) throws IOException {

        if (UserName.getText().equals("Jay") && Password.getText().equals("1447")) {

            Stage primaryStage1 = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/sample/Style/homepage.fxml"));
            Scene scene = new Scene(root,913,629);
            primaryStage1.setScene(scene);
            primaryStage1.show();



        }
        else
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("username or password is incorrect!!!");
            alert.showAndWait();
        }


    }
    public void signupAction(javafx.event.ActionEvent actionEvent) throws IOException{
        Login.getScene().getWindow().hide();

        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/sample/Style/SignUp.fxml"));
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setResizable(false);
        Login.setVisible(false);

    }



    public void passwordVisible(javafx.event.ActionEvent event) {

        if(pass_vis.isSelected())
        {
           Password.getText();
           Password.setVisible(true);

        }


    }
}
