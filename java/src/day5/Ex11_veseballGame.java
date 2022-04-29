package day5;

import java.util.Scanner;

public class Ex11_veseballGame {
	public static void main(String[] args) {
		
		/*숫자 야구 게임을 작성하세요
		 * 중목되지 않은 1~9사이의 세 정수를 입력받아 맞추는 게임
		 * 입력 :,1,2,3
		 * 1B
		 * 입력 :4,5,6
		 * O 
		 * 입력 :7,8,9
		 * 2s
		 * 입력  839
		 * 
		 * 
		 * 반복횟수 : s가 3보다 작을 때까지 반복
		 * 규칙성 : 정수 3개를 입력 받음
		 * 		com1과 user1이 같으면 s를 1증가
		 * 		com2과 user2이 같으면 s를 1증가
		 * 		com1과 user1이 같으면 s를 1증가
		 * 
		 * 
		 * 
		 */
		
		Scanner scan =new Scanner(System.in);
		
		int com1 =3,  com2 =8,  com3 =9;
		int user1, user2, user3;
		
		
		int s=0; int b=0;
		while(s<3) {
			System.out.println("숫자 세개를 입력하세요 :");
			user1=scan.nextInt();
			user2=scan.nextInt();
			user3=scan.nextInt();
			
			s = 0;
			b = 0;
			
			if(com1 == user1) {
				s ++;
			}
			if(com2 == user2) {
				s ++ ;
			}
			if(com3 == user3) {
				s ++ ;
			}
			if((com1 == user1)||com1 ==user3 ) {
				b ++ ;
			}
			if((com2 == user1)||com2 ==user3 ) {
				b ++ ;
			}
			if((com3 == user1)||com3 ==user2 ) {
				b ++ ;
			}
			if(s!=0) {
				System.out.println("S의 개수:"+ s + "s");
			}
			if(b!=0) {
				System.out.println("B의 개수:"+ b + "b");
			}
			if(s==0&&b==0) {
				System.out.println("O");
			}
		
			
		}
		
		
	}	

}
