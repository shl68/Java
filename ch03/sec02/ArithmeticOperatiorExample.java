package ch03.sec02;

public class ArithmeticOperatiorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte v1 = 10;
		byte v2 = 4;
		int v3 = 5;
		long v4 = 10L;
		double v5 = 1.23;
		
		int result1 = v1 + v2; // byte 이용시 컴파일 오류
		System.out.println(result1);
		
		long result2 = v1 + v2 - v4; // int 형에 long 존재하니 long 타입
		System.out.println(result2);
		
		long result3 = (long) v1 / v2; //정수 나눗셈
		System.out.println(result3);
		
		float result7 = (float) v1 / v2; //  실수 나눗셈
		System.out.println(result7);

		int result4 = v1 % v2;
		System.out.println(result4);
		
		double result5 = v1 / v5;
		System.out.println(result5);

		



	}

}
