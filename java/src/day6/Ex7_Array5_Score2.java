package day6;

import java.util.Scanner;

public class Ex7_Array5_Score2 {
	public static void main(String[] args) {
		/*
		 * 최대 10명 학생의 성적을 저장하기 위한 배열을 선언하고, 
		 * 입력할 학생수를 입력을 받아 입력받은 학생수 만큼 성적을 입력받고 출력하는 코드를 작성하세요
		 * 예>
		 * 학생수를 입력하세요 : 3
		 * 1번 학생 : 90
		 * 2번 학생 : 90
		 * 3번 학생 : 90
		 * 총점 240점,  * 평균80
	
		 *학생수를 입력하세요 : 10
		 *최대 10명까지 입니다.
		 *
		 *학생수를 입력하세요 : 0
		 *최소 1명 부터입니다.
		
		 *scan선언
		 *
		 *배열 선언 10개짜리
		 *
		 *학생 수 입력
		 *
		 *입력받은 학생수가 10보다 크면 회대 10명까지 입니다. 라고 출력
		 *
		 *(입력받은 학생수가 10보다 크지 않고) 0보다 작거나 같으면 최소 1명부터 입니다.라고 출력
		 *
		 *(입력받은 학생수가 10보다 크지 않고 0보다 작거나 가지 않으면) 입력받은 학생수 만큼 성적 입력후 총점 계산
		 *
		 *평균 계산
		 *
		 *총점과 평균 출력
		 */
		
		//학생수 입력
		Scanner sc =new Scanner(System.in);
		
		int [] student = new int [10];
		//int max =10;
		//int [] student =new int[max];
		
		
		System.out.println("학생수를 입력하세요 :");
		int num = sc.nextInt();

		if(0<num&&num<11) {
			//학생입력
			int sum = 0; 
			double avg = 0;
			for (int i = 0; i<num ; i++ ) {
				System.out.println(i+1+"번 학생 :");
				student[i] = sc.nextInt();
				sum += student[i];
			}
			avg = (double)sum / num;
			//총점,평균 출력
			System.out.println("총점은"+sum+", 평균은 " + avg+"입니다");
		}
		else if(10<num){
			System.out.println("최대 10명까지 입니다.");
		}
		else if(num<1){
			System.out.println("최소 1명부터 입니다.");
		}
	
	}
}
