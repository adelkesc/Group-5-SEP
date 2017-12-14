package guiView;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * EventsList - This class stores Events in a List
 * 
 * @author Kevin
 * @version 1.0, 14/12/2017
 * @see ArrayList
 */
public class EventsList implements Serializable {
	private static final long serialVersionUID = -8858421447502020577l;
	ArrayList<Events> eventsArrLi;

	/**
	 * 0 argument constructor. Instantiates a new ArrayList.
	 * 
	 * @see ArrayList
	 */
	public EventsList() {
		eventsArrLi = new ArrayList<>();
	}

	/**
	 * addEvent() - Adds an Event argument to ArrayList.
	 * 
	 * @param Events
	 * @see ArrayList
	 */
	public void addEvent(Events event) {
		eventsArrLi.add(event);
	}

	/**
	 * getListOfEvents() - Returns the full EventsList
	 * 
	 * @return ArrayList<Events>
	 */
	public ArrayList<Events> getListOfEvents() {
		return eventsArrLi;
	}

	/**
	 * getEventListSize() - Returns the size of the EventsList ArrayList.
	 * 
	 * @return int
	 */
	public int getEventListSize() {
		return eventsArrLi.size();
	}
}
