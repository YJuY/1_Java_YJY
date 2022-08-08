package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int inputNo = sc.nextInt();
		
		String result = (inputNo==0)?"0 입니다."
										:(inputNo > 0)?"양수 입니다.":"음수 입니다.";
		
		//String result = (input > 0) ? "양수": (input<0?"음수":"0");
		System.out.println(result);
		
		
	}
}
