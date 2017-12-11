package guiView;

import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
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
	private EventsList el1 = new EventsList();
	private ObservableList<Events> data = FXCollections.observableArrayList(el1.getListOfEvents());
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
	private Label txtLabelAddLecturerName;
	@FXML
	private Label txtLabelAddLecturerEmail;
	@FXML
	private Label txtLabelAddLecturerCourseSpec;
	@FXML
	private Label txtLabelAddLecturerTelNumber;
	@FXML
	private Label txtLabelAddLecturerAdvertReq;
	@FXML
	private TextField txtFieldAddLecturerName;
	@FXML
	private TextField txtFieldAddLecturerEmail;
	@FXML
	private TextField txtFieldAddLecturerCourseSpec;
	@FXML
	private TextField txtFieldAddLecturerTelNumber;
	@FXML
	private RadioButton radioBtnAddLecturerYes = new RadioButton();
	@FXML
	private RadioButton radioBtnAddLecturerNo = new RadioButton();
	@FXML
	private Button btnAddNewLecturer;
	@FXML
	private Button btnLecturerBack;
	@FXML
	private Button btnDeleteLecturer;
	@FXML
	private Button btnLecturerAdd;
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
	@FXML
	private Label txtLabelEditLecturerName;
	@FXML
	private Label txtLabelEditLecturerEmail;
	@FXML
	private Label txtLabelEditLecturerCourseSpec;
	@FXML
	private Label txtLabelEditLecturerTelNumber;
	@FXML
	private Label txtLabelEditLecturerAvertReq;
	@FXML
	private TextField txtFieldEditLecturerName;
	@FXML
	private TextField txtFieldEditLecturerEmail;
	@FXML
	private TextField txtFieldEditLecturerCourseSpec;
	@FXML
	private TextField txtFieldEditLecturerTelNumber;
	@FXML
	private RadioButton radioBtnEditLecturerYes = new RadioButton();
	@FXML
	private RadioButton radioBtnEditLecturerNo = new RadioButton();

	// Necessary initializations for Lecturer
	private String value = "";
	private static LecturerList init = new LecturerList();
	private static ObservableList<Lecturer> dataInLecturerTable = FXCollections.observableList(init.getListOfLecturers());
	
	// Necessary initializations for Member
	private static MemberList list = new MemberList();
	private static ObservableList<Member> memberObservableList = FXCollections.observableArrayList(list.getListOfMembers());



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
		tableViewLecturer.setEditable(true);
		
		//Making table cells editable
		tableColumnLecturerName.setCellFactory(TextFieldTableCell.forTableColumn());
		tableColumnLecturerName.setOnEditCommit(new EventHandler<CellEditEvent<Lecturer, String>>()
				{
			@Override
			public void handle(CellEditEvent<Lecturer, String> t)
			{
				((Lecturer) t.getTableView().getItems().get(t.getTablePosition().getRow())).setName(t.getNewValue());
			}
				}
			
				);
		
		tableColumnLecturerEmail.setCellFactory(TextFieldTableCell.forTableColumn());
		tableColumnLecturerEmail.setOnEditCommit(new EventHandler<CellEditEvent<Lecturer, String>>()
				{
			@Override
			public void handle(CellEditEvent<Lecturer, String> t)
			{
				((Lecturer) t.getTableView().getItems().get(t.getTablePosition().getRow())).setEmail(t.getNewValue());
			}
				}
			
				);
		
		tableColumnLecturerCourseSpecification.setCellFactory(TextFieldTableCell.forTableColumn());
		tableColumnLecturerCourseSpecification.setOnEditCommit(new EventHandler<CellEditEvent<Lecturer, String>>()
				{
			@Override
			public void handle(CellEditEvent<Lecturer, String> t)
			{
				((Lecturer) t.getTableView().getItems().get(t.getTablePosition().getRow())).setCourseSpec(t.getNewValue());
			}
				}
			
				);
		
		tableColumnLecturerTelNumber.setCellFactory(TextFieldTableCell.forTableColumn());
		tableColumnLecturerTelNumber.setOnEditCommit(new EventHandler<CellEditEvent<Lecturer, String>>()
				{
			@Override
			public void handle(CellEditEvent<Lecturer, String> t)
			{
				((Lecturer) t.getTableView().getItems().get(t.getTablePosition().getRow())).setTelNumber(t.getNewValue());
			}
				}
			
				);
		
		tableColumnLecturerAdvertReq.setCellFactory(TextFieldTableCell.forTableColumn());
		tableColumnLecturerAdvertReq.setOnEditCommit(new EventHandler<CellEditEvent<Lecturer, String>>()
				{
			@Override
			public void handle(CellEditEvent<Lecturer, String> t)
			{
				((Lecturer) t.getTableView().getItems().get(t.getTablePosition().getRow())).setAdvertReq(t.getNewValue());
			}
				}
			
				);
		
		// Radio Buttons for add lecturer UI
		ToggleGroup addLecturergroup = new ToggleGroup();
		radioBtnAddLecturerYes.setToggleGroup(addLecturergroup);
		radioBtnAddLecturerNo.setToggleGroup(addLecturergroup);
		addLecturergroup.selectToggle(radioBtnAddLecturerNo);
		addLecturergroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
			@Override
			public void changed(ObservableValue<? extends Toggle> ov, Toggle t1, Toggle t2) {
				RadioButton check = (RadioButton) t1.getToggleGroup().getSelectedToggle();
				value = check.getText();
			}
		});
		
		/*// Radio Buttons for edit lecturer UI
		ToggleGroup editLecturergroup = new ToggleGroup();
		radioBtnEditLecturerYes.setToggleGroup(editLecturergroup);
		radioBtnEditLecturerNo.setToggleGroup(editLecturergroup);
		editLecturergroup.selectToggle(radioBtnEditLecturerNo);
		editLecturergroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
			@Override
			public void changed(ObservableValue<? extends Toggle> ov2, Toggle t3, Toggle t4) {
				RadioButton check = (RadioButton) t3.getToggleGroup().getSelectedToggle();
				value = check.getText();
			}
		});*/
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
		System.out.println(init.getListOfLecturers());
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
		ObservableList <Member> selectedMember = tableMemberView.getSelectionModel().getSelectedItems();
		ObservableList <Member> allMembers = tableMemberView.getItems();
		selectedMember.forEach(allMembers::remove);
	}

	public void addLect(ActionEvent event) 
	{
		Lecturer newLecturer = new Lecturer(txtFieldAddLecturerName.getText(), txtFieldAddLecturerEmail.getText(),txtFieldAddLecturerCourseSpec.getText(), txtFieldAddLecturerTelNumber.getText(), value);
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
//		String temp = addEventDate.getText();
//		String[] temp2 = temp.split("/");
//		MyDate date1 = new MyDate(Integer.parseInt(temp2[0]), Integer.parseInt(temp2[1]), Integer.parseInt(temp2[2]));
		Events event1 = new Events(addEventName.getText(), addEventDate.getText(), addEventDuration.getText(),
				addEventType.getText(), addEventLocation.getText(), addEventCategory.getText(),
				addEventPrice.getText(), addEventMinPartic.getText(),
				addEventMaxPartic.getText(), false);
		el1.addEvent(event1);
		JOptionPane.showMessageDialog(null, "Event added sucessfully!");
	}

}
