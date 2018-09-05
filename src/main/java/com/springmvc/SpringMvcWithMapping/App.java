package com.springmvc.SpringMvcWithMapping;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.SQLQuery;



public class App {
	
    
    public static void main( String[] args )
    {
       
		
		
//		Student_Address address= new Student_Address();
//		address.setAddrId(1);
//		address.setDoorNo(1);
//		address.setStreetName("narmadha");
//		address.setCity("chennai");
//		address.setZipCode("600059");
//		
//		Mobile mobile1= new Mobile();
//		mobile1.setMobileId(1);
//		mobile1.setMobileName("MicroMax");
//		mobile1.setMobileNumber("9566193195");
//		
//		Mobile mobile2= new Mobile();
//		mobile2.setMobileId(2);
//		mobile2.setMobileName("Samsung");
//		mobile2.setMobileNumber("1234567890");
//		
//		
//		List<Mobile> list= new ArrayList<Mobile>();
//		list.add(mobile1);
//		list.add(mobile2);
		
		Student student1 = new Student();
		student1.setStudentId(4);
		student1.setStudentName("Maha");
//      student1.setStudentAddress(address);
//		student1.setMobiles(list);
//		mobile1.setStudent(student1);
//      mobile2.setStudent(student1);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persist");
    	EntityManager em = emf.createEntityManager();
    	org.hibernate.Session session = (org.hibernate.Session) em.getDelegate();
        SQLQuery insertquery= session.createSQLQuery("call insertstudent(:a,:b)");
        insertquery.addEntity(Student.class);
        insertquery.setParameter("a", student1.getStudentId());
        insertquery.setParameter("b", student1.getStudentName());
        //insertquery.executeUpdate();
        
        SQLQuery readquery= session.createSQLQuery("call allstudent");
        readquery.addEntity(Student.class).executeUpdate();
        List result = readquery.list();
        for(int i=0; i<result.size(); i++){
        	Student student = (Student)result.get(i);
        	System.out.println("Hi I am "+" " + student.getStudentName()+" "+"My Id is "+" "+student.getStudentId());
        }
       
        SQLQuery updatequery= session.createSQLQuery("call updatestudent(:a,:b)");
        updatequery.addEntity(Student.class);
        updatequery.setParameter("a", student1.getStudentId());
        updatequery.setParameter("b", student1.getStudentName());
        updatequery.executeUpdate();
        
        SQLQuery updatedlist= session.createSQLQuery("call allstudent");
        updatedlist.addEntity(Student.class).executeUpdate();
        List result1 = updatedlist.list();
        for(int i=0; i<result1.size(); i++){
        	Student student = (Student)result1.get(i);
        	System.out.println("Hi I am "+" " + student.getStudentName()+" "+"My Id is "+" "+student.getStudentId());
        }

//    	em.getTransaction().begin();
//    	em.persist(student1);
//    	
//    	em.getTransaction().commit();
    	}
}
