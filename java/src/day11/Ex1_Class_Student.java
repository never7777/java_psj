package day11;

import java.util.Scanner;

public class Ex1_Class_Student {
	
	public static void main(String[] args) {

		Student st = new Student("    ",0,0,0);
		Scanner sc = new Scanner(System.in);
		
		int menu = 0;
		do {
			System.out.println("메뉴");
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 정보 출력");
			System.out.println("3. 프로그램 종료");
			System.out.print("메뉴를 선택하세요: ");
			menu =sc.nextInt();
			
			if(menu == 1) {
				System.out.print("이름: " );
				String name = sc.next();
				System.out.print("학년: " );
				int grade = sc.nextInt();
				System.out.print("반: " );
				int classRoom = sc.nextInt();
				System.out.print("번호: " );
				int number = sc.nextInt();
				st = new Student(name, grade,classRoom, number);
			}else if(menu == 2){
				st.print();
			}else if(menu == 3){
				menu = 3;
			}else {
				System.out.println("잘못된 메뉴를 선택하셨습니다.");
			}
		}while(menu!= 3);
		System.out.println("프로그램을 종료합니다.");
	}
}
class Student{
	//학생 이름 , 학년 , 반, 번호 필드 
	String name;
	int grade;
	int classRoom;
	int number;
	
	//학생 정보를 출력하는 메소드
	void print() {
		System.out.println(grade +"학년" + " "+classRoom+"반" +" "+ number+"번"+" "+name);
	}
	//생성자
	public Student(String name, int grade, int classRoom, int number) {
		this.name = name;
		this.grade = grade;
		this.classRoom = classRoom;
		this.number = number;
	}

}
