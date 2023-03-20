package ch04.sec03;

public class SwitchExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = (int)(Math.random()*6) + 1;

		switch(num) {
		 case 1:
		 {
				System.out.println("1등");
				break;
		 }
		 case 2:
		 {
				System.out.println("2등");
				break;

		 }
		 case 3:
		 {
				System.out.println("3등");
				break;
		 }
		 case 4:
		 {
				System.out.println("4등");
				break;
		 }
		 case 5:
		 {
				System.out.println("5등");
				break;
		 }
		 
		 default : 
		 {
				System.out.println("6등");

		 }
		}	
	}
}
 