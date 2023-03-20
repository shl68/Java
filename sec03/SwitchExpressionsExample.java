package ch04.sec03;

public class SwitchExpressionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char grade = '5';
		
		switch(grade) {
		
		case 'a', 'A', '1' -> {

			System.out.println("1등석 입니다"); // break문은 중괄호가 대신함
		}
		
		case 'b', 'B', '2' -> {
			System.out.println("2등석 입니다");

		}

		
		default ->{
			System.out.println("미등록 탑승권 입니다");
		}
		
		}	
	}
}



