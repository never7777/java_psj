package day7;

public class Ex8_Array_Multidimensional {
	public static void main(String[] args) {
		/*각 반에 최대 30명
		 * 1학년 1반위 국어 성적(정수)을 저장하기 위한 배열을 선언해 보세요.
		 */
		int [] score1 = new int [30]; 
		/*
		 * 1 학년 전체 학생의 국어 성적을 저장하기 위한 배열을 선언해 보세요
		 */
		int [] score2 = new int[30*10];
		int [][] score3 = new int[10][30];
		
		score1 [10] = 100;
		score2 [201] = 100;
		score3 [6][21] = 100;
		/*1~3학년 전체 학생의 국어 성적을 저장하기 위한 배열을 선언해보네요*/
		int score4 [][][] =new int [3][10][30];
	}
}
