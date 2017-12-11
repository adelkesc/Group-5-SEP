package guiView;

import java.io.Serializable;

public class VIAModel implements Serializable {
	private EventsList eventList;
	private MemberList memberList;
	private LecturerList lecturerList;
	
	public VIAModel(EventsList event, MemberList member, LecturerList lecturer) {
		this.eventList = event;
		this.memberList = member;
		this.lecturerList = lecturer;
	}
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
