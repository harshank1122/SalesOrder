package org.careerX2.O.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Ordetails {
	@Id
    private String connu;
    private String cusNmae;
    private String copname;
    private String email;
    private String baddress;
    private String saddress;
    private String ProductN ;
    private String size;
    private String quantity;
	public String getConnu() {
		return connu;
	}
	public void setConnu(String connu) {
		this.connu = connu;
	}
	public String getCusNmae() {
		return cusNmae;
	}
	public void setCusNmae(String cusNmae) {
		this.cusNmae = cusNmae;
	}
	public String getCopname() {
		return copname;
	}
	public void setCopname(String copname) {
		this.copname = copname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBaddress() {
		return baddress;
	}
	public void setBaddress(String baddress) {
		this.baddress = baddress;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public String getProductN() {
		return ProductN;
	}
	public void setProductN(String productN) {
		ProductN = productN;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
    
    
    
}
