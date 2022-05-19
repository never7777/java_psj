package day17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex12_Set_Lotto {

	public static void main(String[] args) {
		/*set을 이용하여 1~45 사이의 중복되지 않은 숫자 6개를 저장하고 출력하는 코드를 작성하세요.*/
		Set<Integer> lotto =new HashSet<Integer>();
		
		int max =10, min = 1;
		while(lotto.size()<6) {
			lotto.add((int)(Math.random() *(45-1+1)+1));
			
			}
			System.out.print(lotto);
			for(Integer tmp:lotto) {
				System.out.println(tmp+"");
			}
			System.out.println();
			
			Iterator<Integer> it = lotto.iterator();
			while(it.hasNext()) {
				Integer tmp = it.next();
				System.out.println(tmp + "");
			}
			System.out.println();
		
			System.out.println();
			//구매한 로또
			Set<Integer> user = new HashSet<Integer>();
			/* 스캐너를 이용하여 정수를 6개 입력받음. 중복되지 않은 숫자 6갤르 입력할떄가지. 범위는 로또와 같음;*/
			Scanner scan  =new Scanner (System.in);

			while(user.size()<6) {
				int num = scan.nextInt();
				if(num>=min&&num<=max) {
				user.add(num);
				}
			
			}
			System.out.print(user);
			int count=0;
			/*lotto와 user에서 일치하는 숫자의 갤수를 세서 출력하세요*/
			for(Integer tmp : lotto) {
				if(user.contains(tmp)) {
					count++;
				}
			}
			System.out.println(count+"개 있습니다.");
	
	}
}

