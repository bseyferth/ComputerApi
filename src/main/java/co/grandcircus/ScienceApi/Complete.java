package co.grandcircus.ScienceApi;

import java.util.List;

public class Complete {

	private List<Complete> complete;
	private String firstName;
	private String lastName;
	private String innovation;
	private Integer year;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getInnovation() {
		return innovation;
	}
	public void setInnovaton(String innovation) {
		this.innovation = innovation;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Complete(List<Complete> complete,String firstName, String lastName, String innovation, Integer year) {
		super();
		this.complete = complete;
		this.firstName = firstName;
		this.lastName = lastName;
		this.innovation = innovation;
		this.year = year;
	}
	
	public Complete() {
	}
	public List<Complete> getComplete() {
		return complete;
	}
	public void setComplete(List<Complete> complete) {
		this.complete = complete;
	}
	@Override
	public String toString() {
		return "Complete [complete=" + complete + ", firstName=" + firstName + ", lastName=" + lastName + ", innovation="
				+ innovation + ", year=" + year + "]";
	}

	
}
