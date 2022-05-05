package day8;

public class Ex3_Method3_GCD {
	public static void main(String[] args) {
		
		int num1= 10; 
		int num2= 5;
		int gcd=gcd(num1, num2);
		System.out.println(num1+"과 "+num2+"의 최대 공약수 : "+ gcd);
		int lcm=lcm(num1, num2);
		System.out.println(num1+"과 "+num2+"의 최소 공배수 : "+ lcm);
	}
	/* 기능 : 두 정수가 주어지면 두 정수의 최대 공약수를 알려주는 메소드
	 * 매개변수 :	두 정수  = > int num1, int num2  
	 * 리턴 타입 : 최대 공약수 = 정수 => int
	 * 메소스명 : gcd 
	 */
	public static int gcd(int num1, int num2) {
		int gcd=0;
		for(int i = 1; i<num1; i++) {
			if(num1%i==0) {
				if(num2%i==0) {
				gcd=i;
				}
			}
		}return gcd;//ghcnfgks rhtdmfh ehffuqhdoa
	}
	/*기능 : 두 정수의 최소 공배수를 알려주는 메소드
	 * 매개변수: 두 정수  => int
	 * 리턴타입: 최소공배수 => 정수 => int
	 * 메소드명: lcm
	 */

	public static int lcm(int num1, int num2) {
		int lcm=num1 +num2/gcd(num1,num2);
		return lcm;		
		
		//return int lcm=num1 +num2/gcd(num1,num2);	바로 보낼수도 있음
	}
	
}
