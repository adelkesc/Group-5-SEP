package guiView;

import java.util.ArrayList;

public class MemberList {
	private ArrayList<Member> members;

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
	public ArrayList<Member> getListOfMembers()
	   {
	      return members;
	   }

	/*public void editMember(Member member, String name, int age, String address, int tel, String email,
			String coursePref) {
		Member editMem = new Member(name, age, address, tel, email, coursePref);
		members.add(editMem);
	}

	
	 * public Member searchMemberByName(String name) { boolean exist = false; if
	 * (members.isEmpty()) { return null; } for (int i = 0; i < members.size(); i++)
	 * { if (members.get(i).getName() == name) { exist = true; }
	 * 
	 * } if (exist) { return members.get(name); } else { return members.get(name); }
	 * 
	 * }
	 */
	public Member searchMemberByName(String name) {
		for (int i = 0; i < members.size(); i++) {
			Member mem = members.get(i);
			if (mem.getName().equals(name)) {
				return mem;
			}
		}
		return null;
	}

	public int countMembers() {
		return members.size();
	}
}
