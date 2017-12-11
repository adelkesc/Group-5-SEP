package guiView;

import java.io.Serializable;
import java.util.ArrayList;

import javafx.beans.property.SimpleStringProperty;

public class Events implements Serializable {
	private SimpleStringProperty name = new SimpleStringProperty("");
	private SimpleStringProperty date = new SimpleStringProperty("");
	private SimpleStringProperty duration = new SimpleStringProperty("");
	private SimpleStringProperty type = new SimpleStringProperty("");
	private SimpleStringProperty location = new SimpleStringProperty("");
	private SimpleStringProperty category = new SimpleStringProperty("");
	// private Lecturer conductor;
	private SimpleStringProperty price = new SimpleStringProperty("");
	private SimpleStringProperty minPartic = new SimpleStringProperty("");
	private SimpleStringProperty maxPartic = new SimpleStringProperty("");
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

}
