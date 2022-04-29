package day5;

import java.util.Scanner;

public class Ex3_UpDown {
	public static void main(String[] args) {
		/*
		 * 랜덤으로 생성한 수를 맞추는 게임을 작성하세요.
		 * 정수를 입력했을 때 입력한 정수보다 랜덤으로 생성된 수가 크면up 작으면 down을 표시
		 * 맞으면 맞췄습니다라고 표시
		 * 랜덤으로 생성한 수 :40
		 * 입력 100
		 * Down
		 * 입력 :50
		 * up
		 * 입력 :40
		 * 정답입니다.
		 * 
		 * 반복횟수 : 무한대
		 * 규칙성 : 정수를 입력받고, 
		 * 			입력받은 정수가 랜덤한 수 r 과 같으면 정답입니다.라고 출력한 후 반복문을 빠져나갑니다.
		 * 			입력받은 정수가 랜덤한 수 r 과 같지 않고 r보다 크면 Down이라고 출력하고,
		 * 			입력받은 정수가 랜덤한 수 r 과 같거나 크지 않으면 Up이라고 출력
		 */
		
		//스캔, int random 
		
		Scanner sc = new Scanner(System.in);
		
		int min= 1;	int max=100;
		int r= (int)(Math.random()*(max-min+1)+min);
		
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			int input = sc.nextInt();
			
			if(input<=0 || 100<input) {
				System.out.println("입력범위를 초과했습니다.");
				continue;
			}else if(r==input) {
				System.out.println("정답입니다");
				break;
			}else if(r>input){
				System.out.println("Up");
			}else if(r<input){
				System.out.println("Down");
			}
			
		//while(true) {
			//  정수를 입력받고,
			//System.out.print("1~100사이의 정수를 입력하세요 : ");
			//int num = sc.nextInt();
			//	입력받은 정수가 랜덤한 수 r 과 같으면 정답입니다.라고 출력한 후 반복문을 빠져나갑니다.
			//if(입력받은 정수가 랜덤한 수 r 과 같으면) {
			//	정답입니다.라고 출력한 후 
			//	반복문을 빠져나갑니다.
			// 	입력받은 정수가 랜덤한 수 r 과 같지 않고 r보다 크면 Down이라고 출력하고,
			//}else if(입력받은 정수가 랜덤한 수 r 과 같지 않고 r보다 크면) {
			//	Down이라고 출력하고,
			//	입력받은 정수가 랜덤한 수 r 과 같거나 크지 않으면 Up이라고 출력
			//}else if(입력받은 정수가 랜덤한 수 r 과 같거나 크지 않으면) {
			//	Up이라고 출력
			//}
		}
	}
}
