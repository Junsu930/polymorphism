package edu.kh.poly.run;
import edu.kh.poly.model.service.PolyService;
import edu.kh.poly.practice.model.service.QuestionService;

public class Run {

	public static void main(String[] args) {
		PolyService ps = new PolyService();
		
		QuestionService qs = new QuestionService();
		
		qs.displayMenu();
		
	}
}
