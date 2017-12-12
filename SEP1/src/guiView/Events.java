package guiView;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Events implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5596571541918537611L;
	private String name;
	private String date = new String("");
	private String duration = new String("");
	private String type = new String("");
	private String location = new String("");
	private String category = new String("");
	// private Lecturer conductor;
	private String price = new String("");
	private String minPartic = new String("");
	private String maxPartic = new String("");
	private boolean isFinalized = false;
	// ArrayList<Members> eventMembList = new ArrayList<>();

	public Events(String name, String date, String duration, String type, String location, String category,
			/* Lecturer conductor, */ String price, String minPartic, String maxPartic, boolean isFinalized) {
		this.name = name;
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
		this("", "", "", "", "", "", "", "", "", false);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date=date;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration=duration;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type=type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location=location;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category=category;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price=price;
	}

	public String getMinPartic() {
		return minPartic;
	}

	public void setMinPartic(String minPartic) {
		this.minPartic=minPartic;
	}

	public String getMaxPartic() {
		return maxPartic;
	}

	public void setMaxPartic(String maxPartic) {
		this.maxPartic=(maxPartic);
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
		return this.name + "\n" + this.date + "\n" + this.duration + "\n" + this.type + "\n" + this.location + "\n"
				+ this.category + "\n" + this.price + "\n" + this.minPartic + "\n" + this.maxPartic + "\n"
				+ this.isFinalized;
	}

}
