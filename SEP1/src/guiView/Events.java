package guiView;

import java.util.ArrayList;

public class Events {
	private String name;
	private MyDate date;
	private int duration;
	private String type;
	private String location;
	private String category;
	// private Lecturer conductor;
	private double price;
	private int minPartic, maxPartic;
	private boolean isFinalized;
	// ArrayList<Members> eventMembList = new ArrayList<>();

	public Events(String name, MyDate date, int duration, String type, String location, String category,
			/* Lecturer conductor, */ double price, int minPartic, int maxPartic, boolean isFinalized) {
		this.name = name;
		this.date = date.copy();
		this.duration = duration;
		this.type = type;
		this.location = location;
		this.category = category;
		// this.conductor=conductor;
		this.price = price;
		this.minPartic = minPartic;
		this.maxPartic = maxPartic;
		this.isFinalized = isFinalized;
	}

	public Events() {
		this.name = "";
		this.date = null;
		this.duration = 0;
		this.type = "";
		this.location = "";
		this.category = "";
		// this.conductor=null;
		this.price = 0;
		this.minPartic = 0;
		this.maxPartic = 0;
		this.isFinalized = false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyDate getDate() {
		return date;
	}

	public void setDate(MyDate date) {
		this.date = date;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getMinPartic() {
		return minPartic;
	}

	public void setMinPartic(int minPartic) {
		this.minPartic = minPartic;
	}

	public int getMaxPartic() {
		return maxPartic;
	}

	public void setMaxPartic(int maxPartic) {
		this.maxPartic = maxPartic;
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
