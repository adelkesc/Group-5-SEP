package guiView;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javafx.beans.property.SimpleStringProperty;

public class Lecturer implements Serializable 
{
   private transient SimpleStringProperty name = new SimpleStringProperty("");
   private transient SimpleStringProperty email = new SimpleStringProperty("");
   private transient SimpleStringProperty courseSpec = new SimpleStringProperty("");
   private transient SimpleStringProperty telNumber = new SimpleStringProperty("");
   private transient SimpleStringProperty advertReq = new SimpleStringProperty("");
   
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
	public void readExternal(ObjectInputStream in) throws IOException, ClassNotFoundException {
		in.defaultReadObject();
		name = new SimpleStringProperty((String) in.readObject());
		email = new SimpleStringProperty((String) in.readObject());
		courseSpec = new SimpleStringProperty((String) in.readObject());
		telNumber = new SimpleStringProperty((String) in.readObject());
		advertReq = new SimpleStringProperty((String) in.readObject());

	}

	public void writeExternal(ObjectOutputStream out) throws IOException {
		out.defaultWriteObject();
		out.writeObject(name.get());
		out.writeObject(email.get());
		out.writeObject(courseSpec.get());
		out.writeObject(telNumber.get());
		out.writeObject(advertReq.get());		
	}
   
}
