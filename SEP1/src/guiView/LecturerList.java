package guiView;

import java.io.Serializable;
import java.util.ArrayList; 

public class LecturerList implements Serializable 
{
   private ArrayList<Lecturer> lecturerList;
   
   
   public LecturerList()
   {
      lecturerList = new ArrayList<Lecturer>();
   }
   
   public void addLecturer(Lecturer newLecturer)
   {
      lecturerList.add(newLecturer);
   }
   
   public void removeLecturer(Lecturer lecturer)
   {
      lecturerList.remove(lecturer);
   }
   
   public ArrayList<Lecturer> getListOfLecturers()
   {
      return lecturerList;
   }
   public int lectListSize() {
	   return lecturerList.size();
   }
}