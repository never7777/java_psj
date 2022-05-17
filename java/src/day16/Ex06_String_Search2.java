package day16;

public class Ex06_String_Search2 {
	public static void main(String[] args) {
		/*주어진 str에 search가 몇번 있는지 출력하는 코드를 작성하여 확인하세요*/
		String str = "sdfjkdldksasabab4";
		String search ="z";
		/*
		int index = str.indexOf(search);
		int count = 0;		
		//index가 >=0 라는건 str에 찾는게 존재한다는거임. 
		while(index>=0)
			if(index>=0	) {
				index =str.indexOf(search, index+search.length());
				count++;
			}
		System.out.println(str+" 문자열에 "+search+"문자열은 " +count+"개 있습니다.");
	}		
	*/
		int index = 0;
		int count = 0;
		do {
			index = str.indexOf(search,index);
			if(index>=0) {
				count ++;
				index = index +search.length();
			}
		}while(index>=0);
		System.out.println(str+"에는 "+search+"가 "+count+"개 있습니다.");
		
	
	}
		
}
