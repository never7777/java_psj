package day17;

import java.util.*;

public class Ex07_List {
	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		Vector<Integer> list2 =new Vector<Integer>();
		LinkedList<Integer> list3 =new LinkedList<Integer>();
		List<Integer> list4 = new ArrayList<Integer>();
		
		list1.add(10);// 정수 10이 자동 박싱으로 Integer의 객체로 변환 후 리스트에 추가 
		list1.add(20);
		list1.add(0,30);//0번지에 30을 추가, 기존에 0번지에 있던 10이 밀림
		list4.addAll(list1);//list 4는 리스트 1을 복사
		list4.add(20);//중복가능
		list1.set(0, 3); //0번지 값을 3으로 변경
		
		System.out.println("list1 :"+list1);
		System.out.println("list의 0번지 값 :"+list1.get(0)); //0번지 값을 출력
		System.out.println("list에 30이 있는가?:"+list1.contains(30)); //있는지 없는지 true false
		System.out.println("list에 10이 있는가?:"+list1.indexOf(10)); //있으면 번지 알려즈고 없으면 -1
		System.out.println("list에 있는 원소 개수:"+list1.size()+"개");
		System.out.println("list4 :"+list4);
		
		Integer num = list4.remove(0);
		System.out.println("list4에서 제거한 0번지의 값 : "+num);
		System.out.println("list4 : "+list4);
		System.out.println("list4에서 제거한 30을 제거 했는가 : "+ list4.remove((Integer)20));
		System.out.println("list4 : "+list4);
		list4.clear();
		System.out.println("list4 : "+list4);
		
		
	}
}
