package org.careerX2.O.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SelesReDetails {
	  
	  @Id
      private String contact; 
      private String CompanyName;
      private String Email;
      private String Password;
      private String FirstName;
      private String LastName;
      private String Address;
      private String State;
      private String Zip;
      
      
      
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getZip() {
		return Zip;
	}
	public void setZip(String zip) {
		Zip = zip;
	}
	@Override
	public String toString() {
		return "SelesReDetails [contact=" + contact + ", CompanyName=" + CompanyName + ", Email=" + Email
				+ ", Password=" + Password + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Address="
				+ Address + ", State=" + State + ", Zip=" + Zip + "]";
	}
      
      
	
}
