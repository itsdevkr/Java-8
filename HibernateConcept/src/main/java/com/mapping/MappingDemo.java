package com.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MappingDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.setEmpId(34); e1.setEmpName("Ram");
		e2.setEmpId(35); e2.setEmpName("Shyam");
	
		Project p1 = new Project();
		Project p2 = new Project();
		p1.setProjectId(1111); p1.setProjectName("Java project");
		p2.setProjectId(2222); p2.setProjectName("Spring Project");
	
		List<Employee> list1 = new ArrayList<Employee>();
		list1.add(e1);list1.add(e2);
		
		List<Project> list2 = new ArrayList<Project>();
		list2.add(p1);list2.add(p2);
		
		e1.setProjects(list2);
		p1.setEmployees(list1);
	
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		s.save(e1);s.save(e2);s.save(p1);s.save(p2);
		
		
	}

}
