package guiView;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class VIAView extends Application {

	public void start(Stage stage) throws Exception {
		//invoke fxml loader
		FXMLLoader load = new FXMLLoader();
		//set location of the FXML doc
		load.setLocation(getClass().getResource("viamain.fxml"));
		Parent root = load.load();
		//Build the scene
		Scene scene = new Scene(root);
		//show the window of the scene graph
		stage.sizeToScene();
		stage.setTitle("VIA");
		stage.setScene(scene);
		stage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
