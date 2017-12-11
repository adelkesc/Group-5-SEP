package guiView;

import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class VIAController implements Initializable, Serializable {
	@FXML
	private TableView<Member> tableMemberView = new TableView<Member>();
	@FXML
	private TableColumn<Member, String> tableColumnMemberName = new TableColumn<Member, String>();
	@FXML
	private TableColumn<Member, String> tableColumnMemberAge = new TableColumn<Member, String>();
	@FXML
	private TableColumn<Member, String> tableColumnMemberAddress = new TableColumn<Member, String>();
	@FXML
	private TableColumn<Member, String> tableColumnMemberTel = new TableColumn<Member, String>();
	@FXML
	private TableColumn<Member, String> tableColumnMemberEmail = new TableColumn<Member, String>();
	@FXML
	private TableColumn<Member, String> tableColumnMemberCoursePref = new TableColumn<Member, String>();
	@FXML
	private TableColumn<Member, String> tableColumnMemberMembPay = new TableColumn<Member, String>();
	// Member FXML
	@FXML
	private Label txtLabelMemberName;
	@FXML
	private Label txtLabelMemberAge;
	@FXML
	private Label txtLabelMemberAddress;
	@FXML
	private Label txtLabelMemberTel;
	@FXML
	private Label txtLabelMemberEmail;
	@FXML
	private Label txtLabelMemberCoursePref;
	@FXML
	private Label txtLabelMemberMembPay;
	@FXML
	private TextField txtFieldMemberName;
	@FXML
	private TextField txtFieldMemberAge;
	@FXML
	private TextField txtFieldMemberAddress;
	@FXML
	private TextField txtFieldMemberTel;
	@FXML
	private TextField txtFieldMemberEmail;
	@FXML
	private TextField txtFieldMemberCoursePref;
	@FXML
	private TextField txtFieldMemberMembPay;
	@FXML
	private TableView<Events> eventsMainTable = new TableView<>();
	private ObservableList<Events> data = FXCollections.observableArrayList(generateTable());
	@FXML
	private TableColumn<Events, String> eventTableCol1 = new TableColumn<>();
	@FXML
	private TableColumn<Events, String> eventTableCol2 = new TableColumn<>();
	@FXML
	private TableColumn<Events, String> eventTableCol3 = new TableColumn<>();
	@FXML
	private TableColumn<Events, String> eventTableCol4 = new TableColumn<>();
	@FXML
	private TableColumn<Events, String> eventTableCol5 = new TableColumn<>();
	@FXML
	private TableColumn<Events, String> eventTableCol6 = new TableColumn<>();
	@FXML
	private TableColumn<Events, String> eventTableCol7 = new TableColumn<>();
	@FXML
	private TableColumn<Events, String> eventTableCol8 = new TableColumn<>();
	@FXML
	private TableColumn<Events, String> eventTableCol9 = new TableColumn<>();
	@FXML
	private TableColumn<Events, String> eventTableCol10 = new TableColumn<>();
	@FXML
	private TableColumn<Events, String> eventTableCol11 = new TableColumn<>();
	@FXML
	private TableColumn<Events, String> eventTableCol12 = new TableColumn<>();
	@FXML
	private TextField addEventName;
	@FXML
	private TextField addEventDate;
	@FXML
	private TextField addEventDuration;
	@FXML
	private TextField addEventType;
	@FXML
	private TextField addEventLocation;
	@FXML
	private TextField addEventCategory;
	@FXML
	private TextField addEventPrice;
	@FXML
	private TextField addEventMinPartic;
	@FXML
	private TextField addEventMaxPartic;

	// main page FXML
	@FXML
	private Button btnMemberAdd;
	@FXML
	private Button btnDeleteMember;
	@FXML
	private Button btnMainPageEvents;
	@FXML
	private Button goBack;
	@FXML
	private AnchorPane mainAnchor;
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
	private RadioButton radioBtnLecturerYes = new RadioButton();
	@FXML
	private RadioButton radioBtnLecturerNo = new RadioButton();
	@FXML
	private Button btnAddNewLecturer;
	@FXML
	private Button btnLecturerBack;
	@FXML
	private Button btnDeleteLecturer;
	@FXML
	private TableView<Lecturer> tableViewLecturer = new TableView<Lecturer>();
	@FXML
	private TableColumn<Lecturer, String> tableColumnLecturerName = new TableColumn<Lecturer, String>();
	@FXML
	private TableColumn<Lecturer, String> tableColumnLecturerEmail = new TableColumn<Lecturer, String>();
	@FXML
	private TableColumn<Lecturer, String> tableColumnLecturerCourseSpecification = new TableColumn<Lecturer, String>();
	@FXML
	private TableColumn<Lecturer, String> tableColumnLecturerTelNumber = new TableColumn<Lecturer, String>();
	@FXML
	private TableColumn<Lecturer, String> tableColumnLecturerAdvertReq = new TableColumn<Lecturer, String>();

	// Necessary initializations for Lecturer
	private String value = "";
	private static LecturerList init = new LecturerList();
	private static ObservableList<Lecturer> dataInLecturerTable = FXCollections.observableList(init.getListOfLecturers());
	
	// Necessary initializations for Member
	private static MemberList list = new MemberList();
	private static ObservableList<Member> memberObservableList = FXCollections.observableArrayList(list.getListOfMembers());

	private EventsList el1 = new EventsList();

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		eventTableCol1.setCellValueFactory(new PropertyValueFactory<Events, String>("name"));
		eventTableCol2.setCellValueFactory(new PropertyValueFactory<Events, String>("date"));
		eventTableCol3.setCellValueFactory(new PropertyValueFactory<Events, String>("duration"));
		eventTableCol4.setCellValueFactory(new PropertyValueFactory<Events, String>("type"));
		eventTableCol5.setCellValueFactory(new PropertyValueFactory<Events, String>("location"));
		eventTableCol6.setCellValueFactory(new PropertyValueFactory<Events, String>("category"));
		eventTableCol7.setCellValueFactory(new PropertyValueFactory<Events, String>("null"));
		eventTableCol8.setCellValueFactory(new PropertyValueFactory<Events, String>("null"));
		eventTableCol9.setCellValueFactory(new PropertyValueFactory<Events, String>("price"));
		eventTableCol10.setCellValueFactory(new PropertyValueFactory<Events, String>("MinPartic"));
		eventTableCol11.setCellValueFactory(new PropertyValueFactory<Events, String>("maxPartic"));
		eventTableCol12.setCellValueFactory(new PropertyValueFactory<Events, String>("isFinalized"));
		eventsMainTable.setItems(data);
		
		tableColumnMemberName.setCellValueFactory(new PropertyValueFactory<Member, String>("name"));
		tableColumnMemberAge.setCellValueFactory(new PropertyValueFactory<Member, String>("age"));
		tableColumnMemberAddress.setCellValueFactory(new PropertyValueFactory<Member, String>("address"));
		tableColumnMemberTel.setCellValueFactory(new PropertyValueFactory<Member, String>("tel"));
		tableColumnMemberEmail.setCellValueFactory(new PropertyValueFactory<Member, String>("email"));
		tableColumnMemberCoursePref.setCellValueFactory(new PropertyValueFactory<Member, String>("coursePref"));
		tableColumnMemberMembPay.setCellValueFactory(new PropertyValueFactory<Member, String>("membPay"));
		tableMemberView.setItems(memberObservableList);

		// Creating and populating Lecturer table
		tableColumnLecturerName.setCellValueFactory(new PropertyValueFactory<Lecturer, String>("name"));
		tableColumnLecturerEmail.setCellValueFactory(new PropertyValueFactory<Lecturer, String>("email"));
		tableColumnLecturerCourseSpecification.setCellValueFactory(new PropertyValueFactory<Lecturer, String>("courseSpec"));
		tableColumnLecturerTelNumber.setCellValueFactory(new PropertyValueFactory<Lecturer, String>("telNumber"));
		tableColumnLecturerAdvertReq.setCellValueFactory(new PropertyValueFactory<Lecturer, String>("advertReq"));
		tableViewLecturer.setItems(dataInLecturerTable);

		// Radio Buttons
		ToggleGroup group = new ToggleGroup();
		radioBtnLecturerYes.setToggleGroup(group);
		radioBtnLecturerNo.setToggleGroup(group);
		group.selectToggle(radioBtnLecturerNo);
		group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
			@Override
			public void changed(ObservableValue<? extends Toggle> ov, Toggle t1, Toggle t2) {
				RadioButton check = (RadioButton) t1.getToggleGroup().getSelectedToggle();
				value = check.getText();
			}
		});
	}

	private ArrayList<Events> generateTable() {
		ArrayList<Events> ar1 = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			ar1.add(new Events());
		}
		return ar1;
	}

	public void toEventsScene() throws IOException {
		AnchorPane paneEvents = FXMLLoader.load(getClass().getResource("eventsView.fxml"));
		mainAnchor.getChildren().setAll(paneEvents);
	}

	public void toMemberScene() throws IOException {
		AnchorPane paneMembers = FXMLLoader.load(getClass().getResource("MemberView.fxml"));
		mainAnchor.getChildren().setAll(paneMembers);
	}

	public void toLecturerScene() throws IOException {
		AnchorPane paneLecturers = FXMLLoader.load(getClass().getResource("DisplayLecturers.fxml"));
		mainAnchor.getChildren().setAll(paneLecturers);
	}

	public void goBack() throws IOException {
		AnchorPane pane = FXMLLoader.load(getClass().getResource("viamain.fxml"));
		mainAnchor.getChildren().setAll(pane);
	}

	public void toAddMemberScene() throws IOException {
		AnchorPane pane = FXMLLoader.load(getClass().getResource("AddMember.fxml"));
		mainAnchor.getChildren().setAll(pane);
	}

	public void toAddLecturerScene() throws IOException {
		AnchorPane pane = FXMLLoader.load(getClass().getResource("AddLecturer.fxml"));
		mainAnchor.getChildren().setAll(pane);
	}

	public void toAddEventScene() throws IOException {
		AnchorPane pane = FXMLLoader.load(getClass().getResource("addNewEvent.fxml"));
		mainAnchor.getChildren().setAll(pane);
	}

	public void addMember(ActionEvent event) {
		Member newMember = new Member(txtFieldMemberName.getText(), txtFieldMemberAge.getText(),txtFieldMemberAddress.getText(), txtFieldMemberTel.getText(), txtFieldMemberEmail.getText(),txtFieldMemberCoursePref.getText(), txtFieldMemberMembPay.getText());
		memberObservableList.add(newMember);
		JOptionPane.showMessageDialog(null, "New Member has been added");
	}
	public void deleteMember(ActionEvent event) {
		
	}

	public void addLect(ActionEvent event) 
	{
		Lecturer newLecturer = new Lecturer(txtFieldLecturerName.getText(), txtFieldLecturerEmail.getText(),txtFieldLecturerCourseSpec.getText(), txtFieldLecturerTelNumber.getText(), value);
		dataInLecturerTable.add(newLecturer);
		JOptionPane.showMessageDialog(null, "Lecturer added sucessfully!");
	}
	
	public void deleteLecturer(ActionEvent event)
	{
		ObservableList <Lecturer> selectedLecturer = tableViewLecturer.getSelectionModel().getSelectedItems();
		ObservableList <Lecturer> allLecturers = tableViewLecturer.getItems();
		selectedLecturer.forEach(allLecturers::remove);
	}

	public void addEvent() {
		String temp = addEventDate.getText();
		String[] temp2 = temp.split("/");
		MyDate date1 = new MyDate(Integer.parseInt(temp2[0]), Integer.parseInt(temp2[1]), Integer.parseInt(temp2[2]));
		Events event1 = new Events(addEventName.getText(), date1, Integer.parseInt(addEventDuration.getText()),
				addEventType.getText(), addEventLocation.getText(), addEventCategory.getText(),
				Double.parseDouble(addEventPrice.getText()), Integer.parseInt(addEventMinPartic.getText()),
				Integer.parseInt(addEventMaxPartic.getText()), false);
		System.out.println(event1);
		el1.addEvent(event1);
	}

}
