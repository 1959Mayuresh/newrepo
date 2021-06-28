package com.endsemq2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;




public class Main {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setStudent_name("Mayuresh");
		s1.setStudent_id(1);
		s1.setCourse("Maths");
		s1.setIsa1(10);
		s1.setIsa2(20);
		s1.setIsa3(20);
		
		s1.setEndsem(30);
		
		s1.setTotal(80);
		SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionfactory.openSession();
		session.beginTransaction();
		session.save(s1);
		session.getTransaction().commit();
		session.close();
		sessionfactory.close();
	}

}

