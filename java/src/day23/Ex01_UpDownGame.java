package day23;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Ex01_UpDownGame {

	public static void main(String[] args) {
		/* - 1~100사이의 랜덤한 수를 맞추는 Up Down 게임 프로그램을 작성하세요
		 * - 기록을 저장하는 기능을 추가
		 * - 기록은 최대 5등까지
		 * - 5등 이내의 기록은 이름을 기록하여 저장
		 * 
		 * 1. 플레이
		 * 2. 기록확인
		 * 3. 종료
		 * */
		List<Rank>rank = new ArrayList <>();
		
		Scanner scan = new Scanner(System.in);
		int menu;
		int max =100, min =1;
		int user;
		String name;
		
		
		//샘플
		rank.add(new Rank("김씨",2));
		rank.add(new Rank("오씨",5));
		rank.add(new Rank("한씨",10));
		rank.add(new Rank("손씨",3));
		rank.add(new Rank("주씨",3));
		
		
		do {
			System.out.println("1. 플레이");
			System.out.println("2. 기록확인");
			System.out.println("3. 종료");
			System.out.print("메뉴 입력 :");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				int count=0;
				user =0;
				//1~100사이의 랜덤한 수 생성
				int com= (int)(Math.random() * (max -min+1)+min);
				System.out.println(com);
				//일치할때 까지 반복함.
				while(com!=user) {
					//사용자에게 수를 입력 받음
					System.out.print("입력 : ");
					user = scan.nextInt();//com 샘플
					//입력받은 수를 비교하여 랜덤 수가 크면 업 낮으면 다운
					if(user>100 ||user<1) {
						System.out.println("범위내 수가 아닙니다.");
						continue;
					}else if(com>user) {
						System.out.println("Up");
					}else if(com<user){
						System.out.println("Down");
					}else {
						System.out.println("정답입니다");
					}
					//횟수를 계산
					count++;
				}
				//- 기록을 저장하는 기능을 추가
				//- count와 리스트의 정보를 비교하여 상위 5명이면 이름을 기록한다. 
				
								
				//리스트의 공간이 5개 미만인 경우 (빈공간이 있는경우) 바로 저장
				if(rank.size()<5) {
					System.out.print("이름 : ");
					name=scan.next();
					rank.add(new Rank(name,count));
				}
				//정렬
				rank.sort(new Comparator<Rank>() {
					@Override
					public int compare(Rank o1, Rank o2) {
						return o1.getCount() - o2.getCount();
					}
				});
				//리스트의 공간이 꽉 찬 경우(5개 이상)	
				if(rank.size()==5) {
					if(rank.get(4).getCount()>count) {
						System.out.print("이름 : ");
						name=scan.next();
						rank.add(new Rank(name,count));
						
						//정렬 후 
						rank.sort(new Comparator<Rank>() {
							@Override
							public int compare(Rank o1, Rank o2) {
								return o1.getCount() - o2.getCount();
							}
						});
						//6번째 값 삭제
						rank.remove(5);
						}
				}
				break;
			case 2:
				
				//정렬
				rank.sort(new Comparator<Rank>() {
					@Override
					public int compare(Rank o1, Rank o2) {
						return o1.getCount() - o2.getCount();
					}
				});

				//출력 class (to string 작성해야 정상 출력)
				for(int i =0; i< rank.size();i++) {
					System.out.println(i +1 + "등 "+rank.get(i));
				}
				break;
				
			case 3:
				menu=3;
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
			}
		}while(menu!=3);
	}
}
