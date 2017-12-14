package guiView;

import java.io.Serializable;

/**
 * Events - This class represents an Event.
 * 
 * @author Kevin
 * @version 1.0, 14/12/2017
 */
public class Events implements Serializable {

	private static final long serialVersionUID = 5596571541918537611L;
	private String name;
	private String date;
	private String duration;
	private String type;
	private String location;
	private String category;
	private String conductor;
	private String price;
	private String minPartic;
	private String maxPartic;
	private String isFinalized = "false";
	// ArrayList<Members> eventMembList = new ArrayList<>();

	/**
	 * 11 argument constructor. Sets all of the Events variables to the arguments
	 * entered.
	 * 
	 */
	public Events(String name, String date, String duration, String type, String location, String category,
			String conductor, String price, String minPartic, String maxPartic, String isFinalized) {
		this.name = name;
		this.date = date;
		this.duration = duration;
		this.type = type;
		this.location = location;
		this.category = category;
		this.conductor = conductor;
		this.price = price;
		this.minPartic = minPartic;
		this.maxPartic = maxPartic;
		this.isFinalized = isFinalized;
	}

	/**
	 * 0 argument constructor. Sets all of the Events variables to default empty
	 * Strings.
	 */
	public Events() {
		this("", "", "", "", "", "", "", "", "", "", "false");
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
		this.date = date;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getMinPartic() {
		return minPartic;
	}

	public void setMinPartic(String minPartic) {
		this.minPartic = minPartic;
	}

	public String getMaxPartic() {
		return maxPartic;
	}

	public void setMaxPartic(String maxPartic) {
		this.maxPartic = (maxPartic);
	}

	public String getisFinalized() {
		return isFinalized;
	}

	public void setisFinalized(String isFinalized) {
		this.isFinalized = isFinalized;
	}

	public String getConductor() {
		return conductor;
	}

	public void setConductor(String conductor) {
		this.conductor = conductor;
	}

	public String getIsFinalized() {
		return isFinalized;
	}

	public void finalizeEvent() {
		this.isFinalized = "true";
	}
	public String toString() {
		return this.name + "\n" + this.date + "\n" + this.duration + "\n" + this.type + "\n" + this.location + "\n"
				+ this.category + "\n" + this.conductor + "\n" + this.price + "\n" + this.minPartic + "\n"
				+ this.maxPartic + "\n" + this.isFinalized;
	}

}
