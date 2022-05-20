package day19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex02_BoardMain {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		List<Board> borad =new ArrayList<>();
		int menu = 0;
		int view=0;
		do {
			System.out.println("====메뉴=====");
			System.out.println("1. 게시글 등록");
			System.out.println("2. 게시글 확인");
			System.out.println("3. 게시글 수정");
			System.out.println("4. 종료");
			System.out.print("메뉴를 선택하세요 :");
			menu = scan.nextInt();
			
			switch(menu) {
			//게시글 등록
			case 1: 
				System.out.print("타입 :" );
				String type =  scan.next();
				System.out.print("제목 :" );
				String title =  scan.nextLine();
				scan.next();
				System.out.print("내용 :" );
				String content =  scan.nextLine();
				scan.next();
				System.out.print("작성자 :" );
				String writer =  scan.next();
				
				//생성자로 넘겨주기 
				borad.add(new Board(type,title,content,writer));
				break;
			//게시글 출력
			case 2: 
				for(int i =0; i<borad.size();i++) {
					System.out.println(borad.get(i));
				}
				System.out.print("게시글 선택 :");
				int num=scan.nextInt();
				//게시글에서 num1-1번지 게시글을 가져온 후 해당 게시글의 디테일 프린트를 호출
				borad.get(num -1).detailPrint();
				//detaiPrint(borad.get(num -1));  
				
				//조회수 증가
				//(접근제한자 프라이빗이라 메소드를 이용해서 필드값을 수정해야 함)
				borad.get(num -1).view();

				break;
			//게시글 수정
			case 3:
				for(int i =0; i<borad.size();i++) {
					System.out.println(borad.get(i));
				}
				System.out.print("게시글 선택 :");
				num = scan.nextInt();
				System.out.println("제목 :" );
				title = scan.nextLine();
				scan.next();
				System.out.println("내용 :" );
				content  = scan.nextLine();
				scan.next();
				//게시글에서 num-1번지 게시글을 가져온 후 해당 게시글의 modify를 호출
				borad.get(num-1).modify(title,content);
				break;
			//프로그램 종료
			case 4: 
				menu =5;
				break;
			default: 
				System.out.println("메뉴를 잘 못입력하셨습니다.");
			}
		}while(4!=menu);
		
		
	}
}
