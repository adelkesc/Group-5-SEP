package guiView;

import java.io.Serializable;

import javafx.beans.property.SimpleStringProperty;

public class Member implements Serializable {
	private SimpleStringProperty name = new SimpleStringProperty("");
	private SimpleStringProperty age = new SimpleStringProperty("");
	private SimpleStringProperty address = new SimpleStringProperty("");
	private SimpleStringProperty tel = new SimpleStringProperty("");
	private SimpleStringProperty email = new SimpleStringProperty("");
	private SimpleStringProperty coursePref = new SimpleStringProperty("");
	private SimpleStringProperty membPay = new SimpleStringProperty("");
	
	////sdfsdfsdfsdf

	public Member() {
		
		      this("lukas", "", "", "", "", "", "");
	}

	public Member(String name, String age, String address, String tel, String email, String coursePref, String membPay) {
		setName(name);
		setAge(age);
		setAddress(address);
		setTel(tel);
		setEmail(email);
		setCoursePref(coursePref);
		setMembPay(membPay);
	}

	 public String getName()
	   {
	      return name.get();
	   }

	public void setName(String newName) {
		name.set(newName);
	}

	public String getAge() {
		return age.get();
	}

	public void setAge(String newAge) {
		age.set(newAge);
	}

	public String getAddress() {
		return address.get();
	}

	public void setAddress(String newAddress) {
		address.set(newAddress);
	}

	public void setTel(String newTel)
	   {
	      tel.set(newTel);
	   }

	   public String getTel()
	   {
	      return tel.get();
	   }

	public void setEmail(String newEmail)
	   {
	      email.set(newEmail);
	   }
	   
	   public String getEmail()
	   {
	      return email.get();
	   }

	   public void setCoursePref(String newCoursePref)
	   {
	      coursePref.set(newCoursePref);
	   }

	   public String getCoursePref()
	   {
	      return coursePref.get();
	   }

	public String getMembPay() {
		return membPay.get();
	}

	public void setMembPay(String newMembPay) {
		membPay.set(newMembPay);
	}

}
