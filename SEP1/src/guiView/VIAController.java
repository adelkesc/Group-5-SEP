package guiView;

import java.io.IOException;
import javax.swing.JOptionPane;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class VIAController {
	// Member FXML
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
	// main page FXML
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

	// Lecturer FXML
	@FXML
	private Label txtLabelLecturerName;
	@FXML
	private Label txtLabelLecturerEmail;
	@FXML
	private Label txtLabelLecturerCourseSpec;
	@FXML
	private Label txtLabelLecturerTelNumber;
	@FXML
	private Label txtLabelLecturerAdvertReq;
	@FXML
	private TextField txtFieldLecturerName;
	@FXML
	private TextField txtFieldLecturerEmail;
	@FXML
	private TextField txtFieldLecturerCourseSpec;
	@FXML
	private TextField txtFieldLecturerTelNumber;
	@FXML
	private RadioButton radioBtnLecturerYes;
	@FXML
	private RadioButton radioBtnLecturerNo;
	@FXML
	private Button btnLecturerAdd;
	@FXML
	private Button btnLecturerBack;

	private String value = "";
	private LecturerModel init = new LecturerModel(null, null, null, 0);

	public void initialize() {
//	      ToggleGroup group = new ToggleGroup();
//	      radioBtnLecturerYes.setToggleGroup(group);
//	      radioBtnLecturerNo.setToggleGroup(group);
//	      group.selectToggle(radioBtnLecturerNo);
//	      group.selectedToggleProperty().addListener(new ChangeListener<Toggle>()
//	            {
//	               @Override
//	               public void changed(ObservableValue<? extends Toggle> ov,
//	                     Toggle t1, Toggle t2)
//	               {
//	                  RadioButton check = (RadioButton)t1.getToggleGroup().getSelectedToggle();
//	                  value = check.getText();
//	                  
//	               }
//	            });
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
		AnchorPane pane = FXMLLoader.load(getClass().getResource("DisplayLecturers.fxml"));
		mainAnchor.getChildren().setAll(pane);
	}

	public void goBack() throws IOException {
		AnchorPane pane = FXMLLoader.load(getClass().getResource("viamain.fxml"));
		secondAnchor.getChildren().setAll(pane);
	}

	public void toAddMemberScene() throws IOException {
		AnchorPane pane = FXMLLoader.load(getClass().getResource("AddMember.fxml"));
		secondAnchor.getChildren().setAll(pane);
	}
	public void toAddLecturerScene() throws IOException{
		AnchorPane pane = FXMLLoader.load(getClass().getResource("AddLecturer.fxml"));
		secondAnchor.getChildren().setAll(pane);
	}

	public void add() {
		MemberModel newMember = new MemberModel(txtFieldMemberName.getText(),
				Integer.parseInt(txtFieldMemberAge.getText()), txtFieldMemberAddress.getText(),
				Integer.parseInt(txtFieldMemberTel.getText()), txtFieldMemberEmail.getText(),
				txtFieldMemberCoursePrefs.getText(), null);
		other.addMember(newMember);
		JOptionPane.showMessageDialog(null, "New Member has been added");
	}
	   public void addLect()
	   {
	      boolean advertReq;
	      if(value.equals("Yes"))
	         advertReq = true;
	      else
	         advertReq = false;
	      LecturerModel newLecturer = new LecturerModel(txtFieldLecturerName.getText(), txtFieldLecturerEmail.getText(), txtFieldLecturerCourseSpec.getText(), Integer.parseInt(txtFieldLecturerTelNumber.getText()), advertReq);
	      init.addLecturer(newLecturer);
	      JOptionPane.showMessageDialog(null, "Lecturer added sucessfully!");
	   }

}
