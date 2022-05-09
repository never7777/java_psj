package day10;

import java.util.Scanner;

public class Ex1_Class_RemoteController {

	public static void main(String[] args) {
		RemoteController rc = new RemoteController(1, 10);
		//생성자를 호출해서 초기화
		/*메뉴를 출력 후 메뉴에 맞는 기능을 동작하도록 코드를 작성하세요
		 * 메뉴
		 * 1. 채널 Up
		 * 2. 채널 Down
		 * 3. 채널 변경
		 * 4. 볼륨 Up
		 * 5  볼륨 Down
		 * 6. 전원
		 * 7. 종료
		 * 메뉴를 선택하세요 : 6*/
		
		Scanner sc =new Scanner(System.in);
		
		int num = 0;
		do {
			System.out.println("1. 채널 Up");
			System.out.println("4. 채널 Down");
			System.out.println("3. 채널 변경");
			System.out.println("4. 볼륨 Up");
			System.out.println("5  볼륨 Down");
			System.out.println("6. 전원");
			System.out.println("7. 종료");
			System.out.print("메뉴를 선택하세요 :");
			num = sc.nextInt();
		
			if(num==1) {
				rc.channelUp();
			}else if(num==2){
				rc.channelDown();
			}else if(num==3){
				System.out.print("채널을 입력하세요 : ");
				int ch = sc.nextInt();
				rc.channel(ch);
			}else if(num==4){
				rc.volumeUp();
			}else if(num==5){
				rc.volumeDown();
			}else if(num==6) {
				rc.turn();
			}
			
		}while(num !=7);
		
		
	} //main
}// class

/*Tv 리모컨 클래스를 생성하고, 객체를 생성 후 기능들을 테스트해보세요*/

class RemoteController{
	//전원 겨기, 전원 끄기, 채널 변경, 볼륨 업, 볼륩 다운
	boolean power;
	int channel;
	int volume;
	int minVolume =0;
	int maxVolume = 32;
	int minChannel = 1;
	int maxChannel = 999;
	
	/*기능 : Tv를 켜는 메소드
	  매개변수 : 없음
	  리턴타입 : 없음  
	  메소드명 : turnOn
	*/
	void turnOn() {
		power = true;
		System.out.println("Tv를 켰습니다.");
	}

	/*기능 : Tv를 끄는 메소드
	  매개변수 : 없음
	  리턴타입 : 없음  
	  메소드명 : turnOff
	*/
	void turnOff() {
		power = false;
		System.out.println("Tv를 껐습니다.");
	}

	/*기능 : Tv를 켰다 껐다하는 메소드
	  매개변수 : 없음
	  리턴타입 : 없음  
	  메소드명 : turn
	 */
	 void turn() {
		power = !power;
		if(power) {
			System.out.println("Tv를 켰습니다.");
		}else {
			System.out.println("Tv를 껐습니다.");

		}

	}
	/*기능 : 소리를 한칸 올리는 기능
	  매개변수 : 없음 
	  리턴타입 : 없음 => void 
	  메소드명 : volumeUp
	*/
 	void volumeUp() {
 		//전원이 켜져있고, 소리가 최대치가 아니면
 		if(power && volume <maxVolume) {
 			volume++;
 			System.out.println("소리 : "+ volume);

 		}
	 
 	}

	/*기능 : 소리를 한칸 내리는 기능
	  매개변수 : 없음 
	  리턴타입 : 없음 => void 
	  메소드명 : volumeDown
	 */	
 	void volumeDown() {
 		//전원이 켜져있고, 소리가 최대치가 아니면
 		if(power) {
 			if(volume >minVolume) {
 				volume--;
 			}
 			System.out.println("소리 : "+ volume);
 		}
 	}
	/*기능 : 채널을 1씩 증가 하는 메소드
	  매개변수 : 없음
	  리턴타입 : 없음 => void 
 	  매개변수 : channerlUp
 	 */
 	void channelUp() {
 		if(power) {
 			if(channel<maxChannel) {
 				channel++;
 			}
 			System.out.println("채널 : " + channel);
 		}
 	}
 	/*기능 : 채널을 1씩 감소 하는 메소드
	  매개변수 : 없음
	  리턴타입 : 없음 => void 
	  매개변수 : channerlDown
	 */

	void channelDown() {
		if(power) {
			if(channel<minChannel) {
				channel--;
			}
			System.out.println("채널 : " + channel);
		}
	}
 	/*기능 : 입력한 채널로 이동하는 메소드
 	 * 매개변수  : 이동할 채널 => int ch
 	 * 리턴타입: 없음 => void
 	 * 메소드명 : channel */

 	void channel(int ch) {
		if(power) {
			if(ch <minChannel) {
				channel =minChannel;
			}else if(ch>maxChannel) {
				channel = maxChannel;
			}
			else {
			channel =ch;
			}
		System.out.println("채널 : " + channel);
		}
	}
 	//생성자
 	public RemoteController() {
 		channel= minChannel;
 		volume = minVolume;
 	}
	public RemoteController(int ch, int v) {
		if(ch>=minChannel && ch <=maxChannel) {
			channel = ch;
		}else {
			channel = minChannel;
		}
		if(v>=minVolume && v <=maxVolume) {
			volume = v;
		}else {
			volume = minChannel;
		}
	}
}
