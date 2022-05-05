package day7;

import java.util.Scanner;

public class Ex6_Array_Lotto {
	public static void main(String[] args) {
		int [] lotto = new int[7];
		
		//로또 번호 생성
		int min=1;
		int max=45;
		int count=0;//배열에 저장된 중복 되지 않은 숫자의 개수
		for(;count<7;) {
			int r = (int)(Math.random() * (max-min+1)+min);;
			int i= 0;
			//랜덤한 수와 저장된 배열 값들을 비교하여 중복이 안되면 저장
			for(i=0;i<count;i++) {
				if(lotto[i]==r)
					break;
				}
			
		//반복문 종료 후  i가 count와 같다는 의미는 중복된 수가 없다는 의미
			if( i ==count) {
				lotto[count++] =r;
				System.out.print(r+" " );
			}
			
		}
			
			//사용자 번호 1-45사이의 정수 6개를 입력 받아 user배열에 저장하느는 코드를 작성하세요
			int user[] =new int[6];
			Scanner scan =new Scanner(System.in);
			System.out.println("로또 번호 입력:");
			for(int i = 0; i<user.length;i++) {
				user[i] = scan.nextInt();
			}
			/*로또번호와 사용자 번호를 이용하여 등수를 출력하는 코드를 작성하세요.
			 * 1등 6개 일치
			 * 2등 5개 보너스
			 * 3등 5개 일ㅊ
			 * 4등 4개 일치
			 * 5등 3개 일치
			 * 꽝 그외
			 */
			
			
			int count2= 0;//일치하는 번호의 갯수
			
			for(int i=0; i<user.length;i++) {
				for(int j=0; j<user.length;j++) {
					if(lotto[i]==user[j]) {
						count2++;
					}
				}
			}
			switch(count2) {
			case 6:
				System.out.println("1등");
				break;
			case 5:
				int k;
				for(k=0;k<user.length; k++) {
					if(user[k] ==lotto[6]) {
						break;
					}
				}
				if(k==user.length) {
					System.out.println("3등");
				}else {
					System.out.println("2등");
				}
			case 4:
				System.out.println("4등");
				break;
			case 3:
				System.out.println("5등");
				break;
			default:
				System.out.println("꽝");
			}
	}//main
}//class
