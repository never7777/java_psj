package problem4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Phonebook_main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		List <PhoneBook>pb = new ArrayList<PhoneBook>();
		
		//샘플
		pb.add(new PhoneBook("홍길동","010-1234-4567"));
		pb.add(new PhoneBook("임꺽정","010-7894-5612"));
		pb.add(new PhoneBook("이길동","010-1111-4444"));
		
		int menu;
		String name, phone;
		do {
			System.out.println("메뉴");
			System.out.println("1.전화번호 추가");
			System.out.println("2.전화번호 확인");
			System.out.println("3.전화번호 검색");
			System.out.print("메뉴를 입력하세요 :");
			menu=sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.print("이름 :");
				name=sc.next();
				System.out.print("번호 :");
				phone=sc.next();
				pb.add(new PhoneBook(name,phone));
				break;
			case 2:
				for(PhoneBook e :pb) {
					System.out.println(e);
				}
				break;	
			case 3:
				System.out.print("이름 :");
				name=sc.next();
				for(int i =0; i<pb.size(); i++) {
					if(pb.get(i).getName().contains(name)) {
						System.out.println(pb.get(i));
					}
				}
				break;
			case 4:
				//menu =4; 를 눌러서 할 필요 없음
				break;
			default:	
				System.out.println("메뉴를 잘 못 입력하셨습니다.");
			}
		
		}while(menu != 4);
	}

}
