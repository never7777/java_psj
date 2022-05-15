package problem1_1;

/*게시글 관리 프로그램 (post)
 * 조회수 증가 기능
	출력메뉴
	1. 게시글 등록(공지 /일반)
	  - 분류(공지 /일반) 선택
	  - 제목작성
	  - 내용작성
	  - 날짜 자동입력

	2. 게시글 확인
	   -게시글의 제목을 출력
	   -번호를 누르면 제목과 내용 출력

	3. 게시글 수정
	  -  게시글의 제목을 출력
	  - 변경사항 선택 (분류/제목/ 내용)
	  - 수정 후 수정 게시글(제목과 내용 출력)

	4. 프로그램 종료
	--------
	id(작성자 )*/
public class Post {
	private boolean type;
	private String title;
	private String date;
	private String content;
	private String id;
	
	//생성자
	public Post(boolean type,String title,String date,String content,String id) {
		this.type= type;
		this.title= title;
		this.date= date;
		this.content= content;
		this.id= id;
	}

	@Override
	public String toString() {
		return " [" + (type?"공지":"일반")+ "] " + title + " | " + date + " | "  + id
				;
	}
	public String toString1() {
		return " [" + (type?"공지":"일반") + "] " + title + " | " + date +" | "+id+ " ]\n" + content ;
	}

}
