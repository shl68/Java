package ch04.sec03;

public class SwitchCahrExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char grade = 'f';
		
		switch(grade) {
		
		case 'A' : // 각 문장 출력 없이 공통 범위라면 묶어서 작성 가능함.
		case 'a' :
		case '1' :

			System.out.println("1등석 입니다");
			break;
			
		case 'B' :
		case 'b' :
		case '2' :

			System.out.println("2등석 입니다");
			break;
		
		default :
			System.out.println("미등록 탑승권 입니다");

		}	
	}
}


