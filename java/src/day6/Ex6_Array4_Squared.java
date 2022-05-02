package day6;

public class Ex6_Array4_Squared {
	public static void main(String[] args) {
		/*배열의 1의 제곱부터 10의 제곱까지 정하고, 출력하는 코드를 작성하세요.
		 */

		int [] squared = new int[10];
		
		for(int i =0;i<squared.length;i++) {
			squared[i] = (i+1) * (i+1);
			System.out.print(squared[i]+" ");
		
			
		}
		int arr2[] =new int[11];		
		for(int i=1;i<squared.length;i++) {
		arr2[i] = i*i;
		System.out.println(arr2[i]);
		}
	}
}
