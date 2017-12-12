package guiView;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javafx.beans.property.SimpleStringProperty;

public class Member implements Serializable {
	private transient SimpleStringProperty name = new SimpleStringProperty("");
	private transient SimpleStringProperty age = new SimpleStringProperty("");
	private transient SimpleStringProperty address = new SimpleStringProperty("");
	private transient SimpleStringProperty tel = new SimpleStringProperty("");
	private transient SimpleStringProperty email = new SimpleStringProperty("");
	private transient SimpleStringProperty coursePref = new SimpleStringProperty("");
	private transient SimpleStringProperty membPay = new SimpleStringProperty("");

	public Member() {
		      this("", "", "", "", "", "", "");
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
	public void readExternal(ObjectInputStream in) throws IOException, ClassNotFoundException {
		in.defaultReadObject();
		name = new SimpleStringProperty((String) in.readObject());
		age = new SimpleStringProperty((String) in.readObject());
		address = new SimpleStringProperty((String) in.readObject());
		tel = new SimpleStringProperty((String) in.readObject());
		email = new SimpleStringProperty((String) in.readObject());
		coursePref = new SimpleStringProperty((String) in.readObject());
		membPay = new SimpleStringProperty((String) in.readObject());

	}

	public void writeExternal(ObjectOutputStream out) throws IOException {
		out.defaultWriteObject();
		out.writeObject(name.get());
		out.writeObject(age.get());
		out.writeObject(address.get());
		out.writeObject(tel.get());
		out.writeObject(email.get());
		out.writeObject(coursePref.get());
		out.writeObject(membPay.get());
		
	}

}
