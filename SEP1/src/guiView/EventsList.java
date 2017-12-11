package guiView;

import java.io.Serializable;
import java.util.ArrayList;

public class EventsList implements Serializable {
ArrayList<Events> eventsArrLi;

public EventsList() {
	eventsArrLi = new ArrayList<>();
}
public void addEvent(Events event) {
	eventsArrLi.add(event);
}
public void removeEvent() {
	
}
public Events editEvent(Events event) {
	Events tempEvent = new Events();
	tempEvent.setName(event.getName());
	tempEvent.setDate(event.getDate());
	tempEvent.setDuration(event.getDuration());
	tempEvent.setType(event.getType());
	tempEvent.setLocation(event.getLocation());
	tempEvent.setCategory(event.getCategory());
	tempEvent.setPrice(event.getPrice());
	tempEvent.setMinPartic(event.getMinPartic());
	tempEvent.setMaxPartic(event.getMaxPartic());
	tempEvent.setFinalized(event.isFinalized());	
	return tempEvent;
}
public Events searchByName(String name) {
	for (int i = 0; i < eventsArrLi.size(); i++) {
		if (eventsArrLi.get(i).getName().equals(name)){
			return eventsArrLi.get(i);
		}
	}
	return null;
}
public Events getEvent(int i) {
	return eventsArrLi.get(i);
}
}
