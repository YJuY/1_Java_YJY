package edu.kh.oop.method.model.run;

import edu.kh.oop.method.model.view.MethodExampleView;

// 실행용 클래스
public class MethodExampleRun {
	public static void main(String[] args) {
		
		MethodExampleView view = new MethodExampleView();
		
		view.displayMenu();
		// view가 참조하는 객체의 기능(메서드) 중
		// diaplayMenu() 메서드를 호출
		
	}

}
