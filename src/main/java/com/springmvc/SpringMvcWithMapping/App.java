package com.springmvc.SpringMvcWithMapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class App {
	
    
    public static void main( String[] args )
    {
       
		
		
		Student_Address address= new Student_Address();
		address.setDoorNo(1);
		address.setStreetName("narmadha");
		address.setCity("chennai");
		address.setZipCode("600059");
		
		Mobile mobile1= new Mobile();
		mobile1.setMobileName("MicroMax");
		mobile1.setMobileNumber("9566193195");
		
		Mobile mobile2= new Mobile();
		mobile2.setMobileName("Samsung");
		mobile2.setMobileNumber("1234567890");
		
		
		List<Mobile> list= new ArrayList<Mobile>();
		list.add(mobile1);
		list.add(mobile2);
		
		Student student1 = new Student();
		student1.setStudentName("stella");
        student1.setStudentAddress(address);
		student1.setMobiles(list);
		mobile1.setStudent(student1);
        mobile2.setStudent(student1);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persist");
    	EntityManager em = emf.createEntityManager();
    	
    	em.getTransaction().begin();
    	em.persist(address);
    	em.persist(student1);
    	
    	em.getTransaction().commit();
    	}
}
