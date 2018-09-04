package sample.ControllerClass;

        import com.jfoenix.controls.JFXButton;
        import javafx.animation.FadeTransition;
        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.fxml.FXMLLoader;
        import javafx.fxml.Initializable;
        import javafx.scene.Node;
        import javafx.scene.Parent;
        import javafx.scene.Scene;
        import javafx.scene.image.ImageView;
        import javafx.scene.layout.AnchorPane;
        import javafx.stage.Stage;
        import javafx.util.Duration;

        import java.io.IOException;
        import java.net.URL;
        import java.util.ResourceBundle;

        public class homeController{

    @FXML
    private JFXButton audi;

    @FXML
    private JFXButton mercedes;

    @FXML
    private JFXButton jaguar;

    @FXML
    private JFXButton bmw;

    @FXML
    private ImageView Audi;


    @FXML
    public void audiAction(ActionEvent event)throws IOException
    {

        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/sample/Style/Audi.fxml"));
        primaryStage.setTitle("Wlcome to Audi Official");

        primaryStage.setScene(new Scene(root, 756, 524));
        primaryStage.show();
        primaryStage.setResizable(false);

    }




}
