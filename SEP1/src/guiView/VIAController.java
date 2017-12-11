package guiView;

import java.io.IOException; 
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

public class VIAController implements Initializable 
{
	@FXML
	private TableView<MemberModel> tableViewMember = new TableView<>();
	@FXML
	private TableColumn<MemberModel, String> tableMemberColumnName = new TableColumn<>();
	@FXML
	private TableColumn<MemberModel, String> tableMemberColumnAge = new TableColumn<>();
	@FXML
	private TableColumn<MemberModel, String> tableMemberColumnAddress = new TableColumn<>();
	@FXML
	private TableColumn<MemberModel, String> tableMemberColumnTel = new TableColumn<>();
	@FXML
	private TableColumn<MemberModel, String> tableMemberColumnEmail = new TableColumn<>();
	@FXML
	private TableColumn<MemberModel, String> tableMemberColumnCoursePref = new TableColumn<>();
	@FXML
	private TableColumn<MemberModel, String> tableMemberColumnMembPay = new TableColumn<>();

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
	private Button btnLecturerAdd;
	@FXML
	private Button btnLecturerBack;
	@FXML
	private TableView<Lecturer> tableViewLecturer = new TableView<Lecturer>();
	@FXML
	private TableColumn<Lecturer, String> tableLecturerColumnName = new TableColumn<Lecturer, String>();
	@FXML
   private TableColumn<Lecturer, String> tableLecturerColumnEmail = new TableColumn<Lecturer, String>();
	@FXML
   private TableColumn<Lecturer, String> tableLecturerColumnCourseSpecification = new TableColumn<Lecturer, String>();
	@FXML
   private TableColumn<Lecturer, String> tableLecturerColumnTelNumber = new TableColumn<Lecturer, String>();
	@FXML
   private TableColumn<Lecturer, String> tableLecturerColumnAdvertReq = new TableColumn<Lecturer, String>();
	
	MemberModel other = new MemberModel("");
	//Necessary initializations for Lecturer
	private String value = "";
	private static LecturerList init = new LecturerList();
	private static ObservableList<Lecturer> dataInLecturerTable = FXCollections.observableList(init.getListOfLecturers());
	
	private EventsList el1 = new EventsList();
	
	@Override
   public void initialize(URL location, ResourceBundle resources) 
	{
	   //Creating and populating Lecturer table
      tableLecturerColumnName.setCellValueFactory(new PropertyValueFactory<Lecturer, String>("name"));
      tableLecturerColumnEmail.setCellValueFactory(new PropertyValueFactory<Lecturer, String>("email"));
      tableLecturerColumnCourseSpecification.setCellValueFactory(new PropertyValueFactory<Lecturer, String>("courseSpec"));
      tableLecturerColumnTelNumber.setCellValueFactory(new PropertyValueFactory<Lecturer, String>("telNumber"));
      tableLecturerColumnAdvertReq.setCellValueFactory(new PropertyValueFactory<Lecturer, String>("advertReq"));
      tableViewLecturer.setItems(dataInLecturerTable);

	   //Radio Buttons
	   ToggleGroup group = new ToggleGroup();
	   radioBtnLecturerYes.setToggleGroup(group);
	   radioBtnLecturerNo.setToggleGroup(group);
	   group.selectToggle(radioBtnLecturerNo);
	   group.selectedToggleProperty().addListener(new ChangeListener<Toggle>()
	         {
	            @Override
	            public void changed(ObservableValue<? extends Toggle> ov,
	                  Toggle t1, Toggle t2)
	            {
	               RadioButton check = (RadioButton)t1.getToggleGroup().getSelectedToggle();
	               value = check.getText();
	               
	            }
	         });
//	      eventsMainTable = new TableView<Events>();
//	      eventTableCol1.setCellValueFactory(new PropertyValueFactory<Events, String>("Random Test"));
//	      EventsList el1 = new EventsList();
//	      for (int i = 0; i < 5; i++) {
//	    	  Events event1 = new Events();
//	    	  data.add(event1);
//	      }
	      
	   }
	

	private final ObservableList<MemberModel> memberObservableList = FXCollections
			.observableArrayList(generateMemberTable());

	public void initialize() {
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

		tableMemberColumnName.setCellValueFactory(new PropertyValueFactory<MemberModel, String>("name"));
		tableMemberColumnAge.setCellValueFactory(new PropertyValueFactory<MemberModel, String>("age"));
		tableMemberColumnAddress.setCellValueFactory(new PropertyValueFactory<MemberModel, String>("address"));
		tableMemberColumnTel.setCellValueFactory(new PropertyValueFactory<MemberModel, String>("tel"));
		tableMemberColumnEmail.setCellValueFactory(new PropertyValueFactory<MemberModel, String>("email"));
		tableMemberColumnCoursePref.setCellValueFactory(new PropertyValueFactory<MemberModel, String>("coursePref"));
		tableMemberColumnMembPay.setCellValueFactory(new PropertyValueFactory<MemberModel, String>("membPay"));
		tableViewMember.setItems(memberObservableList);
		

	}

	private ArrayList<Events> generateTable() {
		ArrayList<Events> ar1 = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			ar1.add(new Events());
		}
		return ar1;
	}

	private ArrayList<MemberModel> generateMemberTable() {
		ArrayList<MemberModel> ar1 = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			ar1.add(new MemberModel("random"));
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

	public void add() {
		MyDate membPay = new MyDate();
		MemberModel newMember = new MemberModel(txtFieldMemberName.getText(),
				Integer.parseInt(txtFieldMemberAge.getText()), txtFieldMemberAddress.getText(),
				Integer.parseInt(txtFieldMemberTel.getText()), txtFieldMemberEmail.getText(),
				txtFieldMemberCoursePref.getText(), membPay);
		other.addMember(newMember);
		JOptionPane.showMessageDialog(null, "New Member has been added");
	}
	   public void addLect(ActionEvent event)
	   {
	      Lecturer newLecturer = new Lecturer(txtFieldLecturerName.getText(), txtFieldLecturerEmail.getText(), txtFieldLecturerCourseSpec.getText(), txtFieldLecturerTelNumber.getText(), value);
         dataInLecturerTable.add(newLecturer);
         JOptionPane.showMessageDialog(null, "Lecturer added sucessfully!");
	   }

	public void addEvent() {
		String temp = addEventDate.getText();
		String[] temp2 = temp.split("/");
		MyDate date1 = new MyDate(Integer.parseInt(temp2[0]), Integer.parseInt(temp2[1]), Integer.parseInt(temp2[2]));
		Events event1 = new Events(addEventName.getText(), date1, Integer.parseInt(addEventDuration.getText()),
				addEventType.getText(), addEventLocation.getText(), addEventCategory.getText(),
				Double.parseDouble(addEventPrice.getText()), Integer.parseInt(addEventMinPartic.getText()),
				Integer.parseInt(addEventMaxPartic.getText()), false);
		JOptionPane.showMessageDialog(null, "Event Succesfully added");
		el1.addEvent(event1);
	}

	public ObservableList<MemberModel> getMemberObservableList() {
		return memberObservableList;
	}

}
