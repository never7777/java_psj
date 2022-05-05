package day8;

public class Ex7_Medhod_Overloading {
	public static void main(String[] args) {
		System.out.println(sum(1,2));
		System.out.println(sum(1.2,2.3));
		System.out.println(sum(1.2f,2.3));//없지만 f는 double로 자동형변환되서 double 메소드 사용가능
		System.out.println(sum(1.2,3));//없지만 int double로 자동형변환되서 double 메소드 사용가능 
	}
	
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	public static double sum(double num1, double num2) {
		return num1 + num2;
	}
}
