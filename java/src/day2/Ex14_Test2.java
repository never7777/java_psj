package day2;

public class Ex14_Test2 {
	public static void main(String[] args) {
		/* 성적에 맞는 학점을 출력하는 코드를 작성하세요
		 * A :90이상 ~ 100이하
		 * B :80이상 ~ 90미만
		 * C :70이상 ~ 80미만
		 * D :60이상 ~ 70미만
		 * F :00이상 ~ 60미만
		 */
		
		int score = 105;
		
		if(score>=90 && score<=100) {
			System.out.println("A");
		}
		else if(score>=80 && score<90){
			System.out.println("B");
		}
		else if(score>=70 && score<80){
			System.out.println("C");
		}
		else if(score>=60&&score<70) {
			System.out.println("D");
		}
		else if(score>=0&&score<60)  {
			System.out.println("F");
		}
		else {
			System.out.println("잘못된 성적입니다.");
		}
		// 잘못된 성적을 먼저 처리 함으로서 코드를 간경하게 줄일수 있음. 
		
		if(score < 0||score > 100) {
			System.out.println(score + "점은 잘못된 성적");
		}else if(score >= 90) {
			System.out.println(score + "점은 A");
		}else if(score >= 80) {
			System.out.println(score + "점은 B");
		}else if(score >= 70) {
			System.out.println(score + "점은 C");
		}else if(score >= 60) {
			System.out.println(score + "점은 D");
		}else {
			System.out.println(score + "점은 F");
		}
	}
}