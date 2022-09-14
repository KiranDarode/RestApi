package com.restApi.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


import com.restApi.entites.Students;

@Service
public class StudDio implements ImpleStud {
	
	List <Students> list;
	public StudDio() {
		list=new ArrayList<>();
		list.add(new Students(1,"kirran","darode","2022"));
		list.add(new Students(2,"rahul","darode","2021"));
		list.add(new Students(3,"rajendra","darodwe","2020"));
		list.add(new Students(4,"Rakesh","darode1","2019"));
		
	}

	@Override
	public List<Students> GetStud() {
		
		return list;
	}

	@Override
	public Students getStudId(int id) {
		
		Students c=null;
		for(Students students : list) {
			
			if(students.getId()==id) {
				c=students;
				break;
		}else {
			System.out.println("data is no avilable");
			
		}
		}
		return c;
	}

	@Override
	public Students AddStudData(Students student) {
		
		list.add(student);
		return student;
	}

	@Override
	public Students DeleStud(int id) {
		Students c=null;
		
		for(Students students : list) {
			if(students.getId()==id) {
				
				list.remove(id);
				System.out.println("deleted succsessfully");
				c=students;
			   break;
			}else {
				System.out.println("id is not present");
			}
		}
		
		return c;
	}

	@Override
	public Students UpdateS(int id) {
		
		Students c=new Students(id,"deva","kuntal","2019");
		
		for(Students students : list) {
			if(students.getId()==id) {
				list.set(id, c);
				System.out.println("updated succsessfully");
				break;
			}
		}
		
		
		return null;
	}
		
}
		
// innowest technologis
	

