package edu.kh.poly.practice.model.service;

import java.util.Arrays;
import java.util.Scanner;

import edu.kh.poly.practice.model.vo.Employee;
import edu.kh.poly.practice.model.vo.Person;
import edu.kh.poly.practice.model.vo.Student;

public class QuestionService implements QuestionInterface{

	Scanner sc = new Scanner(System.in);
	
	Person ps = new Person();
	
	
	Person[] pArr = null;

	public void displayMenu() {
		int input = 0;
		
		
		do{
			System.out.println("=====메뉴 출력======");
			System.out.println("1. 모든 요소 출력");
			System.out.println("2. 학생 정보만 출력");
			System.out.println("3. 직원 정보만 출력");
			System.out.println("4. 정보 찾기(이름)");
			System.out.println("5. 모든 사람의 나이(합/최고/최저)출력");
			System.out.println("6. 입력 인덱스 삭제");
			System.out.println("7. 학생 또는 직원 등록 ");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴를 선택하세요 : ");
			input = sc.nextInt();
			
			switch(input) {
			case 1: selectAll(); break;
			case 2: selectStudent(); break;
			case 3: selectEmployee(); break;
			case 4: if(pArr != null) {
				searchName(); 
				break;
			}else {
					System.out.println("등록 인원이 없습니다.");
					break;
			} 
			case 5: 
			case 6:
			case 7: insertPerson(); break;
			case 0: break;
			default : System.out.println("잘못 입력하셨습니다."); break;
			}
			

		}while(input != 0);
		
		if(input == 0) {
			System.out.println("프로그램을 종료합니다.");
		}
	}

	public void insertPerson() {
		
		int input = 9;
		
		do {
			
			System.out.println("=====등록 메뉴=====");
			System.out.println("1. 학생 등록");
			System.out.println("2. 직원 등록");
			System.out.println("9. 이전 메뉴로");
			System.out.print("번호를 입력하세요 : ");
			input = sc.nextInt();
			
			switch(input) {
			case 1: {
				System.out.print("학생의 이름을 입력하세요 : ");
				String name = sc.next();
				System.out.print("학생의 나이를 입력하세요 : ");
				int age = sc.nextInt();
				
				if(pArr == null) { //null이면 추가 후 등록
					pArr = new Person[1];
					pArr[pArr.length-1] = new Student(name, age);
					System.out.println("등록 완료");
					break;
				}else {
					Person [] pArr2 = new Person[pArr.length+1];
					pArr2 = Arrays.copyOf(pArr, pArr.length+1); // null 아니면 배열에 한 자리 더 추가
					pArr = pArr2;
					pArr[pArr.length-1] = new Student(name, age);
					System.out.println("등록 완료");
					break;
				}
			}
			case 2: {
				
				System.out.print("직원의 이름을 입력하세요 : ");
				String name = sc.next();
				System.out.print("직원의 나이를 입력하세요 : ");
				int age = sc.nextInt();
				
				if(pArr == null) { //null이면 추가 후 등록
					pArr = new Person[1];
					pArr[pArr.length-1] = new Employee(name, age);
					System.out.println("등록 완료");
					break;
				}else {
					Person [] pArr2 = new Person[pArr.length+1];
					pArr2 = Arrays.copyOf(pArr, pArr.length+1);
					pArr = pArr2; // null 아니면 배열에 한 자리 더 추가
					pArr[pArr.length-1] = new Employee(name, age);
					System.out.println("등록 완료");
					break;
				}
				
			}
			case 9: displayMenu(); break;
			default : System.out.println("잘못 입력하셨습니다."); break;
			}
			
		}while(input != 9);
		
		
		
		
	}

	public void selectAll() {
		//모든 정보 출력
		
		if(pArr != null) { // 등록이 되어있을 경우
			//전체 순회하면서 정보 출력
			for(int i = 0; i< pArr.length; i++) {
				pArr[i].information();
				System.out.println();
				}
		} else { // 등록이 안 되어 있으면
			System.out.println("저장된 요소가 없습니다."); 
		}
		
	}

	@Override
	public void selectStudent() {
		
		if(pArr !=null) {
			for(int i = 0; i< pArr.length; i++) {
				if(pArr[i] instanceof Student) {
					pArr[i].information();
					System.out.println();
				}
			}
		}else {
			System.out.println("등록 인원이 없습니다.");
		}
		
	}

	@Override
	public void selectEmployee() {
		
		if(pArr !=null) {
			for(int i = 0; i< pArr.length; i++) {
				if(pArr[i] instanceof Employee) {
					pArr[i].information();
					System.out.println();
				}
			}
		}else {
			System.out.println("등록 인원이 없습니다.");
		}
		
	}

	@Override
	public Person searchName() {
		
		System.out.print("검색할 이름을 입력하세요 : ");
		String name = sc.next();
		
		for(int i = 0; i<pArr.length; i++) {
			if(pArr[i].getName().equals(name)) {
				pArr[i].information();
				return pArr[i];
			}
		}
		System.out.println("찾는 인원이 없습니다.");
		return null;
		
		
	}

	@Override
	public void printAge() {
		int sage = 0;
		int hage = 0;
		int lage = 0;
		
		for(int i = 0; i < pArr.length; i++) {
			sage += pArr[i].getAge();
			System.out.println("모든 나이의 합 : "+ sage);
		}
		
		for(int i = 0; i < pArr.length-1; i++) {
			if(pArr[i].getAge()>pArr[i+1].getAge()) {
				
			}
			System.out.println("모든 나이의 합 : "+ sage);
		}
		
		
	}

	@Override
	public Person deletePerson() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addPerson() {
		// TODO Auto-generated method stub
		
	}
}
