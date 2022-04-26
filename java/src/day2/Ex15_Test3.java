package day2;

public class Ex15_Test3 {
	public static void main(String[] args) {
		/*
		 * month가 주어질 때 해당 달의 마직막 일을 출력하는 코드를 if문으로 작성하세요
		 * 31 : 1 3 5 7 8 10 12
		 * 30 : 4 6 9 11
		 * 28 : 2
		 * 
		 * month 1이거나 month 3이거나 month 5이거나 month 7이거나 month 8이거나
		 * month 10 이거나 month 12이면 31일이라고 출력하고
		 * month 4이거나 month 6이거나 month 9이거나 month 11이면 30일이라고 출력하고
		 * month 2이면 28일이라고 출력하고
		 * 아니면 잘못된 월입니다라고 출력
		 */
		int month =0;

		if(month<=0 || month>12) {
			System.out.println("잘못된 월입니다.");
		}else if (month == 2) {
			System.out.println(month + "월의 마지막날은 28일 입니다.");
		}else if (month == 4 ||month==6 ||month == 9 ||month == 11) {
			System.out.println(month + "월의 마지막날은 30일 입니다");
		}else {
			System.out.println(month + "월의 마지막날은 31일 입니다");
		}

	}
}
