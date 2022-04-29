package day5;

public class Ex6_NextedLoop1 {
	public static void main(String[] args) {

		/* *****
		 * *****
		 * *****
		 */
		
		
		for(int i =1; i<=5;i++) {
			// * 5개 출력하는 코드 => 10개 출력하는 코드 
			for(int j =1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
