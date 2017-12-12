package guiView;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javafx.beans.property.SimpleStringProperty;

public class Events implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5596571541918537611L;
	private transient SimpleStringProperty name = new SimpleStringProperty("");
	private transient SimpleStringProperty date = new SimpleStringProperty("");
	private transient SimpleStringProperty duration = new SimpleStringProperty("");
	private transient SimpleStringProperty type = new SimpleStringProperty("");
	private transient SimpleStringProperty location = new SimpleStringProperty("");
	private transient SimpleStringProperty category = new SimpleStringProperty("");
	// private Lecturer conductor;
	private transient SimpleStringProperty price = new SimpleStringProperty("");
	private transient SimpleStringProperty minPartic = new SimpleStringProperty("");
	private transient SimpleStringProperty maxPartic = new SimpleStringProperty("");
	private boolean isFinalized = false;
	// ArrayList<Members> eventMembList = new ArrayList<>();

	public Events(String name, String date, String duration, String type, String location, String category,
			/* Lecturer conductor, */ String price, String minPartic, String maxPartic, boolean isFinalized) {
		setName(name);
		setDate(date);
		setDuration(duration);
		setType(type);
		setLocation(location);
		setCategory(category);
		setPrice(price);
		setMinPartic(minPartic);
		setMaxPartic(maxPartic);
		this.isFinalized = isFinalized;
	}

	public Events() {
		this("","","","","","","","","",false);
	}

	public String getName() {
		return name.get();
	}

	public void setName(String name) {
		this.name.set(name);
	}

	public String getDate() {
		return date.get();
	}

	public void setDate(String date) {
		this.date.set(date);
	}

	public String getDuration() {
		return duration.get();
	}

	public void setDuration(String duration) {
		this.duration.set(duration);
	}

	public String getType() {
		return type.get();
	}

	public void setType(String type) {
		this.type.set(type);
	}

	public String getLocation() {
		return location.get();
	}

	public void setLocation(String location) {
		this.location.set(location);
	}

	public String getCategory() {
		return category.get();
	}

	public void setCategory(String category) {
		this.category.set(category);
	}

	public String getPrice() {
		return price.get();
	}

	public void setPrice(String price) {
		this.price.set(price);
	}

	public String getMinPartic() {
		return minPartic.get();
	}

	public void setMinPartic(String minPartic) {
		this.minPartic.set(minPartic);
	}

	public String getMaxPartic() {
		return maxPartic.get();
	}

	public void setMaxPartic(String maxPartic) {
		this.maxPartic.set(maxPartic);
	}

	public boolean isFinalized() {
		return isFinalized;
	}

	public void setFinalized(boolean isFinalized) {
		this.isFinalized = isFinalized;
	}

	public void finalizeEvent() {
		this.isFinalized = true;
	}
	// public void addMemToEvent(Members member) {
	// eventMembList.add(member);
	// }
	public String toString() {
		return this.name + "\n" + 	this.date+ "\n" + this.duration+ "\n" + this.type+ "\n" +	this.location+ "\n" +	this.category+ "\n" + this.price+ "\n" + this.minPartic+ "\n" + this.maxPartic+ "\n" + this.isFinalized;
	}

	public void readExternal(ObjectInputStream in) throws IOException, ClassNotFoundException {
		in.defaultReadObject();
		name = new SimpleStringProperty((String) in.readObject());
		date = new SimpleStringProperty((String) in.readObject());
		duration = new SimpleStringProperty((String) in.readObject());
		type = new SimpleStringProperty((String) in.readObject());
		location = new SimpleStringProperty((String) in.readObject());
		category = new SimpleStringProperty((String) in.readObject());
		price = new SimpleStringProperty((String) in.readObject());
		minPartic = new SimpleStringProperty((String) in.readObject());
		maxPartic = new SimpleStringProperty((String) in.readObject());
	}

	public void writeExternal(ObjectOutputStream out) throws IOException {
		out.defaultWriteObject();
		out.writeObject(name.get());
		out.writeObject(date.get());
		out.writeObject(duration.get());
		out.writeObject(type.get());
		out.writeObject(location.get());
		out.writeObject(category.get());
		out.writeObject(price.get());
		out.writeObject(minPartic.get());
		out.writeObject(maxPartic.get());
		
	}

}
