package ch03.sec04;

public class AccuracyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int apple = 1; // 사과 1개
		double pieceUnit = 0.1; //10조각으로 나눔
		int number = 7; //7조각 뺌
		
		double apple2 = apple - (pieceUnit * number) ;
		System.out.println(apple2);
		
	}

}
