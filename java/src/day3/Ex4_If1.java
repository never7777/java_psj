package day3;

import java.util.Scanner;

public class Ex4_If1 {
	public static void main(String[] args) {
		/* 두 정수와 산술 연산자를 입력받아 산술 연산 결과를 출력하는 코드를 작성하세요.
		 * 정수와 산술연산자를 입력하시오(예: 1 + 2) :
		 * 1+2=3
		 */
		
		// int 2개, char 1개, 스캐너
		Scanner scan = new Scanner(System.in);
	
		System.out.println("정수와 산술연산자를 입력하시오(예: 1 + 2) :");
		int num1 = scan.nextInt();
		char op = scan.next().charAt(0);
		int num2 = scan.nextInt();
		
		//같은 변수로 비교하면 else if 를 사용
		//if에서 변수 op인데 op가지고 계속 비교해야 한다면 else if
		//아예 다른 변수가지고 해야하면 새로 if를 만들어야함
		
		if(op == '+') {
			System.out.println(""+num1+ op + num2 + "=" + (num1 + num2));
		}else if(op == '-') {
			System.out.println(""+num1+ op + num2 + "=" + (num1 - num2));
		}else if(op == '*') {
			System.out.println(""+num1+ op + num2 + "=" + (num1 * num2));
		}else if(op == '/') {
			System.out.println(""+num1+ op + num2 + "=" +((double)num1 / num2));
		}else if(op == '%') {
			System.out.println(""+num1+ op + num2 + "=" + (num1 % num2));
		}else { 
			System.out.println(op + "는 산술연산자가 아닙니다");
		}
		
		scan.close();
	}
}