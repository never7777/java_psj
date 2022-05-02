package day6;

public class Ex8_Arrayy6_Divisor {
	public static void main(String[] args) {
		/*정수 num의 약수를 배열에 저장 한 후, 출력하는 코드를 작성하세요
ㅇ		약수는 최대 10개만 저장

		 */
		int num = 14400;
		int max =10;
		int [] arr = new int [max]; 
		int index =0;
		//약수 구하기
		
		for(int i = 1;i<=num;i++) {
			//약수 저장하기 
			if(num%i == 0) {
				if(index<max) {
				arr[index] += i;
				index++;
				}
			}
		}
		//약수 출력하기
		for(int i = 0;i<index;i++) {
			System.out.println(num+"의 약수는 "+arr[i]+"입니다.");
		}
	
	}
}
