package day17;

public class Ex02_Math {

	public static void main(String[] args) {
		/*주어진 정수를 소수점 둘째자리에서 올림하는 코드를 작성하세요.*/
		double pi =3.141592;
		System.out.println(Math.round(pi*10)/10.0);
		
		/*n번째 자리에서 반올림하는 식.*/
		int num=2;//0을 하면 일의 자리에서 반올림. -1하면 십의 자리 반올림 
		//x를 곱해서 반올림
		double pi2 = pi *Math.pow(pi, num-1);
		//반올림한 값에서 x로 나눔
		double pi3 = Math.round(pi*10)/Math.pow(10, num-1);
		double pi4 = Math.round(Math.pow(10, num-1))/Math.pow(10, num-1);
		System.out.println(pi3);
		System.out.println(pi4);
	}

}
