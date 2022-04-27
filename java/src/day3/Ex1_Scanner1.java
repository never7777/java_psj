package day3;

import java.util.Scanner;

public class Ex1_Scanner1 {
	public static void main(String[] args) {

		/*한 한생의 수학, 영어, 국어 성적을 입력받고, 총점과 평균을 구하세요
		 * 단, 성적은 정수로 입력받고 0~100 의 정수를 입력해야 합니다.
		 * 테스트 성적 : 90 90 91

		 *테스트할 과정(절차)을 생각. 어떤식으로 출력되는게 맞는지 고민(실행했을때 결과를 생각)
		 
		 *수학을 입력하세요 (0~100): 90
		 *영어을 입력하세요 (0~100): 90
		 *수학을 입력하세요 (0~100): 91
		 *세 과목의 총점은 271입니다.
		 *세 과목의 평균은 90.33333점 입니다.
		 */
		
		
		/*Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = scan.nextInt();
		System.out.println("입력한 정수는 " + num + "입니다");
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어점수를 입력하세요 : ");
		int kor = scan.nextInt();
		System.out.print("수학점수를 입력하세요 : ");
		int math = scan.nextInt();
		System.out.print("영어점수를 입력하세요 : ");
		int eng =scan.nextInt();
		
		int sum = kor + math + eng;
		System.out.println("총점은 "+ sum + "입니다");
		
		//double avg = ((double)kor+math+eng)/3;

		double avg = (double)sum/3;
		System.out.println("평균은 "+ avg + "입니다");
		
		
		scan.close();//안써도 되나 노란줄 뜨는게 거슬려서 입력
	}
}
