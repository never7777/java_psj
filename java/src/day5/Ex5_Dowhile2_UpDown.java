package day5;

import java.util.Scanner;

public class Ex5_Dowhile2_UpDown {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int min= 1;	int max=100;
		int r= (int)(Math.random()*(max-min+1)+min);
		int input;
				
		do {
			//정수를 입력받고,
			System.out.print("숫자를 입력하세요 : ");
			input = sc.nextInt();

			if(input<=0 || 100<input) {
				System.out.println("입력범위를 초과했습니다.");
				continue;
			}if(r>input){
				System.out.println("Up");
				
			}if(r<input){
				System.out.println("Down");
			}
		}while(r==input);
		System.out.println("정답입니다");
		sc.close();
	}
}