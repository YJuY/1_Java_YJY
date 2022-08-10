package edu.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPractice {

	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		
		int input = sc.nextInt();
		
		if (input == 0) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			
		}else {
			for(int i = 1; i<=input; i++) {
				System.out.print(i);
			}
		}
	}
		
//	=============================================================================================
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		
		int input = sc.nextInt();
		if (input == 0) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			
		}else {
			for(int i = input; i>=1; i--) {
				System.out.print(i+" ");
			}
		}
		
		
	}
//	=============================================================================================
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		
		int sum =0;
		for(int i=1; i<=input; i++) {
			
			System.out.print(i);
			if(i==input) {
				System.out.print(" = ");
			}else {
				System.out.print(" + ");
			}
			sum+=i;
		}
		System.out.println(sum);
	}
	
//	=============================================================================================
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 <= 0 || num2 <= 0) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			
		} else {
			if(num1>num2) {
				for(int i = num2; i<=num1; i++) {
					System.out.print(i+" ");
				}
			}else {
				for(int i = num1; i<=num2; i++) {
					System.out.print(i+" ");
					}
			}
			
		}
		
		
	}
//	=============================================================================================
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		System.out.printf("==== %d단 ====\n", input);
		
		for(int i = 1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", input, i, input*i);
		}
	}
//	=============================================================================================
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		if(input>9) {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
			
		} else {
			
			for(int x = input; x<=9; x++ ) {
				System.out.printf("==== %d단 ====\n",x);
				
				for(int i = 1; i<=9; i++) {
						System.out.printf("%d * %d = %d\n", x, i, x*i);
					}
			}
		}
	}
//	=============================================================================================
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int x=1; x<= input; x++ ){
			for(int i = 1; i<=x; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
//	=============================================================================================
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int x = input; x >= 1; x--) {
			for(int i = 1; i <= x; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
//	=============================================================================================
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for (int x=1; x<=input; x++){
			
			for(int i=input-1; i >=x; i--) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=x;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
	}

//	=============================================================================================
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int input = sc.nextInt();	
		
		for(int x = 1; x<=input; x++) {
			for(int i = 1; i<=x; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		for (int x=1; x<=input; x++){
			
			for(int i=input-1; i >=x; i--) {
				System.out.print("*");
			}
			
			for(int j=1; j<=x;j++) {
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
	
//	=============================================================================================
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int input = sc.nextInt();
		
		for (int x=1; x<=input; x++){
			
			for(int i=input-1; i >=x; i--) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=input;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
//		
//		for(int x = 1; x<=input; x++) {
//			for(int i=)
//			
//		}
	}
	
	public void practice12() {
	}
	
	public void practice13() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		
		for(int i=2; i<=input; i+=2) {//2의 배수
			for(int j = 3; j<=input; j+=3) {//3의 배수
				
				
			}
			
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
