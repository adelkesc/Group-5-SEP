package guiView;

import javax.swing.JOptionPane;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class LecturerController
{
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
   private Button btnLecturerCancel;
   
   private String value = "";
   private LecturerModel init = new LecturerModel(null, null, null, 0);
   
   public void initialize()
   {
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
   
   public void closeWindow()
   {
      Stage stage = (Stage) btnLecturerCancel.getScene().getWindow();
      stage.close();
   }
}
