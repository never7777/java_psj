package day11;

public class Ex2_Init {
	public static void main(String[] args) {
		Test t =new Test(4);
		t.print();
	}
}

class Test{
	//1.타입의 기본값으로 초기화
	int num1;
	//2.명시적 초기화
	int num2 =2;
	//3.초기화 블록을 이용한 초기화 # 변수선언 위치에 중괄호로 초기화  
	int num3 = -1;
	{
		num3 = 3;
	}
	
	int num4 = -1;
	
	void print() {
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
	}
	//생성자를 이용한 초기화
	public Test(int num4) {
		this.num4 = num4;
	}
}
class Test2{
	//1. 타입의 기본 값에 의한 초기화
	static int num1;
	//2. 명시적 초기화
	static int num2 = 2;
	static int num3 = -1;
	//3. 초기화 블록에 의한 초기화
	static {
		num3 =3;
	}
	public static void print() {
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
	}
}
