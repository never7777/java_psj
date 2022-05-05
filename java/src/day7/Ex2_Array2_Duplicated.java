package day7;

import java.util.Scanner;

public class Ex2_Array2_Duplicated {
	public static void main(String[] args) {
		
		int [] arr = {1,2,3};
		/*정수 num를 입력받고, 입력받은 정수가 배열에 있는지 없는지 확인하는 코드를 작성하세요.
		*/
		
		//정수입력
		Scanner sc = new Scanner (System.in);
		System.out.println("정수를 입력하세요 :");
		int num = sc.nextInt();
		
		//정수배열 확인
		int count = 0;
		for(int i = 0;i<arr.length;i++) {
			
			if(arr[i] == num) {
				System.out.println(i +"번지에 있습니다.");
				count ++;
			}
		}
		if(count == 0) {
			System.out.println("베열에 없습니다.");
		}
		
		
		//반복문 사용 1: 배열 전체를 탐색
		
		

		
		
		
		
		//반복문 사용 2: 배열 출력시 주소
		int i;
		for(i=0; i<arr.length;i++) {
			if(arr[i] == num) {
				break;
			}
		}
		//반복문에서 break를 만나면 i는 3보다 작고, break를 안만나면 i는 3인 특성을 이용 => 있으면 i 번지에 있음
 		if(i<arr.length) {
			System.out.println("배열 arr에는 "+num+"가 있습니다.");
		}else {
			System.out.println("배열 arr에는 "+num+"가 있습니다.");
		}
		//별도 설명 : 배열 출력시 주소
 		System.out.println(arr);
 		double arr2[] = new double[2];
 		System.out.println(arr2);
	}
}
