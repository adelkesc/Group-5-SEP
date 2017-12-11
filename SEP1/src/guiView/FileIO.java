package guiView;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FileIO implements Serializable
{
   private VIAModel viaModel1 = new VIAModel();

   public void setVIAModel() throws IOException, ClassNotFoundException
   {

      FileInputStream fstream = new FileInputStream("viaModel.bin");
      ObjectInputStream inputFile = new ObjectInputStream(fstream);

      viaModel1 = (VIAModel) inputFile.readObject();
      inputFile.close();
      System.out.println("Done!");
   }

   public void setToFile() throws IOException
   {

      FileOutputStream fstream = new FileOutputStream("viaModel.bin");
      ObjectOutputStream outputFile = new ObjectOutputStream(fstream);

      try
      {
         outputFile.writeObject(viaModel1);
         outputFile.close();
         System.out.println("Done!");
      }

      catch (FileNotFoundException e)
      {
         System.out.println("File not found.");
      }

      catch (IOException ioe)
      {
         System.out.println("Error.");
      }

   }

}
