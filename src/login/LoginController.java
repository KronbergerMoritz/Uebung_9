package login;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import maincontroller.MainController;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    private Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    @FXML
    private TextField tfusername;

    @FXML
    private PasswordField tfpassword;

    @FXML
    Label lMessage = new Label();

    @FXML
    private void login()
    {

    try{
        String name = tfusername.getText();
        String pw = tfpassword.getText();

    if(name.equals("") && pw.equals(""))
    {
        lMessage.setStyle("-fx-text-fill: red;");
        lMessage.setText("Password and Username missing");
    }

    else if(name.equals(""))
    {
        lMessage.setStyle("-fx-text-fill: red;");
        lMessage.setText("Username missing");

    }
    else if(pw.equals(""))
    {
        lMessage.setStyle("-fx-text-fill: red;");
        lMessage.setText("Password missing");
    }

    else if(name.equals("user") && pw.equals("password")) {


        lMessage.setStyle("-fx-text-fill: green;");
        lMessage.setText("Correct");

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/maincontroller/main.fxml"));
            Parent root = fxmlLoader.load();

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
        lMessage.setStyle("-fx-text-fill: red;");
        lMessage.setText("Wrong Password or Username");
        tfpassword.setText("");

    }
    }
    catch (Exception ex) {
        System.out.println("Exception occured while loading main view!");
    }

     }

}