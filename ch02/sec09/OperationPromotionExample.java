package ch02.sec09;

public class OperationPromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte v1 = 10;
		byte v2 = 20;
		byte result = 10 + 20; // 컴파일 단계에서 연산하기 때문에 오류 아님
		//byte result = v1 + v2; 컴파일 오류 
		int result1 = v1 + v2; //int로 변환
		
		System.out.println(result);
		System.out.println(result1);
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		long result2 = v3 + v4 + v5;
		System.out.println(result2); //가장 강력한 long 타입으로 변환 후 연산
		
		char v6 = 'A';
		char v7 = 1;
		double result3 = v6 + v7; //double type로 변환 후 연산 65+1 -> 66.0
		System.out.println(result3);
		
		int v8 = 10;
		int result4 = v8 / 4; //10을 4로 나누면 2.5지만 정수형이라 2 출력
		System.out.println(result4);
		
		double result5 = v8 / 4.0; //double 값을 설정해도 4로 나누면 2.0이 됨. 4.0으로 나눠야 함.
		System.out.println(result5);
		
		int v10 = 1;
		int v11 = 2;
		double result7 = v10 / v11; //변환 x
		System.out.println(result7);		
		
		double result6 = (double) v10 / v11; //변환 ㅇ
		System.out.println(result6);
	}

}
