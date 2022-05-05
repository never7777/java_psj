package day8;

public class Ex8_Method6_Array {
	public static void main(String[] args) {
		int [] arr =  {1,2,3,4,5};
		int num1 = 7;
		int n = 3;
		
		printArray(arr);
		contains(arr,num1);
		System.out.println(contains(arr,num1));
		System.out.println(contains1(arr,num1));
		System.out.println(contains1(arr, num1,indexN));
	}
	/* 기능 : 정수형 배열이 주어졌을 때, 주어진 배열의 값을 콘솔에 출력하는 메소드
	 * 매개변수 : 정수형 배열 => int [] arr
	 * 리턴타입 : 출력 void
	 * 메소드명: printArray
	 */
	//배열 매개변수로 작성할 수 있음.
	public static void printArray(int [] arr) {
		if(arr ==null||arr.length ==0) {
			System.out.println("출력할 배열이 없습니다. ");
			return;//메소드 종료 //void가 있어도 return을 사용할 수 있다. 
		}
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	/*
	 * 기능 : 정수형 배열에 정수 num가 있는지 없는지 알려주는 메소드
	 * 매개변수 : 정수형 배열, 정수 num => int [] arr, int num
	 * 리턴타입 : 해당 숫자가 있는지 없는지 =>true false => boolean
 	 * 메소드명 : contains
	 */
	
	public static boolean contains(int [] arr, int num1) {

		boolean cheek =false;
		if(arr==null|| arr.length==0) {
			return false;
		}
		for(int i =0; i<arr.length;i++)
			if (arr[i] == num1) {
				cheek=true;
			}
			else {
				cheek=false;
			}
		return cheek;
		
	}
	
	public static boolean contains1(int arr[], int num) {
		if(arr==null||arr.length ==0) {
			return false;
		}
		for(int tmp : arr) {
			if(tmp == num) {
				return true;
			}
		}
		return false;
	}
	/* 기능 : 정수형 배열에서 처음부터 n개 중에서 정수 num가 있는지 없는지 알려주는 메소드
	 * 매개변수 : 정수형 배열, 정수 num, 확인할 개수 n=> int []arr , int num, int indexN
	 * 리턴타입 : 알려준다 => 있다 (참) 없다(거짓) => boolean
	 * 메소드명 : contains
	 */
	public static boolean contains1(int arr[], int num1, int n) {
		//배열이 잘못되거나 비교 갯수가 잘못되서 비교할 필요가 없는 경우
		if(arr==null||arr.length ==0 ||n<=0) {
			return false;
		}
		//n보다 배열의 길이가 작으면 n을 배열의 길이로 바꿔준다. //예외 방지
		if(arr.length<n) {
			n = arr.length;
		}
		for(int i = 0; i<n;i++) {
			if(arr[i]==num1) {
				return true;
			}
		}
		return false;
	}
	
}

