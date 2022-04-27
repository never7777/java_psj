package day3;

public class Ex13_For4_Sum {
	public static void main(String[] args) {
		/*1부터 5까지 합을 구하는 코드를 작성하세요
		 * 		 sum0 = 0
		 * 1  1  sum1 = 0 + 1
		 * 2  3  sum2 = 0 + 1 + 2
00		 * 3  6  sum3 = 0 + 1 + 2 + 3
		 * 4  10 sum4 = 0 + 1 + 2 + 3 + 4
		 * 5  15 sum5 = 0 + 1 + 2 + 3 + 4 + 5
		 * 
		 *  	 sum = 0
		 * 1  1  sum = sum + 1
		 * 2  3  sum = sum + 2
00		 * 3  6  sum = sum + 3
		 * 4  10 sum = sum + 4
		 * 5  15 sum = sum + 5
		 * 
		 * 반복횟수 : i는 1부터 5까지 1씩 증가
		 * 규칙성 : sum = sum + i
		 * 반복문 종료 후 : sum을 출력
		 */
		int sum=0;
		
		for(int i =1; i<=5 ; i++) {
			sum += i; //sum =sum + i;
		}
		System.out.println("1부터 5까지의 합 : "+ sum);
		
	}
}
