package guiView;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Table {
	private final SimpleStringProperty eventName;
	private final SimpleStringProperty eventDate;
	private final SimpleStringProperty eventDuration;
	private final SimpleStringProperty eventType;
	private final SimpleStringProperty eventLocation;
	private final SimpleStringProperty eventCategory;
	private final SimpleDoubleProperty eventPrice;
	private final SimpleIntegerProperty eventMinPartic;
	private final SimpleIntegerProperty eventMaxPartic;

	public Table(String name, String date, String duration, String type, String location, String category, double price, int min, int max)
	{
		this.eventName = new SimpleStringProperty(name);
		this.eventDate = new SimpleStringProperty(date);
		this.eventDuration = new SimpleStringProperty(duration);
		this.eventType = new SimpleStringProperty(type);
		this.eventLocation = new SimpleStringProperty(location);
		this.eventCategory = new SimpleStringProperty(category);
		this.eventPrice = new SimpleDoubleProperty(price);
		this.eventMinPartic = new SimpleIntegerProperty(min);
		this.eventMaxPartic = new SimpleIntegerProperty(max);
	}

	public String getEventName() {
		return eventName.get();
	}
	public SimpleStringProperty getEventNameProperty() {
		return eventName;
	}
	public SimpleStringProperty getEventDateProperty() {
		return eventDate;
	}

	public String getEventDate() {
		return eventDate.get();
	}
	
	public String getEventDuration() {
		return eventDuration.get();
	}

	public SimpleStringProperty getEventDurationProperty() {
		return eventDuration;
	}

	public SimpleStringProperty getEventType() {
		return eventType;
	}

	public SimpleStringProperty getEventLocation() {
		return eventLocation;
	}

	public SimpleStringProperty getEventCategory() {
		return eventCategory;
	}

	public SimpleDoubleProperty getEventPrice() {
		return eventPrice;
	}

	public SimpleIntegerProperty getEventMinPartic() {
		return eventMinPartic;
	}

	public SimpleIntegerProperty getEventMaxPartic() {
		return eventMaxPartic;
	}
}
