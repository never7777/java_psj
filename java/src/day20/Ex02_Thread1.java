package day20;

public class Ex02_Thread1 {
	public static void main(String[] args) {
		//Test1 t1= new Test1();
		//Thread th1 = new Thread(t1);
		Thread th1 =  new Thread(new Test1());//  위에 두개를 한 줄로 줄인 것 
		
		th1.start();
		
		for(int i = 0; i<100; i++) {
			System.out.println("|");
		}
	}
}
//Runnable 인터페이스를 구현한 구현 클래스를 이용
class Test1 implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i<100; i++) {
			System.out.println("-");
		}
	}
	
}
//thread 클래스를 상속 받은 자식 클래스를 이용
class test2 extends Thread{
	public void run() {
		for(int i = 0; i<100; i++) {
			System.out.println("*");
		}
		
	}
}