package main;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private Label lmagicball;

    @FXML
    private TextField tfquestion;

    private String myData = "";

    public void setMyData(String myData) {
        this.myData = myData;
        System.out.println("(MainController) Data received: " + this.myData);


    }

    @FXML
    private void ask()
    {
        String question = tfquestion.getText();

        if(question.equals("?"))
        {
            lmagicball.setText("No");
            lmagicball.setStyle("-fx-text-fill: red;");
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



    }
}
