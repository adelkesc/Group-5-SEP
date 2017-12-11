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

}
