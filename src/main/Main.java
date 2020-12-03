package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/welcome/welcome.fxml"));
        Parent root = fxmlLoader.load();

        //get controller which is connected to this fxml file
        welcome.WelcomeController ctrl = fxmlLoader.getController();
        ctrl.setStage(primaryStage);

        primaryStage.setTitle("Welcome");
        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
