package day5;

public class Ex_9_MultiplicationTable {
	public static void main(String[] args) {
		
		
		/*구구단 7단을 출력하는 코드를 작성하세요.
		 * 7 x 1 = 7    7 x? = ?? 
		 * 7 x 1 = 14  
		 * 7 x 1 = 21 
		 * 7 x 1 = 28 
		 * 
		 * 7 x 9 = 63  
		 * 
		 * 반복횟수  : i는 1부터 9까지 1씩 증가
		 * 규칙성 : 7Xi=(7*i) 를 출력
		 * 반복문 종료 후 : 없음
		 * 
		 */
		
		//int num = 7;
		//for(int i =1; i<=9; i++) {
		//	System.out.println(num+" X "+ i+"="+ num*i );
			
		//}

		for(int i =2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i+" x "+ j +" = "+ i * j);
			}
		}
		
	}
}
