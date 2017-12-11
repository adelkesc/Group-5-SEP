package guiView;

import java.util.ArrayList;

public class LecturerModel
{
   private String name, email, courseSpec;
   private int tel;
   private boolean advertReq;
   private ArrayList<LecturerModel> lecturerList = new ArrayList<LecturerModel>();
   
   public LecturerModel(String name, String email, String courseSpec, int tel, boolean advertReq)
   {
      this.name = name;
      this.email = email;
      this.courseSpec = courseSpec;
      this.tel = tel;
      this.advertReq = advertReq;
   }
   
   public LecturerModel(String name, String email, String courseSpec, int tel)
   {
      this.name = name;
      this.email = email;
      this.courseSpec = courseSpec;
      this.tel = tel;
   }
   
   public void addLecturer(LecturerModel newLecturer)
   {
      lecturerList.add(newLecturer);
   }
   
   public void removeLecturer(LecturerModel lecturer)
   {
      lecturerList.remove(lecturer);
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public String getEmail()
   {
      return email;
   }

   public void setEmail(String email)
   {
      this.email = email;
   }

   public String getCourseSpec()
   {
      return courseSpec;
   }

   public void setCourseSpec(String courseSpec)
   {
      this.courseSpec = courseSpec;
   }

   public int getTel()
   {
      return tel;
   }

   public void setTel(int tel)
   {
      this.tel = tel;
   }

   public boolean isAdvertReq()
   {
      return advertReq;
   }

   public void setAdvertReq(boolean advertReq)
   {
      this.advertReq = advertReq;
   }
   
   
}
