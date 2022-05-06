package day9;

import java.util.Scanner;

public class Ex3_Method3_Sort {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/*5명의 학생의 성적을 입력받아 오른차순으로 출력하는 코드를 작성하세요
	  	단 , 입력받은 성적은 배열에 저장해야합니다.*/
		
		//배열 선언 및 생성
		int [] score = inputCreateArray(scan, 5);
		
		//반복문과 Scanner를 이용하여 성적을 입력 받음
		System.out.println("성적 입력하세요 :");
		
		//반복문을 이용하여 성적을 정렬
		bubbleSort(score,false);
		//반복문을 이용하여 배열 값 출력
		printArr(score);
	}
	//반복문과 Scanner를 이용하여 성적을 입력 받음
	/*매개변수 Scanne을 이용한 성적 => 정수 => int
 	 *리턴값 없음
	 *메소드명 inputScore
	 * */
	public static int [] inputCreateArray(Scanner scan, int n) {
		if(n<=0) {
			return null;
		}
		int arr[] = new int [n];
		for(int i = 0; i<n; i++) {
			arr[i] =scan.nextInt();
		}
		return arr;
	}
	
	/* 기능 : 정수 배열이 주어지면 오름차순 또는 내림차순으로 정렬하는 메소드
	/* 매개변수 : 성적이 저장된 배열, 오름(Ascending)/내림 여부 => 정수 >int arr[], boolean asc 
	 * 리턴타입 : 없음 => void
	 * 메소드명 : bubbleSort
	 * */	
	public static void bubbleSort(int []arr, boolean asc) {

		if(arr == null) {
			return;
		}
		for(int i = 0;i<arr.length-1;i++) {
			//i가 0일 때 j는 4가지 i가 1일때 j는 3까지
			for(int j = 0; j<arr.length-1;j++) {
				//오름차순인 경우
				if(asc &&arr[j] > arr[j+1]) { 
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				//내림차순인 경우	
				}else if(!asc &&arr[j] > arr[j+1]) { 
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}
		
		
	//반복문을 이용하여 배열 값 출력
	/* 매개변수 : int arr[]
	 * 리턴타입 : void
	 * 메소드명 : printArr
	 * */
	public static void printArr(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
}
