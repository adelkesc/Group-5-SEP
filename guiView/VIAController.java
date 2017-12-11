package guiView;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class VIAController {
	@FXML
	private Button btnMainPageEvents;
	@FXML
	private AnchorPane mainAnchor;
	@FXML
	private AnchorPane secondAnchor;
	@FXML
	private Button btnMainPageLect;
	@FXML
	private Button btnMainPageMemb;

	public void initialize() {
		// performs any necessary initialisations

	}

	public void toEventsScene() throws IOException {
		AnchorPane pane = FXMLLoader.load(getClass().getResource("eventsView.fxml"));
		mainAnchor.getChildren().setAll(pane);
	}
	public void toMemberScene() throws IOException {
		AnchorPane pane = FXMLLoader.load(getClass().getResource("MemberView.fxml"));
		mainAnchor.getChildren().setAll(pane);
	}
	public void toLecturerScene() throws IOException {
		AnchorPane pane = FXMLLoader.load(getClass().getResource("LecturerView.fxml"));
		mainAnchor.getChildren().setAll(pane);
	}

	public void goBack() throws IOException {
		AnchorPane pane = FXMLLoader.load(getClass().getResource("viamain.fxml"));
		secondAnchor.getChildren().setAll(pane);
	}

}
