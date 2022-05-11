package day12;

public class Ex3_Override {

	public static void main(String[] args) {
		Animal a= new Animal();
		a.bark();
		Dog b =new Dog();
		b.bark();
		Cat c =new Cat();
		c.bark();
	}
}
class Animal{
	public void bark() {
		System.out.println("짖다");
	}
}

class Dog extends Animal{
	@Override
	public void bark() {
		System.out.println("--------------");
		//super.메소드()는 첫번째가 아니어도 된다.
		super.bark();//부모 클래스의 메소드 위에 새로운 기능을 추가
		System.out.println("멍멍");
		System.out.println("--------------");
	}
}
class Cat extends Animal{
	@Override
	public void bark() {
		//부모 클래스의 메소드를 사용하지 않고 재정의
		System.out.println("야옹");
	}
	
}