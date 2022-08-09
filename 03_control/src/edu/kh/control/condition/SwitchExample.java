package edu.kh.control.condition;

import java.util.Scanner;

public class SwitchExample {
	
	/* switch문
	 *  - 식 하나의 결과로 많은 경우의 수를 처리할 때 사용하는 조건문
	 * -> 식의 결과로 얻은 값과 같은 case 구문이 수행된다.
	 * 
	 * 
	 *  [작성법 ] 
	 *  
	 *  
	 *  // switch문의 식은 결과가 true/false가 아닌 식
	 *  switch(식){
	 *  
	 *  case 결과값1 : 수행코드1; break;
	 *  case 결과값2 : 수행코드1; break;
	 *  case 결과값3 : 수행코드1; break;
	 *  ...
	 *  
	 *  default : 모든 case가 만족하지 않을 경우 수행하는 코드;
	 *  
	 *  }
	 *  
	 * */
	
	public void ex1() {
		//키보드로 정수를 입력 받아
		// 1이면 "빨강색"
		// 2이면 "주황색"
		// 3이면 "노란색"
		// 4이면 "초록색"
		// 1~4가 아니면 "흰색"을 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		String result;
		
//		if(input ==1) {
//			result = "빨강색";
//		} else if(input == 2) {
//			result = "주황색";
//		} else if(input == 3) {
//			result = "노란색";
//		} else if(input ==4) {
//			result = "초록색";
//		} else {
//			result = "흰색";
//		}
		
		// 식 == 여러 값이 나오는 경우
		switch(input) {
		case 1 : result = "빨강색";	break;
		case 2 : result = "주황색";	break;
		case 3 : result = "노란색";	break;
		case 4 : result = "초록색";	break;
		default : result = "흰색";
		}
		System.out.println(result);
	}
	
	
	public void ex2() {
		// 정수를 입력받아
		// 나머지가 1이면 "백팀"
		// 나머지가 2이면 "청팀"
		// 나머지가 3이면 "홍팀"
		// 나머지가 1~3이 아니면 "깍두기"
		
		// [실행화면]
		// 정수 입력 : 1
		// 백팀 입니다.
		
		// 정수 입력 : 5
		// 깍두기 입니다.
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		String result;
		
		switch(input%4) {
		case 1 : result = "백팀"; break;
		case 2 : result = "청팀"; break;
		case 3 : result = "홍팀"; break;
		
		default : result = "깍두기";
		}
		
		System.out.println(result+"입니다.");
		
	}
	
	
	
	public void ex3() {
		
		// switch문의 식 결과가 double형인 경우 -> 안됨!
		// switch문의 식 결과가 String인 경우
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" 김밥(3000) / 라면(4000) / 샌드위치(50000) / 짬뽕(10000) ");
		
		System.out.print("메뉴 입력 : ");
		
		String input = sc.next();
		
		int result;
		switch(input) {	// switch의 식은 int, String만 가능
		case "김밥" : result = 3000;	break;
		case "라면" : result = 4000;	break;
		case "샌드위치" : result = 5000;break;
		case "짬뽕" : result = 10000;	break;
		default : result = -1;	// 잘못 입력하면 -1 이라고 의미 부여
		}
		
		if(result == -1) {
			System.out.println("잘못 입력 하셨습니다.");
		} else {
			System.out.printf("%s은 원 입니다.\n, input, result");
		}
	}
	
	public void ex4() {
		
		// 산술 연산 계산기
		// 두 정수와 1개의 연산자( + = * / % (String)를 입력 받아서
		// 연산결과를 출력
		// 단, 나누기(/)연산 시 0으로는 나루 수 없도록 한다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("연산자 입력 : ");
		String op = sc.next();
		
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		
		String result;
		
		// [실행 화면]
		// 정수 1 입력 : 5
		// 연산자 입력 : +
		// 정수2 입력 : 4
		// 5+ 4 = 9
		
		// [실행 화면]
		// 정수 1 입력 : 5
		// 연산자 입력 : /
		// 정수2 입력 : 0
		// 0으로는 나눌 수 없습니다.
		
		// [실행 화면]
		// 정수 1 입력 : 5
		// 연산자 입력 : @
		// 정수2 입력 : 3
		// 존재하지 않는 연산자 입니다.
		
		//int result; // 결과 저장 변수
		//정상적인 연산자인가?->이런 구분할 변수 필요
		
		switch(op) {
//		case "+": System.out.println(num1+"+"+num2+"="+(num1+num2)); break;
		case "+": System.out.printf("%d %s %d = %d \n",num1,op, num2, num1 + num2); break;
		
		
//		case "-": System.out.println(num1+"-"+num2+"="+(num1-num2)); break;
		case "-": System.out.printf("%d %s %d = %d \n",num1,op, num2, num1 - num2); break;
		
//		case "*": System.out.println(num1+"*"+num2+"="+(num1*num2)); break;
		case "*": System.out.printf("%d %s %d = %d \n",num1,op, num2, num1 * num2); break;
		
		case "/":
			if(num2==0) { // 두 번째 입력한 정수가 0인 경우
				System.out.println("0으로는 나눌 수 없습니다.");
				
			} else {// 두 뻔째 입력한 정수가 0이 아닌 경우
//				System.out.println(num1+"/"+num2+"="+(num1/num2));
				System.out.printf("%d %s %d = %d \n",num1,op, num2, num1 / num2);
				
			}
		break;
		
//		case "%": System.out.println(num1+"%"+num2+"="+(num1%num2)); break;
		case "%": System.out.printf("%d %s %d = %d \n",num1,op, num2, num1 % num2); break;
		
		default : System.out.println("존재하지 않는 연산자 입니다.");
		//연산자를 잘못 입력한 경우
		}
		
		
	}
	
	
	
	
	
}
	

