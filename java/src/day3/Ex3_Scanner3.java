package day3;

import java.util.Scanner;

public class Ex3_Scanner3 {
	public static void main(String[] args) {
		/* 두 정수와 산술 연산자(+-/*%)를 입력받아 입력하는 코드를 작성하세요
		 * 산술연산자는 문자로 받아주세요
		 */
		
		//int 2개, 문자
		//정수를 입력하세요
		//연산자를 입력하세요
		
	  Scanner scan= new Scanner(System.in);
	  
	  System.out.print("정수1을 입력하세요 : "); 
	  int num1 = scan.nextInt();
	  System.out.print("정수2을 입력하세요 : "); 
	  int num2 = scan.nextInt();
	  System.out.print("산술연산자를 입력하세요 : "); 
	  char op = scan.next().charAt(0);
	  //정수 + 정수 => 정수
	  //+는 유니코드표에서 십진수 43에 해당
	  //문자열 + 정수 => 문자열
	  System.out.println(""+ num1 + op + num2);
	  //""+num1은 문자열이됨. 문자열 +op는 문자열. 문자열 +num2 문자열
	  // 우선순위가 왼쪽부터이므로 공백으로 인해 정수가 문자열로 변환되어 출력됨. 
	
	/*
	 * Scanner scan= new Scanner(System.in);
	 * 
	 * System.out.print("두 정수와 산술 연산자를 입력하세요(예: 1 + 2 (띄어쓰기로 구분)) : ");
	 * int num1 = scan.nextInt();
	 * char op = scan.next().charAt(0);
	 * int num2 = scan.nextInt();
	 * System.out.println(""+ num1 + op + num2);
	 */
	scan.close();
	  
	}
}
