package com.springmvc.SpringMvcWithMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_ADDRESS")
public class Student_Address {
	
	@Id
    @Column(name = "ADDR_ID")
    @GeneratedValue
    private int addrId;
    @Column(name = "DOOR_NO")
	private int doorNo;
    @Column(name = "STREET_NAME")
	private String streetName;
    @Column(name = "CITY")
	private String city;
    @Column(name = "ZIPCODE")
	private String zipCode;
    @OneToOne(targetEntity=Student.class)
	private Student student;
	
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	

}
