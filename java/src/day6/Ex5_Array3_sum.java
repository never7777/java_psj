package day6;

import java.util.Scanner;

public class Ex5_Array3_sum {
	public static void main(String[] args) {
		/*학생 3명의 국어 성적을 입력받고 총점과 평균을 구하는 코드를 작성하세요.
		 * 단, 총점과 평균을 출력한 다음 학생 3명의 성적을 출력하세요
		 */
		
		//배열 선언 : 몇개짜리?
		//반복문 몇번??
			//학생의 점수를 입력
		//반복문을 이용하여 총점을 계산
		//총점을 이용하여 평균을 계산
		//총점과 평균을 출력
		//반복문을 이용하여 학생 점수를 출력
		
		//성적입력
		Scanner sc =new Scanner(System.in);
		int [] score = new int[3];
				
		for(int i=0;i<score.length;i++) {
			System.out.println(i+1+"번째 학생 성적: ");		
			score[i] = sc.nextInt();
		}
		int sum=0;
		double avg=0;
		
		//총점과 평균 출력
		for(int i=0;i<score.length;i++) {
			sum += score[i];
		}
		avg = sum / (double)score.length;
		System.out.println("총점 :" + sum);
		System.out.println("평균 :" + avg);	

		//학생 3명의 성적 출력
		for(int i=0;i<score.length;i++) {
			System.out.println(i+1+"번째 학생 점수: "+score[i]);
		}
		
	}
}
