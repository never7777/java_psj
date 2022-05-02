package day6;

import java.util.Scanner;


public class Ex1_Calculator {
	public static void main(String[] args) {
		/*문자를 입력받아 입력받은 문자를 출력하는 코드를 작성하세요*/
		/*, q가 입력될때 까지 입력을 계속적으로 받습니다.
		 *  이 때, q를 입력받으면 q를 출력하고 종료합니다.
		
		산술연산자 메뉴
		1. 더하기
		2. 빼기
		3. 곱하기
		3. 나누기
		5. 나머지
		q. 종료
		메뉴를 선택하세요 :
		
		*/
		
		Scanner sc = new Scanner(System.in);
		char ch = 'a';
		/*
		while(ch !='q') {
			System.out.println("문자를 입력하세요 :");
			 ch = sc.next().charAt(0);
			System.out.println(ch);
		}*/
		
		// 방법 1
		  for(;;) {
			System.out.println("1. 더하기");
			System.out.println("2. 빼기");
			System.out.println("3. 곱하기");
			System.out.println("4. 나누기");
			System.out.println("5. 나머지");
			System.out.println("q. 종료");
			System.out.println("메뉴를 선택하세요 : ");
			ch = sc.next().charAt(0);
			if(ch=='q') {
				break;
			}
				System.out.println("정수1 입력: ");
				int num1 = sc.nextInt();
				System.out.println("정수2 입력: ");
				int num2 = sc.nextInt();
				
				if(ch=='1') {
					System.out.println(num1 +" + "+ num2+"="+ (num1+num2));
				}else if(ch == '2'){
					System.out.println(num1 +" - "+ num2+"="+ (num1-num2));
				}else if(ch == '3'){
					System.out.println(num1 +" * "+ num2+"="+ (num1*num2));
				}else if(ch == '4'){
					System.out.println(num1 +" / "+ num2+"="+ ((double)num1/num2));
				}else if(ch == '5'){
					System.out.println(num1 +" % "+ num2+"="+ (num1%num2));
				}
			}
			
		// 방법 2
		/* for(;ch !='q';) {
			  System.out.println("for");
			System.out.println("문자를 입력하세요 :");
			ch = sc.next().charAt(0);
			System.out.println(ch);
			}
			*/
		
		  //방법 3
		  /* do {
			  System.out.println("do while");
			  System.out.println("문자를 입력하세요 :");
			  ch = sc.next().charAt(0);
			  System.out.println(ch);
		  }while(ch!='q');
		  */
			sc.close();
	}
}
