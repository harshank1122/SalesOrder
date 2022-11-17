package org.careerX2.O.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CusBillAdd {
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
     private int AddId ;
	 private String Country;
	 private String state;
	 private String city;
	 private String zip;
	 private String baddress;
	 
	 private String sCountry;
	 private String sstate;
	 private String scity;
	 private String szip;
	 private String saddress;
	

	public String getBaddress() {
		return baddress;
	}
	public void setBaddress(String baddress) {
		this.baddress = baddress;
	}
	public String getsCountry() {
		return sCountry;
	}
	public void setsCountry(String sCountry) {
		this.sCountry = sCountry;
	}
	public String getSstate() {
		return sstate;
	}
	public void setSstate(String sstate) {
		this.sstate = sstate;
	}
	public String getScity() {
		return scity;
	}
	public void setScity(String scity) {
		this.scity = scity;
	}
	public String getSzip() {
		return szip;
	}
	public void setSzip(String szip) {
		this.szip = szip;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public int getAddId() {
		return AddId;
	}
	public void setAddId(int addId) {
		AddId = addId;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "CusBillAdd [AddId=" + AddId + ", Country=" + Country + ", state=" + state + ", city=" + city + ", zip="
				+ zip + ", baddress=" + baddress + ", cusShipAdd="  +   "]"; //+ cusShipAdd 
	}
	 
	 
}
