package edu.kh.poly.practice.model.service;

import edu.kh.poly.practice.model.vo.Person;

public interface QuestionInterface {
	
	void displayMenu();
	
	void insertPerson();
	
	void selectAll();
	
	void selectStudent();
	
	void selectEmployee();
	
	Person searchName();
	
	void printAge();
	
	Person deletePerson();
	
	void addPerson();
	

}
