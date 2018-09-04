package com.springmvc.SpringMvcWithMapping;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
public class Student {

    @Id
    @GeneratedValue
    @Column(name="STUDENT_ID",nullable=false)
    private int studentId;
    
    @Column(name="NAME")
    private String studentName;

    @OneToOne(targetEntity=Student_Address.class,cascade = CascadeType.ALL,mappedBy="student")
    private Student_Address studentAddress;
    
    @OneToMany(targetEntity=Mobile.class,cascade = CascadeType.ALL,mappedBy="student")
    private List<Mobile> mobiles;

	public List<Mobile> getMobiles() {
		return mobiles;
	}

	public void setMobiles(List<Mobile> mobiles) {
		this.mobiles = mobiles;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Student_Address getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(Student_Address studentAddress) {
		this.studentAddress = studentAddress;
	}
    
}
    