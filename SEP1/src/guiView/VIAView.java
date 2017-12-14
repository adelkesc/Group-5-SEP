package guiView;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 * VIAView - Contains start method from Application. Handles all program start
 * operations.
 * 
 * @author Kevin
 * @version 1.0, 14/12/2017
 * @see Application
 */
public class VIAView extends Application {
	private static FileIO file = new FileIO();
	private static VIAModel viaModel;
	private static VIAController viaContr = new VIAController();

	public void start(Stage stage) throws Exception {
		file.setVIAModelFromFile();
		viaModel = file.getVIAModel();
		// invoke fxml loader
		FXMLLoader load = new FXMLLoader();
		// set location of the FXML doc
		load.setLocation(getClass().getResource("viamain.fxml"));
		Parent root = load.load();
		// Build the scene
		Scene scene = new Scene(root);
		// show the window of the scene graph
		stage.sizeToScene();
		stage.setTitle("VIA");
		stage.setScene(scene);
		stage.show();
		stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
			public void handle(WindowEvent we) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Attention");
				alert.setHeaderText("");
				alert.setContentText("Content has been saved. Closing application.");
				alert.showAndWait();
			}
		});
	}

	/**
	 * main - runs launch from Application. Added Runtime ShutdownHook to set the
	 * VIAModel from FileIO then calls setToFile.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
			public void run() {
				file.setVIAModel(viaModel);
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

	public VIAModel viaModFromFile() {
		return viaModel;
	}

}
