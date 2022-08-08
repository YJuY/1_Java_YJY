package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("국어 : ");
		int korean = sc.nextInt();
		
		System.out.printf("영어 : ");
		int english = sc.nextInt();
		
		System.out.printf("수학 : ");
		int math = sc.nextInt();
		
		//합계를 저장하기 위한 변수
		
		//세 과목의 합과 평균
		int sum = korean+english+math;
		// 평균을 저장하기 위한 변수
		double ave = sum/3.0;
				
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+ave);

		String result = (korean >= 40 && english >= 40 
							&& math>=40 && ave>=60)  ? "합격" : "불합격";
		
		System.out.println(result);
	}
}
