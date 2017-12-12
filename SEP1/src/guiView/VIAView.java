package guiView;
import java.beans.EventHandler;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class VIAView extends Application {
	private static FileIO file = new FileIO();
	private static VIAModel viaModel;
	private static VIAController viaContr = new VIAController();

	public void start(Stage stage) throws Exception {
		file.setVIAModelFromFile();
		viaModel = file.getVIAModel();
		System.out.println(viaContr.getVIAMod().getEventList().getListOfEvents());
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
	    Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
	        public void run() {
	        	file.setVIAModel(viaModel);
	        	viaContr.saveToFile();
					try {
						file.setToFile();
					} catch (IOException e) {
						System.out.println("Unable to save to file.");
					}
	        }
	    }));
	}
	public VIAController getController() {
		return viaContr;
	}
	
}
