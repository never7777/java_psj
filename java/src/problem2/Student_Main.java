package problem2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import day19.Board;

public class Student_Main {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		List <Student> std = new ArrayList <>();//학생 리스트
		List <Student> tmp = new ArrayList <>();//임시 리스트
		
		//샘플
		std.add(new Student("홍홍홍", 1,1,1));
		std.add(new Student("손손손", 1,1,2));
		std.add(new Student("김김김", 1,2,1));
		std.add(new Student("이이이", 1,2,2));
		std.add(new Student("신신신", 1,2,3));
		std.add(new Student("이학년", 2,3,1));
		std.add(new Student("이학년", 2,3,2));
		std.add(new Student("이학년", 2,3,3));
		std.add(new Student("갑갑갑", 3,1,1));
		std.add(new Student("을을을", 3,1,2));
		std.add(new Student("정정정", 3,1,3));
		std.add(new Student("병병병", 3,1,4));
		
		int menu;
		int exitMenu = 8;
		String name;
		int grade, classNum, number;
		double kor, eng, math;
		do {
			
			System.out.println("=======메뉴=======");
			System.out.println("1. 학생 정보 등록");
			System.out.println("2. 학생 정보 수정");
			System.out.println("3. 학생 정보 삭제");
			System.out.println("4. 학생 성적 추가");
			System.out.println("5. 학생 성적 수정");
			System.out.println("6. 학생 성적 삭제");
			System.out.println("7. 학생 성적 출력");
			System.out.println("8. 프로그램 종료");
			System.out.print("메뉴를 입력하세요 : ");
			menu=scan.nextInt();
			
			switch(menu) {
			/*학생 정보 등록
			 -이름, 학년, 반 ,학번을 추가 할 수 있어야함 */
			case 1:
				System.out.println("등록할 학생정보를 입력하세요");
				System.out.print("이름 :");
				name=scan.next();
				System.out.print("학년 :");
				grade=scan.nextInt();
				System.out.print("반 :");
				classNum=scan.nextInt();
				System.out.print("학번 :");
				number=scan.nextInt();
				
				//생성자 넘겨주기(오버로딩해서 매개변수 맞는거 생성)
				std.add(new Student(name, grade, classNum, number));
				break;
			/*학생 정보 수정
				-학년 반 번호를 입력하여 학생의 이름을 변경할수 있어야함 */
			case 2:
				System.out.println("수정할 학생정보를 입력하세요");
				System.out.print("학년 :");
				grade=scan.nextInt();
				System.out.print("반 :");
				classNum=scan.nextInt();
				System.out.print("번호 :");
				number=scan.nextInt();
				
				//임시 리스트(tmp)로 생성 
				tmp.add(new Student(grade, classNum, number));
				
				for(int i =0; i<std.size();i++) {
					if(std.get(i).equals(tmp.get(0))) {
						System.out.println("이름 :");
						name=scan.next();
						std.get(i).modify(name);
					}else {
						System.out.println("등록되지 않은 학생입니다.");
					}
				}
				//임시 리스트(tmp) 삭제 
				tmp.clear();
						
				break;
			/*학생 정보 삭제
			  - 학년 반 번호를 입력하여 학생의 모든 데이터를 삭제할 수 있어야함.*/
			case 3:
				System.out.println("삭제할 학생정보를 입력하세요");
				System.out.print("학년 :");
				grade=scan.nextInt();
				System.out.print("반 :");
				classNum=scan.nextInt();
				System.out.print("번호 :");
				number=scan.nextInt();
				//임시 리스트(tmp)로 생성 
				tmp.add(new Student(grade, classNum, number));
				
				for(int i =0; i<std.size();i++) {
					if(std.get(i).equals(tmp.get(0))) {
						std.remove(i);
					}else {
						System.out.println("등록되지 않은 학생입니다.");
					}
					
				}
				//임시 리스트(tmp) 삭제 
				tmp.clear();
				break;
			case 4:
				/*4. 학생 성적 추가
				  - 여러과목을 자유롭게 추가(개수는 10개 제한)
				   - 중간(30) 기말(50) 수행(20) 비율 성적관리  총점 얼마 한과목에 대한 성적 관리 기능
				 */
				///생성할 과목 이름 입력 받고
				System.out.println("추가할 과목 :");
				String subject=scan.next();
				 //어떻게 필드를 생성해야할지 모르겠어요. 
				
				
				
				break;
			case 5:
				/*학생 성적 수정
  				- 학년 반 번호를 검색해 해당학생의 성적(국영수)을 변경할수 있어야함*/
				System.out.println("수정할 학생정보를 입력하세요");
				System.out.print("학년 :");
				grade=scan.nextInt();
				System.out.print("반 :");
				classNum=scan.nextInt();
				System.out.print("번호 :");
				number=scan.nextInt();
				
				tmp.add(new Student(grade,classNum,number));
				
				for(int i =0; i<std.size();i++) {
					if(std.get(i).equals(tmp.get(0))) {
						System.out.print("국어 :");
						kor=scan.nextDouble();
						System.out.print("영어 :");
						eng=scan.nextDouble();
						System.out.print("수학 :");
						math=scan.nextDouble();
						std.get(i).modify(kor, eng, math);
					}else {
						System.out.println("등록되지 않은 학생입니다.");
					}
				}
				tmp.clear();
				break;
			case 6:
			/*6.학생 성적 삭제
				  -학년 반 번호를 검색해 해당학생의 성적(국영수)을 삭제할수 있어야함*/
				System.out.println("삭제할 학생정보를 입력하세요");
				System.out.print("학년 :");
				grade=scan.nextInt();
				System.out.print("반 :");
				classNum=scan.nextInt();
				System.out.print("번호 :");
				number=scan.nextInt();
				//임시 리스트(tmp)로 생성 
				tmp.add(new Student(grade, classNum, number));
				
				for(int i =0; i<std.size();i++) {
					if(std.get(i).equals(tmp.get(0))) {
						std.get(i).modify(0.0, 0.0, 0.0);
					}else {
						System.out.println("등록되지 않은 학생입니다.");
					}
				} 
				tmp.clear();
				break;
				
			case 7:
			/*7.학생 정보 출력
			   -전체학생
			   -한 학년 전체 학생
			    -1학년 1반의 전체 학생*/
				System.out.println("1. 전교생");
				System.out.println("2. 학년별");
				System.out.println("3. 반별");
				System.out.print("선택 : ");
				int subMenu = scan.nextInt();
				
				switch(subMenu) {
				//전교생 출력
				case 1:
					for(Student i:std) {
						System.out.println(i);
					}
					break;
				case 2: 
					System.out.print("학년 선택 :");
					grade =scan.nextInt();

					tmp.add(new Student(grade));
					
					for(int i =0; i<std.size();i++) {
						if(std.get(i).equals(tmp.get(0))) {
							//수정삭제에서는 됐는데 왜 안돼는지 모르겠어요.
							System.out.println(std.get(i));
							
						}
					}
					tmp.clear();

					break;
				case 3: 
					System.out.print("학년 선택 :");
					grade =scan.nextInt();
					System.out.print("반 선택 :");
					classNum =scan.nextInt();
					
					tmp.add(new Student(grade,classNum)); 
					
					
					for(int i =0; i<std.size();i++) {
						if(std.get(i).equals(tmp.get(0))) {
							//case2 랑 같음. 수정삭제에서는 됐는데 왜 안돼는지 모르겠어요.
							System.out.println(std.get(i));
						}
					}
					tmp.clear();
					break;
					
				default:
					System.out.println("잘못된 선택을 했습니다.");
				}
				
				break;
				
			case 8:
				menu=8;
				break;
			default:
				System.out.println("존재하지 않는 메뉴 입니다.");
			}
			
		}while(menu!=exitMenu);
		
	}//main
}//class