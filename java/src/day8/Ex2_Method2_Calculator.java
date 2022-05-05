package day8;

public class Ex2_Method2_Calculator {
	public static void main(String[] args) {
		
		int num1 = 3;
		int num2 = 3;
		char op = '*';
		
		Calculator(num1,op,num2);
		
	}
	
	/* 기능 : 두 정수와 산술연산자가 주어지면 산술연산결과를 알려주는 메소드
	 * 매개변수 : 두정수와 산술연산자 => int num1, char op, int num2
	 * 리턴타입 : 산술연산 결과 => 실수 => double
	 * 메소드명 : calculator
	 */
	
	public static double Calculator(int num1, char op, int num2) {
		double res = 0;
		switch(op) {
		case '+':
			res = num1 + num2; break;
		case '-':
			res = num1 - num2; break;
		case '*':
			res = num1 * num2; break;
		case '/':
			res = num1 / (double)num2; break;
		case '%':
			res = num1 % num2; break;
		}
		return res;
	}
}
