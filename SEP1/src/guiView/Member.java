package guiView;

import java.io.Serializable;

/**
 * Member - This class represents a Member
 * 
 * @author Nadeem
 * @version 1.0, 14/12/2017
 */
public class Member implements Serializable {
	private String name;
	private String age;
	private String address;
	private String tel;
	private String email;
	private String coursePref;
	private String membPay;

	/**
	 * 0 arguent constructor. Sets the Member attributes to default empty String
	 * values.
	 */
	public Member() {
		this("", "", "", "", "", "", "");
	}

	/**
	 * 7 argument constructor. Sets Member attributes
	 */
	public Member(String name, String age, String address, String tel, String email, String coursePref,
			String membPay) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.tel = tel;
		this.email = email;
		this.coursePref = coursePref;
		this.membPay = membPay;
	}

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String newAge) {
		age = newAge;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String newAddress) {
		address = newAddress;
	}

	public void setTel(String newTel) {
		tel = newTel;
	}

	public String getTel() {
		return tel;
	}

	public void setEmail(String newEmail) {
		email = newEmail;
	}

	public String getEmail() {
		return email;
	}

	public void setCoursePref(String newCoursePref) {
		coursePref = newCoursePref;
	}

	public String getCoursePref() {
		return coursePref;
	}

	public String getMembPay() {
		return membPay;
	}

	public void setMembPay(String newMembPay) {
		membPay = newMembPay;
	}
}
