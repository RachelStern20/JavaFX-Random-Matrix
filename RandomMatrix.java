import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class RandomMatrix extends Application{

    public void start(Stage stage) throws Exception{
        System.out.println(getClass().getResource("/RandomMatrix.fxml"));

        Parent root = (Parent) FXMLLoader.load(getClass().getResource("/RandomMatrix.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("RandomMatrix");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
        System.out.println();
    }
}


