package guiView;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * MemberList - This class stores Member in a List.
 * 
 * @author Nadeem
 * @see ArrayList
 */
public class MemberList implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7507153324124992745L;
	private ArrayList<Member> members;

	/**
	 * 0 argument constructor. Instantiates a new ArrayList
	 * 
	 * @see ArrayList
	 */
	public MemberList() {
		this.members = new ArrayList<Member>();
	}

	public void addMember(Member member) {
		members.add(member);
	}

	public void removeMember(Member member) {
		members.remove(member);
	}

	public void editMember(Member member) {

	}

	public ArrayList<Member> getListOfMembers() {
		return members;
	}

	public int countMembers() {
		return members.size();
	}
}
