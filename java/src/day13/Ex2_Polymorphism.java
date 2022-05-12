package day13;

public class Ex2_Polymorphism {
	
	public static void main(String[] args) {
		Controller controller[] = new RemoteController[3];
		controller[0] = new TvController();
		controller[1] = new RadioController();
		controller[2] = new TvController();

		controller[1].run();
		for(int i=0;i<900;i++) {
			if(controller[1] instanceof RadioController) {
				RadioController tmp =(RadioController)controller[1];
				tmp.frequencyUP();
			}
			if(controller[1] instanceof TvController) {
				TvController tmp =(TvController)controller[1];
				tmp.channelUP();
			}
		}
		for(Controller tmp : controller) {
			printController(tmp);
		}
		
	}
	//매개변수가 인터페이스이면 호출할 때 인터페이스를 구현한 구현 객체가 와야함
	public static void printController(Controller con) {
		con.print();
	}


}

