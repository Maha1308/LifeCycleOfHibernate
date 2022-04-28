package com.edu;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity  //create table MyLaptop
public class MyLaptop {

	@Id
	@Column(name="lid",nullable=false)

	@GeneratedValue(strategy=GenerationType.AUTO)
      int lid;
	float lprice;
	String lname;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public float getLprice() {
		return lprice;
	}
	public void setLprice(float lprice) {
		this.lprice = lprice;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	
	public String toString() {
		return "MyLaptop [lid="+lid+",lname="+lname+",lprice="+lprice+"]";
	

}

	}


