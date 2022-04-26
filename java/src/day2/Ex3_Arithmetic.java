package day2;

public class Ex3_Arithmetic {
	public static void main(String[] args) {
		/*산술 연산자 주의 사항: 나누기할 때 소수점 사라지는 현상 조심
		 * 
		 * 정수 연산자 정수 = > 정수
		 * 5+  2 = 7
		 * 5 - 2 = 3
		 * 5 * 2 = 10
		 * 5 % 2 = 1
		 * 5 / 2 = 2 // 정수 나누기 정수인데 소수점이 사라짐. 
		 * 정수 연산자 실수 => 실수 
		 * 실수 연산자 정수 => 실수
		 * 실수 연산자 실수 => 실수
		 * 결과값이 어떤 수 
		 */
		
		System.out.println(5 + 2);
		System.out.println(5 - 2);
		System.out.println(5 * 2);
		System.out.println(5 % 2);
		System.out.println(5 / 2);
		System.out.println(5 / 2.0);
		System.out.println(5 / (double)2);
		
		// 산술 연산자 주의 사항2 : 0으로 나눈 경우 예외가 발생할 수 있다. (정수 / 0인 경우,정수 % 0인 경우)
		//System.out.println(5 / 0);
		System.out.println(5 / 0.0); //0.0으로 하면 인피니티(무한대)로 나옴
		System.out.println(5 % 0.0); 
		System.out.println("프로그램 종료");
		
	}
}
