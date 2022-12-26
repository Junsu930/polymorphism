package edu.kh.poly.practice.model.vo;

public class Person {

	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Person() {}
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	public void information() {
		if(this instanceof Student ) {
			System.out.println("학생 이름 : " + this.getName());
			System.out.println("학생 나이 : " + this.getAge());
		}else {
			System.out.println("직원 이름 : " + this.getName());
			System.out.println("직원 나이 : " + this.getAge());
			
		}
	}
	
	
	
	
	
	

}
