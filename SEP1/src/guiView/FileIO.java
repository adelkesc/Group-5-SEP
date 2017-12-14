package guiView;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * FileIO - This class handles all file saving and loading.
 * 
 * @author Kevin, Amahdya
 * @version 1.0, 14/12/2017
 */
public class FileIO implements Serializable {

	private static final long serialVersionUID = 1L;
	private VIAModel viaModel1;
	private VIAView viaView1 = new VIAView();
	private VIAController viaContr = new VIAController();

	/**
	 * setVIAModelFromFile() - Sets a FileInputStream to viaModel.ser and passes
	 * this into a new ObjectInputStream. Sets the local VIAModel to be equal to the
	 * Object read from file.
	 * 
	 * @return void
	 * @throws IOException,
	 *             ClassNotFoundException, EOFException
	 * @see java.io.ObjectInputStream, java.io.FileInputStream
	 */
	public void setVIAModelFromFile() throws IOException, ClassNotFoundException, EOFException {
		FileInputStream fstream = new FileInputStream("viaModel.ser");
		ObjectInputStream inputFile = new ObjectInputStream(fstream);

		try {
			viaModel1 = (VIAModel) inputFile.readObject();
		} catch (EOFException eof) {
			eof.printStackTrace();
		}
		inputFile.close();

	}

	/**
	 * setToFile() - Sets a FileOutputStream to viaModel.ser and passes this in to
	 * ObjectOutputStream. Writes the local VIAModel to ObjectOutputStream then
	 * closes the stream.
	 * 
	 * @return void
	 * @throws IOException
	 * @see java.io.FileOutputStream, java.io.ObjectOutputStream
	 */
	public void setToFile() throws IOException {
		viaContr = viaView1.getController();
		FileOutputStream fstream = new FileOutputStream("viaModel.ser");
		ObjectOutputStream outputFile = new ObjectOutputStream(fstream);
		try {
			outputFile.writeObject(viaModel1);
			outputFile.close();
		}

		catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}

		catch (IOException ioe) {
			System.out.println("Error.");
			ioe.printStackTrace();
		}

	}

	/**
	 * getVIAModel() - Returns the local VIAModel.
	 * 
	 * @return VIAModel
	 */
	public VIAModel getVIAModel() {
		return viaModel1;
	}

	/**
	 * setVIAModel() - Sets the local VIAModel to be equal to the VIAModel argument.
	 * 
	 * @return void
	 * @param VIAModel
	 */
	public void setVIAModel(VIAModel viamod) {
		this.viaModel1 = viamod;
	}

}
