package day5;

public class Ex2_Random {
	public static void main(String[] args) {
		/*0<=Math.random() <1 실수
		 */
		int min =1, max = 10;
		// 	int r =(int)(Math.random() * (max-min+1)+min); //반공식

		
		
		for(int i = 1; i<=10; i++) {
			int r =(int)(Math.random() * (max-min+1)+min);
			System.out.println(r+"");
		}
	}
}
