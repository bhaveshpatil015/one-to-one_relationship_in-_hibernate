package com.bhavesh;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public abstract class Test {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		
		SubjectDetails sub1 = new SubjectDetails();
		sub1.setExternalMarks(50);
		sub1.setInternalMarks(30);
		sub1.setName("C Programming");
		sub1.setSubjectCode("CP-1");
		
		SubjectDetails sub2 = new SubjectDetails();
		sub2.setExternalMarks(80);
		sub2.setInternalMarks(70);
		sub2.setName("C++ Programming");
		sub2.setSubjectCode("CPP-1");
		
		SubjectDetails sub3 = new SubjectDetails();
		sub3.setExternalMarks(90);
		sub3.setInternalMarks(40);
		sub3.setName("Java Programming");
		sub3.setSubjectCode("JP-1");
		
		Set<SubjectDetails> subjects = new HashSet<SubjectDetails>();
		subjects.add(sub1);
		subjects.add(sub2);
		subjects.add(sub3);
		
		Address addr = new Address();
		addr.setAddId(1);
		addr.setCity("Burhanpur");
		addr.setPin(450331);
		
		Student s = new Student();
		s.setFname("Bhavesh");
		s.setLname("Patil");
		s.setRollNo(101);
		s.setAddr(addr);
		s.setSubjects(subjects);
		
		session.save(s);
		txn.commit();
		session.close();

	}

}
