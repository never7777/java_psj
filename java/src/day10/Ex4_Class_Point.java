package day10;

import java.util.Scanner;

public class Ex4_Class_Point {
	public static void main(String[] args) {
		Point3D1 pt =new Point3D1(0, 0, 0);
		Scanner sc = new Scanner(System.in);
		
		int menu;
		do {
			System.out.println("메뉴");
			System.out.println("1. 좌표설정");
			System.out.println("2. 좌표출력");
			System.out.println("3. 종료");
			System.out.print("메뉴 선택 : ");
			menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.print("좌표를 입력하세요(예: 1 2 3) : ");
				int x = sc.nextInt();
				int y = sc.nextInt();
				int z = sc.nextInt();
				pt = new Point3D1(x,y,z);
			}else if(menu == 2) {
				pt.pointPrint();
			}else if(menu == 3) {
				menu=3;
			}
		}while(menu!=3);
	
	}
}
/*다음 정보를 가지는 3차원에서 점을 나타내는 클래스를 생성하세요
 * 정보 : 점 x, 점 y, 점 z
 * 기능 : 좌표를 출력하는 기능
 * */
 
class Point3D1{
	int x;
	int y;
	int z;
	
	void pointPrint() {
		System.out.println("x좌표: "+ x +", "+ "y좌표: "+ y+", " +"z좌표: "+  z+" ");
	}
	public Point3D1(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
}