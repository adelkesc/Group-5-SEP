package guiView;

import java.io.Serializable;

/**
 * VIAModel - This class defines a VIAModel, which is composed of an EventsList,
 * a MemberList and a LecturerList.
 * 
 * @author Kevin
 */
public class VIAModel implements Serializable {
	private EventsList eventList;
	private MemberList memberList;
	private LecturerList lecturerList;

	/**
	 * 3 argument constructor. Sets local VIAModel EventsList, MemberList and
	 * LecturerList to the argument Lists.
	 */
	public VIAModel(EventsList event, MemberList member, LecturerList lecturer) {
		this.eventList = event;
		this.memberList = member;
		this.lecturerList = lecturer;
	}

	/**
	 * 0 argument constructor.
	 */
	public VIAModel() {
	}

	public EventsList getEventList() {
		return eventList;
	}

	public void setEventList(EventsList eventList) {
		this.eventList = eventList;
	}

	public MemberList getMemberList() {
		return memberList;
	}

	public void setMemberList(MemberList memberList) {
		this.memberList = memberList;
	}

	public LecturerList getLecturerList() {
		return lecturerList;
	}

	public void setLecturerList(LecturerList lecturerList) {
		this.lecturerList = lecturerList;
	}

}
