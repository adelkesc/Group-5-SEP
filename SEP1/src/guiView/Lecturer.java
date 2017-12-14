package guiView;

import java.io.Serializable;

/**
 * Lecturer - This class represents a Lecturer.
 * 
 * @author Lukas
 * @version 1.0 14/12/2017
 */
public class Lecturer implements Serializable {
	private String name;
	private String email;
	private String courseSpec;
	private String telNumber;
	private String advertReq;

	/**
	 * 0 argument constructor. Sets all of the Lecturer variables to default empty
	 * Strings.
	 */
	public Lecturer() {
		this("", "", "", "", "");
	}

	/**
	 * 5 argument constructor. Sets all of the Lecturer variables to be equal to the
	 * argument Lecturer variables.
	 */
	public Lecturer(String name, String email, String courseSpec, String telNumber, String advertReq) {
		this.name = name;
		this.email = email;
		this.courseSpec = courseSpec;
		this.telNumber = telNumber;
		this.advertReq = advertReq;
	}

	public void setName(String newName) {
		name = newName;
	}

	public String getName() {
		return name;
	}

	public void setEmail(String newEmail) {
		email = newEmail;
	}

	public String getEmail() {
		return email;
	}

	public void setCourseSpec(String newCourseSpec) {
		courseSpec = newCourseSpec;
	}

	public String getCourseSpec() {
		return courseSpec;
	}

	public void setTelNumber(String newTelNumber) {
		telNumber = newTelNumber;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setAdvertReq(String newAdvertReq) {
		advertReq = newAdvertReq;
	}

	public String getAdvertReq() {
		return advertReq;
	}

	public String toString() {
		return "Name: " + name + " E-Mail: " + email + " Course Specification: " + courseSpec + " Tel. Number: "
				+ telNumber + " Advertisement Requirement: " + advertReq + "\n";
	}

}
