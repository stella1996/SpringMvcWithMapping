package com.springmvc.SpringMvcWithMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="MOBILES")
public class Mobile {
	@Id
	@GeneratedValue
	@Column(name="MOBILE_ID")
	private int mobileId;
	@Column(name="MOBILE_NAME")
	private String mobileName;
	@Column(name="MOBILE_NUMBER")
	private String mobileNumber;
	
	@ManyToOne
	private Student student;
	
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Mobile [mobileId=" + mobileId + ", mobileName=" + mobileName + ", mobileNumber=" + mobileNumber
				+ ", student=" + student + "]";
	}
	
	

}
