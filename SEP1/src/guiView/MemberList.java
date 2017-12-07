package Project;

import java.util.ArrayList;

public class MemberList {
	private ArrayList<MemberModel> members;

	public MemberList() {
		this.members = new ArrayList<MemberModel>();
	}

	public void addMember(MemberModel member) {
		members.add(member);
	}

	public void removeMember(MemberModel member) {
		members.remove(member);
	}
	public void editMember(MemberModel member) {
		
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
	public MemberModel searchMemberByName(String name) {
		for (int i = 0; i < members.size(); i++) {
			MemberModel mem = members.get(i);
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
