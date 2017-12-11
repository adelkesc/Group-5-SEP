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

public class FileIO implements Serializable {
	private VIAModel viaModel1 = new VIAModel();
	private VIAController viaContr = new VIAController();

	public void setVIAModelFromFile() throws IOException, ClassNotFoundException, EOFException {
		boolean endOfFile = false;
		FileInputStream fstream = new FileInputStream("viaModel.bin");
		ObjectInputStream inputFile = new ObjectInputStream(fstream);
		
		
		while (!endOfFile) {
			try {
				viaModel1 = (VIAModel) inputFile.readObject();
			} catch (EOFException eof) {
				endOfFile = true;
		}
		}
		inputFile.close();

	}

	public void setToFile() throws IOException {
		
		FileOutputStream fstream = new FileOutputStream("viaModel.bin");
		ObjectOutputStream outputFile = new ObjectOutputStream(fstream);
		viaModel1 = viaContr.getVIAMod();

		try {
			outputFile.writeObject(viaModel1);
			outputFile.close();
		}

		catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}

		catch (IOException ioe) {
			System.out.println("Error.");
		}

	}

	public VIAModel getVIAModel() {
		return viaModel1;
	}
	public void setVIAModel(VIAModel viamod) {
		this.viaModel1 = viamod;
	}

}
