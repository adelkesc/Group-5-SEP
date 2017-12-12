package guiView;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Lecturer implements Serializable 
{
   private  String name;
   private  String email;
   private  String courseSpec;
   private  String telNumber;
   private  String advertReq;
   
   public Lecturer()
   {
      this("", "", "", "", "");
   }
   
   public Lecturer(String name, String email, String courseSpec, String telNumber, String advertReq)
   {
	   this.name=name;
	   this.email=email;
	   this.courseSpec=courseSpec;
	   this.telNumber=telNumber;
	   this.advertReq=advertReq;
   }
   
   public void setName(String newName)
   {
      name=newName;
   }
   
   public String getName()
   {
      return name;
   }

   public void setEmail(String newEmail)
   {
      email=newEmail;
   }
   
   public String getEmail()
   {
      return email;
   }
   
   public void setCourseSpec(String newCourseSpec)
   {
      courseSpec=newCourseSpec;
   }

   public String getCourseSpec()
   {
      return courseSpec;
   }
   
   public void setTelNumber(String newTelNumber)
   {
      telNumber=newTelNumber;
   }

   public String getTelNumber()
   {
      return telNumber;
   }

   public void setAdvertReq(String newAdvertReq)
   {
      advertReq=newAdvertReq;
   }
   
   public String isAdvertReq()
   {
      return advertReq;
   }
   
   public String toString()
   {
      return "Name: " + name + " E-Mail: " + email + " Course Specification: " + courseSpec + " Tel. Number: " + telNumber + " Advertisement Requirement: " + advertReq + "\n";
   }
   
}
