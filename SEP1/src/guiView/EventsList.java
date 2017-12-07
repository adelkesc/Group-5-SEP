package guiView;

import java.util.ArrayList;

public class EventsList {
ArrayList<Events> eventsArrLi = new ArrayList<>();

public EventsList() {
	
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

}
