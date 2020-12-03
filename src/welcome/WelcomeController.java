package welcome;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.MainController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class WelcomeController implements Initializable {

    private Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    Label l = new Label();

    @FXML
    private void next()
    {

        String name = username.getText();
        String pw = password.getText();



    if(name.equals("") && pw.equals(""))
    {
        l.setStyle("-fx-text-fill: red;");
        l.setText("Password and Username missing");
    }

    else if(name.equals(""))
    {
        l.setStyle("-fx-text-fill: red;");
        l.setText("Username missing");
    }
    else if(pw.equals(""))
    {
        l.setStyle("-fx-text-fill: red;");
        l.setText("Password missing");
    }

    else if(name.equals("user") && pw.equals("password"))
    {


            l.setStyle("-fx-text-fill: green;");
            l.setText("Correct!!");
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("main.fxml"));
            Parent root = null;
            
        //send data to MainController
            MainController ctrl = fxmlLoader.getController();
            ctrl.setMyData("Hello from Welcome Controller!");

            Stage mainStage = new Stage();
            mainStage.setTitle("Main");
            mainStage.setScene(new Scene(root, 500, 500));
            mainStage.show();

            this.stage.close();
    }

    else
    {
        l.setStyle("-fx-text-fill: red;");
        l.setText("Wrong Password");
    }




     }

}