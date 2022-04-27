package day3;

public class Ex8_Switch2 {
	public static void main(String[] args) {
		/*월이 주어졌을 때 주어진 월의 마지막일을 출력하는 코드를 작성하세요.(switch문)
		 * 31 : 1 3 5 7 8 10 12
		 * 30 : 4 6 9 11
		 * 28 : 2
		 */
		
		int month = 7;
		
		switch(month) {
		//case 1 : case 3: case 5: case 7 : case 8: case 10: case 12 : //이것도 가능
		case 1,3,5,7,8,10,12:
			System.out.println(month+"월은 31일 입니다."); // 이 실행문은 누구의 실행문일까요? 12월(브레이크가 없기 때문에)
			break;
		case 2 :
			System.out.println(month+"월은 28일 입니다.");
			break;
		case 4,6,9,11 :
			System.out.println(month+"월은 30일 입니다.");
			break;
		default :
			System.out.println(month+"월은 잘못된 월입니다.");
			break;
		}
	}
}
