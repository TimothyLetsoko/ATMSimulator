import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        try{
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("screens\\logIn.fxml")));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("ATM Simulation");
            stage.show();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}