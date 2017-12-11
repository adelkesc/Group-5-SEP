package guiView;

import java.io.Serializable;

import javafx.beans.property.SimpleStringProperty;

public class Lecturer implements Serializable 
{
   private SimpleStringProperty name = new SimpleStringProperty("");
   private SimpleStringProperty email = new SimpleStringProperty("");
   private SimpleStringProperty courseSpec = new SimpleStringProperty("");
   private SimpleStringProperty telNumber = new SimpleStringProperty("");
   private SimpleStringProperty advertReq = new SimpleStringProperty("");
   
   public Lecturer()
   {
      this("", "", "", "", "");
   }
   
   public Lecturer(String name, String email, String courseSpec, String telNumber, String advertReq)
   {
      setName(name);
      setEmail(email);
      setCourseSpec(courseSpec);
      setTelNumber(telNumber);
      setAdvertReq(advertReq);
   }
   
   public void setName(String newName)
   {
      name.set(newName);
   }
   
   public String getName()
   {
      return name.get();
   }

   public void setEmail(String newEmail)
   {
      email.set(newEmail);
   }
   
   public String getEmail()
   {
      return email.get();
   }
   
   public void setCourseSpec(String newCourseSpec)
   {
      courseSpec.set(newCourseSpec);
   }

   public String getCourseSpec()
   {
      return courseSpec.get();
   }
   
   public void setTelNumber(String newTelNumber)
   {
      telNumber.set(newTelNumber);
   }

   public String getTelNumber()
   {
      return telNumber.get();
   }

   public void setAdvertReq(String newAdvertReq)
   {
      advertReq.set(newAdvertReq);
   }
   
   public String isAdvertReq()
   {
      return advertReq.get();
   }
   
   public String toString()
   {
      return "Name: " + name + " E-Mail: " + email + " Course Specification: " + courseSpec + " Tel. Number: " + telNumber + " Advertisement Requirement: " + advertReq + "\n";
   }
   
}
