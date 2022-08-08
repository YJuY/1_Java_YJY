package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int pepoleNo = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.print("1인당 사탕 개수 : " + candy/pepoleNo + "\n");
		System.out.print("남는 사탕 개수 : " + candy%pepoleNo);
		
		
	}
}
