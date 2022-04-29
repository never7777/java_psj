package day5;

import java.util.Scanner;

import com.sun.org.apache.xpath.internal.axes.ReverseAxesWalker;

public class Ex1_ReverseNumber {
	public static void main(String[] args) {
		/* 양의 정수를 입력받아 입력받은 정수를 역으로 출력하는 코드를 작성하세요.

		 * 1230 => 0을 출력, 1230 => 123
		 * 123 => 3을 출력, 123 => 12
		 * 12 => 2를 출력, 12 => 1
		 * 1 => 1을 출력, 1 => 0
		 * 
		 * 945 => 5를 출력, 945 => 94
		 * 94 => 4를 출력, 94 => 9
		 * 9 => 9를 출력, 9=>0
		 * 
		 * 반복횟수 : num가 0이 아닐때까지
		 * 규칙성 : num의 일의 자리를 출력한 후 num를 10으로 나눈 몫을 num에 다시 저장
		 */
		
		Scanner sc =new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int num = sc.nextInt();

//		for( ; num!=0; ) {// 조건식 실수
//			//num의 일의 자리를 출력한 후 num를 10으로 나눈 몫을 num에 다시 저장
//			System.out.println(num);
//			num =num/10;
//		}
		int reverseNum = 0; //리버스 된 숫자 저장
		int tepNum = 0; 
		while(num !=0) {
			////num = num/10-*10;
			System.out.print(num%10);
			//0->0*10+4=4
			reverseNum = 10*reverseNum +num%10;
			num = num/10;
		}
		System.out.println();
		System.out.println(tepNum+ "를 거꾸로한 정수 : "+reverseNum);
	
		sc.close();
	}
}
