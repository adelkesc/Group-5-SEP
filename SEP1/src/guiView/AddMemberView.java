package Project;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AddMemberView extends Application {

		@Override
		public void start(Stage stage) throws Exception {
			// invoke the fxml loader
			FXMLLoader loader = new FXMLLoader();
			// set controller
			loader.setController(new AddMemberController());
			// set the location of the fxml doc
			loader.setLocation(getClass().getResource("AddMember.fxml"));
			Parent root = loader.load();
			// Build the Scene Graph
			Scene scene = new Scene(root);
			// show the window using the scene graph
			stage.setTitle("Add Member here:");
			stage.setScene(scene);
			stage.show();
		}

		public static void main(String[] args) {
			launch(args);
		}

	}
