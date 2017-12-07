package guiView;
import javax.swing.JOptionPane;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AddMemberController {
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
	@FXML
	private Button btnMemberAdd;
	MemberModel other = new MemberModel(null);
	public void initialize() {
		// Perform any necessary in its

	}
	public void add() {
		MemberModel newMember= new MemberModel(txtFieldMemberName.getText(),Integer.parseInt(txtFieldMemberAge.getText()),txtFieldMemberAddress.getText(), Integer.parseInt(txtFieldMemberTel.getText()), txtFieldMemberEmail.getText(), txtFieldMemberCoursePrefs.getText(), null);
		other.addMember(newMember);
		JOptionPane.showMessageDialog(null, "New Member has been added");
	}

}