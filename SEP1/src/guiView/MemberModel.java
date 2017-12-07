package Project;

import java.util.ArrayList;

public class MemberModel {
	private String name;
	private int age;
	private String address;
	private int tel;
	private String email;
	private String coursePref;
	private MyDate membPay;
	private ArrayList<MemberModel> members;

	public MemberModel(String name, int age, String address, int tel, String email, String coursePref, MyDate membPay) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.tel = tel;
		this.email = email;
		this.coursePref = coursePref;
		this.membPay = membPay.copy();
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

	public MemberModel(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCoursePref() {
		return coursePref;
	}

	public void setCoursePref(String coursePref) {
		this.coursePref = coursePref;
	}

	public MyDate getMembPay() {
		return membPay;
	}

	public void setMembPay(MyDate membPay) {
		this.membPay = membPay;
	}

}
