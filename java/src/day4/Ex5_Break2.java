package day4;

import java.util.Scanner;

public class Ex5_Break2 {
	public static void main(String[] args) {
		/* 양의 정수를 무한으로 입력하고, 입력한 정수를 콘솔에 출력하는 코드를 작성하세요
		 * 입력받은 정수가 음수이면 반복문을 빠져 나오게 수정해보세요
		 * 
		 * 반복횟수 : i는 1부터 5까지 1씩 증가
		 * 규칙성 : Scanner를 이용하여 정수를입력받아 num에 저장하고, num가 음수이면 반복문을 빠져나간다
		 * 반복문 종료 후 : 없음
		 */
	
		Scanner sc =new Scanner(System.in);
		int num;
		for(;;) {
			System.out.print("양의 정수를 입력 :");
			num = sc.nextInt();
			//num가 음수이면 반복문을 빠져나간다
			if(num <0) {
				break;
			}
			System.out.println("입력한 정수: "+num);
		}
		
		sc.close();
	}
}
