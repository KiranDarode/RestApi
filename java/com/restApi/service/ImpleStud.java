package com.restApi.service;

import java.util.List;

import com.restApi.entites.Students;

public interface ImpleStud {

	public List<Students> GetStud();
	
	public Students getStudId( int id);

	public Students AddStudData(Students student);

	public Students DeleStud(int id);

	public Students UpdateS(int id);
}
