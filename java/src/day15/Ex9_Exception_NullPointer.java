package day15;


public class Ex9_Exception_NullPointer {

	public static void main(String[] args) {
		/*문자열이 주어지면 주어진 문자열에 a가 몇개 있는지 확인하는 ㄴ코드를 작성하세요.
		 * abca =>2
		 * abc =>1
		 * bc=>0
		 */
		String str ="hello";
		

		String ch="l";
		String[]arr = str.split("");
		int count = 0;
		
		for(int i = 0; i<arr.length;i++) {
			if(arr[i].equals(ch)) {
				count++;
			}
		}
		System.out.println(count++);
		
		
		
		String str1 ="hello";
		
		try {
			int count1 = 0;		
			for(int i = 0; i<str.length();i++) {
				if(str1.charAt(i) =='l') {
					count1++;
				}
			}
			System.out.println(count1++);
		}catch(NullPointerException e) {
			System.out.println("해당 문자를 찾을 수 없습니다.");
		}
		
		
		
		
		
	}

}
