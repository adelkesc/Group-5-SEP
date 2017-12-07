package guiView;

import java.io.IOException;

import javax.swing.JOptionPane;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class VIAController {
	//Member FXML
	@FXML
	private Label txtLabelMemberName;
	private Label txtLabelMemberAge;
	private Label txtLabelMemberAddress;
	private Label txtLabelMemberTel;
	private Label txtLabelMemberEmail;
	private Label txtLabelMemberCoursePref;
	private Label txtLabelMemberMembPay;
	@FXML
	private TextField txtFieldMemberName;
	private TextField txtFieldMemberAge;
	private TextField txtFieldMemberAddress;
	private TextField txtFieldMemberTel;
	private TextField txtFieldMemberEmail;
	private TextField txtFieldMemberCoursePrefs;
	private TextField txtFieldMemberMembPay;
	//main page FXML
	@FXML
	private Button btnMemberAdd;
	MemberModel other = new MemberModel(null);
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
	public void toAddMemberScene() throws IOException{
		AnchorPane pane = FXMLLoader.load(getClass().getResource("AddMember.fxml"));
		secondAnchor.getChildren().setAll(pane);
	}

	public void add() {
		MemberModel newMember= new MemberModel(txtFieldMemberName.getText(),Integer.parseInt(txtFieldMemberAge.getText()),txtFieldMemberAddress.getText(), Integer.parseInt(txtFieldMemberTel.getText()), txtFieldMemberEmail.getText(), txtFieldMemberCoursePrefs.getText(), null);
		other.addMember(newMember);
		JOptionPane.showMessageDialog(null, "New Member has been added");
	}

}
