package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		int [] arr = new int[9];
		
		int sum = 0;
		for (int i = 0; i<arr.length; i++) {
			arr[i]=i+1;
			
			System.out.print(arr[i]+" ");
			
			if(i%2==0) {
				sum+=arr[i];
			}
			
		}
		System.out.println();
		System.out.println("짝수 번째 인덱스 합 : "+sum);
	}
//	-----------------------------------------------------------------
	public void practice2() {
		int [] arr = new int[9];
		
		int sum = 0;
		for (int i = 0; i<arr.length; i++) {
			arr[i]=arr.length-i;
			
			System.out.print(arr[i]+" ");
			
			if(!(i%2==0)) {
				sum+=arr[i];
			}
			
		}
		System.out.println();
		System.out.println("홀수 번째 인덱스 합 : "+sum);
	}
//	--------------------------------------------------------------------
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		for(int i = 0; i <arr.length; i++) {
			arr[i]= i+1;
			System.out.print(arr[i]+" ");
		}
	}
	
//	--------------------------------------------------------------------
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i = 0; i<5; i++) {
			System.out.print("입력 "+i+" : ");
			
			int input = sc.nextInt();
			arr[i]=input;

		}
		System.out.print("검색할 값 : ");
		int input2 = sc.nextInt();
		
		for(int j = 0; j<arr.length; j++) {
			if(input2 == arr[j]) {
				System.out.println("인덱스 : " + j);
				break;
			} else if((input2 != arr[j])) {
				continue;
			}
		}
		System.out.println("일치하는 값이 존재하지 않습니다.");
		
	}
//	--------------------------------------------------------------------
//	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String input = sc.next();
		
		System.out.print("문자 : ");
		char test = sc.next().charAt(0);
		
		// 문자열 길이
		int linput = input.length();
		
		int count = 0;
		
		System.out.print(input+"에 "+test + "가 존재하는 위치(인덱스) : ");
		
		for(int i = 0; i<linput; i++) {
			char ch = input.charAt(i); // 입력받은 문자열 인덱스 문자 하나 얻어옴
			
			if(ch == test) { // i 개수
				count +=1;
				
				System.out.print(i+" ");
				
			}

		}
		System.out.println();
		System.out.println(test + "개수 : "+count);
	}
//	--------------------------------------------------------------------
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			
		}
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			count +=arr[i];
		}
		System.out.println();
		System.out.println("총 합 : "+count);
	}
//	--------------------------------------------------------------------
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String input = sc.next();
		
//		char input = sc.next().charAt(0);
		
		char[] arr = new char[input.length()]; // 주민번호 길이 만큼 배열 생성
		
//		System.out.println(input);
		for(int i = 0; i< input.length(); i++) {
			char ch = input.charAt(i);	// i번째 문자 하나 얻어옴
			arr[i] = ch; // i 번째 문자 대입
			if(i>=8) {
				arr[i]='*';// 성별 이후 부터는 *로 저장
			}
		}
		for(int i = 0; i< input.length(); i++) {
			System.out.print(arr[i]);
		}
	}
//	--------------------------------------------------------------------
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i<1; i--) {
			System.out.print("정수 : ");
			int input = sc.nextInt();
		
			if(input<3 || input%2==0) {
				System.out.println("다시 입력하세요.");
				continue;
				
			}else {
				for(int x= 0; x< input/2+1; x ++) {
					System.out.print(x+1+", ");
				}
				
				for(int y = input/2; y >0; y--) {
					System.out.print(y);
					if(y>1) {
						System.out.print(", ");
					}
				}
			}
		break;
		}
			
	}
//	--------------------------------------------------------------------
	
	
	public void practice9() {
		int[] arr = new int[10];
		
		System.out.print("발생한 난수 : ");
		
		for(int i = 0; i<arr.length; i++) {
			
			int ran = (int)(Math.random()*9+1);//1~10사이 난수
			arr[i] = ran;
			System.out.print(arr[i]+" ");
		}
	}
//	--------------------------------------------------------------------
	public void practice10() {
		int[] arr = new int[10];
		System.out.print("발생한 난수 : ");
		for(int i = 0; i<arr.length; i++) {// 난수 발생 배열 초기화
			
			int ran = (int)(Math.random()*9+1);//1~10사이 난수
			arr[i] = ran;
			System.out.print(arr[i]+" ");
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i =1; i < arr.length; i ++) {
			
			if(arr[i] >max) {
				max = arr[i];
				
			} 
			if(arr[i] < min ){
				min = arr[i];
			}
		}
		System.out.print("\n최대값 : "+max+"\n최소값 : "+min);
		
	}
	
//	--------------------------------------------------------------------
	
	
	public void practice11() {
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			
			int ran = (int)(Math.random()*10+1);//1~10사이 난수
			
			arr[i] = ran;
			
			for(int x =0; x<i; x++) {
				if(arr[x] == ran) {
					i--;
					break;
				}
			}
		}
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
//	--------------------------------------------------------------------
	
	public void practice12() {
		int[] arr = new int[6];
		
		for(int i = 0; i < arr.length; i++) {
			int ran = (int)(Math.random()*45+1);
			arr[i]= ran;
			
			for(int x = 0; x<i; x++) {
				if(arr[x]==ran) {
					i--;
					break;
				}
			}
			
		}
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
//	--------------------------------------------------------------------
	public void practice13() {//*******************************다시
		
//		문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
//		문자의 개수와 함께 출력하세요. (중복 제거)
//		[실행 화면]
//		문자열 : application
//		문자열에 있는 문자 : a, p, l, i, c, t, o, n
//		문자 개수 : 8
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.next();
		System.out.print("문자열에 있는 문자 : ");
		
		char arr[] = new char[str.length()];
		
		int count = 0;
		
		for(int i= 0; i<arr.length; i++) {
			
			char ch = str.charAt(i);
			arr[i] = ch; // 문자 하나 씩 저장
			
			for(int x = 1; x < i; x++) {
				if(arr[x]!=ch) {
					count+=1;
					break;
				}
			}
			for(int y=0; y<i; y++) {
				if(arr)
			}
			
			System.out.print(arr[i]);
					if(i<arr.length-1) {
						System.out.print(", ");
					}
			
		}
			
		System.out.print("\n문자 개수 : "+count);
		
		
	}
	
//	--------------------------------------------------------------------

	public void practice14() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열의 크기를 입력하세요 : ");
		int input = sc.nextInt();
		
		String str = new String();
		
	}
	
	public void practice15() {
		int[][] arr = new int[3][3];
		
		for(int i= 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length;j++) {
				System.out.printf("(%d,%d)",i,j);
			}
			System.out.println();
		}
	}
	
//	--------------------------------------------------------------------
	public void practice16() {
		int[][] arr = new int[4][4];
		
		int count = 0;
		
		for(int i= 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length;j++) {
				count++;
				arr[i][j]=count;
				
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}
//	--------------------------------------------------------------------
	public void practice17() {
		int[][] arr = new int[4][4];
		
		int count = 0;
		
		for(int i= 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length;j++) {
				count++;
				arr[i][j]=count;
				
			}
		}
		
		for(int i = arr.length-1; i>=0; i--) {
			for(int j = arr.length-1; j>=0; j--) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}
	
//	--------------------------------------------------------------------
	
	public void practice18() {
		int[][] arr = new int[4][4];
		
		//랜덤 대입
		for(int i = 0; i<arr.length; i++) {
			
			for(int j = 0; j<arr.length-1;j++) {
				
				int ran = (int)(Math.random()*9+1);
				arr[i][j] = ran;
				
				arr[i][3] = 0;//행
				arr[3][j] = 0;//열
			}
		}
		
		// 행/열 값들 합
		for(int i = 0; i<arr.length-1; i++) {
			for(int j = 0; j<arr.length-1;j++) {

				arr[i][3] += arr[i][j];//행
				arr[3][i] += arr[j][i];//열
			}
		}
		// 총합
		for(int j = 0; j<arr.length-1;j++) {

			arr[3][3] += arr[j][3] + arr[3][j];
		}
		
		 //결과출력
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length;j++) {
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println();
		}
	}
//	--------------------------------------------------------------------
	
	public void practice19() {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i>=0; i++) {
			System.out.print("행 크기 : ");
			int row = sc.nextInt();
			
			System.out.print("열 크기 : ");
			int col = sc.nextInt();
			
			if(!(row >=1 && row <= 10 && col >=1 && col <=10)) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				continue;
			} else {
				
				char[][] arr = new char[row][col];
				for(int x = 0; x<row-1; x++ ) {
					
					for(int y = 0; y<col-1; y++ ) {
						
						char ran = (char)(Math.random()*64+1);
						arr[x][y]=ran;
						System.out.println(arr[x][y]+" ");
					}
					System.out.println();
				}
				break;
			}
		}
	}
//	--------------------------------------------------------------------
	public void practice20() {
		
	}
	
	public void practice21() {
		
	}
	
	public void practice22() {
		
	}
	public void practice23() {
		
	}
	
	public void practice24() {
		
	}
}
