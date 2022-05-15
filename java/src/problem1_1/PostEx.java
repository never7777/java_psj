package problem1_1;

import java.util.Scanner;


public class PostEx {
	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
		//객체 배열 생성
		Post []post = new Post [10];
		int count= 0; // 게시글 count
		int num=0;// 서브메뉴 번호 선택
		boolean subMenu; //분류
		int views=0;//조회수??
		
		int menu = -1;
		
		do {
			System.out.println("======메뉴======");
			System.out.println("1. 게시글 등록");
			System.out.println("2. 게시글 확인");
			System.out.println("3. 게시글 수정");
			System.out.println("4. 종료");
			System.out.print("메뉴를 입력하세요:");
			menu = scan.nextInt();
			System.out.println("==============");

			switch(menu) {
			//게시글 등록
			case 1: 
				System.out.print("공지(true)/일반(false) :");
				subMenu = scan.nextBoolean();
				System.out.print("날짜 : ");
				String date = scan.next();
				System.out.print("제목 : ");
				String title= scan.next();
				System.out.print("내용 : ");
				String content = scan.next();
				System.out.print("작성자 : ");
				String id = scan.next();
				// 작성한 데이터 값 넘겨주는 객체 생성
				post[count] = new Post(subMenu,date,title,content,id);
				count ++;
				break;
			//게시글 확인
			case 2: 
				for(int i =0; i<count;i++) {
					System.out.println(i+1+". "+post[i]);
				}
				//숫자를 입력하면 그 게시물의 내용을 표현
				System.out.print("내용을 확인할 게시물을 선택하세요 :");
				num = scan.nextInt();
				if(0<num&&num<=count) {
					//nullpointExseption 조심//배열의 인덱스때(num-1)
					System.out.println(post[num-1].toString1());
				}
				break;
			//게시글 수정
			case 3: 
				for(int i =0; i<count;i++) {
					System.out.println(i+1+". "+post[i]);
				}
				System.out.println("수정할 게시물을 선택하세요 :");
				num =scan.nextInt();
				System.out.print("공지(true)/일반(false) :");
				subMenu = scan.nextBoolean();
				System.out.print("날짜 : ");
				date = scan.next();
				System.out.print("제목 : ");
				title= scan.next();
				System.out.print("내용 : ");
				content = scan.next();
				System.out.print("작성자 : ");
				id = scan.next();
				
				post[num-1] =new Post(subMenu,date,title,content,id);
				
				break;
			case 4: 
				menu = 4;
				break;
			default :
				System.out.println("잘못된 선택입니다.");
				break;
			}
			
		}while(menu!=5);
		System.out.println("종료합니다.");
		
		
	scan.close();
	}
}
