package day2;

public class Ex7_Condition {
	public static void main(String[] args) {
		/*조건 선택 연산자 예제
		 * (조건식)? 참일때값 : 거짓일때 값
		 * 
		 */
		int score = 50;
		String isA = (score >= 90 && score <= 100)? "A학점":"A학점이 아님";
		System.out.println(score+"점은 "+isA);
	}
}
