package edu.kh.abs.model.service;

import edu.kh.abs.model.vo.*;

public class AbstractService {
	// Chicken
	// Eagle
	// Penguin
	// Shark
	// Whale
	
	// TypeBirds
	// TypeMammalia
	// TypePisces
	
	
	public void ex1() {
		//포유류
		Dog dog = new Dog();
		Cat cat = new Cat();
		Whale whale = new Whale();
		//조류
		Chicken chicken = new Chicken();
		Eagle eagle = new Eagle();
		Penguin penguin = new Penguin();
		//어류
		Shark shark = new Shark();
		
		
		
		/*
		dog.cry();
		dog.eat();
		dog.move();
		
		cat.cry();
		cat.eat();
		cat.move();
		*/
		// Animal animal = new Animal();
		// 추상클래스는 객체화할 수 없다
		// 타입으로서의 기능만 수행한다.
		
		TypeMammalia[] mammalia = new TypeMammalia[] {cat, dog, whale};
		TypeBirds[] birds = new TypeBirds[] {chicken, eagle, penguin};
		TypePisces[] pisces = new TypePisces[] {shark};
		
		Animal[] animal = new Animal[] {
				cat, dog, whale,
				chicken, eagle, penguin, shark};
		
		for(int i = 0; i< animal.length; i++) {
			animal[i].cry();
			animal[i].eat();
			animal[i].move();
			
			// 만약 animal 중에 타입이 고양이일 떄
			// 수유를 한다는 breastfeed() 출력
			
			if(animal[i] instanceof Cat) {
	
				((Cat)animal[i]).breastfeed();
			}
			
			if(animal[i] instanceof Eagle) {
				
				((Eagle)animal[i]).fly();
				//.연산자가 ()보다 우선순위가 빨라서 다운캐스팅에 ()를 씌워준다.
			}
		}
	
	}

}
