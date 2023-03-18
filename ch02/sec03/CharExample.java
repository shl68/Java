package ch02.sec03;

public class CharExample {
	
	public static void main(String[] args) {
		
		char c1 = 'A';
		char c2 = 65;
		//char c3 = '65'; char 는 문자 타입이라 코드처럼 65를 입력하면 컴파일 오류가 됨.
		
		char c4 = '가'; //문자형 가 = 가
		int c5 = '가'; // 정수형 가 = 44032
		char c6 = 44032; // 문자형 44032 = 가
		
		System.out.println(c1);
		System.out.println(c2);
		//System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		}

}
