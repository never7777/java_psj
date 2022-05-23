package problem2;

public class Student {
	private String name;
	private int grade;
	private int classNum;
	private int number;
	private double kor;
	private double eng;
	private double math;
	
	//생성자 오버로딩
	public Student(String name, int grade, int classNum, int number, double kor, double eng, double math) {
		this.name = name;
		this.grade = grade;
		this.classNum = classNum;
		this.number = number;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	//기본
	public Student() {}
	
	//학년, 반, 번호
	public Student(int grade, int classNum, int number) {
		this.grade = grade;
		this.classNum = classNum;
		this.number = number;
		
	}
	//이름 학년 반 번호
	public Student(String name, int grade, int classNum, int number) {
		this.name = name;
		this.grade = grade;
		this.classNum = classNum;
		this.number = number;
		
		
	}
	//학년
	public Student(int grade) {
		this.grade = grade;
	}
	//학년, 반
	public Student(int grade, int classNum) {
		this.grade = grade;
		this.classNum = classNum;
	}
	
	
	// 메소드 오버로딩
	void modify(String name) {
		this.name = name;
	}
	void modify(double kor,double eng,double math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + classNum;
		result = prime * result + grade;
		result = prime * result + number;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (classNum != other.classNum)
			return false;
		if (grade != other.grade)
			return false;
		if (number != other.number)
			return false;
		return true;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassNum() {
		return classNum;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getKor() {
		return kor;
	}
	public void setKor(double kor) {
		this.kor = kor;
	}
	public double getEng() {
		return eng;
	}
	public void setEng(double eng) {
		this.eng = eng;
	}
	public double getMath() {
		return math;
	}
	public void setMath(double math) {
		this.math = math;
	}
	

	@Override
	public String toString() {
		return   grade +"학년 "+ classNum +"반 "+number+ "번 "+ name + " 국어 : "
				+ kor + " 영어 : " + eng + " 수학 : " + math ;
	} 
	

}
