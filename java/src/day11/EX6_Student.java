package day11;
/*학생 클래스를 작성하세요
   - 학생 클래스 : 이름, 학년, 반, 번호, 국어, 영어, 수학 성적 
 *  - 기능 : 
 *     - 학생 정보를 출력하는 기능
 *     - 학년, 반, 번호가 주어졌을 때 일치하는지 확인하는 기능
 *     - 주어진 이름, 국어, 영어, 수학점수로 수정하는 기능
 * - 생성자 : 학년, 반, 번호, 이름, 국어, 영어, 수학 성적이 주어졌을 때 초기화하는 생성자*/
public class EX6_Student {
	//필드
	private String name;
	private int grade, classRoom, number;
	private int kor, eng, math;
	
	//생성자
	//우클릭 > source> generate constructor using fieldes
	public EX6_Student(String name, int grade, int classRoom, int number, int kor, int eng, int math) {
		this.name = name;
		this.grade = grade;
		this.classRoom = classRoom;
		this.number = number;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	//메소드
	
	/*기능 : 학생 정보를 출력하는 기능
	 *매개변수 : 없음 = 필드 사용
	 *리턴타입 : 없음 => void
	 *메소드명 : studentPrint */
	public void studentPrint() {
		System.out.println("=======================================");
		System.out.println(grade+"학년 "+classRoom+"반 "+number+"번 " +name);
		System.out.println("국어 :"+kor+" "+ "영어 : "+eng+" "+ "수학 :"+math);
		System.out.println("=======================================");
	}
	
	/* 기능 : 학년, 반, 번호가 주어졌을 때 일치하는지 확인하는 기능
	 * 매개변수 : 학년, 반, 번호 =>int grade, int classRoom, int number
	 * 리턴타입 : 일치 여부 => boolean 
	 * 메소드명 : studentCheek*/
	/*public boolean studentCheek(int grade, int classRoom, int number) {
		if(this.grade == grade && this.classRoom == classRoom && this.number == number) {
			return true;
		}
		return false;
	}*/
	
	public boolean equal(int grade, int classRoom, int number) {
		if(this.grade !=grade) {
			return false;
		}
		if(this.classRoom !=classRoom) {
			return false;
		}
		if(this.number !=number) {
			return false;
		}
		return true;	
	}

	
	/* 기능 : 주어진 이름, 국어, 영어, 수학점수로 수정하는 기능
	 * 매개변수 : 이름, 국어, 영어, 수학 => String name, int kor, int eng, int math
	 * 리턴타입 : 필드(클래스) 저장 => 없음 => void 
	 * 메소드명 : studentChange
	 */
	public void studentChange(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math= math;		
	}


}
