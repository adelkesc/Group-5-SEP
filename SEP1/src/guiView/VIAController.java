package guiView;

import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
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
import javafx.scene.paint.Paint;

/**
 * VIAController - Handles all actions on the user interface.
 * 
 * @Author Kevin Adams, Lukas Zagata, Muhammad Nadeem, Amahdya Delkescamp
 * @Version Number 1.0, Date 14-12-2017
 */
public class VIAController implements Initializable, Serializable {

	private static final long serialVersionUID = 1L;
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
	private TextField txtFieldAddMemberName;
	@FXML
	private TextField txtFieldAddMemberAge;
	@FXML
	private TextField txtFieldAddMemberAddress;
	@FXML
	private TextField txtFieldAddMemberTel;
	@FXML
	private TextField txtFieldAddMemberEmail;
	@FXML
	private TextField txtFieldAddMemberCoursePref;
	@FXML
	private TextField txtFieldAddMemberMembPay;
	@FXML
	private TextField txtFieldSearchMember;
	@FXML
	private ChoiceBox<String> choiceBoxSearchMember = new ChoiceBox<String>(searchMemberChoices);
	@FXML
	private TableView<Events> eventsMainTable = new TableView<Events>();

	// Necessary intialisations for Event
	private static EventsList eventsList1 = new EventsList();
	private static ObservableList<Events> dataInEventObserableList = FXCollections
			.observableList(eventsList1.getListOfEvents());
	private static ObservableList<String> searchEventChoices = FXCollections.observableArrayList();

	@FXML
	private Label txtLabelAddLecturerToTheEvent;
	@FXML
	private TableColumn<Events, String> eventTableCol1 = new TableColumn<Events, String>();
	@FXML
	private TableColumn<Events, String> eventTableCol2 = new TableColumn<Events, String>();
	@FXML
	private TableColumn<Events, String> eventTableCol3 = new TableColumn<Events, String>();
	@FXML
	private TableColumn<Events, String> eventTableCol4 = new TableColumn<Events, String>();
	@FXML
	private TableColumn<Events, String> eventTableCol5 = new TableColumn<Events, String>();
	@FXML
	private TableColumn<Events, String> eventTableCol6 = new TableColumn<Events, String>();
	@FXML
	private TableColumn<Events, String> eventTableCol7 = new TableColumn<Events, String>();
	@FXML
	private TableColumn<Events, String> eventTableCol8 = new TableColumn<Events, String>();
	@FXML
	private TableColumn<Events, String> eventTableCol9 = new TableColumn<Events, String>();
	@FXML
	private TableColumn<Events, String> eventTableCol10 = new TableColumn<Events, String>();
	@FXML
	private TableColumn<Events, String> eventTableCol11 = new TableColumn<Events, String>();
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
	@FXML
	private TextField txtFieldSearchEvent;
	@FXML
	private Button eventsDeleteButton = new Button();
	@FXML
	private ChoiceBox<String> choiceBoxSearchEvent = new ChoiceBox<String>(searchEventChoices);
	@FXML
	private Button btnAddLecturerToEvent = new Button();
	@FXML
	private Button btnGoBackToCreateEvent;
	@FXML
	private Button btnAddLecturerToTheEvent = new Button();
	@FXML
	private Button btnFinalizeEvent = new Button();
	@FXML
	private Button btnAddMemberToEvent = new Button();

	// main page FXML
	@FXML
	private Button btnMemberAdd;
	@FXML
	private Button btnDeleteMember;
	@FXML
	private Button btnMemberEdit;
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

	// Necessary initializations for Lecturer
	private static String nameOfTheChosenLecturer = "";
	private String selectedRadioButton = "";
	private static LecturerList init = new LecturerList();
	private static ObservableList<Lecturer> dataInLecturerTable = FXCollections
			.observableList(init.getListOfLecturers());
	private static ObservableList<String> searchLecturerChoices = FXCollections.observableArrayList();
	private static boolean setEditable = true;

	// Lecturer FXML
	@FXML
	private TextField txtFieldAddLecturerToTheEvent = new TextField();
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
	private TextField txtFieldSearchLecturer;
	@FXML
	private RadioButton radioBtnAddLecturerYes = new RadioButton();
	@FXML
	private RadioButton radioBtnAddLecturerNo = new RadioButton();
	@FXML
	private Button btnAddNewLecturer = new Button();
	@FXML
	private Button btnLecturerBack = new Button();
	@FXML
	private Button btnDeleteLecturer = new Button();
	@FXML
	private Button btnLecturerAdd = new Button();
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
	private ChoiceBox<String> choiceBoxSearchLecturer = new ChoiceBox<String>(searchLecturerChoices);

	// Necessary initializations for Member
	private static ObservableList<String> searchMemberChoices = FXCollections.observableArrayList();
	private static MemberList list = new MemberList();
	private static ObservableList<Member> memberObservableList = FXCollections.observableList(list.getListOfMembers());

	private VIAModel viaModel = new VIAModel(eventsList1, list, init);
	static Paint value0 = Paint.valueOf("F28697");

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		txtFieldAddLecturerToTheEvent.setText(nameOfTheChosenLecturer);
		eventTableCol1.setCellValueFactory(new PropertyValueFactory<Events, String>("name"));
		eventTableCol2.setCellValueFactory(new PropertyValueFactory<Events, String>("date"));
		eventTableCol3.setCellValueFactory(new PropertyValueFactory<Events, String>("duration"));
		eventTableCol4.setCellValueFactory(new PropertyValueFactory<Events, String>("type"));
		eventTableCol5.setCellValueFactory(new PropertyValueFactory<Events, String>("location"));
		eventTableCol6.setCellValueFactory(new PropertyValueFactory<Events, String>("category"));
		eventTableCol7.setCellValueFactory(new PropertyValueFactory<Events, String>("conductor"));
		eventTableCol8.setCellValueFactory(new PropertyValueFactory<Events, String>("price"));
		eventTableCol9.setCellValueFactory(new PropertyValueFactory<Events, String>("minPartic"));
		eventTableCol10.setCellValueFactory(new PropertyValueFactory<Events, String>("maxPartic"));
		eventTableCol11.setCellValueFactory(new PropertyValueFactory<Events, String>("isFinalized"));
		eventsMainTable.setItems(dataInEventObserableList);
		eventsMainTable.setEditable(setEditable);
		eventsDeleteButton.disableProperty()
				.bind(Bindings.isEmpty(eventsMainTable.getSelectionModel().getSelectedItems()));
		btnAddMemberToEvent.disableProperty()
				.bind(Bindings.isEmpty(eventsMainTable.getSelectionModel().getSelectedItems()));
		btnFinalizeEvent.disableProperty()
				.bind(Bindings.isEmpty(eventsMainTable.getSelectionModel().getSelectedItems()));

		eventTableCol1.setCellFactory(TextFieldTableCell.forTableColumn());
		eventTableCol1.setOnEditCommit(new EventHandler<CellEditEvent<Events, String>>() {
			@Override
			public void handle(CellEditEvent<Events, String> t) {
				((Events) t.getTableView().getItems().get(t.getTablePosition().getRow())).setName(t.getNewValue());
			}
		});
		eventTableCol2.setCellFactory(TextFieldTableCell.forTableColumn());
		eventTableCol2.setOnEditCommit(new EventHandler<CellEditEvent<Events, String>>() {
			@Override
			public void handle(CellEditEvent<Events, String> t) {
				((Events) t.getTableView().getItems().get(t.getTablePosition().getRow())).setDate(t.getNewValue());
			}
		});
		eventTableCol3.setCellFactory(TextFieldTableCell.forTableColumn());
		eventTableCol3.setOnEditCommit(new EventHandler<CellEditEvent<Events, String>>() {
			@Override
			public void handle(CellEditEvent<Events, String> t) {
				((Events) t.getTableView().getItems().get(t.getTablePosition().getRow())).setDuration(t.getNewValue());
			}
		});
		eventTableCol4.setCellFactory(TextFieldTableCell.forTableColumn());
		eventTableCol4.setOnEditCommit(new EventHandler<CellEditEvent<Events, String>>() {
			@Override
			public void handle(CellEditEvent<Events, String> t) {
				((Events) t.getTableView().getItems().get(t.getTablePosition().getRow())).setType(t.getNewValue());
			}
		});
		eventTableCol5.setCellFactory(TextFieldTableCell.forTableColumn());
		eventTableCol5.setOnEditCommit(new EventHandler<CellEditEvent<Events, String>>() {
			@Override
			public void handle(CellEditEvent<Events, String> t) {
				((Events) t.getTableView().getItems().get(t.getTablePosition().getRow())).setLocation(t.getNewValue());
			}
		});
		eventTableCol6.setCellFactory(TextFieldTableCell.forTableColumn());
		eventTableCol6.setOnEditCommit(new EventHandler<CellEditEvent<Events, String>>() {
			@Override
			public void handle(CellEditEvent<Events, String> t) {
				((Events) t.getTableView().getItems().get(t.getTablePosition().getRow())).setCategory(t.getNewValue());
			}
		});
		eventTableCol8.setCellFactory(TextFieldTableCell.forTableColumn());
		eventTableCol8.setOnEditCommit(new EventHandler<CellEditEvent<Events, String>>() {
			@Override
			public void handle(CellEditEvent<Events, String> t) {
				((Events) t.getTableView().getItems().get(t.getTablePosition().getRow())).setPrice(t.getNewValue());
			}
		});
		eventTableCol9.setCellFactory(TextFieldTableCell.forTableColumn());
		eventTableCol9.setOnEditCommit(new EventHandler<CellEditEvent<Events, String>>() {
			@Override
			public void handle(CellEditEvent<Events, String> t) {
				((Events) t.getTableView().getItems().get(t.getTablePosition().getRow())).setMinPartic(t.getNewValue());
			}
		});
		eventTableCol10.setCellFactory(TextFieldTableCell.forTableColumn());
		eventTableCol10.setOnEditCommit(new EventHandler<CellEditEvent<Events, String>>() {
			@Override
			public void handle(CellEditEvent<Events, String> t) {
				((Events) t.getTableView().getItems().get(t.getTablePosition().getRow())).setMaxPartic(t.getNewValue());
			}
		});

		tableColumnMemberName.setCellValueFactory(new PropertyValueFactory<Member, String>("name"));
		tableColumnMemberAge.setCellValueFactory(new PropertyValueFactory<Member, String>("age"));
		tableColumnMemberAddress.setCellValueFactory(new PropertyValueFactory<Member, String>("address"));
		tableColumnMemberTel.setCellValueFactory(new PropertyValueFactory<Member, String>("tel"));
		tableColumnMemberEmail.setCellValueFactory(new PropertyValueFactory<Member, String>("email"));
		tableColumnMemberCoursePref.setCellValueFactory(new PropertyValueFactory<Member, String>("coursePref"));
		tableColumnMemberMembPay.setCellValueFactory(new PropertyValueFactory<Member, String>("membPay"));
		tableMemberView.setItems(memberObservableList);
		tableMemberView.setEditable(true);

		// Editing Members cells
		tableColumnMemberName.setCellValueFactory(new PropertyValueFactory<Member, String>("Name"));
		tableColumnMemberName.setCellFactory(TextFieldTableCell.forTableColumn());
		tableColumnMemberName.setOnEditCommit(new EventHandler<CellEditEvent<Member, String>>() {
			@Override
			public void handle(CellEditEvent<Member, String> t) {
				((Member) t.getTableView().getItems().get(t.getTablePosition().getRow())).setName(t.getNewValue());
			}
		});

		tableColumnMemberAge.setCellFactory(TextFieldTableCell.forTableColumn());
		tableColumnMemberAge.setOnEditCommit(new EventHandler<CellEditEvent<Member, String>>() {
			@Override
			public void handle(CellEditEvent<Member, String> t) {
				((Member) t.getTableView().getItems().get(t.getTablePosition().getRow())).setAge(t.getNewValue());
			}
		});
		tableColumnMemberTel.setCellFactory(TextFieldTableCell.forTableColumn());
		tableColumnMemberTel.setOnEditCommit(new EventHandler<CellEditEvent<Member, String>>() {
			@Override
			public void handle(CellEditEvent<Member, String> t) {
				((Member) t.getTableView().getItems().get(t.getTablePosition().getRow())).setTel(t.getNewValue());
			}
		});
		tableColumnMemberAddress.setCellFactory(TextFieldTableCell.forTableColumn());
		tableColumnMemberAddress.setOnEditCommit(new EventHandler<CellEditEvent<Member, String>>() {
			@Override
			public void handle(CellEditEvent<Member, String> t) {
				((Member) t.getTableView().getItems().get(t.getTablePosition().getRow())).setAddress(t.getNewValue());
			}
		});

		tableColumnMemberEmail.setCellFactory(TextFieldTableCell.forTableColumn());
		tableColumnMemberEmail.setOnEditCommit(new EventHandler<CellEditEvent<Member, String>>() {
			@Override
			public void handle(CellEditEvent<Member, String> t) {
				((Member) t.getTableView().getItems().get(t.getTablePosition().getRow())).setEmail(t.getNewValue());
			}
		});

		tableColumnMemberCoursePref.setCellFactory(TextFieldTableCell.forTableColumn());
		tableColumnMemberCoursePref.setOnEditCommit(new EventHandler<CellEditEvent<Member, String>>() {
			@Override
			public void handle(CellEditEvent<Member, String> t) {
				((Member) t.getTableView().getItems().get(t.getTablePosition().getRow()))
						.setCoursePref(t.getNewValue());
			}
		});

		tableColumnMemberMembPay.setCellFactory(TextFieldTableCell.forTableColumn());
		tableColumnMemberMembPay.setOnEditCommit(new EventHandler<CellEditEvent<Member, String>>() {
			@Override
			public void handle(CellEditEvent<Member, String> t) {
				((Member) t.getTableView().getItems().get(t.getTablePosition().getRow())).setMembPay(t.getNewValue());
			}
		});

		// Creating and populating Lecturer table
		tableColumnLecturerName.setCellValueFactory(new PropertyValueFactory<Lecturer, String>("name"));
		tableColumnLecturerEmail.setCellValueFactory(new PropertyValueFactory<Lecturer, String>("email"));
		tableColumnLecturerCourseSpecification
				.setCellValueFactory(new PropertyValueFactory<Lecturer, String>("courseSpec"));
		tableColumnLecturerTelNumber.setCellValueFactory(new PropertyValueFactory<Lecturer, String>("telNumber"));
		tableColumnLecturerAdvertReq.setCellValueFactory(new PropertyValueFactory<Lecturer, String>("advertReq"));
		tableViewLecturer.setItems(dataInLecturerTable);
		tableViewLecturer.setEditable(true);

		// Making Lecturer table cells editable

		tableColumnLecturerName.setCellFactory(TextFieldTableCell.forTableColumn());
		tableColumnLecturerName.setOnEditCommit(new EventHandler<CellEditEvent<Lecturer, String>>() {
			@Override
			public void handle(CellEditEvent<Lecturer, String> t) {
				((Lecturer) t.getTableView().getItems().get(t.getTablePosition().getRow())).setName(t.getNewValue());
			}
		}

		);

		tableColumnLecturerEmail.setCellFactory(TextFieldTableCell.forTableColumn());
		tableColumnLecturerEmail.setOnEditCommit(new EventHandler<CellEditEvent<Lecturer, String>>() {
			@Override
			public void handle(CellEditEvent<Lecturer, String> t) {
				((Lecturer) t.getTableView().getItems().get(t.getTablePosition().getRow())).setEmail(t.getNewValue());
			}
		}

		);

		tableColumnLecturerCourseSpecification.setCellFactory(TextFieldTableCell.forTableColumn());
		tableColumnLecturerCourseSpecification.setOnEditCommit(new EventHandler<CellEditEvent<Lecturer, String>>() {
			@Override
			public void handle(CellEditEvent<Lecturer, String> t) {
				((Lecturer) t.getTableView().getItems().get(t.getTablePosition().getRow()))
						.setCourseSpec(t.getNewValue());
			}
		}

		);

		tableColumnLecturerTelNumber.setCellFactory(TextFieldTableCell.forTableColumn());
		tableColumnLecturerTelNumber.setOnEditCommit(new EventHandler<CellEditEvent<Lecturer, String>>() {
			@Override
			public void handle(CellEditEvent<Lecturer, String> t) {
				((Lecturer) t.getTableView().getItems().get(t.getTablePosition().getRow()))
						.setTelNumber(t.getNewValue());
			}
		}

		);

		tableColumnLecturerAdvertReq.setCellFactory(TextFieldTableCell.forTableColumn());
		tableColumnLecturerAdvertReq.setOnEditCommit(new EventHandler<CellEditEvent<Lecturer, String>>() {
			@Override
			public void handle(CellEditEvent<Lecturer, String> t) {
				((Lecturer) t.getTableView().getItems().get(t.getTablePosition().getRow()))
						.setAdvertReq(t.getNewValue());
			}
		}

		);

		// Listener for radio buttons for add lecturer UI
		ToggleGroup addLecturergroup = new ToggleGroup();
		radioBtnAddLecturerYes.setToggleGroup(addLecturergroup);
		radioBtnAddLecturerNo.setToggleGroup(addLecturergroup);
		addLecturergroup.selectToggle(radioBtnAddLecturerNo);
		addLecturergroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
			@Override
			public void changed(ObservableValue<? extends Toggle> ov, Toggle t1, Toggle t2) {
				RadioButton check = (RadioButton) t1.getToggleGroup().getSelectedToggle();
				selectedRadioButton = check.getText();
			}
		});
		// Search Member ChioceBox
		choiceBoxSearchMember.getItems().addAll("Search By", "Name", "Address", "Email", "Age", "Membership Payment");
		choiceBoxSearchMember.getSelectionModel().selectFirst();
		choiceBoxSearchMember.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observableMember, String previousChoiceMember,
					String currentChoiceMember) {
				switch (currentChoiceMember) {
				case "Name":
					FilteredList<Member> filteredMemberListByName = new FilteredList<>(memberObservableList, p -> true);
					txtFieldSearchMember.textProperty()
							.addListener((observableMember2, oldValueMember, newValueMember) -> {
								filteredMemberListByName.setPredicate(member -> {
									if (newValueMember == null || newValueMember.isEmpty()) {
										return true;
									}
									String lowerCaseMemberFilter = newValueMember.toLowerCase();
									if (member.getName().toLowerCase().contains(lowerCaseMemberFilter)) {
										return true;
									}
									return false;
								});
							});
					SortedList<Member> sortedMemberListByName = new SortedList<>(filteredMemberListByName);
					sortedMemberListByName.comparatorProperty().bind(tableMemberView.comparatorProperty());
					tableMemberView.setItems(sortedMemberListByName);
					break;

				case "Address":
					FilteredList<Member> filteredMemberListByAddress = new FilteredList<>(memberObservableList,
							p -> true);
					txtFieldSearchMember.textProperty()
							.addListener((observableMember2, oldValueMember, newValueMember) -> {
								filteredMemberListByAddress.setPredicate(member -> {
									if (newValueMember == null || newValueMember.isEmpty()) {
										return true;
									}
									String lowerCaseMemberFilter = newValueMember.toLowerCase();
									if (member.getAddress().toLowerCase().contains(lowerCaseMemberFilter)) {
										return true;
									}
									return false;

								});
							});
					SortedList<Member> sortedMemberListByAddress = new SortedList<>(filteredMemberListByAddress);
					sortedMemberListByAddress.comparatorProperty().bind(tableMemberView.comparatorProperty());
					tableMemberView.setItems(sortedMemberListByAddress);
					break;

				case "Email":
					FilteredList<Member> filteredMemberListByEmail = new FilteredList<>(memberObservableList,
							p -> true);
					txtFieldSearchMember.textProperty()
							.addListener((observableMember2, oldValueMember, newValueMember) -> {
								filteredMemberListByEmail.setPredicate(member -> {
									if (newValueMember == null || newValueMember.isEmpty()) {
										return true;
									}
									String lowerCaseMemberFilter = newValueMember.toLowerCase();
									if (member.getEmail().toLowerCase().contains(lowerCaseMemberFilter)) {
										return true;
									}
									return false;

								});
							});
					SortedList<Member> sortedMemberListByEmail = new SortedList<>(filteredMemberListByEmail);
					sortedMemberListByEmail.comparatorProperty().bind(tableMemberView.comparatorProperty());
					tableMemberView.setItems(sortedMemberListByEmail);
					break;
				case "Age":
					FilteredList<Member> filteredMemberListByAge = new FilteredList<>(memberObservableList, p -> true);
					txtFieldSearchMember.textProperty()
							.addListener((observableMember2, oldValueMember, newValueMember) -> {
								filteredMemberListByAge.setPredicate(member -> {
									if (newValueMember == null || newValueMember.isEmpty()) {
										return true;
									}
									String lowerCaseMemberFilter = newValueMember.toLowerCase();
									if (member.getAge().toLowerCase().contains(lowerCaseMemberFilter)) {
										return true;
									}
									return false;

								});
							});
					SortedList<Member> sortedMemberListByAge = new SortedList<>(filteredMemberListByAge);
					sortedMemberListByAge.comparatorProperty().bind(tableMemberView.comparatorProperty());
					tableMemberView.setItems(sortedMemberListByAge);
					break;

				case "Membership Payment":
					FilteredList<Member> filteredMemberListByMembPay = new FilteredList<>(memberObservableList,
							p -> true);
					txtFieldSearchMember.textProperty()
							.addListener((observableMember2, oldValueMember, newValueMember) -> {
								filteredMemberListByMembPay.setPredicate(member -> {
									if (newValueMember == null || newValueMember.isEmpty()) {
										return true;
									}
									String lowerCaseMemberFilter = newValueMember.toLowerCase();
									if (member.getEmail().toLowerCase().contains(lowerCaseMemberFilter)) {
										return true;
									}
									return false;

								});
							});
					SortedList<Member> sortedMemberListByMembPay = new SortedList<>(filteredMemberListByMembPay);
					sortedMemberListByMembPay.comparatorProperty().bind(tableMemberView.comparatorProperty());
					tableMemberView.setItems(sortedMemberListByMembPay);
					break;
				}
			}
		});
		// Search Event ChioceBox
		choiceBoxSearchEvent.getItems().addAll("Search By", "Name", "Type", "Category", "is-Finalized");
		choiceBoxSearchEvent.getSelectionModel().selectFirst();
		choiceBoxSearchEvent.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observableEvent, String previousChoiceEvent,
					String currentChoiceEvent) {
				switch (currentChoiceEvent) {
				case "Name":
					FilteredList<Events> filteredEventListByName = new FilteredList<>(dataInEventObserableList,
							p -> true);
					txtFieldSearchEvent.textProperty().addListener((observableEvent2, oldValueEvent, newValueEvent) -> {
						filteredEventListByName.setPredicate(events -> {
							if (newValueEvent == null || newValueEvent.isEmpty()) {
								return true;
							}
							String lowerCaseEventFilter = newValueEvent.toLowerCase();
							if (events.getName().toLowerCase().contains(lowerCaseEventFilter)) {
								return true;
							}
							return false;
						});
					});
					SortedList<Events> sortedEventListByName = new SortedList<>(filteredEventListByName);
					sortedEventListByName.comparatorProperty().bind(eventsMainTable.comparatorProperty());
					eventsMainTable.setItems(sortedEventListByName);
					break;

				case "Type":
					FilteredList<Events> filteredEventListByType = new FilteredList<>(dataInEventObserableList,
							p -> true);
					txtFieldSearchEvent.textProperty().addListener((observableEvent2, oldValueEvent, newValueEvent) -> {
						filteredEventListByType.setPredicate(events -> {
							if (newValueEvent == null || newValueEvent.isEmpty()) {
								return true;
							}
							String lowerCaseEventFilter = newValueEvent.toLowerCase();
							if (events.getType().toLowerCase().contains(lowerCaseEventFilter)) {
								return true;
							}
							return false;
						});
					});
					SortedList<Events> sortedEventListByType = new SortedList<>(filteredEventListByType);
					sortedEventListByType.comparatorProperty().bind(eventsMainTable.comparatorProperty());
					eventsMainTable.setItems(sortedEventListByType);
					break;

				case "Category":
					FilteredList<Events> filteredEventListByCategory = new FilteredList<>(dataInEventObserableList,
							p -> true);
					txtFieldSearchEvent.textProperty().addListener((observableEvent2, oldValueEvent, newValueEvent) -> {
						filteredEventListByCategory.setPredicate(events -> {
							if (newValueEvent == null || newValueEvent.isEmpty()) {
								return true;
							}
							String lowerCaseEventFilter = newValueEvent.toLowerCase();
							if (events.getCategory().toLowerCase().contains(lowerCaseEventFilter)) {
								return true;
							}
							return false;
						});
					});
					SortedList<Events> sortedEventListByCategory = new SortedList<>(filteredEventListByCategory);
					sortedEventListByCategory.comparatorProperty().bind(eventsMainTable.comparatorProperty());
					eventsMainTable.setItems(sortedEventListByCategory);
					break;

				case "is-Finalized":
					FilteredList<Events> filteredEventListByIsFinalized = new FilteredList<>(dataInEventObserableList,
							p -> true);
					txtFieldSearchEvent.textProperty().addListener((observableEvent2, oldValueEvent, newValueEvent) -> {
						filteredEventListByIsFinalized.setPredicate(events -> {
							if (newValueEvent == null || newValueEvent.isEmpty()) {
								return true;
							}
							String lowerCaseEventFilter = newValueEvent.toLowerCase();
							if (events.getisFinalized().toLowerCase().contains(lowerCaseEventFilter)) {
								return true;
							}
							return false;
						});
					});
					SortedList<Events> sortedEventListByIsFinalized = new SortedList<>(filteredEventListByIsFinalized);
					sortedEventListByIsFinalized.comparatorProperty().bind(eventsMainTable.comparatorProperty());
					eventsMainTable.setItems(sortedEventListByIsFinalized);
					break;
				}
			}
		});

		// Listener for Search Lecturer ChoiceBox
		choiceBoxSearchLecturer.getItems().addAll("Search By", "Name", "Email", "Course Specification",
				"Advertisement Requirement");
		choiceBoxSearchLecturer.getSelectionModel().selectFirst();
		choiceBoxSearchLecturer.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String previousChoice,
					String currentChoice) {
				switch (currentChoice) {
				case "Name":
					FilteredList<Lecturer> filteredLecturerListByName = new FilteredList<>(dataInLecturerTable,
							p -> true);
					txtFieldSearchLecturer.textProperty().addListener((observable2, oldValue, newValue) -> {
						filteredLecturerListByName.setPredicate(lecturer -> {
							if (newValue == null || newValue.isEmpty()) {
								return true;
							}
							String lowerCaseFilter = newValue.toLowerCase();
							if (lecturer.getName().toLowerCase().contains(lowerCaseFilter)) {
								return true;
							}
							return false;
						});
					});
					SortedList<Lecturer> sortedDataByName = new SortedList<>(filteredLecturerListByName);
					sortedDataByName.comparatorProperty().bind(tableViewLecturer.comparatorProperty());
					tableViewLecturer.setItems(sortedDataByName);
					break;

				case "Email":
					FilteredList<Lecturer> filteredLecturerListByEmail = new FilteredList<>(dataInLecturerTable,
							p -> true);
					txtFieldSearchLecturer.textProperty().addListener((observable2, oldValue, newValue) -> {
						filteredLecturerListByEmail.setPredicate(lecturer -> {
							if (newValue == null || newValue.isEmpty()) {
								return true;
							}
							String lowerCaseFilter = newValue.toLowerCase();
							if (lecturer.getEmail().toLowerCase().contains(lowerCaseFilter)) {
								return true;
							}

							return false;
						});
					});
					SortedList<Lecturer> sortedDataByEmail = new SortedList<>(filteredLecturerListByEmail);
					sortedDataByEmail.comparatorProperty().bind(tableViewLecturer.comparatorProperty());
					tableViewLecturer.setItems(sortedDataByEmail);
					break;

				case "Course Specification":
					FilteredList<Lecturer> filteredLecturerListByCourseSpecification = new FilteredList<>(
							dataInLecturerTable, p -> true);
					txtFieldSearchLecturer.textProperty().addListener((observable2, oldValue, newValue) -> {
						filteredLecturerListByCourseSpecification.setPredicate(lecturer -> {
							if (newValue == null || newValue.isEmpty()) {
								return true;
							}
							String lowerCaseFilter = newValue.toLowerCase();
							if (lecturer.getCourseSpec().toLowerCase().contains(lowerCaseFilter)) {
								return true;
							}
							return false;
						});
					});
					SortedList<Lecturer> sortedDataByCourseSpecification = new SortedList<>(
							filteredLecturerListByCourseSpecification);
					sortedDataByCourseSpecification.comparatorProperty().bind(tableViewLecturer.comparatorProperty());
					tableViewLecturer.setItems(sortedDataByCourseSpecification);
					break;

				case "Advertisement Requirement":
					FilteredList<Lecturer> filteredLecturerListByAdvertisementRequirement = new FilteredList<>(
							dataInLecturerTable, p -> true);
					txtFieldSearchLecturer.textProperty().addListener((observable2, oldValue, newValue) -> {
						filteredLecturerListByAdvertisementRequirement.setPredicate(lecturer -> {
							if (newValue == null || newValue.isEmpty()) {
								return true;
							}
							String lowerCaseFilter = newValue.toLowerCase();
							if (lecturer.getAdvertReq().toLowerCase().contains(lowerCaseFilter)) {
								return true;
							}
							return false;
						});
					});
					SortedList<Lecturer> sortedDataByAdvertisementRequirement = new SortedList<>(
							filteredLecturerListByAdvertisementRequirement);
					sortedDataByAdvertisementRequirement.comparatorProperty()
							.bind(tableViewLecturer.comparatorProperty());
					tableViewLecturer.setItems(sortedDataByAdvertisementRequirement);
					break;
				}
			}
		});
		txtFieldAddLecturerToTheEvent.setOpacity(1.0);
		txtFieldAddLecturerToTheEvent.setStyle("-fx-control-inner-background: #"+value0.toString().substring(2));
	}

	/**
	 * toEventsScene() - Defines a new VIAView and sets the local VIAModel from
	 * file. Sets local EventsList from the VIAModel then applies this to an
	 * ObservableList. Defines and Instantiates a new anchor pane of eventsView.fxml
	 * and sets this as the main AnchorPane.
	 * 
	 * @return void
	 * @throws IOException
	 * 
	 */
	public void toEventsScene() throws IOException {
		nameOfTheChosenLecturer = "";
		VIAView viaView1 = new VIAView();
		viaModel = viaView1.viaModFromFile();
		eventsList1 = viaModel.getEventList();
		dataInEventObserableList = FXCollections.observableList(eventsList1.getListOfEvents());
		AnchorPane paneEvents = FXMLLoader.load(getClass().getResource("eventsView.fxml"));
		mainAnchor.getChildren().setAll(paneEvents);
	}

	/**
	 * toMemberScene() - Defined a new VIAView and sets the local VIAModel from
	 * file. Sets local MemberList from the VIAModel then applies this to an
	 * ObservableList. Defines and Instantiates a new anchor pane of MemberView.fxml
	 * and sets this as the main AnchorPane.
	 * 
	 * @return void
	 * @throws IOException
	 */
	public void toMemberScene() throws IOException {
		VIAView viaView1 = new VIAView();
		viaModel = viaView1.viaModFromFile();
		list = viaModel.getMemberList();
		memberObservableList = FXCollections.observableList(list.getListOfMembers());
		AnchorPane paneMembers = FXMLLoader.load(getClass().getResource("MemberView.fxml"));
		mainAnchor.getChildren().setAll(paneMembers);
	}

	/**
	 * toLecturerScene() - Defined a new VIAView and sets the local VIAModel from
	 * file. Sets local LecturerList from the VIAModel then applies this to an
	 * ObservableList. Defines and Instantiates a new anchor pane of
	 * DisplayLecturers.fxml and sets this as the main AnchorPane.
	 * 
	 * @return void
	 * @throws IOException
	 */
	public void toLecturerScene() throws IOException {
		VIAView viaView1 = new VIAView();
		viaModel = viaView1.viaModFromFile();
		init = viaModel.getLecturerList();
		dataInLecturerTable = FXCollections.observableList(init.getListOfLecturers());
		AnchorPane paneLecturers = FXMLLoader.load(getClass().getResource("DisplayLecturers.fxml"));
		mainAnchor.getChildren().setAll(paneLecturers);
	}

	/**
	 * goBack() - Sets nameOfChosenLecturer to "". Defines and Instantiates a new
	 * AnchorPane of viamain.fxml and sets this as the main AnchorPane.
	 * 
	 * @return void
	 * @throws IOException
	 */
	public void goBack() throws IOException {
		value0 = Paint.valueOf("F28697");
		AnchorPane pane = FXMLLoader.load(getClass().getResource("viamain.fxml"));
		mainAnchor.getChildren().setAll(pane);
	}

	/**
	 * toAddMemberScene() - Defines and Instantiates a new AnchorPane of
	 * AddMember.fxml and sets this as the main AnchorPane.
	 * 
	 * @return void
	 * @throws IOException
	 */
	public void toAddMemberScene() throws IOException {
		AnchorPane pane = FXMLLoader.load(getClass().getResource("AddMember.fxml"));
		mainAnchor.getChildren().setAll(pane);
	}

	/**
	 * toEditMemberScene() - Defines and Instantiates a new AnchorPane of
	 * EditMember.fxml and sets this as the main AnchorPane.
	 * 
	 * @return void
	 * @throws IOException
	 */
	public void toEditMemberScene() throws IOException {
		AnchorPane pane = FXMLLoader.load(getClass().getResource("EditMember.fxml"));
		mainAnchor.getChildren().setAll(pane);
	}

	/**
	 * toAddLecturerScene() - Defines and Instantiates a new AnchorPane of
	 * AddLecturer.fxml and sets this as the main AnchorPane.
	 * 
	 * @return void
	 * @throws IOException
	 */
	public void toAddLecturerScene() throws IOException {
		AnchorPane pane = FXMLLoader.load(getClass().getResource("AddLecturer.fxml"));
		mainAnchor.getChildren().setAll(pane);
	}

	/**
	 * toAddEventScene() - Defines and Instantiates a new AnchorPane of
	 * AddEvent.fxml and sets this as the main AnchorPane.
	 * 
	 * @return void
	 * @throws IOException
	 */
	public void toAddEventScene() throws IOException {
		value0 = Paint.valueOf("F28697");
		nameOfTheChosenLecturer = "";
		AnchorPane pane = FXMLLoader.load(getClass().getResource("addNewEvent.fxml"));
		mainAnchor.getChildren().setAll(pane);
	}

	/**
	 * addLecturerToTheEventsScene() - Defines and Instantiates a VIAView. Sets the
	 * local VIAModel from the viaView Method viaModFromFile(). Sets the local
	 * LecturerList from the local VIAModel. Sets the ObservableList of Lecturers as
	 * the LecturerList from VIAModel. Defines and Instantiates a new AnchorPane and
	 * sets this as the main AnchorPane. Sets the disable property of
	 * btnAddLecturerToTheEvent to false if an item of the TableView is selected.
	 * 
	 * @return void
	 * @throws IOException
	 */
	public void addLecturerToTheEventScene() throws IOException {
		VIAView viaView1 = new VIAView();
		viaModel = viaView1.viaModFromFile();
		init = viaModel.getLecturerList();
		dataInLecturerTable = FXCollections.observableList(init.getListOfLecturers());
		AnchorPane pane = FXMLLoader.load(getClass().getResource("AddLecturerToEvent.fxml"));
		mainAnchor.getChildren().setAll(pane);
		btnAddLecturerToTheEvent.disableProperty()
				.bind(Bindings.isEmpty(tableViewLecturer.getSelectionModel().getSelectedItems()));
	}

	/**
	 * addMember() - Defines and Instantiates a new Member, passing in the values
	 * entered in each of the text fields of AddMember.fxml.
	 * 
	 * @param ActionEvent
	 * @return void
	 */
	public void addMember(ActionEvent event) {
		Member newMember = new Member(txtFieldAddMemberName.getText(), txtFieldAddMemberAge.getText(),
				txtFieldAddMemberAddress.getText(), txtFieldAddMemberTel.getText(), txtFieldAddMemberEmail.getText(),
				txtFieldAddMemberCoursePref.getText(), txtFieldAddMemberMembPay.getText());
		memberObservableList.add(newMember);
		JOptionPane.showMessageDialog(null, "Member added sucessfully!");
	}

	/**
	 * deleteMember() - Defines and Instantiates two ObservableList. One is assigned
	 * the selected row from the TableView, the other is assigned each of the
	 * elements within this row. The elements of the row are then removed from the
	 * selected row.
	 * 
	 * @param ActionEvent
	 * @return void
	 */
	public void deleteMember(ActionEvent event) {
		ObservableList<Member> selectedMember = tableMemberView.getSelectionModel().getSelectedItems();
		ObservableList<Member> allMembers = tableMemberView.getItems();
		selectedMember.forEach(allMembers::remove);
	}

	/**
	 * addLect() - Defaults the RadioButton selectedRadioButton to a value. Defines
	 * and Instantiates a new Lecturer taking the information entered into the
	 * TextFields of AddLecturer.fxml and adds this to the local ObservableList
	 * dataInLecturerTable. Displays a JOptionPane.
	 * 
	 * @param ActionEvent
	 * @return void
	 * @see javafx.collections.ObservableList, javax.swing.JOptionPane
	 */
	public void addLect(ActionEvent event) {
		if (!(selectedRadioButton.equals("Yes")))
			selectedRadioButton = "No";
		Lecturer newLecturer = new Lecturer(txtFieldAddLecturerName.getText(), txtFieldAddLecturerEmail.getText(),
				txtFieldAddLecturerCourseSpec.getText(), txtFieldAddLecturerTelNumber.getText(), selectedRadioButton);
		dataInLecturerTable.add(newLecturer);
		JOptionPane.showMessageDialog(null, "Lecturer added sucessfully!");
	}

	/**
	 * deleteLecturer() - Defines and Instantiates two ObservableList. One is
	 * assigned the selected row from the TableView, the other is assigned each of
	 * the elements within this row. The elements of the row are then removed from
	 * the selected row.
	 * 
	 * @param ActionEvent
	 * @return void
	 */
	public void deleteLecturer(ActionEvent event) {
		ObservableList<Lecturer> selectedLecturer = tableViewLecturer.getSelectionModel().getSelectedItems();
		//ObservableList<Lecturer> allLecturers = tableViewLecturer.getItems();
		selectedLecturer.forEach(dataInLecturerTable::remove);

	}

	/**
	 * addEvent() - Defines and Instantiates a new Event, passing in the values
	 * entered in each of the text fields of addNewEvent.fxml.
	 * 
	 * @param ActionEvent
	 * @return void
	 */
	public void addEvent(ActionEvent event) {
		Events event1 = new Events(addEventName.getText(), addEventDate.getText(), addEventDuration.getText(),
				addEventType.getText(), addEventLocation.getText(), addEventCategory.getText(), nameOfTheChosenLecturer,
				addEventPrice.getText(), addEventMinPartic.getText(), addEventMaxPartic.getText(), "false");
		dataInEventObserableList.add(event1);
		JOptionPane.showMessageDialog(null, "Event added sucessfully!");

	}

	/**
	 * deleteEvent() - Defines and Instantiates two ObservableList. One is assigned
	 * the selected row from the TableView, the other is assigned each of the
	 * elements within this row. The elements of the row are then removed from the
	 * selected row.
	 * 
	 * @param ActionEvent
	 * @return void
	 */
	public void deleteEvent(ActionEvent event) {
		ObservableList<Events> selectedEvent = eventsMainTable.getSelectionModel().getSelectedItems();
		ObservableList<Events> allEvents = eventsMainTable.getItems();
		selectedEvent.forEach(allEvents::remove);

	}

	/**
	 * finalizeEvent() - Gets the currently selected row of the Observable list and
	 * sets isFinalized to equal the String "true". Displays a JOptionPane.
	 * 
	 * @param ActionEvent
	 * @throws IOException
	 * @see javax.swing.JOptionPane
	 */
	public void finalizeEvent(ActionEvent event) throws IOException {
		dataInEventObserableList.get(eventsMainTable.getSelectionModel().getSelectedIndex()).setisFinalized("true");
		if (dataInEventObserableList.get(eventsMainTable.getSelectionModel().getSelectedIndex()) != null) {
			JOptionPane.showMessageDialog(null, "Event Finalized.");
			toEventsScene();
		}

	}

	/**
	 * getVIAMod() - returns the VIAModel local to VIAController.
	 * 
	 * @return VIAModel
	 */
	public VIAModel getVIAMod() {
		return viaModel;
	}

	/**
	 * deletetheTextInsideOfTheSearchEventTextField() - Sets the text of
	 * txtFieldSearchEvent to "".
	 * 
	 * @return void
	 */
	public void deletetheTextInsideOfTheSearchEventTextField() {
		txtFieldSearchEvent.setText("");
	}

	/**
	 * deletetheTextInsideOfTheSearchLecturerTextField() - Sets the text of
	 * txtFieldSearchLecturer to "".
	 * 
	 * @return void
	 */
	public void deletetheTextInsideOfTheSearchLecturerTextField() {
		txtFieldSearchLecturer.setText("");
	}

	/**
	 * deletetheTextInsideOfTheSearchMemberTextField() - Sets the text of
	 * txtFieldSearchMember to "".
	 * 
	 * @return void
	 */
	public void deletetheTextInsideOfTheSearchMemberTextField() {
		txtFieldSearchMember.setText("");
	}

	/**
	 * addLecturerToEvent() - Sets nameOfTheChosenLecturer to the currently selected
	 * TableView row name. Defines and Instantiates a new AnchorPane of
	 * addNewEvent.fxml and sets this to the main AnchorPane.
	 * 
	 * @return void
	 * @throws IOException
	 * @see javafx.scene.control.TableView, javafx.scene.layout.AnchorPane
	 */
	public void addLecturerToEvent() throws IOException {
		value0 = Paint.valueOf("92fcb7");
		nameOfTheChosenLecturer = tableViewLecturer.getSelectionModel().getSelectedItem().getName();
		AnchorPane pane = FXMLLoader.load(getClass().getResource("addNewEvent.fxml"));
		mainAnchor.getChildren().setAll(pane);
	}

	/**
	 * addMemberToEvent() - Displays a JOption pane for now. Functionality may be
	 * added in future.
	 * 
	 * @return void
	 * @throws IOException
	 * @see javax.swing.JOptionPane
	 */
	public void addMemberToEvent() throws IOException {
		JOptionPane.showMessageDialog(null, "No functionality added at this time. Check back later");
	}
}