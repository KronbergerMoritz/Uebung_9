package maincontroller;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


import javax.swing.*;
import java.net.URL;
import java.security.SecureRandom;
import java.util.Random;
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


    private String answers[] = {"It is certain", "It is decidedly so", "Whitout a doubt", "Yes- definitely","You may rely on it","As I see it, yes","Most likely","Outlook good", "Yes", "Signs point to yes", "Reply hazy, try again","Ask again later","Better not tell you now","Cannot predict now","Concentrate and ask again","Don't count on it", "My reply is no", "My sources say no", "Outlook not so good", "Very doubtful"};


    @FXML
    private void ask()
    {

        String question = tfquestion.getText();

        if(question.equals("Maxi?"))
        {
            lmagicball.setText("GINGER!");
            lmagicball.setStyle("-fx-text-fill: orange;");
        }

        else if(question.contains("?"))
        {
            int random_number = Random();
            switch (random_number){
                case 0:
                    lmagicball.setText("It is certain.");
                    lmagicball.setStyle("-fx-text-fill: green;");
                    break;
                case 1:
                    lmagicball.setText("It is decidedly so.");
                    lmagicball.setStyle("-fx-text-fill: green;");
                    break;
                case 2:
                    lmagicball.setText("Without a doubt.");
                    lmagicball.setStyle("-fx-text-fill: green;");
                    break;
                case 3:
                    lmagicball.setText("Yes - definitely.");
                    lmagicball.setStyle("-fx-text-fill: green;");
                    break;
                case 4:
                    lmagicball.setText("You may rely on it.");
                    lmagicball.setStyle("-fx-text-fill: green;");
                    break;
                case 5:
                    lmagicball.setText("As I see it, yes.");
                    lmagicball.setStyle("-fx-text-fill: green;");
                    break;
                case 6:
                    lmagicball.setText("Most likely.");
                    lmagicball.setStyle("-fx-text-fill: green;");
                    break;
                case 7:
                    lmagicball.setText("Outlook good.");
                    lmagicball.setStyle("-fx-text-fill: green;");
                    break;
                case 8:
                    lmagicball.setText("Yes!");
                    lmagicball.setStyle("-fx-text-fill: green;");
                    break;
                case 9:
                    lmagicball.setText("Signs point to yes.");
                    lmagicball.setStyle("-fx-text-fill: green;");
                    break;
                case 10:
                    lmagicball.setText("Reply hazy, try again.");
                    lmagicball.setStyle("-fx-text-fill: yellow;");
                    break;
                case 11:
                    lmagicball.setText("Ask again later.");
                    lmagicball.setStyle("-fx-text-fill: yellow;");
                    break;
                case 12:
                    lmagicball.setText("Better not tell you now.");
                    lmagicball.setStyle("-fx-text-fill: yellow;");
                    break;
                case 13:
                    lmagicball.setText("Cannot predict now.");
                    lmagicball.setStyle("-fx-text-fill: yellow;");
                    break;
                case 14:
                    lmagicball.setText("Concentrate and ask again.");
                    lmagicball.setStyle("-fx-text-fill: yellow;");
                    break;
                case 15:
                    lmagicball.setText("Don't count on it.");
                    lmagicball.setStyle("-fx-text-fill: red;");
                    break;
                case 16:
                    lmagicball.setText("My reply is no.");
                    lmagicball.setStyle("-fx-text-fill: red;");
                    break;
                case 17:
                    lmagicball.setText("My sources say no");
                    lmagicball.setStyle("-fx-text-fill: red;");
                    break;
                case 18:
                    lmagicball.setText("Outlook not so good.");
                    lmagicball.setStyle("-fx-text-fill: red;");
                    break;
                case 19:
                    lmagicball.setText("Very doubtful.");
                    lmagicball.setStyle("-fx-text-fill: red;");
                    break;
            }

        }
        else
        {
            lmagicball.setText("This is not a question");
            lmagicball.setStyle("-fx-text-fill: red;");
        }


    }

    public int Random(){
        return (int)(System.currentTimeMillis() % 19);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



    }
}
