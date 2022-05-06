package day9;

public class Ex1_Metfod1_Array {
	public static void main(String[] args) {
		/*1~4사이의 중복되지 않은 3개 수를 생성하여 배열에 저장하고 출력하는 코드를 작성하세요
		 * contains와 printArray를 이용 */
		
		/*
		//3개 짜리 배열을 생성
		int [] arr = new int[4];
		
		int count = 0;
		while(count<3) {
			//1~4의 랜덤한 수 생성
			int r= (int)(Math.random()*4)+1;{
				//배열에 count개만큼 랜덤한 수와 비교하여 있는지 없는지 확인해서 없으면 배열 count 번지에 랜덤한 수 저장하고, //count 1증가
				for(int i = 0; i<count; i++) {
					if(arr[i]!=count) {
						arr[i]=r;
						count ++;
					}
				}
				break;
			}
		}
		//배열값 출력
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		*/
		int user[] = {1,2,3};
		int com[] =new int [3];
		int min =1, max = 6;
		
		for(int count  = 0; count <3;) {
			int r =(int)(Math.random()*(max -min+1)+min);
		
			if(/*배열애 count만큼 랜덤한 수와 비교하여 있는지 없는지 확인해서 없으*/!contains(com, count, r)) {
				//count 번지에 랜덤함수 저장하고;
				com[count] = r;
				//count를 1증가
				count ++;
			}
		}
		//배열값 출력
		printArray(com);
		System.out.println(getStrike(com,user));
		
		
	}
	/*기능 :  정수형 배열에서 처음부터 n개 중에서 정수 num가 있는 지 없는지 알려주는 메소드*/
	public static boolean contains(int arr[], int num1, int n) {
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
	
	/* 기능 : 정수형 배열이 주어 졌을 때 주어진 배열의 값을 콘솔에 출력하는 메소드*/	 
	public static void printArray(int [] arr) {
		if(arr ==null||arr.length ==0) {
			System.out.println("출력할 배열이 없습니다. ");
			return;//메소드 종료 //void가 있어도 return을 사용할 수 있다. 
		}
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	/* 기능 : 정수형 배열 2개가 주어지면 스트라이크 갯수(같은 자리에서 일치하는 숫자의 개수)를 알려주는 메소드
	 * 매개변수 : 정수형 배열 2개 => int [] arr1, int [] arr2
	 * 리턴타입 : 일치하는 숫자의 개수 => int
	 * 메소드명 : getStrike
	 */
	
	public static int getStrike(int []arr1, int []arr2) {

		if(arr1 ==null || arr2 == null) {
			return 0;
		}
		int strike =0;
		int count = arr1.length>arr2.length? arr2.length : arr1.length;
		for(int i = 0; i<arr1.length;i++) {
			if(arr1[i] ==arr2[i]) {
				strike++;
			}
		}
		return 0;
	}
	/* 기능 : 정수형 배열 2개가 주어지면 볼 갯수(다른 자이레엇 일치하는 숫자의 개수)를 알려주는 메소드
	 * 매개변수: 정수형 배열 2개 => int [] arr1, int [] arr2
	 * 리턴타입: 스트라이크 개수 => 정수 =>int
	 * 메소드명: getBall
	 */
	public static int getBall(int []arr1, int []arr2) {

		if(arr1 ==null || arr2 == null) {
			return 0;
		}
		int ball =0;
		//전체 일치하는 갯수 = 볼 + 스트라이크의 갯수
		for(int tmp : arr1) {
			if(contains(arr2,arr2.length,tmp)) {
				ball++;
			}
		}
		//볼의 갯수 : 전체 일치하는 개수- 스트라이크 갯수
		return ball =getStrike(arr1,arr2);
	}
	
}
