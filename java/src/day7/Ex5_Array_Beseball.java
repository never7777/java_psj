package day7;

import java.util.Scanner;

public class Ex5_Array_Beseball {
	public static void main(String[] args) {
		/*3개짜리 배열 com을 생성 한 후 랜덤으로 1~9사이의 세 정수를 만들어 
		 * 배열에 저장하는 코드를 작성하세요(중복 가능) */
	
		/*사용자가 정수 3개를 입력하여 3S가 될때 까지 게임을 진행하도록 코드를 작성하세요.
		 * 단 사용자가 입력한 정수도 배열에 저장*/
		
		int [] com = new int[3];
		int [] user = new int [3];
		
		int min=1;
		int max=9;
		int s=0;
		int b=0;
				
		/*
		for(int i = 0;i<com.length;i++ ) {
			com[i] = (int)(Math.random() * (max-min+1)+min);
			System.out.print(com[i]+" ");
		}
		*/
		
		int count =0;
		for(;count<3;) {
			//랜덤한 수 생성
			int random = (int)(Math.random() * (max-min+1)+min);
			//랜덤한 수와 저장된 배열 값들을 비교하여 중복이 안되면 저장
			int i =0;
			for (i =0; i<count;i++){
				if(com[i] == random)
					break;
				}
			
			//반복문 종료 후  i가 count와 같다는 의미는 중복된 수가 없다는 의미 
			if(i==count) {
				com[count] = random;
				System.out.print(com[count]+" ");
				count++;
			}
		}
		
		
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		
		//3S가 될떄까
		while(s!= 3) {
			//사용자 배열에 입력받기
			for(int i =0;i<user.length;i++ ) {
				System.out.println("숫자를 입력하세요: ");
				user[i]=sc.nextInt();
			}
			//스트라이크 갯수 확인
			for(int i = 0; i<com.length;i++) {
				if(com[i] == user[i]) {
					s++;
				}
			}
			for(int i = 0; i<com.length;i++) {
				for(int j = 0; j<user.length;j++) {
					if(i==j) {
						continue;
					}
					if(com[i] ==user[j])
						b++;
				}
			}
			//s와 b의 개수 출력
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