package sample.ControllerClass;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.*;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignupController {

    @FXML
    private PasswordField password;

    @FXML
    private TextField name;

    @FXML
    private Button signup;

    @FXML
    private RadioButton male;

    @FXML
    private RadioButton female;

    @FXML
    private TextField email;

    @FXML
    private Button login;

    @FXML
    private Label Car;

    @FXML
    private Label Review;

    @FXML
    private ImageView userImage;

    @FXML
    private ImageView emailImage;

    @FXML
    private ImageView passImage;



    public void loginAction(javafx.event.ActionEvent actionEvent)throws IOException {
        signup.getScene().getWindow().hide();

        Stage Login = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/sample/Style/sample.fxml"));
        Scene scene = new Scene(root);

        Login.setScene(scene);
        Login.show();
        Login.setResizable(false);
        signup.setVisible(false);
    }


    public void SIGNUP(javafx.event.ActionEvent event) throws IOException {
        Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
        Matcher m = p.matcher(email.getText());

            try {
                if (m.find() && m.group().equals(email.getText())) {
                    Stage stage = new Stage();
                    Parent root = FXMLLoader.load(getClass().getResource("/sample/Style/homepage.fxml"));
                    Scene scene = new Scene(root, 913, 629);
                    stage.setScene(scene);
                    stage.show();
                } else if ((male.isSelected() || female.isSelected()) == false) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText(null);
                    alert.setContentText("Please select your Gender");
                    alert.showAndWait();
                }
                else if(password.getLength() <=6)
                {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText(null);
                    alert.setContentText("password must be more than 6 letter");
                    alert.showAndWait();
                }
                else {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText(null);
                    alert.setContentText("Please Enter valid Details");
                    alert.showAndWait();
                }

                FileWriter br = new FileWriter(new File("C:\\Users\\jaypa\\Desktop\\My Doc\\Project\\car\\src\\sample\\Files\\login.txt"));
                br.write(name.toString());
                br.close();
            }
             catch (IOException e)
        {
            e.printStackTrace();
        }
        }
    }



