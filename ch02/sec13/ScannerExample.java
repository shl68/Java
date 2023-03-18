package ch02.sec13;		// 키보드로부터 입력


import java.util.Scanner; //java.util 패키지에서 스캐너 찾아와서 사용

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in); //변수 선언, 객체 생성 , 입력
		//Scanner는 자바 기본 제공 x line3에서 import
		
		System.out.print(" x 값 입력 :"); //설명
		String strX = scanner.nextLine(); //Strx 에 입력값 저장
		int x = Integer.parseInt(strX); //형변환, 문자는 변환 불가능 컴파일 에러
		
		System.out.print(" y 값 입력 :"); //설명
		String strY = scanner.nextLine(); //Strx 에 입력값 저장
		int y = Integer.parseInt(strY); //형변환, 문자는 변환 불가능 컴파일 에러
	
		int result = x + y;
		System.out.println("x + y : " + result);
		
		
		
		while(true) {
			System.out.print("입력문자열 : ");
			String data = scanner.nextLine(); //Strx 에 입력값 저장
			if(data.equals("Quit")) {
				break;
			}
			System.out.printf("출력문자열 : %s" , data);
			System.out.println();	

		}
		System.out.printf("종료");

	}

}
